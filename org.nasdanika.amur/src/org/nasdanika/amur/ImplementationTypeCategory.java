/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extension category.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.ImplementationTypeCategory#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.amur.ImplementationTypeCategory#getExternalSiblings <em>External Siblings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeCategory()
 * @model
 * @generated
 */
public interface ImplementationTypeCategory extends ImplementationTypeDescriptor {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.amur.ImplementationTypeDescriptor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension category children - extensions or sub-categories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeCategory_Children()
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ImplementationTypeDescriptor> getChildren();

	/**
	 * Returns the value of the '<em><b>External Siblings</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.ImplementationTypeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References to extensions defined elsewhere. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Siblings</em>' reference list.
	 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeCategory_ExternalSiblings()
	 * @model
	 * @generated
	 */
	EList<ImplementationTypeDescriptor> getExternalSiblings();

} // ImplementationTypeCategory
