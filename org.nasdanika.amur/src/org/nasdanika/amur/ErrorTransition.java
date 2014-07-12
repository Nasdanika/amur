/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transition which is activated in the case of exception in the source activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.ErrorTransition#getErrorType <em>Error Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getErrorTransition()
 * @model
 * @generated
 */
public interface ErrorTransition extends Connection {
	/**
	 * Returns the value of the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error (exception) type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Type</em>' attribute.
	 * @see #setErrorType(String)
	 * @see org.nasdanika.amur.AmurPackage#getErrorTransition_ErrorType()
	 * @model
	 * @generated
	 */
	String getErrorType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.ErrorTransition#getErrorType <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Type</em>' attribute.
	 * @see #getErrorType()
	 * @generated
	 */
	void setErrorType(String value);

} // ErrorTransition
