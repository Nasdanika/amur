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
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.AmurFactory;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.Composite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeItemProvider
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
	public CompositeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return injectItemPropertyDescriptors(object, itemPropertyDescriptors);
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
			childrenFeatures.add(AmurPackage.Literals.COMPOSITE__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * This returns Composite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return AmurEditPlugin.INSTANCE.adjustImage(object, getAdapterFactory(), overlayImage(object, org.nasdanika.common.Activator.getImageDescriptor("icons/led/drawer.png")));
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
		String label = ((Composite)object).getName();
		return label == null || label.length() == 0 ?
			typeName(object, "_UI_Composite_type") :
			typeName(object, "_UI_Composite_type") + " " + label;
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

		switch (notification.getFeatureID(Composite.class)) {
			case AmurPackage.COMPOSITE__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}
	
	private static final String COMPONENT_ID = "org.nasdanika.amur.edit.component";
	
	/**
	 * Collects extension category children providers.
	 * @param diagramElement
	 * @return
	 */
	private Collection<Component> getComponents() {
		final EList<Component> ret = new BasicEList<Component>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(COMPONENT_ID);
		for (IConfigurationElement ce: config) {
			try {
				Object o = ce.createExecutableExtension("class");
				if (o instanceof Component) {
					ret.add((Component) o);
				} else if (o instanceof IExecutableExtensionFactory) {
					ret.add((Component) ((IExecutableExtensionFactory) o).create());
				}
			} catch (CoreException e) {
				e.printStackTrace();
				throw new AmurException(e); 
			}
		}
		
		Collections.sort(ret, new Comparator<Component>() {

			@Override
			public int compare(Component o1, Component o2) {
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

		newChildDescriptors.add
			(createChildParameter
				(AmurPackage.Literals.COMPOSITE__CHILDREN,
				 AmurFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(AmurPackage.Literals.COMPOSITE__CHILDREN,
				 AmurFactory.eINSTANCE.createComposite()));

//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createConnectionSource()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createConnectionTarget()));

		newChildDescriptors.add
			(createChildParameter
				(AmurPackage.Literals.COMPOSITE__CHILDREN,
				 AmurFactory.eINSTANCE.createNode()));

//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createInputPort()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createOutputPort()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createGateway()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createErrorHandler()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createContainer()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createTransition()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createErrorTransition()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createCall()));
//
//		newChildDescriptors.add
//			(createChildParameter
//				(AmurPackage.Literals.COMPOSITE__CHILDREN,
//				 AmurFactory.eINSTANCE.createReference()));
		
		for (Component ext: getComponents()) {
			newChildDescriptors.add(createChildParameter(AmurPackage.Literals.COMPOSITE__CHILDREN, ext));			
		}		
		
	}

}
