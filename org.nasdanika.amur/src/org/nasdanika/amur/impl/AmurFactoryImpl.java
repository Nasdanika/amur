/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jface.action.IMenuManager;
import org.nasdanika.amur.AmurFactory;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentType;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.ConnectionSource;
import org.nasdanika.amur.ConnectionTarget;
import org.nasdanika.amur.CopyImplementationTypeFactory;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Gateway;
import org.nasdanika.amur.ImplementationTypeCategory;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.Transition;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmurFactoryImpl extends EFactoryImpl implements AmurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmurFactory init() {
		try {
			AmurFactory theAmurFactory = (AmurFactory)EPackage.Registry.INSTANCE.getEFactory(AmurPackage.eNS_URI);
			if (theAmurFactory != null) {
				return theAmurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmurPackage.COMPONENT: return (EObject)createComponent();
			case AmurPackage.COMPOSITE: return (EObject)createComposite();
			case AmurPackage.CONNECTION_SOURCE: return (EObject)createConnectionSource();
			case AmurPackage.CONNECTION_TARGET: return (EObject)createConnectionTarget();
			case AmurPackage.NODE: return (EObject)createNode();
			case AmurPackage.INPUT_PORT: return (EObject)createInputPort();
			case AmurPackage.OUTPUT_PORT: return (EObject)createOutputPort();
			case AmurPackage.GATEWAY: return (EObject)createGateway();
			case AmurPackage.ERROR_HANDLER: return (EObject)createErrorHandler();
			case AmurPackage.CONTAINER: return (EObject)createContainer();
			case AmurPackage.TRANSITION: return (EObject)createTransition();
			case AmurPackage.ERROR_TRANSITION: return (EObject)createErrorTransition();
			case AmurPackage.CALL: return (EObject)createCall();
			case AmurPackage.REFERENCE: return (EObject)createReference();
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY: return (EObject)createImplementationTypeCategory();
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY: return (EObject)createCopyImplementationTypeFactory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AmurPackage.COMPONENT_TYPE:
				return createComponentTypeFromString(eDataType, initialValue);
			case AmurPackage.CLASS_LOADER:
				return createClassLoaderFromString(eDataType, initialValue);
			case AmurPackage.IMENU_MANAGER:
				return createIMenuManagerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AmurPackage.COMPONENT_TYPE:
				return convertComponentTypeToString(eDataType, instanceValue);
			case AmurPackage.CLASS_LOADER:
				return convertClassLoaderToString(eDataType, instanceValue);
			case AmurPackage.IMENU_MANAGER:
				return convertIMenuManagerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSource createConnectionSource() {
		ConnectionSourceImpl connectionSource = new ConnectionSourceImpl();
		return connectionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionTarget createConnectionTarget() {
		ConnectionTargetImpl connectionTarget = new ConnectionTargetImpl();
		return connectionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort createInputPort() {
		InputPortImpl inputPort = new InputPortImpl();
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPort createOutputPort() {
		OutputPortImpl outputPort = new OutputPortImpl();
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorHandler createErrorHandler() {
		ErrorHandlerImpl errorHandler = new ErrorHandlerImpl();
		return errorHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.amur.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransition createErrorTransition() {
		ErrorTransitionImpl errorTransition = new ErrorTransitionImpl();
		return errorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTypeCategory createImplementationTypeCategory() {
		ImplementationTypeCategoryImpl implementationTypeCategory = new ImplementationTypeCategoryImpl();
		return implementationTypeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyImplementationTypeFactory createCopyImplementationTypeFactory() {
		CopyImplementationTypeFactoryImpl copyImplementationTypeFactory = new CopyImplementationTypeFactoryImpl();
		return copyImplementationTypeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentTypeFromString(EDataType eDataType, String initialValue) {
		ComponentType result = ComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLoader createClassLoaderFromString(EDataType eDataType, String initialValue) {
		return (ClassLoader)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassLoaderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMenuManager createIMenuManagerFromString(EDataType eDataType, String initialValue) {
		return (IMenuManager)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIMenuManagerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurPackage getAmurPackage() {
		return (AmurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmurPackage getPackage() {
		return AmurPackage.eINSTANCE;
	}

} //AmurFactoryImpl
