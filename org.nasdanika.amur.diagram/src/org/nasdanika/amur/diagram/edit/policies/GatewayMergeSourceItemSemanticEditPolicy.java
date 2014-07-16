package org.nasdanika.amur.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

/**
 * @generated
 */
public class GatewayMergeSourceItemSemanticEditPolicy extends
		AmurBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GatewayMergeSourceItemSemanticEditPolicy() {
		super(AmurElementTypes.GatewayMergeSource_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
