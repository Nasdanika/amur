package org.nasdanika.common.editorproviders;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.keys.IBindingService;
import org.fife.rsta.ac.LanguageSupportFactory;
import org.fife.rsta.ac.js.JavaScriptCompletionProvider;
import org.fife.rsta.ac.js.JavaScriptLanguageSupport;
import org.fife.rsta.ac.js.SourceCompletionProvider;
import org.fife.rsta.ui.GoToDialog;
import org.fife.rsta.ui.search.FindDialog;
import org.fife.rsta.ui.search.ReplaceDialog;
import org.fife.rsta.ui.search.SearchEvent;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;
import org.fife.ui.rtextarea.SearchResult;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.autocomplete.CompletionProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;
import org.nasdanika.common.editorproviders.languagesupport.js.JsCompletionBridge;


public class RSyntaxTextAreaProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "RSyntax Text Area";
	}
			
	@Override
	public boolean supports(String mimeType) {
		for (Field f: SyntaxConstants.class.getDeclaredFields()) {
			try {
				if (f.get(null).equals(mimeType)) {
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Editor createEditor(final String mimeType) {
		
		return new AwtEditor() {
			
			private RSyntaxTextArea rSyntaxTextArea;
			
			private SearchListener searchListener = new SearchListener() {
				
				public void searchEvent(SearchEvent e) {

					SearchEvent.Type type = e.getType();
					SearchContext context = e.getSearchContext();
					SearchResult result = null;

					switch (type) {
						case MARK_ALL:
							result = SearchEngine.markAll(rSyntaxTextArea, context);
							break;
						case FIND:
							result = SearchEngine.find(rSyntaxTextArea, context);
							if (!result.wasFound()) {
								UIManager.getLookAndFeel().provideErrorFeedback(rSyntaxTextArea);
							}
							break;
						case REPLACE:
							result = SearchEngine.replace(rSyntaxTextArea, context);
							if (!result.wasFound()) {
								UIManager.getLookAndFeel().provideErrorFeedback(rSyntaxTextArea);
							}
							break;
						case REPLACE_ALL:
							result = SearchEngine.replaceAll(rSyntaxTextArea, context);
							JOptionPane.showMessageDialog(null, result.getCount() +	" occurrences replaced.");
							break;
					}

				}

			};
//			
//			private FindDialog findDialog;
//
//			private ReplaceDialog replaceDialog;
			
			@Override
			public Object getValue() {
				return rSyntaxTextArea.getText();							
			}
			
			@Override
			public void setValue(final Object value) {
				rSyntaxTextArea.setText(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createAwtContent(JRootPane root, Object value, final CompletionProviderFactory autoCompletionProvider) {
				rSyntaxTextArea = new RSyntaxTextArea();
				rSyntaxTextArea.setText(value==null ? "" : value.toString());
				
				rSyntaxTextArea.setSyntaxEditingStyle(mimeType);
				rSyntaxTextArea.setCodeFoldingEnabled(true);
				rSyntaxTextArea.setAntiAliasingEnabled(true);
				
				// Search, replace, go to line menu items
				//rSyntaxTextArea.getPopupMenu().
								
				Frame frame = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, root);
				final FindDialog findDialog = new FindDialog(frame, searchListener);
				final ReplaceDialog replaceDialog = new ReplaceDialog(frame, searchListener);

				JPopupMenu menu = rSyntaxTextArea.getPopupMenu();
				menu.addSeparator();
				menu.add(new JMenuItem(new AbstractAction("Find...") {
					
//					{
//						int c = SwingUtilities.getWindowAncestor(rSyntaxTextArea).getToolkit().getMenuShortcutKeyMask();
//						putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F, c));
//					}

					public void actionPerformed(ActionEvent e) {
						if (replaceDialog.isVisible()) {
							replaceDialog.setVisible(false);
						}
						findDialog.setVisible(true);
					}

				}));
				menu.add(new JMenuItem(new AbstractAction("Replace...") {
					
//					{
//						int c = SwingUtilities.getWindowAncestor(rSyntaxTextArea).getToolkit().getMenuShortcutKeyMask();
//						putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, c));
//					}

					public void actionPerformed(ActionEvent e) {
						if (findDialog.isVisible()) {
							findDialog.setVisible(false);
						}
						replaceDialog.setVisible(true);
					}

				}));
				menu.add(new JMenuItem(new AbstractAction("Go To Line...") {

//					{
//						int c = SwingUtilities.getWindowAncestor(rSyntaxTextArea).getToolkit().getMenuShortcutKeyMask();
//						putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_L, c));
//					}

					public void actionPerformed(ActionEvent e) {
						if (findDialog.isVisible()) {
							findDialog.setVisible(false);
						}
						if (replaceDialog.isVisible()) {
							replaceDialog.setVisible(false);
						}
						GoToDialog dialog = new GoToDialog((Frame) SwingUtilities.getAncestorOfClass(Frame.class, rSyntaxTextArea));
						dialog.setMaxLineNumberAllowed(rSyntaxTextArea.getLineCount());
						dialog.setVisible(true);
						int line = dialog.getLineNumber();
						if (line>0) {
							try {
								rSyntaxTextArea.setCaretPosition(rSyntaxTextArea.getLineStartOffset(line-1));
							} catch (BadLocationException ble) { // Never happens
								UIManager.getLookAndFeel().provideErrorFeedback(rSyntaxTextArea);
								ble.printStackTrace();
							}
						}
					}

				}));

				
				RTextScrollPane sp = new RTextScrollPane(rSyntaxTextArea);
				sp.setFoldIndicatorEnabled(true);
				
				rSyntaxTextArea.addFocusListener(new FocusListener() {

					IBindingService iBindingService = (IBindingService) PlatformUI.getWorkbench().getService(IBindingService.class);
					boolean keyFilterEnabled;
										
					@Override
					public void focusLost(FocusEvent e) {
						iBindingService.setKeyFilterEnabled(keyFilterEnabled); 
					}
					
					@Override
					public void focusGained(FocusEvent e) {
						keyFilterEnabled = iBindingService.isKeyFilterEnabled();
						iBindingService.setKeyFilterEnabled(false); 
					}
				});
				
		        root.getContentPane().add(sp);
		        
		        addLanguageSupport(rSyntaxTextArea, mimeType, autoCompletionProvider);
		        
		        sp.requestFocusInWindow();
			}

			@Override
			public void setEnabled(boolean enabled) {
				if (rSyntaxTextArea!=null) {
					rSyntaxTextArea.setEditable(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "RSyntax";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 2;
	}

	protected void addLanguageSupport(
			RSyntaxTextArea rSyntaxTextArea, 
			final String mimeType,
			final CompletionProviderFactory autoCompletionProviderFactory) {
		
		switch (mimeType) {
		case ("text/javascript"):
			CompletionProvider completionProvider = autoCompletionProviderFactory==null ? null : autoCompletionProviderFactory.getCompletionProvider(mimeType);
			if (completionProvider!=null) {			
				final AtomicReference<SourceCompletionProvider> pRef = new AtomicReference<>();
				
				JavaScriptLanguageSupport jsls = new JavaScriptLanguageSupport() {
					
					@Override
					protected JavaScriptCompletionProvider createJavaScriptCompletionProvider() {
						JavaScriptCompletionProvider ret = super.createJavaScriptCompletionProvider();
						pRef.set(ret.getProvider());
						return ret;
					}
					
				};
	
				new JsCompletionBridge(completionProvider, pRef.get());

				jsls.install(rSyntaxTextArea);
			}
			break;
		default:
			LanguageSupportFactory.get().register(rSyntaxTextArea);
			break;
		}
		
//		if (autoCompletionProvider!=null) {
//		    org.fife.ui.autocomplete.CompletionProvider wProvider = new ContextAwareCompletionProvider(autoCompletionProvider);		        
//		    configureProvider(mimeType, wProvider);
//		    
//		    rSyntaxTextArea.setToolTipSupplier((ToolTipSupplier) wProvider);
//			ToolTipManager.sharedInstance().registerComponent(rSyntaxTextArea);
//
//			AutoCompletion ac = new AutoCompletion(wProvider);
//			ac.setAutoActivationDelay(700);
//			ac.setAutoActivationEnabled(true);
//			ac.setListCellRenderer(createCellRenderer(mimeType));
//			ac.setParameterAssistanceEnabled(true);
//			ac.install(rSyntaxTextArea);
//		}
	}
}
