package org.nasdanika.amur.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.nasdanika.amur.diagram.edit.commands.ConnectionSourceCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ConnectionTargetCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ContainerCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ErrorHandlerCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.GatewayCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.InputPortCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.NodeCreateCommand;
import org.nasdanika.amur.diagram.edit.commands.OutputPortCreateCommand;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class NodeItemSemanticEditPolicy extends AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeItemSemanticEditPolicy() {
		super(AmurElementTypes.Node_1000);
	}

	/**
	 * @generated NOT - Gateway Commented out.
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
//		if (AmurElementTypes.Gateway_2001 == req.getElementType()) {
//			return getGEFWrapper(new GatewayCreateCommand(req));
//		}
		if (AmurElementTypes.Container_2002 == req.getElementType()) {
			return getGEFWrapper(new ContainerCreateCommand(req));
		}
		if (AmurElementTypes.ConnectionSource_2003 == req.getElementType()) {
			return getGEFWrapper(new ConnectionSourceCreateCommand(req));
		}
		if (AmurElementTypes.ConnectionTarget_2004 == req.getElementType()) {
			return getGEFWrapper(new ConnectionTargetCreateCommand(req));
		}
		if (AmurElementTypes.ErrorHandler_2005 == req.getElementType()) {
			return getGEFWrapper(new ErrorHandlerCreateCommand(req));
		}
		if (AmurElementTypes.OutputPort_2006 == req.getElementType()) {
			return getGEFWrapper(new OutputPortCreateCommand(req));
		}
		if (AmurElementTypes.InputPort_2007 == req.getElementType()) {
			return getGEFWrapper(new InputPortCreateCommand(req));
		}
		if (AmurElementTypes.Node_2008 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
