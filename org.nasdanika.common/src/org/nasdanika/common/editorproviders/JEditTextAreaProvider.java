package org.nasdanika.common.editorproviders;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JRootPane;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.keys.IBindingService;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.TokenMarkerProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;
import org.nasdanika.common.jedit.tokenmarker.JetTokenMarker;
import org.syntax.jedit.JEditTextArea;
import org.syntax.jedit.tokenmarker.CCTokenMarker;
import org.syntax.jedit.tokenmarker.CTokenMarker;
import org.syntax.jedit.tokenmarker.HTMLTokenMarker;
import org.syntax.jedit.tokenmarker.JavaScriptTokenMarker;
import org.syntax.jedit.tokenmarker.JavaTokenMarker;
import org.syntax.jedit.tokenmarker.PHPTokenMarker;
import org.syntax.jedit.tokenmarker.PLSQLTokenMarker;
import org.syntax.jedit.tokenmarker.PerlTokenMarker;
import org.syntax.jedit.tokenmarker.PropsTokenMarker;
import org.syntax.jedit.tokenmarker.PythonTokenMarker;
import org.syntax.jedit.tokenmarker.ShellScriptTokenMarker;
import org.syntax.jedit.tokenmarker.TokenMarker;
import org.syntax.jedit.tokenmarker.XMLTokenMarker;


public class JEditTextAreaProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "JEdit Text Area";
	}
	
	private static final Map<String, TokenMarker> TOKEN_MARKERS = new HashMap<String, TokenMarker>();
	
	public static final String TOKEN_MARKER_PROVIDER_ID = "org.nasdanika.common.TokenMarkerProvider";
	
	static {
		TOKEN_MARKERS.put("text/java", new JavaTokenMarker());
		TOKEN_MARKERS.put("text/javascript", new JavaScriptTokenMarker());
		TOKEN_MARKERS.put("text/c", new CTokenMarker());
		TOKEN_MARKERS.put("text/cpp", new CCTokenMarker());
		TOKEN_MARKERS.put("text/html", new HTMLTokenMarker());
		TOKEN_MARKERS.put("text/xml", new XMLTokenMarker());
		TOKEN_MARKERS.put("text/perl", new PerlTokenMarker());
		TOKEN_MARKERS.put("text/php", new PHPTokenMarker());
		TOKEN_MARKERS.put("text/properties", new PropsTokenMarker());
		TOKEN_MARKERS.put("text/python", new PythonTokenMarker());
		TOKEN_MARKERS.put("text/shell", new ShellScriptTokenMarker());
		TOKEN_MARKERS.put("text/sql", new PLSQLTokenMarker());
		TOKEN_MARKERS.put("text/jet", new JetTokenMarker());
	}
	
	public JEditTextAreaProvider() {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry!=null) {
			IConfigurationElement[] config = extensionRegistry.getConfigurationElementsFor(TOKEN_MARKER_PROVIDER_ID);
			try {
				for (IConfigurationElement e : config) {
					Object o = e.createExecutableExtension("class");
					if (o instanceof TokenMarkerProvider) {
						TOKEN_MARKERS.putAll(((TokenMarkerProvider) o).getMarkers());
					}
				}
			} catch (CoreException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	@Override
	public boolean supports(String mimeType) {
		return TOKEN_MARKERS.keySet().contains(mimeType);
	}

	@Override
	public Editor createEditor(String mimeType) {
		final TokenMarker tokenMarker = TOKEN_MARKERS.get(mimeType);
		if (tokenMarker==null) {
			return null;
		}
		
		return new AwtEditor() {
			
			private JEditTextArea jEditTextArea;
			
			@Override
			public Object getValue() {
				return jEditTextArea.getText();
			}
			
			@Override
			public void setValue(Object value) {
				jEditTextArea.setText(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createAwtContent(JRootPane root, Object value, final CompletionProviderFactory autoCompletionProvider) {
				jEditTextArea = new JEditTextArea();
				jEditTextArea.setTokenMarker(tokenMarker);
				jEditTextArea.setText(value==null ? "" : value.toString());
		        root.getContentPane().add(jEditTextArea);
				
				jEditTextArea.addFocusListener(new FocusListener() {

					IBindingService iBindingService = (IBindingService) PlatformUI.getWorkbench().getService(IBindingService.class);
					boolean keyFilterEnabled;
										
					@Override
					public void focusLost(FocusEvent e) {
						iBindingService.setKeyFilterEnabled(keyFilterEnabled); 
					}
					
					@Override
					public void focusGained(FocusEvent e) {
						keyFilterEnabled = iBindingService.isKeyFilterEnabled();
						System.out.println(keyFilterEnabled);
						iBindingService.setKeyFilterEnabled(false); 
					}
				});
				
				// TODO - completion
//		        if (objectBrowserRoots!=null && !objectBrowserRoots.isEmpty()) {
//    				JPopupMenu pm = new JPopupMenu();
//    				final JMenuItem mi = new JMenuItem();
//    				pm.add(mi);
//    				mi.setAction(new AbstractAction("Object browser") {
//
//						@Override
//						public void actionPerformed(ActionEvent e) {
//							ObjectBrowserDialog obd = new ObjectBrowserDialog(mi, objectBrowserRoots);
//							obd.setVisible(true);
//							String result = obd.getResult();
//							if (result!=null) {
//								try {
//									jEditTextArea.getDocument().insertString(jEditTextArea.getCaretPosition(), result, null);
//								} catch (BadLocationException ex) {
//									ex.printStackTrace();
//									JOptionPane.showMessageDialog(jEditTextArea, ex.toString());
//								}
//							}
//						}
//    					
//    				});
//    				
//    				jEditTextArea.setRightClickPopup(pm);
//		        	
//		        }
		        jEditTextArea.requestFocusInWindow();
			}

			@Override
			public void setEnabled(boolean enabled) {
				if (jEditTextArea!=null) {
					jEditTextArea.setEditable(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "JEdit Text Area";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 0;
	}


}
