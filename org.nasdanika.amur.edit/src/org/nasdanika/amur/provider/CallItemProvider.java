/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ImplementationType;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.Call} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallItemProvider
	extends ComponentItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,		
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns Call.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return AmurEditPlugin.INSTANCE.adjustImage(object, getAdapterFactory(), overlayImage(object, getResourceLocator().getImage("full/obj16/Call")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Call)object).getName();
		return label == null || label.length() == 0 ?
			typeName(object, "_UI_Call_type") :
				typeName(object, "_UI_Call_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
	
	@Override
	protected List<IItemPropertyDescriptor> injectItemPropertyDescriptors(Object object, List<IItemPropertyDescriptor> itemPropertyDescriptors) {
		List<IItemPropertyDescriptor> ret = super.injectItemPropertyDescriptors(object, itemPropertyDescriptors);
		
		// Collecting parent contributions.
		AbstractConnectionSource source = ((Connection) object).getSource();
		if (source instanceof Component) {
			ImplementationType pit = ((Component) source).getImplementationType();
			if (pit!=null) {
				Adapter adapted = ((ComposeableAdapterFactory) getAdapterFactory()).getRootAdapterFactory().adapt(pit, IItemPropertyDescriptorsContributor.class);
				if (adapted instanceof IItemPropertyDescriptorsContributor) {
					((IItemPropertyDescriptorsContributor) adapted).contributePropertyDescriptors(source, object, AmurPackage.eINSTANCE.getAbstractConnectionSource_OutboundConnections(), ret);
				}
			}			
		}
		
		// Collecting parent contributions.
		AbstractConnectionTarget target = ((Connection) object).getTarget();
		if (target instanceof Component) {
			ImplementationType pit = ((Component) target).getImplementationType();
			if (pit!=null) {
				Adapter adapted = ((ComposeableAdapterFactory) getAdapterFactory()).getRootAdapterFactory().adapt(pit, IItemPropertyDescriptorsContributor.class);
				if (adapted instanceof IItemPropertyDescriptorsContributor) {
					((IItemPropertyDescriptorsContributor) adapted).contributePropertyDescriptors(target, object, AmurPackage.eINSTANCE.getAbstractConnectionTarget_InboundConnections(), ret);
				}
			}			
		}
		
		return ret;
	}

}
