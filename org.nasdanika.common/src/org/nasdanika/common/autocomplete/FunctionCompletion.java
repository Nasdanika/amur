package org.nasdanika.common.autocomplete;

import java.util.List;

public interface FunctionCompletion extends VariableCompletion {
	
	List<Parameter> getParameters();
	
	String getReturnValueDescription();

}
