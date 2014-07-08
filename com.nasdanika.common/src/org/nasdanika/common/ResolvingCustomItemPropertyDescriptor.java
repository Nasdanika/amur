package org.nasdanika.common;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;

public class ResolvingCustomItemPropertyDescriptor extends ResolvingItemPropertyDescriptor implements CustomItemPropertyDescriptor {

	public ResolvingCustomItemPropertyDescriptor(CustomItemPropertyDescriptor master) {
		super(master);
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite,	ILabelProvider editLabelProvider, Object object) {
		return ((CustomItemPropertyDescriptor) master).createPropertyEditor(composite, editLabelProvider, resolve(object));
	}

	@Override
	public ILabelProvider getLabelProvider(ILabelProvider superLabelProvider) {
		return ((CustomItemPropertyDescriptor) master).getLabelProvider(superLabelProvider);
	}

}
