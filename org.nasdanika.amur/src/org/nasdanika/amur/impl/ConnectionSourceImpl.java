/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ConnectionSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ConnectionSourceImpl#getOutboundConnections <em>Outbound Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionSourceImpl extends ComponentImpl implements ConnectionSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.CONNECTION_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getOutboundConnections() {
		return (EList<Connection>)eDynamicGet(AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, AmurPackage.Literals.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundConnections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				return ((InternalEList<?>)getOutboundConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				return getOutboundConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				getOutboundConnections().addAll((Collection<? extends Connection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS:
				return !getOutboundConnections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractConnectionSource.class) {
			switch (derivedFeatureID) {
				case AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS: return AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS;
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
		if (baseClass == AbstractConnectionSource.class) {
			switch (baseFeatureID) {
				case AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS: return AmurPackage.CONNECTION_SOURCE__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionSourceImpl
