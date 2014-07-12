/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ConnectionSource;
import org.nasdanika.amur.ConnectionTarget;
import org.nasdanika.amur.Container;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.AmurPackage
 * @generated
 */
public class AmurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AmurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurSwitch() {
		if (modelPackage == null) {
			modelPackage = AmurPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AmurPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseComponent(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseComponent(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.ABSTRACT_CONNECTION_SOURCE: {
				AbstractConnectionSource abstractConnectionSource = (AbstractConnectionSource)theEObject;
				T result = caseAbstractConnectionSource(abstractConnectionSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.ABSTRACT_CONNECTION_TARGET: {
				AbstractConnectionTarget abstractConnectionTarget = (AbstractConnectionTarget)theEObject;
				T result = caseAbstractConnectionTarget(abstractConnectionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.CONNECTION_SOURCE: {
				ConnectionSource connectionSource = (ConnectionSource)theEObject;
				T result = caseConnectionSource(connectionSource);
				if (result == null) result = caseComponent(connectionSource);
				if (result == null) result = caseAbstractConnectionSource(connectionSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.CONNECTION_TARGET: {
				ConnectionTarget connectionTarget = (ConnectionTarget)theEObject;
				T result = caseConnectionTarget(connectionTarget);
				if (result == null) result = caseComponent(connectionTarget);
				if (result == null) result = caseAbstractConnectionTarget(connectionTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseComposite(node);
				if (result == null) result = caseAbstractConnectionSource(node);
				if (result == null) result = caseAbstractConnectionTarget(node);
				if (result == null) result = caseComponent(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = caseComponent(inputPort);
				if (result == null) result = caseAbstractConnectionSource(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = caseComponent(outputPort);
				if (result == null) result = caseAbstractConnectionTarget(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseComponent(gateway);
				if (result == null) result = caseAbstractConnectionSource(gateway);
				if (result == null) result = caseAbstractConnectionTarget(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.ERROR_HANDLER: {
				ErrorHandler errorHandler = (ErrorHandler)theEObject;
				T result = caseErrorHandler(errorHandler);
				if (result == null) result = caseComponent(errorHandler);
				if (result == null) result = caseAbstractConnectionSource(errorHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseComposite(container);
				if (result == null) result = caseAbstractConnectionSource(container);
				if (result == null) result = caseAbstractConnectionTarget(container);
				if (result == null) result = caseComponent(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseConnection(transition);
				if (result == null) result = caseComponent(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.ERROR_TRANSITION: {
				ErrorTransition errorTransition = (ErrorTransition)theEObject;
				T result = caseErrorTransition(errorTransition);
				if (result == null) result = caseConnection(errorTransition);
				if (result == null) result = caseComponent(errorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseConnection(call);
				if (result == null) result = caseComponent(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseConnection(reference);
				if (result == null) result = caseComponent(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.IMPLEMENTATION_TYPE: {
				ImplementationType implementationType = (ImplementationType)theEObject;
				T result = caseImplementationType(implementationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY: {
				ImplementationTypeCategory implementationTypeCategory = (ImplementationTypeCategory)theEObject;
				T result = caseImplementationTypeCategory(implementationTypeCategory);
				if (result == null) result = caseImplementationTypeDescriptor(implementationTypeCategory);
				if (result == null) result = caseImplementationTypeProvider(implementationTypeCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.IMPLEMENTATION_TYPE_DESCRIPTOR: {
				ImplementationTypeDescriptor implementationTypeDescriptor = (ImplementationTypeDescriptor)theEObject;
				T result = caseImplementationTypeDescriptor(implementationTypeDescriptor);
				if (result == null) result = caseImplementationTypeProvider(implementationTypeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.IMPLEMENTATION_TYPE_FACTORY: {
				ImplementationTypeFactory implementationTypeFactory = (ImplementationTypeFactory)theEObject;
				T result = caseImplementationTypeFactory(implementationTypeFactory);
				if (result == null) result = caseImplementationTypeDescriptor(implementationTypeFactory);
				if (result == null) result = caseImplementationTypeProvider(implementationTypeFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.IMPLEMENTATION_TYPE_PROVIDER: {
				ImplementationTypeProvider implementationTypeProvider = (ImplementationTypeProvider)theEObject;
				T result = caseImplementationTypeProvider(implementationTypeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY: {
				CopyImplementationTypeFactory copyImplementationTypeFactory = (CopyImplementationTypeFactory)theEObject;
				T result = caseCopyImplementationTypeFactory(copyImplementationTypeFactory);
				if (result == null) result = caseImplementationTypeFactory(copyImplementationTypeFactory);
				if (result == null) result = caseImplementationTypeDescriptor(copyImplementationTypeFactory);
				if (result == null) result = caseImplementationTypeProvider(copyImplementationTypeFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnectionSource(AbstractConnectionSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnectionTarget(AbstractConnectionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionSource(ConnectionSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionTarget(ConnectionTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorHandler(ErrorHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorTransition(ErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationType(ImplementationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationTypeCategory(ImplementationTypeCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationTypeDescriptor(ImplementationTypeDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationTypeFactory(ImplementationTypeFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Type Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Type Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationTypeProvider(ImplementationTypeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Implementation Type Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Implementation Type Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyImplementationTypeFactory(CopyImplementationTypeFactory object) {
		return null;
	}

	

//	/**
//	 * Returns the result of interpreting the object as an instance of '<em>Generation Command</em>'.
//	 * <!-- begin-user-doc -->
//	 * This implementation returns null;
//	 * returning a non-null result will terminate the switch.
//	 * <!-- end-user-doc -->
//	 * @param object the target of the switch.
//	 * @return the result of interpreting the object as an instance of '<em>Generation Command</em>'.
//	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
//	 * @generated
//	 */
//	public <V> T caseGenerationCommand(GenerationCommand<V> object) {
//		return null;
//	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AmurSwitch
