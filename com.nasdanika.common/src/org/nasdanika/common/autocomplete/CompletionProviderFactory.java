package org.nasdanika.common.autocomplete;


public interface CompletionProviderFactory {
	
	/**
	 * @param context - Completion context, e.g. language name/mime type.
	 * @return Completion provider for a given context.
	 */
	CompletionProvider getCompletionProvider(Object context);

}
