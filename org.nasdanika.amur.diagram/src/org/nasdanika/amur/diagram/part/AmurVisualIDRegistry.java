package org.nasdanika.amur.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.nasdanika.amur.diagram.edit.parts.CallEditPart;
import org.nasdanika.amur.diagram.edit.parts.CallNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSource2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTarget2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Container2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerContainerChildrenCompartment2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerContainerChildrenCompartmentEditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandler2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Gateway2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Node2EditPart;
import org.nasdanika.amur.diagram.edit.parts.Node3EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeEditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionNameEditPart;

import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Node;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AmurVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.nasdanika.amur.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (NodeEditPart.MODEL_ID.equals(view.getType())) {
				return NodeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AmurDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AmurPackage.eINSTANCE.getNode().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Node) domainElement)) {
			return NodeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
				.getModelID(containerView);
		if (!NodeEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (NodeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NodeEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case NodeEditPart.VISUAL_ID:
			if (AmurPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())) {
				return GatewayEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return ContainerEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getConnectionSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionSourceEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getConnectionTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionTargetEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getErrorHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return ErrorHandlerEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return Node2EditPart.VISUAL_ID;
			}
			break;
		case ContainerContainerChildrenCompartmentEditPart.VISUAL_ID:
			if (AmurPackage.eINSTANCE.getConnectionSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionSource2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getConnectionTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionTarget2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getErrorHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return ErrorHandler2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())) {
				return Gateway2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return Node3EditPart.VISUAL_ID;
			}
			break;
		case ContainerContainerChildrenCompartment2EditPart.VISUAL_ID:
			if (AmurPackage.eINSTANCE.getConnectionSource().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionSource2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getConnectionTarget().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionTarget2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return Container2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getErrorHandler().isSuperTypeOf(
					domainElement.eClass())) {
				return ErrorHandler2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getGateway().isSuperTypeOf(
					domainElement.eClass())) {
				return Gateway2EditPart.VISUAL_ID;
			}
			if (AmurPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return Node3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
				.getModelID(containerView);
		if (!NodeEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (NodeEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = NodeEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case NodeEditPart.VISUAL_ID:
			if (GatewayEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ErrorHandlerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GatewayEditPart.VISUAL_ID:
			if (GatewayNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerEditPart.VISUAL_ID:
			if (ContainerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainerContainerChildrenCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionSourceEditPart.VISUAL_ID:
			if (ConnectionSourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionTargetEditPart.VISUAL_ID:
			if (ConnectionTargetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ErrorHandlerEditPart.VISUAL_ID:
			if (ErrorHandlerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPortEditPart.VISUAL_ID:
			if (OutputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPortEditPart.VISUAL_ID:
			if (InputPortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node2EditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionSource2EditPart.VISUAL_ID:
			if (ConnectionSourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionTarget2EditPart.VISUAL_ID:
			if (ConnectionTargetName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Container2EditPart.VISUAL_ID:
			if (ContainerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContainerContainerChildrenCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ErrorHandler2EditPart.VISUAL_ID:
			if (ErrorHandlerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Gateway2EditPart.VISUAL_ID:
			if (GatewayName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node3EditPart.VISUAL_ID:
			if (NodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerContainerChildrenCompartmentEditPart.VISUAL_ID:
			if (ConnectionSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionTarget2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ErrorHandler2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Gateway2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContainerContainerChildrenCompartment2EditPart.VISUAL_ID:
			if (ConnectionSource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionTarget2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Container2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ErrorHandler2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Gateway2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallEditPart.VISUAL_ID:
			if (CallNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ErrorTransitionEditPart.VISUAL_ID:
			if (ErrorTransitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReferenceEditPart.VISUAL_ID:
			if (ReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AmurPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		if (AmurPackage.eINSTANCE.getCall().isSuperTypeOf(
				domainElement.eClass())) {
			return CallEditPart.VISUAL_ID;
		}
		if (AmurPackage.eINSTANCE.getErrorTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return ErrorTransitionEditPart.VISUAL_ID;
		}
		if (AmurPackage.eINSTANCE.getReference().isSuperTypeOf(
				domainElement.eClass())) {
			return ReferenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Node element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ContainerContainerChildrenCompartmentEditPart.VISUAL_ID:
		case ContainerContainerChildrenCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case NodeEditPart.VISUAL_ID:
			return false;
		case GatewayEditPart.VISUAL_ID:
		case ConnectionSourceEditPart.VISUAL_ID:
		case ConnectionTargetEditPart.VISUAL_ID:
		case ErrorHandlerEditPart.VISUAL_ID:
		case OutputPortEditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case Node2EditPart.VISUAL_ID:
		case ConnectionSource2EditPart.VISUAL_ID:
		case ConnectionTarget2EditPart.VISUAL_ID:
		case ErrorHandler2EditPart.VISUAL_ID:
		case Gateway2EditPart.VISUAL_ID:
		case Node3EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.nasdanika.amur.diagram.part.AmurVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
