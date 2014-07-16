package org.nasdanika.amur.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.nasdanika.amur.diagram.edit.parts.CallEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSource2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTarget2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.edit.parts.Container2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerContainerChildrenCompartment2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerContainerChildrenCompartmentEditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandler2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.Gateway2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayMergeSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.Node2EditPart;
import org.nasdanika.amur.diagram.edit.parts.Node3EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionEditPart;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Call;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.ConnectionSource;
import org.nasdanika.amur.ConnectionTarget;
import org.nasdanika.amur.Container;
import org.nasdanika.amur.ErrorHandler;
import org.nasdanika.amur.ErrorTransition;
import org.nasdanika.amur.Gateway;
import org.nasdanika.amur.InputPort;
import org.nasdanika.amur.Node;
import org.nasdanika.amur.OutputPort;
import org.nasdanika.amur.Reference;
import org.nasdanika.amur.Transition;

/**
 * @generated
 */
public class AmurDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<AmurNodeDescriptor> getSemanticChildren(View view) {
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_1000SemanticChildren(view);
		case ContainerContainerChildrenCompartmentEditPart.VISUAL_ID:
			return getContainerContainerChildrenCompartment_7001SemanticChildren(view);
		case ContainerContainerChildrenCompartment2EditPart.VISUAL_ID:
			return getContainerContainerChildrenCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurNodeDescriptor> getNode_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurNodeDescriptor> result = new LinkedList<AmurNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = AmurVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GatewayEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContainerEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionSourceEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionTargetEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ErrorHandlerEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurNodeDescriptor> getContainerContainerChildrenCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Container modelElement = (Container) containerView.getElement();
		LinkedList<AmurNodeDescriptor> result = new LinkedList<AmurNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = AmurVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionSource2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionTarget2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Container2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ErrorHandler2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Gateway2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node3EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurNodeDescriptor> getContainerContainerChildrenCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Container modelElement = (Container) containerView.getElement();
		LinkedList<AmurNodeDescriptor> result = new LinkedList<AmurNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = AmurVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionSource2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionTarget2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Container2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ErrorHandler2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Gateway2EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node3EditPart.VISUAL_ID) {
				result.add(new AmurNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainedLinks(View view) {
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_1000ContainedLinks(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2001ContainedLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002ContainedLinks(view);
		case ConnectionSourceEditPart.VISUAL_ID:
			return getConnectionSource_2003ContainedLinks(view);
		case ConnectionTargetEditPart.VISUAL_ID:
			return getConnectionTarget_2004ContainedLinks(view);
		case ErrorHandlerEditPart.VISUAL_ID:
			return getErrorHandler_2005ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2006ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2007ContainedLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2008ContainedLinks(view);
		case ConnectionSource2EditPart.VISUAL_ID:
			return getConnectionSource_3001ContainedLinks(view);
		case ConnectionTarget2EditPart.VISUAL_ID:
			return getConnectionTarget_3002ContainedLinks(view);
		case Container2EditPart.VISUAL_ID:
			return getContainer_3003ContainedLinks(view);
		case ErrorHandler2EditPart.VISUAL_ID:
			return getErrorHandler_3004ContainedLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_3005ContainedLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_3006ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_4002ContainedLinks(view);
		case ErrorTransitionEditPart.VISUAL_ID:
			return getErrorTransition_4003ContainedLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getIncomingLinks(View view) {
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2001IncomingLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002IncomingLinks(view);
		case ConnectionSourceEditPart.VISUAL_ID:
			return getConnectionSource_2003IncomingLinks(view);
		case ConnectionTargetEditPart.VISUAL_ID:
			return getConnectionTarget_2004IncomingLinks(view);
		case ErrorHandlerEditPart.VISUAL_ID:
			return getErrorHandler_2005IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2006IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2007IncomingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2008IncomingLinks(view);
		case ConnectionSource2EditPart.VISUAL_ID:
			return getConnectionSource_3001IncomingLinks(view);
		case ConnectionTarget2EditPart.VISUAL_ID:
			return getConnectionTarget_3002IncomingLinks(view);
		case Container2EditPart.VISUAL_ID:
			return getContainer_3003IncomingLinks(view);
		case ErrorHandler2EditPart.VISUAL_ID:
			return getErrorHandler_3004IncomingLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_3005IncomingLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_3006IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_4002IncomingLinks(view);
		case ErrorTransitionEditPart.VISUAL_ID:
			return getErrorTransition_4003IncomingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getOutgoingLinks(View view) {
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2001OutgoingLinks(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002OutgoingLinks(view);
		case ConnectionSourceEditPart.VISUAL_ID:
			return getConnectionSource_2003OutgoingLinks(view);
		case ConnectionTargetEditPart.VISUAL_ID:
			return getConnectionTarget_2004OutgoingLinks(view);
		case ErrorHandlerEditPart.VISUAL_ID:
			return getErrorHandler_2005OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2006OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2007OutgoingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2008OutgoingLinks(view);
		case ConnectionSource2EditPart.VISUAL_ID:
			return getConnectionSource_3001OutgoingLinks(view);
		case ConnectionTarget2EditPart.VISUAL_ID:
			return getConnectionTarget_3002OutgoingLinks(view);
		case Container2EditPart.VISUAL_ID:
			return getContainer_3003OutgoingLinks(view);
		case ErrorHandler2EditPart.VISUAL_ID:
			return getErrorHandler_3004OutgoingLinks(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_3005OutgoingLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_3006OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		case CallEditPart.VISUAL_ID:
			return getCall_4002OutgoingLinks(view);
		case ErrorTransitionEditPart.VISUAL_ID:
			return getErrorTransition_4003OutgoingLinks(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_1000ContainedLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_2001ContainedLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Gateway_MergeSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_2002ContainedLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getOutputPort_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getInputPort_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_2008ContainedLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_3003ContainedLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_3005ContainedLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Gateway_MergeSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_3006ContainedLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getCall_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorTransition_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getReference_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_2001IncomingLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_2002IncomingLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_2003IncomingLinks(
			View view) {
		ConnectionSource modelElement = (ConnectionSource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_2004IncomingLinks(
			View view) {
		ConnectionTarget modelElement = (ConnectionTarget) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_2005IncomingLinks(
			View view) {
		ErrorHandler modelElement = (ErrorHandler) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getOutputPort_2006IncomingLinks(
			View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getInputPort_2007IncomingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_2008IncomingLinks(View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_3001IncomingLinks(
			View view) {
		ConnectionSource modelElement = (ConnectionSource) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_3002IncomingLinks(
			View view) {
		ConnectionTarget modelElement = (ConnectionTarget) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_3003IncomingLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_3004IncomingLinks(
			View view) {
		ErrorHandler modelElement = (ErrorHandler) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_3005IncomingLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_3006IncomingLinks(View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Call_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ErrorTransition_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Reference_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getCall_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorTransition_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getReference_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_2001OutgoingLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Gateway_MergeSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_2002OutgoingLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_2003OutgoingLinks(
			View view) {
		ConnectionSource modelElement = (ConnectionSource) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_2005OutgoingLinks(
			View view) {
		ErrorHandler modelElement = (ErrorHandler) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getOutputPort_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getInputPort_2007OutgoingLinks(
			View view) {
		InputPort modelElement = (InputPort) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_2008OutgoingLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionSource_3001OutgoingLinks(
			View view) {
		ConnectionSource modelElement = (ConnectionSource) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getConnectionTarget_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getContainer_3003OutgoingLinks(
			View view) {
		Container modelElement = (Container) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorHandler_3004OutgoingLinks(
			View view) {
		ErrorHandler modelElement = (ErrorHandler) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getGateway_3005OutgoingLinks(
			View view) {
		Gateway modelElement = (Gateway) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Gateway_MergeSource_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getNode_3006OutgoingLinks(View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Call_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ErrorTransition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Reference_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getCall_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getErrorTransition_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AmurLinkDescriptor> getReference_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			Composite container) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getContainedTypeModelFacetLinks_Call_4002(
			Composite container) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Call) {
				continue;
			}
			Call link = (Call) linkObject;
			if (CallEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Call_4002, CallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getContainedTypeModelFacetLinks_ErrorTransition_4003(
			Composite container) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ErrorTransition) {
				continue;
			}
			ErrorTransition link = (ErrorTransition) linkObject;
			if (ErrorTransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.ErrorTransition_4003,
					ErrorTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getContainedTypeModelFacetLinks_Reference_4004(
			Composite container) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Reference) {
				continue;
			}
			Reference link = (Reference) linkObject;
			if (ReferenceEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Reference_4004,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			AbstractConnectionTarget target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AmurPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, target, link,
					AmurElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getIncomingTypeModelFacetLinks_Call_4002(
			AbstractConnectionTarget target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AmurPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Call) {
				continue;
			}
			Call link = (Call) setting.getEObject();
			if (CallEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, target, link,
					AmurElementTypes.Call_4002, CallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getIncomingTypeModelFacetLinks_ErrorTransition_4003(
			AbstractConnectionTarget target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AmurPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof ErrorTransition) {
				continue;
			}
			ErrorTransition link = (ErrorTransition) setting.getEObject();
			if (ErrorTransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, target, link,
					AmurElementTypes.ErrorTransition_4003,
					ErrorTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getIncomingTypeModelFacetLinks_Reference_4004(
			AbstractConnectionTarget target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AmurPackage.eINSTANCE
					.getConnection_Target()
					|| false == setting.getEObject() instanceof Reference) {
				continue;
			}
			Reference link = (Reference) setting.getEObject();
			if (ReferenceEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionSource src = link.getSource();
			result.add(new AmurLinkDescriptor(src, target, link,
					AmurElementTypes.Reference_4004,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getIncomingFeatureModelFacetLinks_Gateway_MergeSource_4005(
			AbstractConnectionSource target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AmurPackage.eINSTANCE
					.getGateway_MergeSource()) {
				result.add(new AmurLinkDescriptor(setting.getEObject(), target,
						AmurElementTypes.GatewayMergeSource_4005,
						GatewayMergeSourceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			AbstractConnectionSource source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getOutgoingTypeModelFacetLinks_Call_4002(
			AbstractConnectionSource source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Call) {
				continue;
			}
			Call link = (Call) linkObject;
			if (CallEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Call_4002, CallEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getOutgoingTypeModelFacetLinks_ErrorTransition_4003(
			AbstractConnectionSource source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ErrorTransition) {
				continue;
			}
			ErrorTransition link = (ErrorTransition) linkObject;
			if (ErrorTransitionEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.ErrorTransition_4003,
					ErrorTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getOutgoingTypeModelFacetLinks_Reference_4004(
			AbstractConnectionSource source) {
		Composite container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Composite) {
				container = (Composite) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		for (Iterator<?> links = container.getChildren().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Reference) {
				continue;
			}
			Reference link = (Reference) linkObject;
			if (ReferenceEditPart.VISUAL_ID != AmurVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractConnectionTarget dst = link.getTarget();
			AbstractConnectionSource src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AmurLinkDescriptor(src, dst, link,
					AmurElementTypes.Reference_4004,
					ReferenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AmurLinkDescriptor> getOutgoingFeatureModelFacetLinks_Gateway_MergeSource_4005(
			Gateway source) {
		LinkedList<AmurLinkDescriptor> result = new LinkedList<AmurLinkDescriptor>();
		AbstractConnectionSource destination = source.getMergeSource();
		if (destination == null) {
			return result;
		}
		result.add(new AmurLinkDescriptor(source, destination,
				AmurElementTypes.GatewayMergeSource_4005,
				GatewayMergeSourceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<AmurNodeDescriptor> getSemanticChildren(View view) {
			return AmurDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AmurLinkDescriptor> getContainedLinks(View view) {
			return AmurDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AmurLinkDescriptor> getIncomingLinks(View view) {
			return AmurDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AmurLinkDescriptor> getOutgoingLinks(View view) {
			return AmurDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
