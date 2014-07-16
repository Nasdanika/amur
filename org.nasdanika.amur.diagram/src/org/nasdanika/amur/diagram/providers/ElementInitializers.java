package org.nasdanika.amur.diagram.providers;

import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AmurDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			AmurDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
