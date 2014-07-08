package org.nasdanika.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;

public class ResolvingDialogItemPropertyDescriptor extends ResolvingItemPropertyDescriptor implements DialogItemPropertyDescriptor {

	public ResolvingDialogItemPropertyDescriptor(DialogItemPropertyDescriptor master) {
		super(master);
	}

	@Override
	public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
		return ((DialogItemPropertyDescriptor) master).openDialogBox(cellEditorWindow, initialValue, adapterFactory);
	}

	@Override
	public Button customizeButton(Button button) {
		return ((DialogItemPropertyDescriptor) master).customizeButton(button);
	}

}
