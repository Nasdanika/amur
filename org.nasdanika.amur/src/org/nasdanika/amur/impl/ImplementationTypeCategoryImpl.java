/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationTypeCategory;
import org.nasdanika.amur.ImplementationTypeDescriptor;
import org.nasdanika.amur.ImplementationTypeFactory;
import org.nasdanika.amur.ImplementationTypeProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Type Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl#getExternalSiblings <em>External Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationTypeCategoryImpl extends CDOObjectImpl implements ImplementationTypeCategory {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ImplementationTypeCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.IMPLEMENTATION_TYPE_CATEGORY;
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
		return (String)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getKeywords() {
		return (EList<String>)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTypeCategory getParent() {
		return (ImplementationTypeCategory)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ImplementationTypeCategory newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ImplementationTypeCategory newParent) {
		eDynamicSet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT, AmurPackage.Literals.IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationTypeDescriptor> getChildren() {
		return (EList<ImplementationTypeDescriptor>)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN, AmurPackage.Literals.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationTypeDescriptor> getExternalSiblings() {
		return (EList<ImplementationTypeDescriptor>)eDynamicGet(AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS, AmurPackage.Literals.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ImplementationTypeFactory> getImplementationTypeFactories(Component modelElement) {
		EList<ImplementationTypeFactory> ret = new BasicEList<ImplementationTypeFactory>();
		for (ImplementationTypeDescriptor child: getChildren()) {
			if (child instanceof ImplementationTypeProvider) {
				ret.addAll(((ImplementationTypeProvider) child).getImplementationTypeFactories(modelElement));
			}
		}
		for (ImplementationTypeDescriptor sibling: getExternalSiblings()) {
			if (sibling instanceof ImplementationTypeProvider) {
				ret.addAll(((ImplementationTypeProvider) sibling).getImplementationTypeFactories(modelElement));
			}
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ImplementationTypeCategory)otherEnd, msgs);
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				return basicSetParent(null, msgs);
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID:
				return getId();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME:
				return getName();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION:
				return getDescription();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS:
				return getKeywords();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				return getParent();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				return getChildren();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS:
				return getExternalSiblings();
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID:
				setId((String)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME:
				setName((String)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				setParent((ImplementationTypeCategory)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ImplementationTypeDescriptor>)newValue);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS:
				getExternalSiblings().clear();
				getExternalSiblings().addAll((Collection<? extends ImplementationTypeDescriptor>)newValue);
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID:
				setId(ID_EDEFAULT);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS:
				getKeywords().clear();
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				setParent((ImplementationTypeCategory)null);
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				getChildren().clear();
				return;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS:
				getExternalSiblings().clear();
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
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS:
				return !getKeywords().isEmpty();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__PARENT:
				return getParent() != null;
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN:
				return !getChildren().isEmpty();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS:
				return !getExternalSiblings().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationTypeCategoryImpl
