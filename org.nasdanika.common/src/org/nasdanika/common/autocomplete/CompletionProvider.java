package org.nasdanika.common.autocomplete;

import java.util.Collection;

/**
 * Provider of completions.
 * @author Pavel
 *
 */
public interface CompletionProvider {
	
	/**
	 * @return Unscoped completions.
	 */
	Collection<Completion> getCompletions();
	
	/**
	 * @return "this" scope.
	 */
	Scope getScope();
	
	Scope resolveScope(String scopeId);

}
