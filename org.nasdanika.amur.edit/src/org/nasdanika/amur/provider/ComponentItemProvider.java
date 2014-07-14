/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
import org.nasdanika.amur.provider.editor.ImplementationTypeDialog;

import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.impl.NoImplementationType;
import org.nasdanika.common.Activator;
import org.nasdanika.common.CustomItemPropertyDescriptor;
import org.nasdanika.common.DialogItemPropertyDescriptor;
import org.nasdanika.common.DialogItemPropertyDescriptorImpl;
import org.nasdanika.common.ExtensibleDialogItemPropertyDescriptor;
import org.nasdanika.common.ResolvingCustomItemPropertyDescriptor;
import org.nasdanika.common.ResolvingDialogItemPropertyDescriptor;
import org.nasdanika.common.ResolvingItemPropertyDescriptor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * This is the item provider adapter for a {@link org.nasdanika.amur.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, IFigureFilterProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
//			addIdPropertyDescriptor(object);
//			addAuthorsPropertyDescriptor(object);
//			addCodeGenerationResourcePropertyDescriptor(object);
//			addDocumentationGenerationResourcePropertyDescriptor(object);		
//			addGenerationTimeoutPropertyDescriptor(object);
//			addResourcePathPropertyDescriptor(object);
//			addGenerationArgumentsPropertyDescriptor(object);
//			addGenerationPropertiesPropertyDescriptor(object);
//			addGenerationServicesPropertyDescriptor(object);
//			addGenerationCodePropertyDescriptor(object);
		}
		
		return injectItemPropertyDescriptors(object, itemPropertyDescriptors);
	}	

	protected List<IItemPropertyDescriptor> injectItemPropertyDescriptors(Object object, List<IItemPropertyDescriptor> itemPropertyDescriptors) {
		List<IItemPropertyDescriptor> ret = new ArrayList<IItemPropertyDescriptor>(itemPropertyDescriptors);
		ret.add(createImplementationTypePropertyDescriptor(object));
		
		ImplementationType implementationType = ((Component) object).getImplementationType();
		if (implementationType!=null) {
			IItemPropertySource itips = (IItemPropertySource) ((ComposeableAdapterFactory) getAdapterFactory()).getRootAdapterFactory().adapt(implementationType, IItemPropertySource.class);
			if (itips!=null) {		
				for (IItemPropertyDescriptor iipd: itips.getPropertyDescriptors(implementationType)) {
					Object feature = iipd.getFeature(implementationType);
					if (feature instanceof EStructuralFeature 
							&& AmurPackage.eINSTANCE.getEClassifiers().contains(((EStructuralFeature) feature).getEContainingClass())) {
						continue; // Skip features declared in Amur package - id, name, description, ...
					}
					if (iipd instanceof DialogItemPropertyDescriptor) {
						ret.add(new ResolvingDialogItemPropertyDescriptor((DialogItemPropertyDescriptor) iipd) {
							
							@Override
							protected Object resolve(Object obj) {
								return ((Component) obj).getImplementationType();
							}
						});
					} else if (iipd instanceof CustomItemPropertyDescriptor) {
						ret.add(new ResolvingCustomItemPropertyDescriptor((CustomItemPropertyDescriptor) iipd) {
							
							@Override
							protected Object resolve(Object obj) {
								return ((Component) obj).getImplementationType();
							}
						});
					} else {
						ret.add(new ResolvingItemPropertyDescriptor(iipd) {
							
							@Override
							protected Object resolve(Object obj) {
								return ((Component) obj).getImplementationType();
							}
						});
					}
				}
			}
		}
		
//		// Collecting parent contributions.
//		for (Component parent = ((Component) object).getParent(); parent!=null; parent = parent.getParent()) {
//			ImplementationType pit = parent.getImplementationType();
//			if (pit!=null) {
//				Adapter adapted = ((ComposeableAdapterFactory) getAdapterFactory()).getRootAdapterFactory().adapt(pit, IItemPropertyDescriptorsContributingParent.class);
//				if (adapted instanceof IItemPropertyDescriptorsContributingParent) {
//					((IItemPropertyDescriptorsContributingParent) adapted).contributePropertyDescriptors(parent, object, ret);
//				}
//			}			
//		}
		
		// Collecting parent contributions.
		Component parent = ((Component) object).getParent();
		if (parent!=null) {
			ImplementationType pit = parent.getImplementationType();
			if (pit!=null) {
				Adapter adapted = ((ComposeableAdapterFactory) getAdapterFactory()).getRootAdapterFactory().adapt(pit, IItemPropertyDescriptorsContributor.class);
				if (adapted instanceof IItemPropertyDescriptorsContributor) {
					((IItemPropertyDescriptorsContributor) adapted).contributePropertyDescriptors(parent, object, AmurPackage.eINSTANCE.getComposite_Children(), ret);
				}
			}			
		}
				
		return ret;
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
				 getString("_UI_Component_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_name_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__NAME,
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
		CompletionProviderFactory autoCompletionProvider = null; // TODO - items for inserting wiki-like cross-links to the documentation.
		itemPropertyDescriptors.add
			(new ExtensibleDialogItemPropertyDescriptor(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_description_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 Activator.getImageDescriptor("icons/fugue/icons/book-open-list.png"),
				 getString("_UI_GeneralPropertyCategory"),
				 null), null, autoCompletionProvider, "text/html"));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_id_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__ID,
				 false,
				 false,
				 false,
				 Activator.getImageDescriptor("icons/fat-cow-farm-fresh-web-icons/16x16/key.png"),
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Implementation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_implementationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_implementationType_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__IMPLEMENTATION_TYPE,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Code Generation Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCodeGenerationResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_codeGenerationResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_codeGenerationResource_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__CODE_GENERATION_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {IPropertySheetEntry.FILTER_ID_EXPERT}));
	}

	/**
	 * This adds a property descriptor for the Documentation Generation Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationGenerationResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_documentationGenerationResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_documentationGenerationResource_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Resource Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_resourcePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_resourcePath_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__RESOURCE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Generation Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_generationTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_generationTimeout_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__GENERATION_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Generation Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_generationProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_generationProperties_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__GENERATION_PROPERTIES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Generation Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_generationServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_generationServices_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__GENERATION_SERVICES,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Generation Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_generationArguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_generationArguments_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__GENERATION_ARGUMENTS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {
					"org.eclipse.ui.views.properties.expert"
				 }));
	}

	/**
	 * This adds a property descriptor for the Generation Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGenerationCodePropertyDescriptor(Object object) {
		CompletionProviderFactory autoCompletionProvider = null; // TODO
		itemPropertyDescriptors.add
			(new ExtensibleDialogItemPropertyDescriptor(
				createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_generationCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_generationCode_feature", "_UI_Component_type"),
				 AmurPackage.Literals.COMPONENT__GENERATION_CODE,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GenerationPropertyCategory"),
				 new String[] {IPropertySheetEntry.FILTER_ID_EXPERT}), null, autoCompletionProvider, "text/java"));
	}

	/**
	 * This adds a property descriptor for the Implementation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IItemPropertyDescriptor createImplementationTypePropertyDescriptor(final Object object) {
		ItemPropertyDescriptor itpd = createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						 getResourceLocator(),
						 getString("_UI_Component_implementationType_feature"),
						 getString("_UI_PropertyDescriptor_description", "_UI_Component_implementationType_feature", "_UI_Component_type"),
						 AmurPackage.Literals.COMPONENT__IMPLEMENTATION_TYPE,
						 true,
						 false,
						 false,
						 null,
						 getString("_UI_GeneralPropertyCategory"),
						 null);
		
		DialogItemPropertyDescriptorImpl dipd = new DialogItemPropertyDescriptorImpl(itpd, null) {

			@Override
			public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
				ImplementationTypeDialog dialog = new ImplementationTypeDialog(
						cellEditorWindow.getShell(), 
						getString("_UI_Component_implementationType_feature"), 
						(Component) object,
						((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory());
				return dialog.open()==Dialog.OK ? dialog.getValue() : null;
			}
			
			@Override
			public void setPropertyValue(Object object, Object value) {
				if (value instanceof NoImplementationType) {
					value = null;
				}
				
				super.setPropertyValue(object, value);
			}
			
		};
		
		return dipd;
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
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return AmurEditPlugin.INSTANCE.adjustImage(object, getAdapterFactory(), overlayImage(object, org.nasdanika.common.Activator.getImageDescriptor("icons/crystal_project/16x16/actions/runprog.png")));
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
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			typeName(object, "_UI_Component_type") :
			typeName(object, "_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case AmurPackage.COMPONENT__NAME:
			case AmurPackage.COMPONENT__DESCRIPTION:
			case AmurPackage.COMPONENT__ID:
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
			case AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE:
			case AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE:
			case AmurPackage.COMPONENT__RESOURCE_PATH:
			case AmurPackage.COMPONENT__GENERATION_TIMEOUT:
			case AmurPackage.COMPONENT__GENERATION_PROPERTIES:
			case AmurPackage.COMPONENT__GENERATION_SERVICES:
			case AmurPackage.COMPONENT__GENERATION_ARGUMENTS:
			case AmurPackage.COMPONENT__GENERATION_CODE:
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

	@Override
	public IFigureFilter getFigureFilter(Object object) {
		// Delegates to the plugin for centralized caching.
		return AmurEditPlugin.INSTANCE.getFigureFilter(object, getAdapterFactory());			
	}
	
	protected String typeName(Object object, String key) {
		if (object instanceof Component 
				&& ((Component) object).getImplementationType()!=null
				&& ((Component) object).getImplementationType().getName()!=null
				&& ((Component) object).getImplementationType().getName().trim().length()>0) {
			return ((Component) object).getImplementationType().getName();
		}
		return getString(key);
	}

}
