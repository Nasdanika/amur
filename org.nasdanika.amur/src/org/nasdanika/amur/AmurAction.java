package org.nasdanika.amur;

import java.util.Map;

public interface AmurAction<T> extends AmurActionBase<T> {

	void run(T target, String actionId, Map<Object, Object> context);

}
