/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Handler for exceptions not taken care of by error transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.ErrorHandler#getErrorType <em>Error Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getErrorHandler()
 * @model
 * @generated
 */
public interface ErrorHandler extends Component, AbstractConnectionSource {
	/**
	 * Returns the value of the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error (exception) type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Type</em>' attribute.
	 * @see #setErrorType(String)
	 * @see org.nasdanika.amur.AmurPackage#getErrorHandler_ErrorType()
	 * @model
	 * @generated
	 */
	String getErrorType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.ErrorHandler#getErrorType <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Type</em>' attribute.
	 * @see #getErrorType()
	 * @generated
	 */
	void setErrorType(String value);

} // ErrorHandler
