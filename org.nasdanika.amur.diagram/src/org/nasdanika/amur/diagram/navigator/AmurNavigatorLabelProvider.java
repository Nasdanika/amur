package org.nasdanika.amur.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.nasdanika.amur.diagram.edit.parts.CallEditPart;
import org.nasdanika.amur.diagram.edit.parts.CallNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSource2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTarget2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Container2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandler2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Gateway2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayMergeSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.Node2EditPart;
import org.nasdanika.amur.diagram.edit.parts.Node3EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeEditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionNameEditPart;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;
import org.nasdanika.amur.diagram.providers.AmurParserProvider;

import org.nasdanika.amur.Node;

/**
 * @generated
 */
public class AmurNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AmurDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AmurDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AmurNavigatorItem
				&& !isOwnView(((AmurNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof AmurNavigatorGroup) {
			AmurNavigatorGroup group = (AmurNavigatorGroup) element;
			return AmurDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof AmurNavigatorItem) {
			AmurNavigatorItem navigatorItem = (AmurNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?urn:org.nasdanika.amur?Node", AmurElementTypes.Node_1000); //$NON-NLS-1$
		case GatewayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?Gateway", AmurElementTypes.Gateway_2001); //$NON-NLS-1$
		case ContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?Container", AmurElementTypes.Container_2002); //$NON-NLS-1$
		case ConnectionSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?ConnectionSource", AmurElementTypes.ConnectionSource_2003); //$NON-NLS-1$
		case ConnectionTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?ConnectionTarget", AmurElementTypes.ConnectionTarget_2004); //$NON-NLS-1$
		case ErrorHandlerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?ErrorHandler", AmurElementTypes.ErrorHandler_2005); //$NON-NLS-1$
		case OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?OutputPort", AmurElementTypes.OutputPort_2006); //$NON-NLS-1$
		case InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?InputPort", AmurElementTypes.InputPort_2007); //$NON-NLS-1$
		case Node2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?urn:org.nasdanika.amur?Node", AmurElementTypes.Node_2008); //$NON-NLS-1$
		case ConnectionSource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?ConnectionSource", AmurElementTypes.ConnectionSource_3001); //$NON-NLS-1$
		case ConnectionTarget2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?ConnectionTarget", AmurElementTypes.ConnectionTarget_3002); //$NON-NLS-1$
		case Container2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?Container", AmurElementTypes.Container_3003); //$NON-NLS-1$
		case ErrorHandler2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?ErrorHandler", AmurElementTypes.ErrorHandler_3004); //$NON-NLS-1$
		case Gateway2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?Gateway", AmurElementTypes.Gateway_3005); //$NON-NLS-1$
		case Node3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?urn:org.nasdanika.amur?Node", AmurElementTypes.Node_3006); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?urn:org.nasdanika.amur?Transition", AmurElementTypes.Transition_4001); //$NON-NLS-1$
		case CallEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?urn:org.nasdanika.amur?Call", AmurElementTypes.Call_4002); //$NON-NLS-1$
		case ErrorTransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?urn:org.nasdanika.amur?ErrorTransition", AmurElementTypes.ErrorTransition_4003); //$NON-NLS-1$
		case ReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?urn:org.nasdanika.amur?Reference", AmurElementTypes.Reference_4004); //$NON-NLS-1$
		case GatewayMergeSourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?urn:org.nasdanika.amur?Gateway?mergeSource", AmurElementTypes.GatewayMergeSource_4005); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AmurDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& AmurElementTypes.isKnownElementType(elementType)) {
			image = AmurElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof AmurNavigatorGroup) {
			AmurNavigatorGroup group = (AmurNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AmurNavigatorItem) {
			AmurNavigatorItem navigatorItem = (AmurNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AmurVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_1000Text(view);
		case GatewayEditPart.VISUAL_ID:
			return getGateway_2001Text(view);
		case ContainerEditPart.VISUAL_ID:
			return getContainer_2002Text(view);
		case ConnectionSourceEditPart.VISUAL_ID:
			return getConnectionSource_2003Text(view);
		case ConnectionTargetEditPart.VISUAL_ID:
			return getConnectionTarget_2004Text(view);
		case ErrorHandlerEditPart.VISUAL_ID:
			return getErrorHandler_2005Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_2006Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_2007Text(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2008Text(view);
		case ConnectionSource2EditPart.VISUAL_ID:
			return getConnectionSource_3001Text(view);
		case ConnectionTarget2EditPart.VISUAL_ID:
			return getConnectionTarget_3002Text(view);
		case Container2EditPart.VISUAL_ID:
			return getContainer_3003Text(view);
		case ErrorHandler2EditPart.VISUAL_ID:
			return getErrorHandler_3004Text(view);
		case Gateway2EditPart.VISUAL_ID:
			return getGateway_3005Text(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_3006Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case CallEditPart.VISUAL_ID:
			return getCall_4002Text(view);
		case ErrorTransitionEditPart.VISUAL_ID:
			return getErrorTransition_4003Text(view);
		case ReferenceEditPart.VISUAL_ID:
			return getReference_4004Text(view);
		case GatewayMergeSourceEditPart.VISUAL_ID:
			return getGatewayMergeSource_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getNode_1000Text(View view) {
		Node domainModelElement = (Node) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGateway_2001Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Gateway_2001,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(GatewayNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainer_2002Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Container_2002,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(ContainerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionSource_2003Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ConnectionSource_2003,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ConnectionSourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionTarget_2004Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ConnectionTarget_2004,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ConnectionTargetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getErrorHandler_2005Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ErrorHandler_2005,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ErrorHandlerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputPort_2006Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.OutputPort_2006,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(OutputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputPort_2007Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.InputPort_2007,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(InputPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_2008Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Node_2008,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(NodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionSource_3001Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ConnectionSource_3001,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ConnectionSourceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnectionTarget_3002Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ConnectionTarget_3002,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ConnectionTargetName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContainer_3003Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Container_3003,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(ContainerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getErrorHandler_3004Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ErrorHandler_3004,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ErrorHandlerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGateway_3005Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Gateway_3005,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(GatewayName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNode_3006Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Node_3006,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(NodeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(TransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCall_4002Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Call_4002,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(CallNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getErrorTransition_4003Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.ErrorTransition_4003,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry
						.getType(ErrorTransitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReference_4004Text(View view) {
		IParser parser = AmurParserProvider.getParser(
				AmurElementTypes.Reference_4004,
				view.getElement() != null ? view.getElement() : view,
				AmurVisualIDRegistry.getType(ReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGatewayMergeSource_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return NodeEditPart.MODEL_ID.equals(AmurVisualIDRegistry
				.getModelID(view));
	}

}
