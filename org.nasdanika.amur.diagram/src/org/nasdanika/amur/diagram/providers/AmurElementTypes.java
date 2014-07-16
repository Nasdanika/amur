package org.nasdanika.amur.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.nasdanika.amur.diagram.edit.parts.CallEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSource2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTarget2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.edit.parts.Container2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandler2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorTransitionEditPart;
import org.nasdanika.amur.diagram.edit.parts.Gateway2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayEditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayMergeSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.Node2EditPart;
import org.nasdanika.amur.diagram.edit.parts.Node3EditPart;
import org.nasdanika.amur.diagram.edit.parts.NodeEditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.ReferenceEditPart;
import org.nasdanika.amur.diagram.edit.parts.TransitionEditPart;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;

import org.nasdanika.amur.AmurPackage;

/**
 * @generated
 */
public class AmurElementTypes {

	/**
	 * @generated
	 */
	private AmurElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			AmurDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Node_1000 = getElementType("org.nasdanika.amur.diagram.Node_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gateway_2001 = getElementType("org.nasdanika.amur.diagram.Gateway_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Container_2002 = getElementType("org.nasdanika.amur.diagram.Container_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionSource_2003 = getElementType("org.nasdanika.amur.diagram.ConnectionSource_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionTarget_2004 = getElementType("org.nasdanika.amur.diagram.ConnectionTarget_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ErrorHandler_2005 = getElementType("org.nasdanika.amur.diagram.ErrorHandler_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_2006 = getElementType("org.nasdanika.amur.diagram.OutputPort_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_2007 = getElementType("org.nasdanika.amur.diagram.InputPort_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_2008 = getElementType("org.nasdanika.amur.diagram.Node_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionSource_3001 = getElementType("org.nasdanika.amur.diagram.ConnectionSource_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionTarget_3002 = getElementType("org.nasdanika.amur.diagram.ConnectionTarget_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Container_3003 = getElementType("org.nasdanika.amur.diagram.Container_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ErrorHandler_3004 = getElementType("org.nasdanika.amur.diagram.ErrorHandler_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Gateway_3005 = getElementType("org.nasdanika.amur.diagram.Gateway_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Node_3006 = getElementType("org.nasdanika.amur.diagram.Node_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("org.nasdanika.amur.diagram.Transition_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Call_4002 = getElementType("org.nasdanika.amur.diagram.Call_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ErrorTransition_4003 = getElementType("org.nasdanika.amur.diagram.ErrorTransition_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Reference_4004 = getElementType("org.nasdanika.amur.diagram.Reference_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GatewayMergeSource_4005 = getElementType("org.nasdanika.amur.diagram.GatewayMergeSource_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Node_1000, AmurPackage.eINSTANCE.getNode());

			elements.put(Gateway_2001, AmurPackage.eINSTANCE.getGateway());

			elements.put(Container_2002, AmurPackage.eINSTANCE.getContainer());

			elements.put(ConnectionSource_2003,
					AmurPackage.eINSTANCE.getConnectionSource());

			elements.put(ConnectionTarget_2004,
					AmurPackage.eINSTANCE.getConnectionTarget());

			elements.put(ErrorHandler_2005,
					AmurPackage.eINSTANCE.getErrorHandler());

			elements.put(OutputPort_2006, AmurPackage.eINSTANCE.getOutputPort());

			elements.put(InputPort_2007, AmurPackage.eINSTANCE.getInputPort());

			elements.put(Node_2008, AmurPackage.eINSTANCE.getNode());

			elements.put(ConnectionSource_3001,
					AmurPackage.eINSTANCE.getConnectionSource());

			elements.put(ConnectionTarget_3002,
					AmurPackage.eINSTANCE.getConnectionTarget());

			elements.put(Container_3003, AmurPackage.eINSTANCE.getContainer());

			elements.put(ErrorHandler_3004,
					AmurPackage.eINSTANCE.getErrorHandler());

			elements.put(Gateway_3005, AmurPackage.eINSTANCE.getGateway());

			elements.put(Node_3006, AmurPackage.eINSTANCE.getNode());

			elements.put(Transition_4001, AmurPackage.eINSTANCE.getTransition());

			elements.put(Call_4002, AmurPackage.eINSTANCE.getCall());

			elements.put(ErrorTransition_4003,
					AmurPackage.eINSTANCE.getErrorTransition());

			elements.put(Reference_4004, AmurPackage.eINSTANCE.getReference());

			elements.put(GatewayMergeSource_4005,
					AmurPackage.eINSTANCE.getGateway_MergeSource());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Node_1000);
			KNOWN_ELEMENT_TYPES.add(Gateway_2001);
			KNOWN_ELEMENT_TYPES.add(Container_2002);
			KNOWN_ELEMENT_TYPES.add(ConnectionSource_2003);
			KNOWN_ELEMENT_TYPES.add(ConnectionTarget_2004);
			KNOWN_ELEMENT_TYPES.add(ErrorHandler_2005);
			KNOWN_ELEMENT_TYPES.add(OutputPort_2006);
			KNOWN_ELEMENT_TYPES.add(InputPort_2007);
			KNOWN_ELEMENT_TYPES.add(Node_2008);
			KNOWN_ELEMENT_TYPES.add(ConnectionSource_3001);
			KNOWN_ELEMENT_TYPES.add(ConnectionTarget_3002);
			KNOWN_ELEMENT_TYPES.add(Container_3003);
			KNOWN_ELEMENT_TYPES.add(ErrorHandler_3004);
			KNOWN_ELEMENT_TYPES.add(Gateway_3005);
			KNOWN_ELEMENT_TYPES.add(Node_3006);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
			KNOWN_ELEMENT_TYPES.add(Call_4002);
			KNOWN_ELEMENT_TYPES.add(ErrorTransition_4003);
			KNOWN_ELEMENT_TYPES.add(Reference_4004);
			KNOWN_ELEMENT_TYPES.add(GatewayMergeSource_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case NodeEditPart.VISUAL_ID:
			return Node_1000;
		case GatewayEditPart.VISUAL_ID:
			return Gateway_2001;
		case ContainerEditPart.VISUAL_ID:
			return Container_2002;
		case ConnectionSourceEditPart.VISUAL_ID:
			return ConnectionSource_2003;
		case ConnectionTargetEditPart.VISUAL_ID:
			return ConnectionTarget_2004;
		case ErrorHandlerEditPart.VISUAL_ID:
			return ErrorHandler_2005;
		case OutputPortEditPart.VISUAL_ID:
			return OutputPort_2006;
		case InputPortEditPart.VISUAL_ID:
			return InputPort_2007;
		case Node2EditPart.VISUAL_ID:
			return Node_2008;
		case ConnectionSource2EditPart.VISUAL_ID:
			return ConnectionSource_3001;
		case ConnectionTarget2EditPart.VISUAL_ID:
			return ConnectionTarget_3002;
		case Container2EditPart.VISUAL_ID:
			return Container_3003;
		case ErrorHandler2EditPart.VISUAL_ID:
			return ErrorHandler_3004;
		case Gateway2EditPart.VISUAL_ID:
			return Gateway_3005;
		case Node3EditPart.VISUAL_ID:
			return Node_3006;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		case CallEditPart.VISUAL_ID:
			return Call_4002;
		case ErrorTransitionEditPart.VISUAL_ID:
			return ErrorTransition_4003;
		case ReferenceEditPart.VISUAL_ID:
			return Reference_4004;
		case GatewayMergeSourceEditPart.VISUAL_ID:
			return GatewayMergeSource_4005;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.nasdanika.amur.diagram.providers.AmurElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.nasdanika.amur.diagram.providers.AmurElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.nasdanika.amur.diagram.providers.AmurElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
