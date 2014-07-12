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
import org.nasdanika.amur.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ReferenceImpl#isCache <em>Cache</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends ComponentImpl implements Reference {
	/**
	 * The default value of the '{@link #isCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCache()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CACHE_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource getSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.REFERENCE__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionSource basicGetSource() {
		return (AbstractConnectionSource)eDynamicGet(AmurPackage.REFERENCE__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractConnectionSource newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, AmurPackage.REFERENCE__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(AbstractConnectionSource newSource) {
		eDynamicSet(AmurPackage.REFERENCE__SOURCE, AmurPackage.Literals.CONNECTION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget getTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.REFERENCE__TARGET, AmurPackage.Literals.CONNECTION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionTarget basicGetTarget() {
		return (AbstractConnectionTarget)eDynamicGet(AmurPackage.REFERENCE__TARGET, AmurPackage.Literals.CONNECTION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractConnectionTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, AmurPackage.REFERENCE__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(AbstractConnectionTarget newTarget) {
		eDynamicSet(AmurPackage.REFERENCE__TARGET, AmurPackage.Literals.CONNECTION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCache() {
		return (Boolean)eDynamicGet(AmurPackage.REFERENCE__CACHE, AmurPackage.Literals.REFERENCE__CACHE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(boolean newCache) {
		eDynamicSet(AmurPackage.REFERENCE__CACHE, AmurPackage.Literals.REFERENCE__CACHE, newCache);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eDynamicGet(AmurPackage.REFERENCE__TYPE, AmurPackage.Literals.REFERENCE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eDynamicSet(AmurPackage.REFERENCE__TYPE, AmurPackage.Literals.REFERENCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.REFERENCE__SOURCE:
				AbstractConnectionSource source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, AmurPackage.ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS, AbstractConnectionSource.class, msgs);
				return basicSetSource((AbstractConnectionSource)otherEnd, msgs);
			case AmurPackage.REFERENCE__TARGET:
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
			case AmurPackage.REFERENCE__SOURCE:
				return basicSetSource(null, msgs);
			case AmurPackage.REFERENCE__TARGET:
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
			case AmurPackage.REFERENCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AmurPackage.REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case AmurPackage.REFERENCE__CACHE:
				return isCache();
			case AmurPackage.REFERENCE__TYPE:
				return getType();
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
			case AmurPackage.REFERENCE__SOURCE:
				setSource((AbstractConnectionSource)newValue);
				return;
			case AmurPackage.REFERENCE__TARGET:
				setTarget((AbstractConnectionTarget)newValue);
				return;
			case AmurPackage.REFERENCE__CACHE:
				setCache((Boolean)newValue);
				return;
			case AmurPackage.REFERENCE__TYPE:
				setType((String)newValue);
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
			case AmurPackage.REFERENCE__SOURCE:
				setSource((AbstractConnectionSource)null);
				return;
			case AmurPackage.REFERENCE__TARGET:
				setTarget((AbstractConnectionTarget)null);
				return;
			case AmurPackage.REFERENCE__CACHE:
				setCache(CACHE_EDEFAULT);
				return;
			case AmurPackage.REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AmurPackage.REFERENCE__SOURCE:
				return basicGetSource() != null;
			case AmurPackage.REFERENCE__TARGET:
				return basicGetTarget() != null;
			case AmurPackage.REFERENCE__CACHE:
				return isCache() != CACHE_EDEFAULT;
			case AmurPackage.REFERENCE__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
