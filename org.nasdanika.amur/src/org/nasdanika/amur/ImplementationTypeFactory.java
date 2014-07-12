/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Type Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extension factory creates extensions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.ImplementationTypeFactory#getVersion <em>Version</em>}</li>
 *   <li>{@link org.nasdanika.amur.ImplementationTypeFactory#getSpecializes <em>Specializes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ImplementationTypeFactory extends ImplementationTypeDescriptor {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeFactory_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.ImplementationTypeFactory#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute allows to establish specialization relationship. E.g. FTP activity is a specialization of Activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specializes</em>' attribute.
	 * @see #setSpecializes(String)
	 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeFactory_Specializes()
	 * @model
	 * @generated
	 */
	String getSpecializes();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.ImplementationTypeFactory#getSpecializes <em>Specializes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' attribute.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instantiates extension.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	ImplementationType createImplementationType(Component modelElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true if selector is empty or evaluates to true.
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable(Component component);

} // ImplementationTypeFactory
