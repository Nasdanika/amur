package org.nasdanika.common.autocomplete;

import javax.swing.Icon;

public interface Completion {
	
	Icon getIcon();
	
	String getSummary();
	
	String getShortDescription();
	
	int getRelevance();
	
	/**
	 * @return Unique id of the completion within its scope, e.g. field name in its class.
	 */
	String getId();

	/**
	 * @return Id of the scope which represents result of evaluation of this completion, e.g. method return type 
	 * or variable type.
	 */
	String getType();
	
}
