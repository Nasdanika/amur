package org.nasdanika.amur;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;

public interface AmurActionWithProgress<T, C> extends AmurActionBase<T> {
	
	C configure(T target);
	
	IStatus run(T target, C config, String actionId, IProgressMonitor monitor, Map<Object, Object> context);

}
