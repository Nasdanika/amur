package org.nasdanika.common.editorproviders;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JEditorPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;

import jsyntaxpane.DefaultSyntaxKit;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.keys.IBindingService;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;


public class JSyntaxPaneProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "JSyntaxPane";
	}
	
	private static final Set<String> CONTENT_TYPES = new HashSet<String>();
	
	static {
		DefaultSyntaxKit.initKit();
		CONTENT_TYPES.addAll(Arrays.asList(DefaultSyntaxKit.getContentTypes()));
	}

	@Override
	public boolean supports(String mimeType) {
		return CONTENT_TYPES.contains(mimeType);
	}

	@Override
	public Editor createEditor(final String mimeType) {
		
		return new AwtEditor() {
			
			private JEditorPane codeEditor;
			
			@Override
			public Object getValue() {
				return codeEditor.getText();
			}
			
			@Override
			public void setValue(Object value) {
				codeEditor.setText(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createAwtContent(JRootPane root, Object value, final CompletionProviderFactory autoCompletionProvider) {

				// Containing dialog is responsible for restoring key filtering to its original value.
				((IBindingService) PlatformUI.getWorkbench().getService(IBindingService.class)).setKeyFilterEnabled(false);

				final Container c = root.getContentPane();
				c.setLayout(new BorderLayout());

				codeEditor = new JEditorPane();
				JScrollPane scrPane = new JScrollPane(codeEditor);
				c.add(scrPane, BorderLayout.CENTER);
				c.doLayout();

				if (mimeType != null) {
					codeEditor.setContentType(mimeType);
				}
				
				codeEditor.setText(value==null ? "" : value.toString());
				
				// TODO - completion
				
//		        if (objectBrowserRoots!=null && !objectBrowserRoots.isEmpty()) {
//    				final JMenuItem mi = new JMenuItem();
//    				mi.setAction(new AbstractAction("Object browser") {
//
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							ObjectBrowserDialog obd = new ObjectBrowserDialog(mi, objectBrowserRoots);
//							obd.setVisible(true);
//							String result = obd.getResult();
//							if (result!=null) {
//								try {
//									codeEditor.getDocument().insertString(codeEditor.getCaretPosition(), result, null);
//								} catch (BadLocationException ex) {
//									ex.printStackTrace();
//									JOptionPane.showMessageDialog(codeEditor, ex.toString());
//								}
//							}
//						}
//    					
//    				});
//    				
//    				JPopupMenu pm = codeEditor.getComponentPopupMenu();
//    				if (pm==null) {
//    					pm = new JPopupMenu();
//    					codeEditor.setComponentPopupMenu(pm);
//    				}
//    				pm.add(mi);
//    				
//		        }
				
				codeEditor.requestFocusInWindow();
			}

			@Override
			public void setEnabled(boolean enabled) {
				if (codeEditor!=null) {
					codeEditor.setEditable(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "JSyntaxPane";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 0;
	}


}
