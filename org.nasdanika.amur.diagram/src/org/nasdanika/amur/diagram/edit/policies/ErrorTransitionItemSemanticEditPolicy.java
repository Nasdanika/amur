package org.nasdanika.amur.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class ErrorTransitionItemSemanticEditPolicy extends
		AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ErrorTransitionItemSemanticEditPolicy() {
		super(AmurElementTypes.ErrorTransition_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
