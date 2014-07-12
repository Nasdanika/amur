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
 * A representation of the model object '<em><b>Abstract Connection Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source of connections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.AbstractConnectionSource#getOutboundConnections <em>Outbound Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getAbstractConnectionSource()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface AbstractConnectionSource extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Outbound Connections</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.amur.Connection}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outbound connections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound Connections</em>' reference list.
	 * @see org.nasdanika.amur.AmurPackage#getAbstractConnectionSource_OutboundConnections()
	 * @see org.nasdanika.amur.Connection#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Connection> getOutboundConnections();

} // AbstractConnectionSource
