/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ValidationContributor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.CallImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.CallImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends ComponentImpl implements Call {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource getSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.CALL__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource basicGetSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.CALL__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractConnectionSource newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, AmurPackage.CALL__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractConnectionSource newSource) {
		eDynamicSet(AmurPackage.CALL__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget getTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.CALL__TARGET, AmurPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget basicGetTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.CALL__TARGET, AmurPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractConnectionTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, AmurPackage.CALL__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractConnectionTarget newTarget) {
		eDynamicSet(AmurPackage.CALL__TARGET, AmurPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.CALL__SOURCE:
				AbstractConnectionSource source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, AbstractConnectionSource.class, msgs);
				return basicSetSource((AbstractConnectionSource)otherEnd, msgs);
			case AmurPackage.CALL__TARGET:
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
			case AmurPackage.CALL__SOURCE:
				return basicSetSource(null, msgs);
			case AmurPackage.CALL__TARGET:
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
			case AmurPackage.CALL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmurPackage.CALL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case AmurPackage.CALL__SOURCE:
				setSource((AbstractConnectionSource)newValue);
				return;
			case AmurPackage.CALL__TARGET:
				setTarget((AbstractConnectionTarget)newValue);
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
			case AmurPackage.CALL__SOURCE:
				setSource((AbstractConnectionSource)null);
				return;
			case AmurPackage.CALL__TARGET:
				setTarget((AbstractConnectionTarget)null);
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
			case AmurPackage.CALL__SOURCE:
				return basicGetSource() != null;
			case AmurPackage.CALL__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		
		AbstractConnectionSource source = getSource();
		if (source instanceof Component) {
			ImplementationType pit = ((Component) source).getImplementationType();
			if (pit instanceof ValidationContributor) {
				result = ((ValidationContributor) pit).validate(this, AmurPackage.eINSTANCE.getAbstractConnectionSource_OutboundConnections(), diagnostics, context) && result;
			}
		}
		
		AbstractConnectionTarget target = getTarget();
		if (target instanceof Component) {
			ImplementationType pit = ((Component) target).getImplementationType();
			if (pit instanceof ValidationContributor) {
				result = ((ValidationContributor) pit).validate(this, AmurPackage.eINSTANCE.getAbstractConnectionTarget_InboundConnections(), diagnostics, context) && result;
			}
		}
		
		return result;
	}	

} //CallImpl
