package org.nasdanika.amur.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSource2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionSourceEditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTarget2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ConnectionTargetEditPart;
import org.nasdanika.amur.diagram.edit.parts.Container2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ContainerEditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandler2EditPart;
import org.nasdanika.amur.diagram.edit.parts.ErrorHandlerEditPart;
import org.nasdanika.amur.diagram.edit.parts.Gateway2EditPart;
import org.nasdanika.amur.diagram.edit.parts.GatewayEditPart;
import org.nasdanika.amur.diagram.edit.parts.InputPortEditPart;
import org.nasdanika.amur.diagram.edit.parts.Node2EditPart;
import org.nasdanika.amur.diagram.edit.parts.Node3EditPart;
import org.nasdanika.amur.diagram.edit.parts.OutputPortEditPart;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;
import org.nasdanika.amur.diagram.providers.AmurModelingAssistantProvider;

/**
 * @generated
 */
public class AmurModelingAssistantProviderOfGatewayEditPart extends
		AmurModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((GatewayEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(GatewayEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(AmurElementTypes.Transition_4001);
		types.add(AmurElementTypes.Call_4002);
		types.add(AmurElementTypes.ErrorTransition_4003);
		types.add(AmurElementTypes.Reference_4004);
		//types.add(AmurElementTypes.GatewayMergeSource_4005);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((GatewayEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			GatewayEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GatewayEditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ContainerEditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ConnectionTargetEditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof ConnectionTarget2EditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Container2EditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Gateway2EditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof Node3EditPart) {
			types.add(AmurElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof GatewayEditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof ContainerEditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof ConnectionTargetEditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof ConnectionTarget2EditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof Container2EditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof Gateway2EditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof Node3EditPart) {
			types.add(AmurElementTypes.Call_4002);
		}
		if (targetEditPart instanceof GatewayEditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof ContainerEditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof ConnectionTargetEditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof ConnectionTarget2EditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof Container2EditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof Gateway2EditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof Node3EditPart) {
			types.add(AmurElementTypes.ErrorTransition_4003);
		}
		if (targetEditPart instanceof GatewayEditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof ContainerEditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof ConnectionTargetEditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof OutputPortEditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof ConnectionTarget2EditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof Container2EditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof Gateway2EditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof Node3EditPart) {
			types.add(AmurElementTypes.Reference_4004);
		}
		if (targetEditPart instanceof GatewayEditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof ContainerEditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof ConnectionSourceEditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof ErrorHandlerEditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof InputPortEditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof Node2EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof ConnectionSource2EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof Container2EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof ErrorHandler2EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof Gateway2EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		if (targetEditPart instanceof Node3EditPart) {
			//types.add(AmurElementTypes.GatewayMergeSource_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((GatewayEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(GatewayEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AmurElementTypes.Transition_4001) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionTarget_2004);
			types.add(AmurElementTypes.OutputPort_2006);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionTarget_3002);
			types.add(AmurElementTypes.Container_3003);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Call_4002) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionTarget_2004);
			types.add(AmurElementTypes.OutputPort_2006);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionTarget_3002);
			types.add(AmurElementTypes.Container_3003);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.ErrorTransition_4003) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionTarget_2004);
			types.add(AmurElementTypes.OutputPort_2006);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionTarget_3002);
			types.add(AmurElementTypes.Container_3003);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Reference_4004) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionTarget_2004);
			types.add(AmurElementTypes.OutputPort_2006);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionTarget_3002);
			types.add(AmurElementTypes.Container_3003);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.GatewayMergeSource_4005) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((GatewayEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(GatewayEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(AmurElementTypes.Transition_4001);
		types.add(AmurElementTypes.Call_4002);
		types.add(AmurElementTypes.ErrorTransition_4003);
		types.add(AmurElementTypes.Reference_4004);
		//types.add(AmurElementTypes.GatewayMergeSource_4005);
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
		return doGetTypesForSource((GatewayEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(GatewayEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AmurElementTypes.Transition_4001) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Call_4002) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.ErrorTransition_4003) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.Reference_4004) {
			//types.add(AmurElementTypes.Gateway_2001);
			types.add(AmurElementTypes.Container_2002);
			types.add(AmurElementTypes.ConnectionSource_2003);
			types.add(AmurElementTypes.ErrorHandler_2005);
			types.add(AmurElementTypes.InputPort_2007);
			types.add(AmurElementTypes.Node_2008);
			types.add(AmurElementTypes.ConnectionSource_3001);
			types.add(AmurElementTypes.Container_3003);
			types.add(AmurElementTypes.ErrorHandler_3004);
			//types.add(AmurElementTypes.Gateway_3005);
			types.add(AmurElementTypes.Node_3006);
		} else if (relationshipType == AmurElementTypes.GatewayMergeSource_4005) {
			//types.add(AmurElementTypes.Gateway_2001);
			//types.add(AmurElementTypes.Gateway_3005);
		}
		return types;
	}

}
