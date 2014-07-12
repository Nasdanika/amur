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
import org.nasdanika.amur.ErrorHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ErrorHandlerImpl#getOutboundConnections <em>Outbound Connections</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ErrorHandlerImpl#getErrorType <em>Error Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorHandlerImpl extends ComponentImpl implements ErrorHandler {
	/**
	 * The default value of the '{@link #getErrorType() <em>Error Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorType()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.ERROR_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connection> getOutboundConnections() {
		return (EList<Connection>)eDynamicGet(AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS, AmurPackage.Literals.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorType() {
		return (String)eDynamicGet(AmurPackage.ERROR_HANDLER__ERROR_TYPE, AmurPackage.Literals.ERROR_HANDLER__ERROR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorType(String newErrorType) {
		eDynamicSet(AmurPackage.ERROR_HANDLER__ERROR_TYPE, AmurPackage.Literals.ERROR_HANDLER__ERROR_TYPE, newErrorType);
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
				return getOutboundConnections();
			case AmurPackage.ERROR_HANDLER__ERROR_TYPE:
				return getErrorType();
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				getOutboundConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case AmurPackage.ERROR_HANDLER__ERROR_TYPE:
				setErrorType((String)newValue);
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
				getOutboundConnections().clear();
				return;
			case AmurPackage.ERROR_HANDLER__ERROR_TYPE:
				setErrorType(ERROR_TYPE_EDEFAULT);
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
			case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS:
				return !getOutboundConnections().isEmpty();
			case AmurPackage.ERROR_HANDLER__ERROR_TYPE:
				return ERROR_TYPE_EDEFAULT == null ? getErrorType() != null : !ERROR_TYPE_EDEFAULT.equals(getErrorType());
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
				case AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS: return AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS;
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
				case AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS: return AmurPackage.ERROR_HANDLER__OUTBOUND_CONNECTIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ErrorHandlerImpl
