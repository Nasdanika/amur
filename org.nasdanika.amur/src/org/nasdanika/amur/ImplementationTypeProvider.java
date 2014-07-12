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
 * A representation of the model object '<em><b>Implementation Type Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extension provider.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.amur.AmurPackage#getImplementationTypeProvider()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ImplementationTypeProvider extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of factories for possible implementation for given diagram element.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<ImplementationTypeFactory> getImplementationTypeFactories(Component modelElement);

} // ImplementationTypeProvider
