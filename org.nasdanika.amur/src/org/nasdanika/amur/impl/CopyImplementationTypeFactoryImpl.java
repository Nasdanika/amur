/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentType;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.CopyImplementationTypeFactory;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Gateway;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeCategory;
import org.nasdanika.amur.ImplementationTypeFactory;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Implementation Type Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getImplementationTypeReference <em>Implementation Type Reference</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyImplementationTypeFactoryImpl extends CDOObjectImpl implements CopyImplementationTypeFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CopyImplementationTypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getKeywords() {
		return (EList<String>)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTypeCategory getParent() {
		return (ImplementationTypeCategory)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ImplementationTypeCategory newParent) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecializes() {
		return (String)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializes(String newSpecializes) {
		eSet(AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, newSpecializes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return (ImplementationType)eGet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(ImplementationType newImplementationType) {
		eSet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, newImplementationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationTypeReference() {
		return (ImplementationType)eGet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationTypeReference(ImplementationType newImplementationTypeReference) {
		eSet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, newImplementationTypeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return (String)eGet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		eSet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComponentType> getAppliesTo() {
		return (EList<ComponentType>)eGet(AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ImplementationType createImplementationType(Component modelElement) {
		ImplementationType ret = null;
		if (getImplementationType()==null) {
			if (getImplementationTypeReference()==null) {
				throw new AmurException("Both implementation type and implementation type reference are null");
			}
			ret = EcoreUtil.copy(getImplementationTypeReference());
		} else {
			if (getImplementationTypeReference()!=null) {
				throw new AmurException("Both implementation type and implementation type reference are not null");
			}
			ret = EcoreUtil.copy(getImplementationType());
		}
		
		ret.setId(getId());
		ret.setName(getName());
		ret.setDescription(getDescription());
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isApplicable(Component component) {
		boolean ret = getAppliesTo().isEmpty();
		if (!ret) {
			Z: for (ComponentType met: getAppliesTo()) {
				switch (met) {
				case CALL:
					if (component instanceof Call) {
						ret = true;
						break Z;
					}
					break;
				case COMPONENT:
					if (component instanceof Component) {
						ret = true;
						break Z;
					}
					break;
				case COMPOSITE:
					if (component instanceof Composite) {
						ret = true;
						break Z;
					}
					break;
				case CONTAINER: 
					if (component instanceof Container) {
						ret = true;
						break Z;
					}
					break;
				case ERROR_HANDLER:
					if (component instanceof ErrorHandler) {
						ret = true;
						break Z;
					}
					break;
				case ERROR_TRANSITION:
					if (component instanceof ErrorTransition) {
						ret = true;
						break Z;
					}
					break;
				case NODE:
					if (component instanceof Node) {
						ret = true;
						break Z;
					}
					break;
				case GATEWAY:
					if (component instanceof Gateway) {
						ret = true;
						break Z;
					}
					break;
				case INPUT_PORT:
					if (component instanceof InputPort) {
						ret = true;
						break Z;
					}
					break;
				case OUTPUT_PORT:
					if (component instanceof OutputPort) {
						ret = true;
						break Z;
					}
					break;
				case REFERENCE:
					if (component instanceof Reference) {
						ret = true;
						break Z;
					}
					break;
				case TRANSITION:
					if (component instanceof Transition) {
						ret = true;
						break Z;
					}
					break;					
				default:
					throw new IllegalArgumentException("Unexpected model element type: "+met);								
				}				
			}
		}
		
		if (!ret) {
			return false;
		}
		
		if (getSelector()==null || getSelector().trim().length()==0) {
			return true;
		}
		
//		try {
//			ScriptEvaluator se = new ScriptEvaluator(
//					new Scanner("selector", new StringReader(getSelector())), 
//					boolean.class, 
//					new String[] {"implementationType", "component"},  
//					new Class[] {getImplementationType()==null ? getImplementationTypeReference().getClass() : getImplementationType().getClass(), component.getClass() }, 
//					new Class[] {Exception.class},
//					component.getClass().getClassLoader());
//			
//			return Boolean.TRUE.equals(se.evaluate(new Object[] {getImplementationType()==null ? getImplementationTypeReference() : getImplementationType(), component}));
//		} catch (Exception e) {
//			throw new AmurException("Error evaluating selector", e);
//		}
		
		throw new UnsupportedOperationException("Selector is not supported");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ImplementationTypeFactory> getImplementationTypeFactories(Component modelElement) {
		if (isApplicable(modelElement)) {
			return (EList<ImplementationTypeFactory>) ECollections.singletonEList((ImplementationTypeFactory) this);
		}
		return ECollections.emptyEList();
	}

} //CopyImplementationTypeFactoryImpl
