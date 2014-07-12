/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Merges several incoming invocations into one and dispatches resulting invocation to other activities. For this activity code becomes the body of join() method.
 * TODO - validateInput and partialJoin attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.Gateway#getMergeSource <em>Merge Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends Component, AbstractConnectionSource, AbstractConnectionTarget {
	/**
	 * Returns the value of the '<em><b>Merge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For some types of merges it is required to know source of activations to be merged to make sure that all activations are merged.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merge Source</em>' reference.
	 * @see #setMergeSource(AbstractConnectionSource)
	 * @see org.nasdanika.amur.AmurPackage#getGateway_MergeSource()
	 * @model
	 * @generated
	 */
	AbstractConnectionSource getMergeSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Gateway#getMergeSource <em>Merge Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Source</em>' reference.
	 * @see #getMergeSource()
	 * @generated
	 */
	void setMergeSource(AbstractConnectionSource value);

} // Gateway
