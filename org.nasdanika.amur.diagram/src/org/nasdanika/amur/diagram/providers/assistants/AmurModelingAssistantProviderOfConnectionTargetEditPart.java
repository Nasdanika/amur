package org.nasdanika.amur.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;
import org.nasdanika.amur.diagram.providers.AmurModelingAssistantProvider;

/**
 * @generated
 */
public class AmurModelingAssistantProviderOfConnectionTargetEditPart extends
		AmurModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ConnectionTargetEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ConnectionTargetEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(AmurElementTypes.Transition_4001);
		types.add(AmurElementTypes.Call_4002);
		types.add(AmurElementTypes.ErrorTransition_4003);
		types.add(AmurElementTypes.Reference_4004);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ConnectionTargetEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ConnectionTargetEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AmurElementTypes.Transition_4001) {
//			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
//			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Call_4002) {
//			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
//			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.ErrorTransition_4003) {
//			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
//			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Reference_4004) {
//			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
//			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		}
		return types;
	}

}
