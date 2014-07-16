package org.nasdanika.amur.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.nasdanika.amur.diagram.edit.commands.CallCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.CallReorientCommand;
import org.nasdanika.amur.diagram.edit.commands.ErrorTransitionCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ErrorTransitionReorientCommand;
import org.nasdanika.amur.diagram.edit.commands.GatewayMergeSourceCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.GatewayMergeSourceReorientCommand;
import org.nasdanika.amur.diagram.edit.commands.ReferenceCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ReferenceReorientCommand;
import org.nasdanika.amur.diagram.edit.commands.TransitionCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.TransitionReorientCommand;
import org.nasdanika.amur.diagram.edit.parts.CallEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayMergeSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionEditPart;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class Gateway2ItemSemanticEditPolicy extends
		AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Gateway2ItemSemanticEditPolicy() {
		super(AmurElementTypes.Gateway_3005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (AmurVisualIDRegistry.getVisualID(incomingLink) == TransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(incomingLink) == CallEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(incomingLink) == ErrorTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(incomingLink) == ReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(incomingLink) == GatewayMergeSourceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AmurVisualIDRegistry.getVisualID(outgoingLink) == TransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(outgoingLink) == CallEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(outgoingLink) == ErrorTransitionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(outgoingLink) == ReferenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AmurVisualIDRegistry.getVisualID(outgoingLink) == GatewayMergeSourceEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AmurElementTypes.Transition_4001 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.Call_4002 == req.getElementType()) {
			return getGEFWrapper(new CallCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (AmurElementTypes.ErrorTransition_4003 == req.getElementType()) {
			return getGEFWrapper(new ErrorTransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.Reference_4004 == req.getElementType()) {
			return getGEFWrapper(new ReferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.GatewayMergeSource_4005 == req.getElementType()) {
			return getGEFWrapper(new GatewayMergeSourceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AmurElementTypes.Transition_4001 == req.getElementType()) {
			return getGEFWrapper(new TransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.Call_4002 == req.getElementType()) {
			return getGEFWrapper(new CallCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (AmurElementTypes.ErrorTransition_4003 == req.getElementType()) {
			return getGEFWrapper(new ErrorTransitionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.Reference_4004 == req.getElementType()) {
			return getGEFWrapper(new ReferenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AmurElementTypes.GatewayMergeSource_4005 == req.getElementType()) {
			return getGEFWrapper(new GatewayMergeSourceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new TransitionReorientCommand(req));
		case CallEditPart.VISUAL_ID:
			return getGEFWrapper(new CallReorientCommand(req));
		case ErrorTransitionEditPart.VISUAL_ID:
			return getGEFWrapper(new ErrorTransitionReorientCommand(req));
		case ReferenceEditPart.VISUAL_ID:
			return getGEFWrapper(new ReferenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GatewayMergeSourceEditPart.VISUAL_ID:
			return getGEFWrapper(new GatewayMergeSourceReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
