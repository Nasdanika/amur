/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import static org.nasdanika.amur.AmurPackage.CONTAINER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.jface.action.IMenuManager;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurFactory;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentType;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ConnectionSource;
import org.nasdanika.amur.ConnectionTarget;
import org.nasdanika.amur.CopyImplementationTypeFactory;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Gateway;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeCategory;
import org.nasdanika.amur.ImplementationTypeDescriptor;
import org.nasdanika.amur.ImplementationTypeFactory;
import org.nasdanika.amur.ImplementationTypeProvider;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.Transition;
import org.nasdanika.amur.util.AmurValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmurPackageImpl extends EPackageImpl implements AmurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectionSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationTypeProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyImplementationTypeFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classLoaderEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iMenuManagerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.amur.AmurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AmurPackageImpl() {
		super(eNS_URI, AmurFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AmurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AmurPackage init() {
		if (isInited) return (AmurPackage)EPackage.Registry.INSTANCE.getEPackage(AmurPackage.eNS_URI);

		// Obtain or create and register package
		AmurPackageImpl theAmurPackage = (AmurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmurPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAmurPackage.createPackageContents();

		// Initialize created meta-data
		theAmurPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAmurPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AmurValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAmurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AmurPackage.eNS_URI, theAmurPackage);
		return theAmurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Description() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Id() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ImplementationType() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Parent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_CodeGenerationResource() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_DocumentationGenerationResource() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_ResourcePath() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_GenerationTimeout() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_GenerationProperties() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_GenerationServices() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_GenerationArguments() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_GenerationCode() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposite_Children() {
		return (EReference)compositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectionSource() {
		return abstractConnectionSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectionSource_OutboundConnections() {
		return (EReference)abstractConnectionSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectionTarget() {
		return abstractConnectionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConnectionTarget_InboundConnections() {
		return (EReference)abstractConnectionTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionSource() {
		return connectionSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionTarget() {
		return connectionTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_MergeSource() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorHandler() {
		return errorHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorHandler_ErrorType() {
		return (EAttribute)errorHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Order() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Guard() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTransition() {
		return errorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_ErrorType() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Cache() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Type() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationType() {
		return implementationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationType_Name() {
		return (EAttribute)implementationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationType_Id() {
		return (EAttribute)implementationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationType_Owner() {
		return (EReference)implementationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationType_Description() {
		return (EAttribute)implementationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationTypeCategory() {
		return implementationTypeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationTypeCategory_Children() {
		return (EReference)implementationTypeCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationTypeCategory_ExternalSiblings() {
		return (EReference)implementationTypeCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationTypeDescriptor() {
		return implementationTypeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeDescriptor_Id() {
		return (EAttribute)implementationTypeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeDescriptor_Name() {
		return (EAttribute)implementationTypeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeDescriptor_Description() {
		return (EAttribute)implementationTypeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeDescriptor_Keywords() {
		return (EAttribute)implementationTypeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplementationTypeDescriptor_Parent() {
		return (EReference)implementationTypeDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationTypeFactory() {
		return implementationTypeFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeFactory_Version() {
		return (EAttribute)implementationTypeFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplementationTypeFactory_Specializes() {
		return (EAttribute)implementationTypeFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationTypeProvider() {
		return implementationTypeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyImplementationTypeFactory() {
		return copyImplementationTypeFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyImplementationTypeFactory_ImplementationType() {
		return (EReference)copyImplementationTypeFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCopyImplementationTypeFactory_ImplementationTypeReference() {
		return (EReference)copyImplementationTypeFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyImplementationTypeFactory_Selector() {
		return (EAttribute)copyImplementationTypeFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyImplementationTypeFactory_AppliesTo() {
		return (EAttribute)copyImplementationTypeFactoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentType() {
		return componentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassLoader() {
		return classLoaderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIMenuManager() {
		return iMenuManagerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurFactory getAmurFactory() {
		return (AmurFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__DESCRIPTION);
		createEAttribute(componentEClass, COMPONENT__ID);
		createEReference(componentEClass, COMPONENT__IMPLEMENTATION_TYPE);
		createEReference(componentEClass, COMPONENT__PARENT);
		createEAttribute(componentEClass, COMPONENT__CODE_GENERATION_RESOURCE);
		createEAttribute(componentEClass, COMPONENT__DOCUMENTATION_GENERATION_RESOURCE);
		createEAttribute(componentEClass, COMPONENT__RESOURCE_PATH);
		createEAttribute(componentEClass, COMPONENT__GENERATION_TIMEOUT);
		createEAttribute(componentEClass, COMPONENT__GENERATION_PROPERTIES);
		createEAttribute(componentEClass, COMPONENT__GENERATION_SERVICES);
		createEAttribute(componentEClass, COMPONENT__GENERATION_ARGUMENTS);
		createEAttribute(componentEClass, COMPONENT__GENERATION_CODE);

		compositeEClass = createEClass(COMPOSITE);
		createEReference(compositeEClass, COMPOSITE__CHILDREN);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);

		abstractConnectionSourceEClass = createEClass(ABSTRACT_CONNECTION_SOURCE);
		createEReference(abstractConnectionSourceEClass, ABSTRACT_CONNECTION_SOURCE__OUTBOUND_CONNECTIONS);

		abstractConnectionTargetEClass = createEClass(ABSTRACT_CONNECTION_TARGET);
		createEReference(abstractConnectionTargetEClass, ABSTRACT_CONNECTION_TARGET__INBOUND_CONNECTIONS);

		connectionSourceEClass = createEClass(CONNECTION_SOURCE);

		connectionTargetEClass = createEClass(CONNECTION_TARGET);

		nodeEClass = createEClass(NODE);

		inputPortEClass = createEClass(INPUT_PORT);

		outputPortEClass = createEClass(OUTPUT_PORT);

		gatewayEClass = createEClass(GATEWAY);
		createEReference(gatewayEClass, GATEWAY__MERGE_SOURCE);

		errorHandlerEClass = createEClass(ERROR_HANDLER);
		createEAttribute(errorHandlerEClass, ERROR_HANDLER__ERROR_TYPE);

		containerEClass = createEClass(CONTAINER);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__ORDER);
		createEAttribute(transitionEClass, TRANSITION__GUARD);

		errorTransitionEClass = createEClass(ERROR_TRANSITION);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__ERROR_TYPE);

		callEClass = createEClass(CALL);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__CACHE);
		createEAttribute(referenceEClass, REFERENCE__TYPE);

		implementationTypeEClass = createEClass(IMPLEMENTATION_TYPE);
		createEAttribute(implementationTypeEClass, IMPLEMENTATION_TYPE__NAME);
		createEAttribute(implementationTypeEClass, IMPLEMENTATION_TYPE__ID);
		createEReference(implementationTypeEClass, IMPLEMENTATION_TYPE__OWNER);
		createEAttribute(implementationTypeEClass, IMPLEMENTATION_TYPE__DESCRIPTION);

		implementationTypeCategoryEClass = createEClass(IMPLEMENTATION_TYPE_CATEGORY);
		createEReference(implementationTypeCategoryEClass, IMPLEMENTATION_TYPE_CATEGORY__CHILDREN);
		createEReference(implementationTypeCategoryEClass, IMPLEMENTATION_TYPE_CATEGORY__EXTERNAL_SIBLINGS);

		implementationTypeDescriptorEClass = createEClass(IMPLEMENTATION_TYPE_DESCRIPTOR);
		createEAttribute(implementationTypeDescriptorEClass, IMPLEMENTATION_TYPE_DESCRIPTOR__ID);
		createEAttribute(implementationTypeDescriptorEClass, IMPLEMENTATION_TYPE_DESCRIPTOR__NAME);
		createEAttribute(implementationTypeDescriptorEClass, IMPLEMENTATION_TYPE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(implementationTypeDescriptorEClass, IMPLEMENTATION_TYPE_DESCRIPTOR__KEYWORDS);
		createEReference(implementationTypeDescriptorEClass, IMPLEMENTATION_TYPE_DESCRIPTOR__PARENT);

		implementationTypeFactoryEClass = createEClass(IMPLEMENTATION_TYPE_FACTORY);
		createEAttribute(implementationTypeFactoryEClass, IMPLEMENTATION_TYPE_FACTORY__VERSION);
		createEAttribute(implementationTypeFactoryEClass, IMPLEMENTATION_TYPE_FACTORY__SPECIALIZES);

		implementationTypeProviderEClass = createEClass(IMPLEMENTATION_TYPE_PROVIDER);

		copyImplementationTypeFactoryEClass = createEClass(COPY_IMPLEMENTATION_TYPE_FACTORY);
		createEReference(copyImplementationTypeFactoryEClass, COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE);
		createEReference(copyImplementationTypeFactoryEClass, COPY_IMPLEMENTATION_TYPE_FACTORY__IMPLEMENTATION_TYPE_REFERENCE);
		createEAttribute(copyImplementationTypeFactoryEClass, COPY_IMPLEMENTATION_TYPE_FACTORY__SELECTOR);
		createEAttribute(copyImplementationTypeFactoryEClass, COPY_IMPLEMENTATION_TYPE_FACTORY__APPLIES_TO);

		// Create enums
		componentTypeEEnum = createEEnum(COMPONENT_TYPE);

		// Create data types
		classLoaderEDataType = createEDataType(CLASS_LOADER);
		iMenuManagerEDataType = createEDataType(IMENU_MANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeEClass.getESuperTypes().add(this.getComponent());
		connectionEClass.getESuperTypes().add(this.getComponent());
		connectionSourceEClass.getESuperTypes().add(this.getComponent());
		connectionSourceEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		connectionTargetEClass.getESuperTypes().add(this.getComponent());
		connectionTargetEClass.getESuperTypes().add(this.getAbstractConnectionTarget());
		nodeEClass.getESuperTypes().add(this.getComposite());
		nodeEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		nodeEClass.getESuperTypes().add(this.getAbstractConnectionTarget());
		inputPortEClass.getESuperTypes().add(this.getComponent());
		inputPortEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		outputPortEClass.getESuperTypes().add(this.getComponent());
		outputPortEClass.getESuperTypes().add(this.getAbstractConnectionTarget());
		gatewayEClass.getESuperTypes().add(this.getComponent());
		gatewayEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		gatewayEClass.getESuperTypes().add(this.getAbstractConnectionTarget());
		errorHandlerEClass.getESuperTypes().add(this.getComponent());
		errorHandlerEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		containerEClass.getESuperTypes().add(this.getComposite());
		containerEClass.getESuperTypes().add(this.getAbstractConnectionSource());
		containerEClass.getESuperTypes().add(this.getAbstractConnectionTarget());
		transitionEClass.getESuperTypes().add(this.getConnection());
		errorTransitionEClass.getESuperTypes().add(this.getConnection());
		callEClass.getESuperTypes().add(this.getConnection());
		referenceEClass.getESuperTypes().add(this.getConnection());
		implementationTypeCategoryEClass.getESuperTypes().add(this.getImplementationTypeDescriptor());
		implementationTypeDescriptorEClass.getESuperTypes().add(this.getImplementationTypeProvider());
		implementationTypeFactoryEClass.getESuperTypes().add(this.getImplementationTypeDescriptor());
		copyImplementationTypeFactoryEClass.getESuperTypes().add(this.getImplementationTypeFactory());

		// Initialize classes and features; add operations and parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Id(), ecorePackage.getEString(), "id", "", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ImplementationType(), this.getImplementationType(), this.getImplementationType_Owner(), "implementationType", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Parent(), this.getComposite(), this.getComposite_Children(), "parent", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_CodeGenerationResource(), ecorePackage.getEString(), "codeGenerationResource", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_DocumentationGenerationResource(), ecorePackage.getEString(), "documentationGenerationResource", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_ResourcePath(), ecorePackage.getEString(), "resourcePath", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_GenerationTimeout(), ecorePackage.getEInt(), "generationTimeout", "30", 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_GenerationProperties(), ecorePackage.getEString(), "generationProperties", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_GenerationServices(), ecorePackage.getEString(), "generationServices", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_GenerationArguments(), ecorePackage.getEString(), "generationArguments", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_GenerationCode(), ecorePackage.getEString(), "generationCode", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(componentEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(componentEClass, null, "createGenerationCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposite_Children(), this.getComponent(), this.getComponent_Parent(), "children", null, 0, -1, Composite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Source(), this.getAbstractConnectionSource(), this.getAbstractConnectionSource_OutboundConnections(), "source", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getAbstractConnectionTarget(), this.getAbstractConnectionTarget_InboundConnections(), "target", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectionSourceEClass, AbstractConnectionSource.class, "AbstractConnectionSource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConnectionSource_OutboundConnections(), this.getConnection(), this.getConnection_Source(), "outboundConnections", null, 0, -1, AbstractConnectionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectionTargetEClass, AbstractConnectionTarget.class, "AbstractConnectionTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConnectionTarget_InboundConnections(), this.getConnection(), this.getConnection_Target(), "inboundConnections", null, 0, -1, AbstractConnectionTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionSourceEClass, ConnectionSource.class, "ConnectionSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionTargetEClass, ConnectionTarget.class, "ConnectionTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGateway_MergeSource(), this.getAbstractConnectionSource(), null, "mergeSource", null, 0, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorHandlerEClass, ErrorHandler.class, "ErrorHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorHandler_ErrorType(), ecorePackage.getEString(), "errorType", null, 0, 1, ErrorHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.amur.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Order(), ecorePackage.getEInt(), "order", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorTransitionEClass, ErrorTransition.class, "ErrorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorTransition_ErrorType(), ecorePackage.getEString(), "errorType", null, 0, 1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Cache(), ecorePackage.getEBoolean(), "cache", "true", 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Type(), ecorePackage.getEString(), "type", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationTypeEClass, ImplementationType.class, "ImplementationType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationType_Id(), ecorePackage.getEString(), "id", null, 0, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationType_Owner(), this.getComponent(), this.getComponent_ImplementationType(), "owner", null, 0, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ImplementationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(implementationTypeEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImplementationType(), "prevImplementationType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(implementationTypeEClass, null, "contributeToPopupMenu", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIMenuManager(), "menu", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(implementationTypeEClass, ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(implementationTypeEClass, ecorePackage.getEBoolean(), "isComposite", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(implementationTypeEClass, null, "destroy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementationTypeCategoryEClass, ImplementationTypeCategory.class, "ImplementationTypeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplementationTypeCategory_Children(), this.getImplementationTypeDescriptor(), this.getImplementationTypeDescriptor_Parent(), "children", null, 0, -1, ImplementationTypeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationTypeCategory_ExternalSiblings(), this.getImplementationTypeDescriptor(), null, "externalSiblings", null, 0, -1, ImplementationTypeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationTypeDescriptorEClass, ImplementationTypeDescriptor.class, "ImplementationTypeDescriptor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationTypeDescriptor_Id(), ecorePackage.getEString(), "id", null, 1, 1, ImplementationTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationTypeDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImplementationTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationTypeDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1, ImplementationTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationTypeDescriptor_Keywords(), ecorePackage.getEString(), "keywords", null, 0, -1, ImplementationTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplementationTypeDescriptor_Parent(), this.getImplementationTypeCategory(), this.getImplementationTypeCategory_Children(), "parent", null, 0, 1, ImplementationTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationTypeFactoryEClass, ImplementationTypeFactory.class, "ImplementationTypeFactory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplementationTypeFactory_Version(), ecorePackage.getEString(), "version", null, 0, 1, ImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplementationTypeFactory_Specializes(), ecorePackage.getEString(), "specializes", null, 0, 1, ImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(implementationTypeFactoryEClass, this.getImplementationType(), "createImplementationType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(implementationTypeFactoryEClass, ecorePackage.getEBoolean(), "isApplicable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "component", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(implementationTypeProviderEClass, ImplementationTypeProvider.class, "ImplementationTypeProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(implementationTypeProviderEClass, this.getImplementationTypeFactory(), "getImplementationTypeFactories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComponent(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(copyImplementationTypeFactoryEClass, CopyImplementationTypeFactory.class, "CopyImplementationTypeFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCopyImplementationTypeFactory_ImplementationType(), this.getImplementationType(), null, "implementationType", null, 0, 1, CopyImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCopyImplementationTypeFactory_ImplementationTypeReference(), this.getImplementationType(), null, "implementationTypeReference", null, 0, 1, CopyImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyImplementationTypeFactory_Selector(), ecorePackage.getEString(), "selector", null, 0, 1, CopyImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyImplementationTypeFactory_AppliesTo(), this.getComponentType(), "appliesTo", null, 0, -1, CopyImplementationTypeFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentTypeEEnum, ComponentType.class, "ComponentType");
		addEEnumLiteral(componentTypeEEnum, ComponentType.NODE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.INPUT_PORT);
		addEEnumLiteral(componentTypeEEnum, ComponentType.OUTPUT_PORT);
		addEEnumLiteral(componentTypeEEnum, ComponentType.GATEWAY);
		addEEnumLiteral(componentTypeEEnum, ComponentType.TRANSITION);
		addEEnumLiteral(componentTypeEEnum, ComponentType.ERROR_TRANSITION);
		addEEnumLiteral(componentTypeEEnum, ComponentType.ERROR_HANDLER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.CALL);
		addEEnumLiteral(componentTypeEEnum, ComponentType.REFERENCE);
		addEEnumLiteral(componentTypeEEnum, ComponentType.CONTAINER);
		addEEnumLiteral(componentTypeEEnum, ComponentType.COMPONENT);
		addEEnumLiteral(componentTypeEEnum, ComponentType.COMPOSITE);

		// Initialize data types
		initEDataType(classLoaderEDataType, ClassLoader.class, "ClassLoader", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iMenuManagerEDataType, IMenuManager.class, "IMenuManager", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AmurPackageImpl
