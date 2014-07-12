/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.ErrorTransition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ErrorTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ErrorTransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ErrorTransitionImpl#getErrorType <em>Error Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorTransitionImpl extends ComponentImpl implements ErrorTransition {
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
	protected ErrorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.ERROR_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource getSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.ERROR_TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource basicGetSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.ERROR_TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractConnectionSource newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, AmurPackage.ERROR_TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractConnectionSource newSource) {
		eDynamicSet(AmurPackage.ERROR_TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget getTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.ERROR_TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget basicGetTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.ERROR_TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractConnectionTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, AmurPackage.ERROR_TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractConnectionTarget newTarget) {
		eDynamicSet(AmurPackage.ERROR_TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorType() {
		return (String)eDynamicGet(AmurPackage.ERROR_TRANSITION__ERROR_TYPE, AmurPackage.Literals.ERROR_TRANSITION__ERROR_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorType(String newErrorType) {
		eDynamicSet(AmurPackage.ERROR_TRANSITION__ERROR_TYPE, AmurPackage.Literals.ERROR_TRANSITION__ERROR_TYPE, newErrorType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				AbstractConnectionSource source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, AbstractConnectionSource.class, msgs);
				return basicSetSource((AbstractConnectionSource)otherEnd, msgs);
			case AmurPackage.ERROR_TRANSITION__TARGET:
				AbstractConnectionTarget target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, AmurPackage.ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS, AbstractConnectionTarget.class, msgs);
				return basicSetTarget((AbstractConnectionTarget)otherEnd, msgs);
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
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case AmurPackage.ERROR_TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmurPackage.ERROR_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmurPackage.ERROR_TRANSITION__ERROR_TYPE:
				return getErrorType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				setSource((AbstractConnectionSource)newValue);
				return;
			case AmurPackage.ERROR_TRANSITION__TARGET:
				setTarget((AbstractConnectionTarget)newValue);
				return;
			case AmurPackage.ERROR_TRANSITION__ERROR_TYPE:
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
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				setSource((AbstractConnectionSource)null);
				return;
			case AmurPackage.ERROR_TRANSITION__TARGET:
				setTarget((AbstractConnectionTarget)null);
				return;
			case AmurPackage.ERROR_TRANSITION__ERROR_TYPE:
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
			case AmurPackage.ERROR_TRANSITION__SOURCE:
				return basicGetSource() != null;
			case AmurPackage.ERROR_TRANSITION__TARGET:
				return basicGetTarget() != null;
			case AmurPackage.ERROR_TRANSITION__ERROR_TYPE:
				return ERROR_TYPE_EDEFAULT == null ? getErrorType() != null : !ERROR_TYPE_EDEFAULT.equals(getErrorType());
		}
		return super.eIsSet(featureID);
	}

} //ErrorTransitionImpl
