/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.party.PartyPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Flow package.
 * <!-- end-model-doc -->
 * @see org.nasdanika.amur.AmurFactory
 * @model kind="package"
 * @generated
 */
public interface AmurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "amur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.amur";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.amur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmurPackage eINSTANCE = org.nasdanika.amur.impl.AmurPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ComponentImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ROLES = PartyPackage.COMMON_OBJECT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__AUTHORS = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION_TYPE = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CODE_GENERATION_RESOURCE = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DOCUMENTATION_GENERATION_RESOURCE = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RESOURCE_PATH = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATION_TIMEOUT = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATION_PROPERTIES = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATION_SERVICES = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATION_ARGUMENTS = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GENERATION_CODE = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = PartyPackage.COMMON_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.CompositeImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CHILDREN = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.Connection <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.Connection
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.AbstractConnectionSource <em>Abstract Connection Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.AbstractConnectionSource
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getAbstractConnectionSource()
	 * @generated
	 */
	int ABSTRACT_CONNECTION_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Connection Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.AbstractConnectionTarget <em>Abstract Connection Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.AbstractConnectionTarget
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getAbstractConnectionTarget()
	 * @generated
	 */
	int ABSTRACT_CONNECTION_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Abstract Connection Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONNECTION_TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ConnectionSourceImpl <em>Connection Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ConnectionSourceImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnectionSource()
	 * @generated
	 */
	int CONNECTION_SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE__OUTBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SOURCE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ConnectionTargetImpl <em>Connection Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ConnectionTargetImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnectionTarget()
	 * @generated
	 */
	int CONNECTION_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET__INBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TARGET_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.NodeImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 7;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ROLES = COMPOSITE__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = COMPOSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = COMPOSITE__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__AUTHORS = COMPOSITE__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IMPLEMENTATION_TYPE = COMPOSITE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = COMPOSITE__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CODE_GENERATION_RESOURCE = COMPOSITE__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DOCUMENTATION_GENERATION_RESOURCE = COMPOSITE__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESOURCE_PATH = COMPOSITE__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATION_TIMEOUT = COMPOSITE__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATION_PROPERTIES = COMPOSITE__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATION_SERVICES = COMPOSITE__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATION_ARGUMENTS = COMPOSITE__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GENERATION_CODE = COMPOSITE__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = COMPOSITE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTBOUND_CONNECTIONS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INBOUND_CONNECTIONS = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.InputPortImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__OUTBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.OutputPortImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 9;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__INBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.GatewayImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 10;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MERGE_SOURCE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ErrorHandlerImpl <em>Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ErrorHandlerImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getErrorHandler()
	 * @generated
	 */
	int ERROR_HANDLER = 11;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ROLES = COMPONENT__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__AUTHORS = COMPONENT__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__IMPLEMENTATION_TYPE = COMPONENT__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__PARENT = COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__CODE_GENERATION_RESOURCE = COMPONENT__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__DOCUMENTATION_GENERATION_RESOURCE = COMPONENT__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__RESOURCE_PATH = COMPONENT__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__GENERATION_TIMEOUT = COMPONENT__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__GENERATION_PROPERTIES = COMPONENT__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__GENERATION_SERVICES = COMPONENT__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__GENERATION_ARGUMENTS = COMPONENT__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__GENERATION_CODE = COMPONENT__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__OUTBOUND_CONNECTIONS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER__ERROR_TYPE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ContainerImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ROLES = COMPOSITE__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = COMPOSITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ID = COMPOSITE__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__AUTHORS = COMPOSITE__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMPLEMENTATION_TYPE = COMPOSITE__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARENT = COMPOSITE__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CODE_GENERATION_RESOURCE = COMPOSITE__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DOCUMENTATION_GENERATION_RESOURCE = COMPOSITE__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESOURCE_PATH = COMPOSITE__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATION_TIMEOUT = COMPOSITE__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATION_PROPERTIES = COMPOSITE__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATION_SERVICES = COMPOSITE__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATION_ARGUMENTS = COMPOSITE__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERATION_CODE = COMPOSITE__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = COMPOSITE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Outbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OUTBOUND_CONNECTIONS = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inbound Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__INBOUND_CONNECTIONS = COMPOSITE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.TransitionImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 13;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ROLES = CONNECTION__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__AUTHORS = CONNECTION__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IMPLEMENTATION_TYPE = CONNECTION__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARENT = CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CODE_GENERATION_RESOURCE = CONNECTION__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DOCUMENTATION_GENERATION_RESOURCE = CONNECTION__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESOURCE_PATH = CONNECTION__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATION_TIMEOUT = CONNECTION__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATION_PROPERTIES = CONNECTION__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATION_SERVICES = CONNECTION__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATION_ARGUMENTS = CONNECTION__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GENERATION_CODE = CONNECTION__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ORDER = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ErrorTransitionImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getErrorTransition()
	 * @generated
	 */
	int ERROR_TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ROLES = CONNECTION__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__AUTHORS = CONNECTION__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__IMPLEMENTATION_TYPE = CONNECTION__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__PARENT = CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__CODE_GENERATION_RESOURCE = CONNECTION__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DOCUMENTATION_GENERATION_RESOURCE = CONNECTION__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__RESOURCE_PATH = CONNECTION__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__GENERATION_TIMEOUT = CONNECTION__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__GENERATION_PROPERTIES = CONNECTION__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__GENERATION_SERVICES = CONNECTION__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__GENERATION_ARGUMENTS = CONNECTION__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__GENERATION_CODE = CONNECTION__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TARGET = CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Error Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ERROR_TYPE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.CallImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 15;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ROLES = CONNECTION__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__AUTHORS = CONNECTION__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__IMPLEMENTATION_TYPE = CONNECTION__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PARENT = CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CODE_GENERATION_RESOURCE = CONNECTION__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DOCUMENTATION_GENERATION_RESOURCE = CONNECTION__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__RESOURCE_PATH = CONNECTION__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__GENERATION_TIMEOUT = CONNECTION__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__GENERATION_PROPERTIES = CONNECTION__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__GENERATION_SERVICES = CONNECTION__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__GENERATION_ARGUMENTS = CONNECTION__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__GENERATION_CODE = CONNECTION__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET = CONNECTION__TARGET;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ReferenceImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ROLES = CONNECTION__ROLES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__AUTHORS = CONNECTION__AUTHORS;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__IMPLEMENTATION_TYPE = CONNECTION__IMPLEMENTATION_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PARENT = CONNECTION__PARENT;

	/**
	 * The feature id for the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CODE_GENERATION_RESOURCE = CONNECTION__CODE_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DOCUMENTATION_GENERATION_RESOURCE = CONNECTION__DOCUMENTATION_GENERATION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__RESOURCE_PATH = CONNECTION__RESOURCE_PATH;

	/**
	 * The feature id for the '<em><b>Generation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_TIMEOUT = CONNECTION__GENERATION_TIMEOUT;

	/**
	 * The feature id for the '<em><b>Generation Properties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_PROPERTIES = CONNECTION__GENERATION_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Generation Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_SERVICES = CONNECTION__GENERATION_SERVICES;

	/**
	 * The feature id for the '<em><b>Generation Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_ARGUMENTS = CONNECTION__GENERATION_ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__GENERATION_CODE = CONNECTION__GENERATION_CODE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CACHE = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.licensing.Licenseable <em>Licenseable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.licensing.Licenseable
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getLicenseable()
	 * @generated
	 */
	int LICENSEABLE = 23;

	/**
	 * The number of structural features of the '<em>Licenseable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.ImplementationType <em>Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.ImplementationType
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationType()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__NAME = LICENSEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__ID = LICENSEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__OWNER = LICENSEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__DESCRIPTION = LICENSEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FEATURE_COUNT = LICENSEABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.ImplementationTypeProvider <em>Implementation Type Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.ImplementationTypeProvider
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeProvider()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE_PROVIDER = 21;

	/**
	 * The number of structural features of the '<em>Implementation Type Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.ImplementationTypeDescriptor <em>Implementation Type Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeDescriptor()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR__ID = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR__NAME = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Implementation Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT = IMPLEMENTATION_TYPE_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl <em>Implementation Type Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.ImplementationTypeCategoryImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeCategory()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE_CATEGORY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__ID = IMPLEMENTATION_TYPE_DESCRIPTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__NAME = IMPLEMENTATION_TYPE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__DESCRIPTION = IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__KEYWORDS = IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__PARENT = IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__CHILDREN = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation Type Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_CATEGORY_FEATURE_COUNT = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.ImplementationTypeFactory <em>Implementation Type Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.ImplementationTypeFactory
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeFactory()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE_FACTORY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__ID = IMPLEMENTATION_TYPE_DESCRIPTOR__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__NAME = IMPLEMENTATION_TYPE_DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION = IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__KEYWORDS = IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__PARENT = IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__VERSION = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implementation Type Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT = IMPLEMENTATION_TYPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl <em>Copy Implementation Type Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getCopyImplementationTypeFactory()
	 * @generated
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__ID = IMPLEMENTATION_TYPE_FACTORY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__NAME = IMPLEMENTATION_TYPE_FACTORY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION = IMPLEMENTATION_TYPE_FACTORY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__KEYWORDS = IMPLEMENTATION_TYPE_FACTORY__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__PARENT = IMPLEMENTATION_TYPE_FACTORY__PARENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__VERSION = IMPLEMENTATION_TYPE_FACTORY__VERSION;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES = IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE = IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Type Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE = IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR = IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO = IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Copy Implementation Type Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT = IMPLEMENTATION_TYPE_FACTORY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.amur.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.amur.ComponentType
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 24;

	/**
	 * The meta object id for the '<em>Class Loader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.ClassLoader
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getClassLoader()
	 * @generated
	 */
	int CLASS_LOADER = 25;

	/**
	 * The meta object id for the '<em>IMenu Manager</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jface.action.IMenuManager
	 * @see org.nasdanika.amur.impl.AmurPackageImpl#getIMenuManager()
	 * @generated
	 */
	int IMENU_MANAGER = 26;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.nasdanika.amur.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.amur.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.Component#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authors</em>'.
	 * @see org.nasdanika.amur.Component#getAuthors()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.Component#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Type</em>'.
	 * @see org.nasdanika.amur.Component#getImplementationType()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ImplementationType();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.amur.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.nasdanika.amur.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getCodeGenerationResource <em>Code Generation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Generation Resource</em>'.
	 * @see org.nasdanika.amur.Component#getCodeGenerationResource()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CodeGenerationResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getDocumentationGenerationResource <em>Documentation Generation Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation Generation Resource</em>'.
	 * @see org.nasdanika.amur.Component#getDocumentationGenerationResource()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_DocumentationGenerationResource();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.Component#getResourcePath <em>Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Path</em>'.
	 * @see org.nasdanika.amur.Component#getResourcePath()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getGenerationTimeout <em>Generation Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Timeout</em>'.
	 * @see org.nasdanika.amur.Component#getGenerationTimeout()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_GenerationTimeout();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.Component#getGenerationProperties <em>Generation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generation Properties</em>'.
	 * @see org.nasdanika.amur.Component#getGenerationProperties()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_GenerationProperties();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.Component#getGenerationServices <em>Generation Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generation Services</em>'.
	 * @see org.nasdanika.amur.Component#getGenerationServices()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_GenerationServices();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.Component#getGenerationArguments <em>Generation Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generation Arguments</em>'.
	 * @see org.nasdanika.amur.Component#getGenerationArguments()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_GenerationArguments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Component#getGenerationCode <em>Generation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Code</em>'.
	 * @see org.nasdanika.amur.Component#getGenerationCode()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_GenerationCode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.nasdanika.amur.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.Composite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.amur.Composite#getChildren()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.nasdanika.amur.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.amur.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.amur.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.AbstractConnectionSource <em>Abstract Connection Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connection Source</em>'.
	 * @see org.nasdanika.amur.AbstractConnectionSource
	 * @generated
	 */
	EClass getAbstractConnectionSource();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.AbstractConnectionSource#getOutboundConnections <em>Outbound Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound Connections</em>'.
	 * @see org.nasdanika.amur.AbstractConnectionSource#getOutboundConnections()
	 * @see #getAbstractConnectionSource()
	 * @generated
	 */
	EReference getAbstractConnectionSource_OutboundConnections();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.AbstractConnectionTarget <em>Abstract Connection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connection Target</em>'.
	 * @see org.nasdanika.amur.AbstractConnectionTarget
	 * @generated
	 */
	EClass getAbstractConnectionTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.AbstractConnectionTarget#getInboundConnections <em>Inbound Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Connections</em>'.
	 * @see org.nasdanika.amur.AbstractConnectionTarget#getInboundConnections()
	 * @see #getAbstractConnectionTarget()
	 * @generated
	 */
	EReference getAbstractConnectionTarget_InboundConnections();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ConnectionSource <em>Connection Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Source</em>'.
	 * @see org.nasdanika.amur.ConnectionSource
	 * @generated
	 */
	EClass getConnectionSource();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ConnectionTarget <em>Connection Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Target</em>'.
	 * @see org.nasdanika.amur.ConnectionTarget
	 * @generated
	 */
	EClass getConnectionTarget();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.amur.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see org.nasdanika.amur.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see org.nasdanika.amur.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.nasdanika.amur.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.Gateway#getMergeSource <em>Merge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merge Source</em>'.
	 * @see org.nasdanika.amur.Gateway#getMergeSource()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_MergeSource();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ErrorHandler <em>Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Handler</em>'.
	 * @see org.nasdanika.amur.ErrorHandler
	 * @generated
	 */
	EClass getErrorHandler();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ErrorHandler#getErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Type</em>'.
	 * @see org.nasdanika.amur.ErrorHandler#getErrorType()
	 * @see #getErrorHandler()
	 * @generated
	 */
	EAttribute getErrorHandler_ErrorType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.amur.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.amur.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Transition#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.nasdanika.amur.Transition#getOrder()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see org.nasdanika.amur.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Guard();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Transition</em>'.
	 * @see org.nasdanika.amur.ErrorTransition
	 * @generated
	 */
	EClass getErrorTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ErrorTransition#getErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Type</em>'.
	 * @see org.nasdanika.amur.ErrorTransition#getErrorType()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_ErrorType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.nasdanika.amur.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.nasdanika.amur.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Reference#isCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see org.nasdanika.amur.Reference#isCache()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Cache();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.Reference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.amur.Reference#getType()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type</em>'.
	 * @see org.nasdanika.amur.ImplementationType
	 * @generated
	 */
	EClass getImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.ImplementationType#getName()
	 * @see #getImplementationType()
	 * @generated
	 */
	EAttribute getImplementationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.amur.ImplementationType#getId()
	 * @see #getImplementationType()
	 * @generated
	 */
	EAttribute getImplementationType_Id();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.amur.ImplementationType#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.nasdanika.amur.ImplementationType#getOwner()
	 * @see #getImplementationType()
	 * @generated
	 */
	EReference getImplementationType_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.ImplementationType#getDescription()
	 * @see #getImplementationType()
	 * @generated
	 */
	EAttribute getImplementationType_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ImplementationTypeCategory <em>Implementation Type Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type Category</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeCategory
	 * @generated
	 */
	EClass getImplementationTypeCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.amur.ImplementationTypeCategory#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeCategory#getChildren()
	 * @see #getImplementationTypeCategory()
	 * @generated
	 */
	EReference getImplementationTypeCategory_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.amur.ImplementationTypeCategory#getExternalSiblings <em>External Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Siblings</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeCategory#getExternalSiblings()
	 * @see #getImplementationTypeCategory()
	 * @generated
	 */
	EReference getImplementationTypeCategory_ExternalSiblings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ImplementationTypeDescriptor <em>Implementation Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type Descriptor</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor
	 * @generated
	 */
	EClass getImplementationTypeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getId()
	 * @see #getImplementationTypeDescriptor()
	 * @generated
	 */
	EAttribute getImplementationTypeDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getName()
	 * @see #getImplementationTypeDescriptor()
	 * @generated
	 */
	EAttribute getImplementationTypeDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getDescription()
	 * @see #getImplementationTypeDescriptor()
	 * @generated
	 */
	EAttribute getImplementationTypeDescriptor_Description();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keywords</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getKeywords()
	 * @see #getImplementationTypeDescriptor()
	 * @generated
	 */
	EAttribute getImplementationTypeDescriptor_Keywords();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.amur.ImplementationTypeDescriptor#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeDescriptor#getParent()
	 * @see #getImplementationTypeDescriptor()
	 * @generated
	 */
	EReference getImplementationTypeDescriptor_Parent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ImplementationTypeFactory <em>Implementation Type Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type Factory</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeFactory
	 * @generated
	 */
	EClass getImplementationTypeFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationTypeFactory#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeFactory#getVersion()
	 * @see #getImplementationTypeFactory()
	 * @generated
	 */
	EAttribute getImplementationTypeFactory_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.ImplementationTypeFactory#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specializes</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeFactory#getSpecializes()
	 * @see #getImplementationTypeFactory()
	 * @generated
	 */
	EAttribute getImplementationTypeFactory_Specializes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.ImplementationTypeProvider <em>Implementation Type Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type Provider</em>'.
	 * @see org.nasdanika.amur.ImplementationTypeProvider
	 * @generated
	 */
	EClass getImplementationTypeProvider();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.amur.CopyImplementationTypeFactory <em>Copy Implementation Type Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Implementation Type Factory</em>'.
	 * @see org.nasdanika.amur.CopyImplementationTypeFactory
	 * @generated
	 */
	EClass getCopyImplementationTypeFactory();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Type</em>'.
	 * @see org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationType()
	 * @see #getCopyImplementationTypeFactory()
	 * @generated
	 */
	EReference getCopyImplementationTypeFactory_ImplementationType();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationTypeReference <em>Implementation Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Type Reference</em>'.
	 * @see org.nasdanika.amur.CopyImplementationTypeFactory#getImplementationTypeReference()
	 * @see #getCopyImplementationTypeFactory()
	 * @generated
	 */
	EReference getCopyImplementationTypeFactory_ImplementationTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.nasdanika.amur.CopyImplementationTypeFactory#getSelector()
	 * @see #getCopyImplementationTypeFactory()
	 * @generated
	 */
	EAttribute getCopyImplementationTypeFactory_Selector();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.amur.CopyImplementationTypeFactory#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applies To</em>'.
	 * @see org.nasdanika.amur.CopyImplementationTypeFactory#getAppliesTo()
	 * @see #getCopyImplementationTypeFactory()
	 * @generated
	 */
	EAttribute getCopyImplementationTypeFactory_AppliesTo();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.licensing.Licenseable <em>Licenseable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Licenseable</em>'.
	 * @see org.nasdanika.licensing.Licenseable
	 * @model instanceClass="org.nasdanika.licensing.Licenseable"
	 * @generated
	 */
	EClass getLicenseable();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.amur.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see org.nasdanika.amur.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.ClassLoader <em>Class Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class Loader</em>'.
	 * @see java.lang.ClassLoader
	 * @model instanceClass="java.lang.ClassLoader"
	 * @generated
	 */
	EDataType getClassLoader();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jface.action.IMenuManager <em>IMenu Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IMenu Manager</em>'.
	 * @see org.eclipse.jface.action.IMenuManager
	 * @model instanceClass="org.eclipse.jface.action.IMenuManager"
	 * @generated
	 */
	EDataType getIMenuManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmurFactory getAmurFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ComponentImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__AUTHORS = eINSTANCE.getComponent_Authors();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTATION_TYPE = eINSTANCE.getComponent_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

		/**
		 * The meta object literal for the '<em><b>Code Generation Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CODE_GENERATION_RESOURCE = eINSTANCE.getComponent_CodeGenerationResource();

		/**
		 * The meta object literal for the '<em><b>Documentation Generation Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DOCUMENTATION_GENERATION_RESOURCE = eINSTANCE.getComponent_DocumentationGenerationResource();

		/**
		 * The meta object literal for the '<em><b>Resource Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__RESOURCE_PATH = eINSTANCE.getComponent_ResourcePath();

		/**
		 * The meta object literal for the '<em><b>Generation Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GENERATION_TIMEOUT = eINSTANCE.getComponent_GenerationTimeout();

		/**
		 * The meta object literal for the '<em><b>Generation Properties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GENERATION_PROPERTIES = eINSTANCE.getComponent_GenerationProperties();

		/**
		 * The meta object literal for the '<em><b>Generation Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GENERATION_SERVICES = eINSTANCE.getComponent_GenerationServices();

		/**
		 * The meta object literal for the '<em><b>Generation Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GENERATION_ARGUMENTS = eINSTANCE.getComponent_GenerationArguments();

		/**
		 * The meta object literal for the '<em><b>Generation Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GENERATION_CODE = eINSTANCE.getComponent_GenerationCode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.CompositeImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__CHILDREN = eINSTANCE.getComposite_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.Connection <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.Connection
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.AbstractConnectionSource <em>Abstract Connection Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.AbstractConnectionSource
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getAbstractConnectionSource()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTION_SOURCE = eINSTANCE.getAbstractConnectionSource();

		/**
		 * The meta object literal for the '<em><b>Outbound Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS = eINSTANCE.getAbstractConnectionSource_OutboundConnections();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.AbstractConnectionTarget <em>Abstract Connection Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.AbstractConnectionTarget
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getAbstractConnectionTarget()
		 * @generated
		 */
		EClass ABSTRACT_CONNECTION_TARGET = eINSTANCE.getAbstractConnectionTarget();

		/**
		 * The meta object literal for the '<em><b>Inbound Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS = eINSTANCE.getAbstractConnectionTarget_InboundConnections();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ConnectionSourceImpl <em>Connection Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ConnectionSourceImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnectionSource()
		 * @generated
		 */
		EClass CONNECTION_SOURCE = eINSTANCE.getConnectionSource();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ConnectionTargetImpl <em>Connection Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ConnectionTargetImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getConnectionTarget()
		 * @generated
		 */
		EClass CONNECTION_TARGET = eINSTANCE.getConnectionTarget();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.NodeImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.InputPortImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.OutputPortImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.GatewayImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Merge Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__MERGE_SOURCE = eINSTANCE.getGateway_MergeSource();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ErrorHandlerImpl <em>Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ErrorHandlerImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getErrorHandler()
		 * @generated
		 */
		EClass ERROR_HANDLER = eINSTANCE.getErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Error Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_HANDLER__ERROR_TYPE = eINSTANCE.getErrorHandler_ErrorType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ContainerImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.TransitionImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ORDER = eINSTANCE.getTransition_Order();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ErrorTransitionImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getErrorTransition()
		 * @generated
		 */
		EClass ERROR_TRANSITION = eINSTANCE.getErrorTransition();

		/**
		 * The meta object literal for the '<em><b>Error Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__ERROR_TYPE = eINSTANCE.getErrorTransition_ErrorType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.CallImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ReferenceImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__CACHE = eINSTANCE.getReference_Cache();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__TYPE = eINSTANCE.getReference_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.ImplementationType <em>Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.ImplementationType
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationType()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE = eINSTANCE.getImplementationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE__NAME = eINSTANCE.getImplementationType_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE__ID = eINSTANCE.getImplementationType_Id();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_TYPE__OWNER = eINSTANCE.getImplementationType_Owner();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE__DESCRIPTION = eINSTANCE.getImplementationType_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.ImplementationTypeCategoryImpl <em>Implementation Type Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.ImplementationTypeCategoryImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeCategory()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE_CATEGORY = eINSTANCE.getImplementationTypeCategory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_TYPE_CATEGORY__CHILDREN = eINSTANCE.getImplementationTypeCategory_Children();

		/**
		 * The meta object literal for the '<em><b>External Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS = eINSTANCE.getImplementationTypeCategory_ExternalSiblings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.ImplementationTypeDescriptor <em>Implementation Type Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.ImplementationTypeDescriptor
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeDescriptor()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE_DESCRIPTOR = eINSTANCE.getImplementationTypeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_DESCRIPTOR__ID = eINSTANCE.getImplementationTypeDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_DESCRIPTOR__NAME = eINSTANCE.getImplementationTypeDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION = eINSTANCE.getImplementationTypeDescriptor_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS = eINSTANCE.getImplementationTypeDescriptor_Keywords();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT = eINSTANCE.getImplementationTypeDescriptor_Parent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.ImplementationTypeFactory <em>Implementation Type Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.ImplementationTypeFactory
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeFactory()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE_FACTORY = eINSTANCE.getImplementationTypeFactory();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_FACTORY__VERSION = eINSTANCE.getImplementationTypeFactory_Version();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES = eINSTANCE.getImplementationTypeFactory_Specializes();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.ImplementationTypeProvider <em>Implementation Type Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.ImplementationTypeProvider
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getImplementationTypeProvider()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE_PROVIDER = eINSTANCE.getImplementationTypeProvider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl <em>Copy Implementation Type Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.impl.CopyImplementationTypeFactoryImpl
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getCopyImplementationTypeFactory()
		 * @generated
		 */
		EClass COPY_IMPLEMENTATION_TYPE_FACTORY = eINSTANCE.getCopyImplementationTypeFactory();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE = eINSTANCE.getCopyImplementationTypeFactory_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Implementation Type Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE = eINSTANCE.getCopyImplementationTypeFactory_ImplementationTypeReference();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR = eINSTANCE.getCopyImplementationTypeFactory_Selector();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO = eINSTANCE.getCopyImplementationTypeFactory_AppliesTo();

		/**
		 * The meta object literal for the '{@link org.nasdanika.licensing.Licenseable <em>Licenseable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.licensing.Licenseable
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getLicenseable()
		 * @generated
		 */
		EClass LICENSEABLE = eINSTANCE.getLicenseable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.amur.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.amur.ComponentType
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em>Class Loader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.ClassLoader
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getClassLoader()
		 * @generated
		 */
		EDataType CLASS_LOADER = eINSTANCE.getClassLoader();

		/**
		 * The meta object literal for the '<em>IMenu Manager</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jface.action.IMenuManager
		 * @see org.nasdanika.amur.impl.AmurPackageImpl#getIMenuManager()
		 * @generated
		 */
		EDataType IMENU_MANAGER = eINSTANCE.getIMenuManager();

	}

} //AmurPackage
