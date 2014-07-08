package org.nasdanika.common;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

public class EncryptingPasswordPropertyDescriptor extends ResolvingItemPropertyDescriptor implements CustomItemPropertyDescriptor {

	private byte[] key;
	private static Image KEY = Activator.getImageDescriptor("icons/led/key.png").createImage();

	public EncryptingPasswordPropertyDescriptor(IItemPropertyDescriptor master, byte[] key) {
		super(master);
		this.key = key;
	}

	@Override
	public CellEditor createPropertyEditor(Composite composite,	ILabelProvider editLabelProvider, Object object) {
		TextCellEditor ret = new TextCellEditor(composite) {
			
			@Override
			protected Control createControl(Composite parent) {
				Control control = super.createControl(parent);
				((Text) control).setEchoChar('*');
				return control;
			}
			
			@Override
			protected Object doGetValue() {
				Object plain = super.doGetValue();
				try {
					return Activator.encrypt(String.valueOf(plain), key);
				} catch (Exception e) {
					return "";
				}
			}
			
			@Override
			protected void doSetValue(Object value) {			
				try {
					super.doSetValue(Activator.decrypt(String.valueOf(value), key));
				} catch (Exception e) {
					super.doSetValue("");
				}
			}
		};
		return ret;
	}
	
	@Override
	public ILabelProvider getLabelProvider(ILabelProvider superLabelProvider) {
		return new LabelProvider() {
			
			@Override
			public String getText(Object element) {
				StringBuilder ret = new StringBuilder();
				if (element!=null) {
					for (int i=0, l=String.valueOf(element).length()/2; i<l; ++i) {
						ret.append("*");
					}
				}
				return ret.toString();
			}
			
			@Override
			public Image getImage(Object element) {
				return KEY;
			}
			
		};
	}

}
