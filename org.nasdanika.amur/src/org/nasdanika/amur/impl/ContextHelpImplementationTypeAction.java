package org.nasdanika.amur.impl;

import java.util.Map;

import org.eclipse.ui.PlatformUI;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeAction;

/**
 * Opens context help with id equal to the action id.
 * @author Pavel
 *
 */
public class ContextHelpImplementationTypeAction implements ImplementationTypeAction {

	@Override
	public void run(ImplementationType implementationType, String actionId,	Map<Object, Object> context) {
		PlatformUI.getWorkbench().getHelpSystem().displayHelp(actionId);		
	}

	@Override
	public org.nasdanika.amur.AmurActionBase.Mode getMode(ImplementationType target) {
		return Mode.ENABLED;
	}

}
