/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.jface.action.IMenuManager;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentType;
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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.amur.AmurPackage
 * @generated
 */
public class AmurValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AmurValidator INSTANCE = new AmurValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.nasdanika.amur";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT__VALIDATE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Implementation Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMPLEMENTATION_TYPE__VALIDATE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AmurPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AmurPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case AmurPackage.COMPOSITE:
				return validateComposite((Composite)value, diagnostics, context);
			case AmurPackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case AmurPackage.ABSTRACT_CONNECTION_SOURCE:
				return validateAbstractConnectionSource((AbstractConnectionSource)value, diagnostics, context);
			case AmurPackage.ABSTRACT_CONNECTION_TARGET:
				return validateAbstractConnectionTarget((AbstractConnectionTarget)value, diagnostics, context);
			case AmurPackage.CONNECTION_SOURCE:
				return validateConnectionSource((ConnectionSource)value, diagnostics, context);
			case AmurPackage.CONNECTION_TARGET:
				return validateConnectionTarget((ConnectionTarget)value, diagnostics, context);
			case AmurPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case AmurPackage.INPUT_PORT:
				return validateInputPort((InputPort)value, diagnostics, context);
			case AmurPackage.OUTPUT_PORT:
				return validateOutputPort((OutputPort)value, diagnostics, context);
			case AmurPackage.GATEWAY:
				return validateGateway((Gateway)value, diagnostics, context);
			case AmurPackage.ERROR_HANDLER:
				return validateErrorHandler((ErrorHandler)value, diagnostics, context);
			case AmurPackage.CONTAINER:
				return validateContainer((Container)value, diagnostics, context);
			case AmurPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case AmurPackage.ERROR_TRANSITION:
				return validateErrorTransition((ErrorTransition)value, diagnostics, context);
			case AmurPackage.CALL:
				return validateCall((Call)value, diagnostics, context);
			case AmurPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case AmurPackage.IMPLEMENTATION_TYPE:
				return validateImplementationType((ImplementationType)value, diagnostics, context);
			case AmurPackage.IMPLEMENTATION_TYPE_CATEGORY:
				return validateImplementationTypeCategory((ImplementationTypeCategory)value, diagnostics, context);
			case AmurPackage.IMPLEMENTATION_TYPE_DESCRIPTOR:
				return validateImplementationTypeDescriptor((ImplementationTypeDescriptor)value, diagnostics, context);
			case AmurPackage.IMPLEMENTATION_TYPE_FACTORY:
				return validateImplementationTypeFactory((ImplementationTypeFactory)value, diagnostics, context);
			case AmurPackage.IMPLEMENTATION_TYPE_PROVIDER:
				return validateImplementationTypeProvider((ImplementationTypeProvider)value, diagnostics, context);
			case AmurPackage.COPY_IMPLEMENTATION_TYPE_FACTORY:
				return validateCopyImplementationTypeFactory((CopyImplementationTypeFactory)value, diagnostics, context);
			case AmurPackage.COMPONENT_TYPE:
				return validateComponentType((ComponentType)value, diagnostics, context);
			case AmurPackage.CLASS_LOADER:
				return validateClassLoader((ClassLoader)value, diagnostics, context);
			case AmurPackage.IMENU_MANAGER:
				return validateIMenuManager((IMenuManager)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)component, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)component, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(component, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent_validate(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComposite(Composite composite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)composite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)composite, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(composite, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)connection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)connection, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(connection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConnectionSource(AbstractConnectionSource abstractConnectionSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)abstractConnectionSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConnectionTarget(AbstractConnectionTarget abstractConnectionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)abstractConnectionTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionSource(ConnectionSource connectionSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)connectionSource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)connectionSource, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(connectionSource, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionTarget(ConnectionTarget connectionTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)connectionTarget, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)connectionTarget, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(connectionTarget, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)node, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputPort(InputPort inputPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)inputPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)inputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(inputPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputPort(OutputPort outputPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)outputPort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)outputPort, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(outputPort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)gateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)gateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(gateway, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorHandler(ErrorHandler errorHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)errorHandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)errorHandler, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(errorHandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainer(Container container, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)container, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)container, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(container, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorTransition(ErrorTransition errorTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)errorTransition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)errorTransition, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(errorTransition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCall(Call call, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)call, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)call, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(call, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)reference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent_validate(reference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationType(ImplementationType implementationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)implementationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)implementationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateImplementationType_validate(implementationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Implementation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationType_validate(ImplementationType implementationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return implementationType.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationTypeCategory(ImplementationTypeCategory implementationTypeCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)implementationTypeCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationTypeDescriptor(ImplementationTypeDescriptor implementationTypeDescriptor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)implementationTypeDescriptor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationTypeFactory(ImplementationTypeFactory implementationTypeFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)implementationTypeFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationTypeProvider(ImplementationTypeProvider implementationTypeProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)implementationTypeProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyImplementationTypeFactory(CopyImplementationTypeFactory copyImplementationTypeFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)copyImplementationTypeFactory, diagnostics, context);
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	public boolean validateGenerationCommand(GenerationCommand<?> generationCommand, DiagnosticChain diagnostics, Map<Object, Object> context) {
//		return validate_EveryDefaultConstraint((EObject)generationCommand, diagnostics, context);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentType(ComponentType componentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassLoader(ClassLoader classLoader, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIMenuManager(IMenuManager iMenuManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AmurValidator
