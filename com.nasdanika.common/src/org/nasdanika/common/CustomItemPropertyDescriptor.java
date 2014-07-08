package org.nasdanika.common;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;

public interface CustomItemPropertyDescriptor extends IItemPropertyDescriptor {

	/**
	 * Creates a custom cell editor.
	 * @param composite
	 * @param object 
	 * @return
	 */
	CellEditor createPropertyEditor(Composite composite, ILabelProvider editLabelProvider, Object object);
	
	ILabelProvider getLabelProvider(ILabelProvider superLabelProvider);
	
}