package org.nasdanika.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;

public interface DialogItemPropertyDescriptor extends IItemPropertyDescriptor {

	/**
	 * Opens a custom dialog to edit property.
	 * @param cellEditorWindow
	 * @return New property value or null if dialog action was cancelled.
	 */
	Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory);

	/**
	 * This method simply returns its parameter. Override it to customize or replace the cell editor button, 
	 * e.g. add context menu to switch between different editors.
	 * @param button
	 */
	Button customizeButton(Button button);

}