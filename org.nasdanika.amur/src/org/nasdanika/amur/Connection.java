/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connection between source and target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.amur.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getConnection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Connection extends Component {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.AbstractConnectionSource#getOutboundConnections <em>Outbound Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractConnectionSource)
	 * @see org.nasdanika.amur.AmurPackage#getConnection_Source()
	 * @see org.nasdanika.amur.AbstractConnectionSource#getOutboundConnections
	 * @model opposite="outboundConnections" required="true"
	 * @generated
	 */
	AbstractConnectionSource getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractConnectionSource value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.AbstractConnectionTarget#getInboundConnections <em>Inbound Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connection target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractConnectionTarget)
	 * @see org.nasdanika.amur.AmurPackage#getConnection_Target()
	 * @see org.nasdanika.amur.AbstractConnectionTarget#getInboundConnections
	 * @model opposite="inboundConnections" required="true"
	 * @generated
	 */
	AbstractConnectionTarget getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractConnectionTarget value);

} // Connection
