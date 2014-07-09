package org.nasdanika.common;

import java.util.Arrays;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;

public abstract class ComboBoxPropertyDescriptor extends ResolvingItemPropertyDescriptor implements CustomItemPropertyDescriptor {

	public ComboBoxPropertyDescriptor(IItemPropertyDescriptor master) {
		super(master);
	}

	protected String getText(Object item) {
		return String.valueOf(item);
	}
	
	protected abstract Object[] getItems();

	@Override
	public CellEditor createPropertyEditor(Composite composite,	ILabelProvider editLabelProvider, Object object) {
		final Object[] items = getItems();
		String[] labels = new String[items.length];
		for (int i=0; i<items.length; ++i) {
			labels[i] = getText(items[i]);
		}
		
		return new ComboBoxCellEditor(composite, labels) {
			@Override
			protected Object doGetValue() {
				int val = ((Integer) super.doGetValue()).intValue();
				return val==-1 ? null : items[val];
			}
			
			@Override
			protected void doSetValue(Object value) {
				super.doSetValue(Arrays.asList(items).indexOf(value));
			}
		};
	}
	
	protected LabelProvider labelProvider = new LabelProvider();
	
	@Override
	public ILabelProvider getLabelProvider(ILabelProvider superLabelProvider) {
		return labelProvider;
	}

}
