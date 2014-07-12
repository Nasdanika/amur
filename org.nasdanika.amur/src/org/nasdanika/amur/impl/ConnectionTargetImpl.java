/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ConnectionTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ConnectionTargetImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionTargetImpl extends ComponentImpl implements ConnectionTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.CONNECTION_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getInboundConnections() {
		return (EList<Connection>)eGet(AmurPackage.Literals.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractConnectionTarget.class) {
			switch (derivedFeatureID) {
				case AmurPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS: return AmurPackage.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractConnectionTarget.class) {
			switch (baseFeatureID) {
				case AmurPackage.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS: return AmurPackage.CONNECTION_TARGET__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionTargetImpl
