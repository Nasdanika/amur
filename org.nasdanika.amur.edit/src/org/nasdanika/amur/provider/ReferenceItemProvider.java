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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.Reference;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.Reference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceItemProvider
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
	public ReferenceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCachePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return injectItemPropertyDescriptors(object, itemPropertyDescriptors);
	}

	/**
	 * This adds a property descriptor for the Cache feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCachePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_Reference_cache_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_cache_feature", "_UI_Reference_type"),
//				 AmurPackage.Literals.REFERENCE__CACHE,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
//				 getString("_UI_GeneralPropertyCategory"),
//				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTypePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_Reference_type_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Reference_type_feature", "_UI_Reference_type"),
//				 AmurPackage.Literals.REFERENCE__TYPE,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 getString("_UI_GeneralPropertyCategory"),
//				 null));
	}

	/**
	 * This returns Reference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return AmurEditPlugin.INSTANCE.adjustImage(object, getAdapterFactory(), overlayImage(object, getResourceLocator().getImage("full/obj16/Reference")));
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
		String label = ((Reference)object).getName();
		return label == null || label.length() == 0 ?
			typeName(object, "_UI_Reference_type") :
			typeName(object, "_UI_Reference_type") + " " + label;
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

		switch (notification.getFeatureID(Reference.class)) {
			case AmurPackage.REFERENCE__CACHE:
			case AmurPackage.REFERENCE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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
