package org.nasdanika.common.editorproviders;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JRootPane;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.keys.IBindingService;
import org.nasdanika.common.AwtEditor;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

import com.hexidec.ekit.EkitCore;
import com.hexidec.ekit.EkitCoreSpell;


public class EKitProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "EKit";
	}
	
	@Override
	public boolean supports(String mimeType) {
		return "text/html".equalsIgnoreCase(mimeType);
	}

	
	@Override
	public Editor createEditor(String mimeType) {
		
		return new AwtEditor() {
			
			private EkitCore eKitCore;
			
			@Override
			public Object getValue() {
				return eKitCore.getDocumentBody();
			}
			
			@Override
			public void setValue(Object value) {
				eKitCore.setDocumentText(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createAwtContent(JRootPane root, Object value, final CompletionProviderFactory autoCompletionProvider) {
		        Container contentPane = root.getContentPane();
				
				boolean showToolBar = true;
				boolean showToolBarMulti = true;
				boolean showViewSource = false;
				String sLanguage = Locale.getDefault().getLanguage();
				String sCountry = Locale.getDefault().getCountry();
				boolean editModeExclusive = true;
				boolean showMenuIcons = true;
				boolean spellChecker = false;
				String toolbarSeq = (showToolBarMulti ? EkitCore.TOOLBAR_DEFAULT_MULTI : EkitCore.TOOLBAR_DEFAULT_SINGLE);
				boolean enterBreak = true;

				if(spellChecker) {
					eKitCore = new EkitCoreSpell(false, null, null, showToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, false, showToolBarMulti, toolbarSeq, enterBreak);
				} else {
					eKitCore = new EkitCore(false, null, null, showToolBar, showViewSource, showMenuIcons, editModeExclusive, sLanguage, sCountry, false, false, showToolBarMulti, toolbarSeq, enterBreak);
				}
				
				eKitCore.setDocumentText(value==null ? "" : value.toString());
				
				/* Add menus, based on whether or not they are requested (all are shown by default) */
				Vector<String> vcMenus = new Vector<String>();
				vcMenus.add(EkitCore.KEY_MENU_EDIT);
				vcMenus.add(EkitCore.KEY_MENU_VIEW);
				vcMenus.add(EkitCore.KEY_MENU_FONT);
				vcMenus.add(EkitCore.KEY_MENU_FORMAT);
				vcMenus.add(EkitCore.KEY_MENU_INSERT);
				vcMenus.add(EkitCore.KEY_MENU_TABLE);
				vcMenus.add(EkitCore.KEY_MENU_FORMS);
				vcMenus.add(EkitCore.KEY_MENU_SEARCH);
				vcMenus.add(EkitCore.KEY_MENU_TOOLS);
//					vcMenus.add(EkitCore.KEY_MENU_HELP);
				root.setJMenuBar(eKitCore.getCustomMenuBar(vcMenus));

				/* Add the components to the app */
				if(showToolBar)	{
					if(showToolBarMulti) {
						contentPane.setLayout(new GridBagLayout());
						GridBagConstraints gbc = new GridBagConstraints();
						gbc.fill       = GridBagConstraints.HORIZONTAL;
						gbc.anchor     = GridBagConstraints.NORTH;
						gbc.gridheight = 1;
						gbc.gridwidth  = 1;
						gbc.weightx    = 1.0;
						gbc.weighty    = 0.0;
						gbc.gridx      = 1;

						eKitCore.initializeMultiToolbars(toolbarSeq);

						gbc.gridy = 1;
						contentPane.add(eKitCore.getToolBarMain(showToolBar && eKitCore.getToolBarMain(showToolBar).getComponentCount() > 0), gbc);

						gbc.gridy = 2;
						contentPane.add(eKitCore.getToolBarFormat(showToolBar && eKitCore.getToolBarFormat(showToolBar).getComponentCount() > 0), gbc);

						gbc.gridy = 3;
						contentPane.add(eKitCore.getToolBarStyles(showToolBar && eKitCore.getToolBarStyles(showToolBar).getComponentCount() > 0), gbc);

						gbc.anchor     = GridBagConstraints.CENTER;
						gbc.fill       = GridBagConstraints.BOTH;
						gbc.weighty    = 1.0;
						gbc.gridy      = 4;
						contentPane.add(eKitCore, gbc);
					} else {
						eKitCore.initializeSingleToolbar(toolbarSeq);

						contentPane.setLayout(new BorderLayout());
						contentPane.add(eKitCore, BorderLayout.CENTER);
						contentPane.add(eKitCore.getToolBar(showToolBar), BorderLayout.NORTH);
					}			
				}
				
				eKitCore.getTextPane().addFocusListener(new FocusListener() {

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
				
				// TODO - code completion, maybe as a context menu.
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
//									eKitCore.getTextPane().getDocument().insertString(eKitCore.getTextPane().getCaretPosition(), result, null);
//								} catch (BadLocationException ex) {
//									ex.printStackTrace();
//									JOptionPane.showMessageDialog(eKitCore, ex.toString());
//								}
//							}
//						}
//    					
//    				});
//    				
//    				JPopupMenu pm = eKitCore.getTextPane().getComponentPopupMenu();
//    				if (pm==null) {
//    					pm = new JPopupMenu();
//    					eKitCore.getTextPane().setComponentPopupMenu(pm);
//    				}
//    				pm.add(mi);
//    				
//		        }
//				eKitCore.getTextPane().requestFocusInWindow();				
			}

			@Override
			public void setEnabled(boolean enabled) {
				if (eKitCore!=null) {
					eKitCore.setEnabled(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "EKit";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 3;
	}

}
