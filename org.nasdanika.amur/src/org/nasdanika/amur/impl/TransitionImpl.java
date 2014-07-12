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
import org.nasdanika.amur.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.TransitionImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ComponentImpl implements Transition {
	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource getSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource basicGetSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractConnectionSource newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, AmurPackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractConnectionSource newSource) {
		eDynamicSet(AmurPackage.TRANSITION__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget getTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget basicGetTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractConnectionTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, AmurPackage.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractConnectionTarget newTarget) {
		eDynamicSet(AmurPackage.TRANSITION__TARGET, AmurPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return (Integer)eDynamicGet(AmurPackage.TRANSITION__ORDER, AmurPackage.Literals.TRANSITION__ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		eDynamicSet(AmurPackage.TRANSITION__ORDER, AmurPackage.Literals.TRANSITION__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return (String)eDynamicGet(AmurPackage.TRANSITION__GUARD, AmurPackage.Literals.TRANSITION__GUARD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		eDynamicSet(AmurPackage.TRANSITION__GUARD, AmurPackage.Literals.TRANSITION__GUARD, newGuard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.TRANSITION__SOURCE:
				AbstractConnectionSource source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, AbstractConnectionSource.class, msgs);
				return basicSetSource((AbstractConnectionSource)otherEnd, msgs);
			case AmurPackage.TRANSITION__TARGET:
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
			case AmurPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case AmurPackage.TRANSITION__TARGET:
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
			case AmurPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmurPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmurPackage.TRANSITION__ORDER:
				return getOrder();
			case AmurPackage.TRANSITION__GUARD:
				return getGuard();
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
			case AmurPackage.TRANSITION__SOURCE:
				setSource((AbstractConnectionSource)newValue);
				return;
			case AmurPackage.TRANSITION__TARGET:
				setTarget((AbstractConnectionTarget)newValue);
				return;
			case AmurPackage.TRANSITION__ORDER:
				setOrder((Integer)newValue);
				return;
			case AmurPackage.TRANSITION__GUARD:
				setGuard((String)newValue);
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
			case AmurPackage.TRANSITION__SOURCE:
				setSource((AbstractConnectionSource)null);
				return;
			case AmurPackage.TRANSITION__TARGET:
				setTarget((AbstractConnectionTarget)null);
				return;
			case AmurPackage.TRANSITION__ORDER:
				setOrder(ORDER_EDEFAULT);
				return;
			case AmurPackage.TRANSITION__GUARD:
				setGuard(GUARD_EDEFAULT);
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
			case AmurPackage.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case AmurPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case AmurPackage.TRANSITION__ORDER:
				return getOrder() != ORDER_EDEFAULT;
			case AmurPackage.TRANSITION__GUARD:
				return GUARD_EDEFAULT == null ? getGuard() != null : !GUARD_EDEFAULT.equals(getGuard());
		}
		return super.eIsSet(featureID);
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
//		boolean result = super.validate(diagnostics, context);
//		if (diagnostics != null) { 
//			if (getSource() == null) {			
//				diagnostics.add
//					(new BasicDiagnostic
//						(Diagnostic.ERROR,
//						 AmurValidator.DIAGNOSTIC_SOURCE,
//						 AmurValidator.COMPONENT__VALIDATE,
//						 "Connection source is null",
//						 new Object [] { this }));
//				result = false;
//			}
//				
//			if (getTarget() == null) {			
//				diagnostics.add
//					(new BasicDiagnostic
//						(Diagnostic.ERROR,
//						 AmurValidator.DIAGNOSTIC_SOURCE,
//						 AmurValidator.COMPONENT__VALIDATE,
//						 "Connection target is null",
//						 new Object [] { this }));
//				result = false;
//			}
//			
//		}
//						
//		return result;
//	}
	
} //TransitionImpl
