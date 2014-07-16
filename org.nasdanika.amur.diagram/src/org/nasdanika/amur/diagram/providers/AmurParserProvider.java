package org.nasdanika.amur.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.nasdanika.amur.diagram.edit.parts.CallNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeName2EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceNameEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionNameEditPart;
import org.nasdanika.amur.diagram.parsers.MessageFormatParser;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;

import org.nasdanika.amur.AmurPackage;

/**
 * @generated
 */
public class AmurParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser gatewayName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getGatewayName_5001Parser() {
		if (gatewayName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gatewayName_5001Parser = parser;
		}
		return gatewayName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser containerName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getContainerName_5002Parser() {
		if (containerName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerName_5002Parser = parser;
		}
		return containerName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionSourceName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionSourceName_5003Parser() {
		if (connectionSourceName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionSourceName_5003Parser = parser;
		}
		return connectionSourceName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionTargetName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionTargetName_5004Parser() {
		if (connectionTargetName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionTargetName_5004Parser = parser;
		}
		return connectionTargetName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser errorHandlerName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getErrorHandlerName_5005Parser() {
		if (errorHandlerName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			errorHandlerName_5005Parser = parser;
		}
		return errorHandlerName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputPortName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getOutputPortName_5006Parser() {
		if (outputPortName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputPortName_5006Parser = parser;
		}
		return outputPortName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPortName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getInputPortName_5007Parser() {
		if (inputPortName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputPortName_5007Parser = parser;
		}
		return inputPortName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5008Parser() {
		if (nodeName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5008Parser = parser;
		}
		return nodeName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionSourceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionSourceName_5009Parser() {
		if (connectionSourceName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionSourceName_5009Parser = parser;
		}
		return connectionSourceName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionTargetName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionTargetName_5010Parser() {
		if (connectionTargetName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectionTargetName_5010Parser = parser;
		}
		return connectionTargetName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser containerName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getContainerName_5014Parser() {
		if (containerName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			containerName_5014Parser = parser;
		}
		return containerName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser errorHandlerName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getErrorHandlerName_5011Parser() {
		if (errorHandlerName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			errorHandlerName_5011Parser = parser;
		}
		return errorHandlerName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser gatewayName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getGatewayName_5012Parser() {
		if (gatewayName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			gatewayName_5012Parser = parser;
		}
		return gatewayName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser nodeName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getNodeName_5013Parser() {
		if (nodeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			nodeName_5013Parser = parser;
		}
		return nodeName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser transitionName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getTransitionName_6001Parser() {
		if (transitionName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			transitionName_6001Parser = parser;
		}
		return transitionName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser callName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getCallName_6002Parser() {
		if (callName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			callName_6002Parser = parser;
		}
		return callName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser errorTransitionName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getErrorTransitionName_6003Parser() {
		if (errorTransitionName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			errorTransitionName_6003Parser = parser;
		}
		return errorTransitionName_6003Parser;
	}

	/**
	 * @generated
	 */
	private IParser referenceName_6004Parser;

	/**
	 * @generated
	 */
	private IParser getReferenceName_6004Parser() {
		if (referenceName_6004Parser == null) {
			EAttribute[] features = new EAttribute[] { AmurPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			referenceName_6004Parser = parser;
		}
		return referenceName_6004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case GatewayNameEditPart.VISUAL_ID:
			return getGatewayName_5001Parser();
		case ContainerNameEditPart.VISUAL_ID:
			return getContainerName_5002Parser();
		case ConnectionSourceNameEditPart.VISUAL_ID:
			return getConnectionSourceName_5003Parser();
		case ConnectionTargetNameEditPart.VISUAL_ID:
			return getConnectionTargetName_5004Parser();
		case ErrorHandlerNameEditPart.VISUAL_ID:
			return getErrorHandlerName_5005Parser();
		case OutputPortNameEditPart.VISUAL_ID:
			return getOutputPortName_5006Parser();
		case InputPortNameEditPart.VISUAL_ID:
			return getInputPortName_5007Parser();
		case NodeNameEditPart.VISUAL_ID:
			return getNodeName_5008Parser();
		case ConnectionSourceName2EditPart.VISUAL_ID:
			return getConnectionSourceName_5009Parser();
		case ConnectionTargetName2EditPart.VISUAL_ID:
			return getConnectionTargetName_5010Parser();
		case ContainerName2EditPart.VISUAL_ID:
			return getContainerName_5014Parser();
		case ErrorHandlerName2EditPart.VISUAL_ID:
			return getErrorHandlerName_5011Parser();
		case GatewayName2EditPart.VISUAL_ID:
			return getGatewayName_5012Parser();
		case NodeName2EditPart.VISUAL_ID:
			return getNodeName_5013Parser();
		case TransitionNameEditPart.VISUAL_ID:
			return getTransitionName_6001Parser();
		case CallNameEditPart.VISUAL_ID:
			return getCallName_6002Parser();
		case ErrorTransitionNameEditPart.VISUAL_ID:
			return getErrorTransitionName_6003Parser();
		case ReferenceNameEditPart.VISUAL_ID:
			return getReferenceName_6004Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AmurVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AmurVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AmurElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
