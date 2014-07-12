/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
	@SuppressWarnings("unchecked")
	public EList<ImplementationTypeDescriptor> getChildren() {
		return (EList<ImplementationTypeDescriptor>)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_CATEGORY__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ImplementationTypeDescriptor> getExternalSiblings() {
		return (EList<ImplementationTypeDescriptor>)eGet(AmurPackage.Literals.IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS, true);
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

} //ImplementationTypeCategoryImpl
