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
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.Gateway;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.GatewayImpl#getOutboundConnections <em>Outbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.GatewayImpl#getInboundConnections <em>Inbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.GatewayImpl#getMergeSource <em>Merge Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GatewayImpl extends ComponentImpl implements Gateway {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getOutboundConnections() {
		return (EList<Connection>)eDynamicGet(AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS, AmurPackage.Literals.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getInboundConnections() {
		return (EList<Connection>)eDynamicGet(AmurPackage.GATEWAY__INBOUND_CONNECTIONS, AmurPackage.Literals.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource getMergeSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.GATEWAY__MERGE_SOURCE, AmurPackage.Literals.GATEWAY__MERGE_SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource basicGetMergeSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.GATEWAY__MERGE_SOURCE, AmurPackage.Literals.GATEWAY__MERGE_SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergeSource(AbstractConnectionSource newMergeSource) {
		eDynamicSet(AmurPackage.GATEWAY__MERGE_SOURCE, AmurPackage.Literals.GATEWAY__MERGE_SOURCE, newMergeSource);
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutboundConnections()).basicAdd(otherEnd, msgs);
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundConnections()).basicAdd(otherEnd, msgs);
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				return ((InternalEList<?>)getOutboundConnections()).basicRemove(otherEnd, msgs);
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				return ((InternalEList<?>)getInboundConnections()).basicRemove(otherEnd, msgs);
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				return getOutboundConnections();
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				return getInboundConnections();
			case AmurPackage.GATEWAY__MERGE_SOURCE:
				if (resolve) return getMergeSource();
				return basicGetMergeSource();
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				getOutboundConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				getInboundConnections().clear();
				getInboundConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case AmurPackage.GATEWAY__MERGE_SOURCE:
				setMergeSource((AbstractConnectionSource)newValue);
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				return;
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				getInboundConnections().clear();
				return;
			case AmurPackage.GATEWAY__MERGE_SOURCE:
				setMergeSource((AbstractConnectionSource)null);
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
			case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS:
				return !getOutboundConnections().isEmpty();
			case AmurPackage.GATEWAY__INBOUND_CONNECTIONS:
				return !getInboundConnections().isEmpty();
			case AmurPackage.GATEWAY__MERGE_SOURCE:
				return basicGetMergeSource() != null;
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
				case AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS: return AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractConnectionTarget.class) {
			switch (derivedFeatureID) {
				case AmurPackage.GATEWAY__INBOUND_CONNECTIONS: return AmurPackage.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS;
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
				case AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS: return AmurPackage.GATEWAY__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractConnectionTarget.class) {
			switch (baseFeatureID) {
				case AmurPackage.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS: return AmurPackage.GATEWAY__INBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GatewayImpl
