package org.nasdanika.amur;

public interface AmurActionBase<T> {

	enum Mode {
		HIDDEN,
		DISABLED,
		ENABLED
	}
	
	Mode getMode(T target);
	
}
