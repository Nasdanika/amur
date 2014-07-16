package org.nasdanika.amur.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;

/**
 * @generated
 */
public class AmurEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AmurVisualIDRegistry.getVisualID(view)) {

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case GatewayEditPart.VISUAL_ID:
				return new GatewayEditPart(view);

			case GatewayNameEditPart.VISUAL_ID:
				return new GatewayNameEditPart(view);

			case ContainerEditPart.VISUAL_ID:
				return new ContainerEditPart(view);

			case ContainerNameEditPart.VISUAL_ID:
				return new ContainerNameEditPart(view);

			case ConnectionSourceEditPart.VISUAL_ID:
				return new ConnectionSourceEditPart(view);

			case ConnectionSourceNameEditPart.VISUAL_ID:
				return new ConnectionSourceNameEditPart(view);

			case ConnectionTargetEditPart.VISUAL_ID:
				return new ConnectionTargetEditPart(view);

			case ConnectionTargetNameEditPart.VISUAL_ID:
				return new ConnectionTargetNameEditPart(view);

			case ErrorHandlerEditPart.VISUAL_ID:
				return new ErrorHandlerEditPart(view);

			case ErrorHandlerNameEditPart.VISUAL_ID:
				return new ErrorHandlerNameEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case OutputPortNameEditPart.VISUAL_ID:
				return new OutputPortNameEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case InputPortNameEditPart.VISUAL_ID:
				return new InputPortNameEditPart(view);

			case Node2EditPart.VISUAL_ID:
				return new Node2EditPart(view);

			case NodeNameEditPart.VISUAL_ID:
				return new NodeNameEditPart(view);

			case ConnectionSource2EditPart.VISUAL_ID:
				return new ConnectionSource2EditPart(view);

			case ConnectionSourceName2EditPart.VISUAL_ID:
				return new ConnectionSourceName2EditPart(view);

			case ConnectionTarget2EditPart.VISUAL_ID:
				return new ConnectionTarget2EditPart(view);

			case ConnectionTargetName2EditPart.VISUAL_ID:
				return new ConnectionTargetName2EditPart(view);

			case Container2EditPart.VISUAL_ID:
				return new Container2EditPart(view);

			case ContainerName2EditPart.VISUAL_ID:
				return new ContainerName2EditPart(view);

			case ErrorHandler2EditPart.VISUAL_ID:
				return new ErrorHandler2EditPart(view);

			case ErrorHandlerName2EditPart.VISUAL_ID:
				return new ErrorHandlerName2EditPart(view);

			case Gateway2EditPart.VISUAL_ID:
				return new Gateway2EditPart(view);

			case GatewayName2EditPart.VISUAL_ID:
				return new GatewayName2EditPart(view);

			case Node3EditPart.VISUAL_ID:
				return new Node3EditPart(view);

			case NodeName2EditPart.VISUAL_ID:
				return new NodeName2EditPart(view);

			case ContainerContainerChildrenCompartmentEditPart.VISUAL_ID:
				return new ContainerContainerChildrenCompartmentEditPart(view);

			case ContainerContainerChildrenCompartment2EditPart.VISUAL_ID:
				return new ContainerContainerChildrenCompartment2EditPart(view);

			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);

			case TransitionNameEditPart.VISUAL_ID:
				return new TransitionNameEditPart(view);

			case CallEditPart.VISUAL_ID:
				return new CallEditPart(view);

			case CallNameEditPart.VISUAL_ID:
				return new CallNameEditPart(view);

			case ErrorTransitionEditPart.VISUAL_ID:
				return new ErrorTransitionEditPart(view);

			case ErrorTransitionNameEditPart.VISUAL_ID:
				return new ErrorTransitionNameEditPart(view);

			case ReferenceEditPart.VISUAL_ID:
				return new ReferenceEditPart(view);

			case ReferenceNameEditPart.VISUAL_ID:
				return new ReferenceNameEditPart(view);

			case GatewayMergeSourceEditPart.VISUAL_ID:
				return new GatewayMergeSourceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
