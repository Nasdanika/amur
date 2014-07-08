package org.nasdanika.common.editorproviders;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JEditorPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;

import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;


public class JEditorPaneProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "Text";
	}
	
	@Override
	public boolean supports(String mimeType) {
		return "text".equalsIgnoreCase(mimeType);
	}

	@Override
	public Editor createEditor(final String mimeType) {
		
		return new AwtEditor() {
			
			private JEditorPane editor;
			
			@Override
			public Object getValue() {
				return editor.getText();
			}
						
			@Override
			public void setValue(Object value) {
				editor.setText(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createAwtContent(JRootPane root, Object value, final CompletionProviderFactory autoCompletionProvider) {
				final Container c = root.getContentPane();
				c.setLayout(new BorderLayout());

				editor = new JEditorPane();
				JScrollPane scrPane = new JScrollPane(editor);
				c.add(scrPane, BorderLayout.CENTER);
				c.doLayout();
				
				// TODO - completion provider, maybe as a context menu.
//		        if (objectBrowserRoots!=null && !objectBrowserRoots.isEmpty()) {
//    				final JPopupMenu pm = new JPopupMenu();
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
//									editor.getDocument().insertString(editor.getCaretPosition(), result, null);
//								} catch (BadLocationException ex) {
//									ex.printStackTrace();
//									JOptionPane.showMessageDialog(editor, ex.toString());
//								}
//							}
//						}
//    					
//    				});
//    				
//    				editor.setComponentPopupMenu(pm);
//		        }
				
				editor.setText(value==null ? "" : value.toString());
				editor.requestFocusInWindow();
			}

			@Override
			public void setEnabled(boolean enabled) {
				if (editor!=null) {
					editor.setEditable(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "JEditor";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 1;
	}


}
