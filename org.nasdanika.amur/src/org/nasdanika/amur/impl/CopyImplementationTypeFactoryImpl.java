/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSpecializes() <em>Specializes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

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
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getKeywords() {
		return (EList<String>)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTypeCategory getParent() {
		return (ImplementationTypeCategory)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ImplementationTypeCategory newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ImplementationTypeCategory newParent) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION, AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION, AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecializes() {
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializes(String newSpecializes) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, AmurPackage.Literals.IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES, newSpecializes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return (ImplementationType)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationType(ImplementationType newImplementationType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImplementationType, AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationType(ImplementationType newImplementationType) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE, newImplementationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationTypeReference() {
		return (ImplementationType)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType basicGetImplementationTypeReference() {
		return (ImplementationType)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationTypeReference(ImplementationType newImplementationTypeReference) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE, newImplementationTypeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return (String)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		eDynamicSet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR, newSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ComponentType> getAppliesTo() {
		return (EList<ComponentType>)eDynamicGet(AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO, AmurPackage.Literals.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO, true, true);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ImplementationTypeCategory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				return basicSetParent(null, msgs);
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				return basicSetImplementationType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				return eInternalContainer().eInverseRemove(this, AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN, ImplementationTypeCategory.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID:
				return getId();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME:
				return getName();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION:
				return getDescription();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS:
				return getKeywords();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				return getParent();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION:
				return getVersion();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES:
				return getSpecializes();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE:
				if (resolve) return getImplementationTypeReference();
				return basicGetImplementationTypeReference();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR:
				return getSelector();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO:
				return getAppliesTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID:
				setId((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME:
				setName((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				setParent((ImplementationTypeCategory)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION:
				setVersion((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES:
				setSpecializes((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE:
				setImplementationTypeReference((ImplementationType)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR:
				setSelector((String)newValue);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends ComponentType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS:
				getKeywords().clear();
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				setParent((ImplementationTypeCategory)null);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES:
				setSpecializes(SPECIALIZES_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)null);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE:
				setImplementationTypeReference((ImplementationType)null);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO:
				getAppliesTo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS:
				return !getKeywords().isEmpty();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT:
				return getParent() != null;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION:
				return VERSION_EDEFAULT == null ? getVersion() != null : !VERSION_EDEFAULT.equals(getVersion());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES:
				return SPECIALIZES_EDEFAULT == null ? getSpecializes() != null : !SPECIALIZES_EDEFAULT.equals(getSpecializes());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE:
				return getImplementationType() != null;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE:
				return basicGetImplementationTypeReference() != null;
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR:
				return SELECTOR_EDEFAULT == null ? getSelector() != null : !SELECTOR_EDEFAULT.equals(getSelector());
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO:
				return !getAppliesTo().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CopyImplementationTypeFactoryImpl
