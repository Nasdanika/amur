/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Connection Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connection target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.AbstractConnectionTarget#getInboundConnections <em>Inbound Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getAbstractConnectionTarget()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AbstractConnectionTarget extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Inbound Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.Connection}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inbound connections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Connections</em>' reference list.
	 * @see org.nasdanika.amur.AmurPackage#getAbstractConnectionTarget_InboundConnections()
	 * @see org.nasdanika.amur.Connection#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Connection> getInboundConnections();

} // AbstractConnectionTarget
