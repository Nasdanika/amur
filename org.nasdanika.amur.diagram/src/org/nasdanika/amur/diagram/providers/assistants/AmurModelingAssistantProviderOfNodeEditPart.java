package org.nasdanika.amur.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;
import org.nasdanika.amur.diagram.providers.AmurModelingAssistantProvider;

/**
 * @generated
 */
public class AmurModelingAssistantProviderOfNodeEditPart extends
		AmurModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		//types.add(AmurElementTypes.Gateway_2001);
		types.add(AmurElementTypes.Container_2002);
		types.add(AmurElementTypes.ConnectionSource_2003);
		types.add(AmurElementTypes.ConnectionTarget_2004);
		types.add(AmurElementTypes.ErrorHandler_2005);
		types.add(AmurElementTypes.OutputPort_2006);
		types.add(AmurElementTypes.InputPort_2007);
		types.add(AmurElementTypes.Node_2008);
		return types;
	}

}
