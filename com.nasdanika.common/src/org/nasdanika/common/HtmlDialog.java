package org.nasdanika.common;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Locale;
import java.util.Vector;

import javax.swing.JRootPane;

import org.eclipse.swt.widgets.Shell;

import com.hexidec.ekit.EkitCore;
import com.hexidec.ekit.EkitCoreSpell;

/**
 * Dialog with WYSIWYG HTML editor
 * @author Pavel Vlasov
 *
 */
public class HtmlDialog extends AwtDialog {
	
	private String text;

	public HtmlDialog(Shell parentShell, String title, String text, int contentWidth, int contentHeight) {
		super(parentShell, title, contentWidth, contentHeight);
		this.text = text;
	}
	
	private EkitCore eKitCore;
	
	@Override
	protected void createAwtContent(JRootPane root) {
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
		
		if (text!=null) {
			eKitCore.setDocumentText(text);
		}

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
//			vcMenus.add(EkitCore.KEY_MENU_HELP);
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
	}
	
	public String getDocumentBody() {
		return eKitCore==null ? null : eKitCore.getDocumentBody();
	}

}
