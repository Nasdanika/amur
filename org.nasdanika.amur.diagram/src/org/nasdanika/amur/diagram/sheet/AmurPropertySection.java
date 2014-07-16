package org.nasdanika.amur.diagram.sheet;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.gmf.tooling.runtime.sheet.DefaultPropertySection;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

import org.nasdanika.common.CustomItemPropertyDescriptor;
import org.nasdanika.common.DialogItemPropertyDescriptor;

/**
 * @generated
 */
public class AmurPropertySection extends DefaultPropertySection implements
		IPropertySourceProvider {
		
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		}
		final AdapterFactory af = getAdapterFactory(object);
		if (af != null) {
			IItemPropertySource ips = (IItemPropertySource) af.adapt(object, IItemPropertySource.class);
			if (ips != null) {
				return new PropertySource(object, ips) {
					 
                    /**
                     * Customization of property source to return custom property descriptor which recognizes
                     * DialogItemPropertyDescriptor.
                     */
                    @Override
                    protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
                        return new org.eclipse.emf.edit.ui.provider.PropertyDescriptor(object, itemPropertyDescriptor) {

                            @Override
                            public CellEditor createPropertyEditor(Composite composite) {                            
                                // If item property descriptor provides its own dialog, then use it
                                if (itemPropertyDescriptor instanceof DialogItemPropertyDescriptor) {
                                    return new ExtendedDialogCellEditor(composite, getEditLabelProvider()) {

                                        @Override
                                        protected Object openDialogBox(Control cellEditorWindow) {
                                            return((DialogItemPropertyDescriptor) itemPropertyDescriptor).openDialogBox(cellEditorWindow, getValue(), af);
                                        }

                                        protected Button createButton(Composite parent) {
                                            return ((DialogItemPropertyDescriptor) itemPropertyDescriptor).customizeButton(super.createButton(parent));
                                        }

                                    };

                                }
                                
                               if (itemPropertyDescriptor instanceof CustomItemPropertyDescriptor) {
                            	   return ((CustomItemPropertyDescriptor) itemPropertyDescriptor).createPropertyEditor(composite, getEditLabelProvider(), object);
                               }
	                               
                                return super.createPropertyEditor(composite);
                            }
                            
                            @Override
                            public ILabelProvider getLabelProvider() {
                            ILabelProvider superLabelProvider = super.getLabelProvider();
                               if (itemPropertyDescriptor instanceof CustomItemPropertyDescriptor) {
                             	   ILabelProvider labelProvider = ((CustomItemPropertyDescriptor) itemPropertyDescriptor).getLabelProvider(superLabelProvider);
                             	   if (labelProvider!=null) {
                             		   return labelProvider;
                             	   }
                                }
								return superLabelProvider;
                            }
                         };
                    }
             };
			}
		}
		if (object instanceof IAdaptable) {
			return (IPropertySource) ((IAdaptable) object).getAdapter(IPropertySource.class);
		}
		return null;
	}
		

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	@Override
	protected Object transformSelection(Object selected) {
		selected = /*super.*/transformSelectionToDomain(selected);
		return selected;
	}

}
