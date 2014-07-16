package org.nasdanika.amur.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.nasdanika.amur.diagram.edit.parts.AmurEditPartFactory;
import org.nasdanika.amur.diagram.edit.parts.NodeEditPart;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;

/**
 * @generated
 */
public class AmurEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public AmurEditPartProvider() {
		super(new AmurEditPartFactory(), AmurVisualIDRegistry.TYPED_INSTANCE,
				NodeEditPart.MODEL_ID);
	}

}
