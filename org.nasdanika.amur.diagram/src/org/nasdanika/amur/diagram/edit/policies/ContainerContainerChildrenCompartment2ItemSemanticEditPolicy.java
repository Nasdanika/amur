package org.nasdanika.amur.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.nasdanika.amur.diagram.edit.commands.ConnectionSource2CreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ConnectionTarget2CreateCommand;
import org.nasdanika.amur.diagram.edit.commands.Container2CreateCommand;
import org.nasdanika.amur.diagram.edit.commands.ErrorHandler2CreateCommand;
import org.nasdanika.amur.diagram.edit.commands.Gateway2CreateCommand;
import org.nasdanika.amur.diagram.edit.commands.Node2CreateCommand;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class ContainerContainerChildrenCompartment2ItemSemanticEditPolicy
		extends AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContainerContainerChildrenCompartment2ItemSemanticEditPolicy() {
		super(AmurElementTypes.Container_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AmurElementTypes.ConnectionSource_3001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionSource2CreateCommand(req));
		}
		if (AmurElementTypes.ConnectionTarget_3002 == req.getElementType()) {
			return getGEFWrapper(new ConnectionTarget2CreateCommand(req));
		}
		if (AmurElementTypes.Container_3003 == req.getElementType()) {
			return getGEFWrapper(new Container2CreateCommand(req));
		}
		if (AmurElementTypes.ErrorHandler_3004 == req.getElementType()) {
			return getGEFWrapper(new ErrorHandler2CreateCommand(req));
		}
		if (AmurElementTypes.Gateway_3005 == req.getElementType()) {
			return getGEFWrapper(new Gateway2CreateCommand(req));
		}
		if (AmurElementTypes.Node_3006 == req.getElementType()) {
			return getGEFWrapper(new Node2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
