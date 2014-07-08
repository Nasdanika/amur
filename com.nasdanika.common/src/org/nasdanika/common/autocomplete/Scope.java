package org.nasdanika.common.autocomplete;

import java.util.Collection;
import java.util.List;

/**
 * Completion scope. It is used to resolve completions after dot. Corresponds to class/object.
 * @author Pavel
 *
 */
public interface Scope {
	
	/**
	 * @return Unique scope id, e.g. fully qualified name of Java class.
	 */
	String getId();
	
	/**
	 * @return Human-readable scope name, e.g. class name.
	 */
	String getName();

	/**
	 * @return Completions for this scope.
	 */
	Collection<VariableCompletion> getCompletions();
	
	/**
	 * @return A list of base (super) scopes which this scope extends.
	 */
	List<Scope> getBaseScopes();
}
