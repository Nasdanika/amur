package org.nasdanika.amur.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class CallItemSemanticEditPolicy extends AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CallItemSemanticEditPolicy() {
		super(AmurElementTypes.Call_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
