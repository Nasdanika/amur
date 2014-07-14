/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.provider;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.CopyImplementationTypeFactory;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.common.ExtensibleDialogItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.CopyImplementationTypeFactory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CopyImplementationTypeFactoryItemProvider
	extends ItemProviderAdapter
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
	public CopyImplementationTypeFactoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addKeywordsPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addSpecializesPropertyDescriptor(object);
			addImplementationTypeReferencePropertyDescriptor(object);
			addSelectorPropertyDescriptor(object);
			addAppliesToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeDescriptor_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeDescriptor_id_feature", "_UI_ImplementationTypeDescriptor_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeDescriptor_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeDescriptor_name_feature", "_UI_ImplementationTypeDescriptor_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ExtensibleDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeDescriptor_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeDescriptor_description_feature", "_UI_ImplementationTypeDescriptor_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null), null, null, "text/html"));
	}

	/**
	 * This adds a property descriptor for the Keywords feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeywordsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeDescriptor_keywords_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeDescriptor_keywords_feature", "_UI_ImplementationTypeDescriptor_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeFactory_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeFactory_version_feature", "_UI_ImplementationTypeFactory_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Specializes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecializesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImplementationTypeFactory_specializes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImplementationTypeFactory_specializes_feature", "_UI_ImplementationTypeFactory_type"),
				 AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Type Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationTypeReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CopyImplementationTypeFactory_implementationTypeReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CopyImplementationTypeFactory_implementationTypeReference_feature", "_UI_CopyImplementationTypeFactory_type"),
				 AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Selector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CopyImplementationTypeFactory_selector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CopyImplementationTypeFactory_selector_feature", "_UI_CopyImplementationTypeFactory_type"),
				 AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Applies To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliesToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CopyImplementationTypeFactory_appliesTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CopyImplementationTypeFactory_appliesTo_feature", "_UI_CopyImplementationTypeFactory_type"),
				 AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CopyImplementationTypeFactory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CopyImplementationTypeFactory"));
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CopyImplementationTypeFactory)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CopyImplementationTypeFactory_type") :
			getString("_UI_CopyImplementationTypeFactory_type") + " " + label;
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

		switch (notification.getFeatureID(CopyImplementationTypeFactory.class)) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR:
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	private static final String IMPLEMENTATION_TYPE_ID = "org.nasdanika.amur.edit.implementation_type";
	
	/**
	 * Collects extension category children providers.
	 * @param diagramElement
	 * @return
	 */
	private Collection<ImplementationType> getImplementationTypes() {
		final EList<ImplementationType> ret = new BasicEList<ImplementationType>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IMPLEMENTATION_TYPE_ID);
		for (IConfigurationElement ce: config) {
			try {
				Object o = ce.createExecutableExtension("class");
				if (o instanceof ImplementationType) {
					ret.add((ImplementationType) o);
				}
			} catch (CoreException e) {
				e.printStackTrace();
				throw new AmurException(e); 
			}
		}
		
		Collections.sort(ret, new Comparator<ImplementationType>() {

			@Override
			public int compare(ImplementationType o1, ImplementationType o2) {
				if (o1==null) {
					return o2==null ? 0 : 1;
				}
				if (o2==null) {
					return -1;
				}
				String n1 = o1.getName();
				String n2 = o2.getName();
				if (n1==null) {
					return n2==null ? o1.hashCode()-o2.hashCode() : 1;
				}
				if (n2==null) {
					return -1;
				}
				
				return n1.compareTo(n2);
			}
			
		});
		
		return ret;
	}
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		
		for (ImplementationType ext: getImplementationTypes()) {
			newChildDescriptors.add(createChildParameter(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, ext));			
		}		
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AmurEditPlugin.INSTANCE;
	}

}
