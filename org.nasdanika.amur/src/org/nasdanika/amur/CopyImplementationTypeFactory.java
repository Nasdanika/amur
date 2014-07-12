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
 * A representation of the model object '<em><b>Copy Implementation Type Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Creates an extension by making a deep copy of the contained extension or referenced extension.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationTypeReference <em>Implementation Type Reference</em>}</li>
 *   <li>{@link org.nasdanika.amur.CopyImplementationTypeFactory#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.nasdanika.amur.CopyImplementationTypeFactory#getAppliesTo <em>Applies To</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getCopyImplementationTypeFactory()
 * @model
 * @generated
 */
public interface CopyImplementationTypeFactory extends ImplementationTypeFactory {
	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contained extension, mutually exclusive with extensionRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Type</em>' containment reference.
	 * @see #setImplementationType(ImplementationType)
	 * @see org.nasdanika.amur.AmurPackage#getCopyImplementationTypeFactory_ImplementationType()
	 * @model containment="true"
	 * @generated
	 */
	ImplementationType getImplementationType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationType <em>Implementation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' containment reference.
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(ImplementationType value);

	/**
	 * Returns the value of the '<em><b>Implementation Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to external extension. Mutually exclusive with contained extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation Type Reference</em>' reference.
	 * @see #setImplementationTypeReference(ImplementationType)
	 * @see org.nasdanika.amur.AmurPackage#getCopyImplementationTypeFactory_ImplementationTypeReference()
	 * @model
	 * @generated
	 */
	ImplementationType getImplementationTypeReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationTypeReference <em>Implementation Type Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type Reference</em>' reference.
	 * @see #getImplementationTypeReference()
	 * @generated
	 */
	void setImplementationTypeReference(ImplementationType value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fragment of Java code (method body) which returns true if given extension is applicable for a given diagram element. Takes two parameters - extension and diagramElement. If selector is empty then extension is cosidered to be applicable to all diagram elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.nasdanika.amur.AmurPackage#getCopyImplementationTypeFactory_Selector()
	 * @model
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' attribute list.
	 * The list contents are of type {@link org.nasdanika.amur.ComponentType}.
	 * The literals are from the enumeration {@link org.nasdanika.amur.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' attribute list.
	 * @see org.nasdanika.amur.ComponentType
	 * @see org.nasdanika.amur.AmurPackage#getCopyImplementationTypeFactory_AppliesTo()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getAppliesTo();

} // CopyImplementationTypeFactory
