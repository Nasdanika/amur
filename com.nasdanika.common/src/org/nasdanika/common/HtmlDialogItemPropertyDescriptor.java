package org.nasdanika.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class HtmlDialogItemPropertyDescriptor extends DialogItemPropertyDescriptorImpl {

	public HtmlDialogItemPropertyDescriptor(IItemPropertyDescriptor master, CompletionProviderFactory autoCompletionProvider) {
		super(master, autoCompletionProvider);
	}
	
	@Override
	public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
		HtmlDialog dialog = new HtmlDialog(
				cellEditorWindow.getShell(), 
				"Description", 
				(String) initialValue, 
				// TODO - root ObjectBrowser items.
				600, 
				400);
		return dialog.open()==Dialog.OK ? dialog.getDocumentBody() : null;
	}
	
}	
