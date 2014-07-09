package org.nasdanika.common;

/**
 * Extension - provider of property editors.
 * @author Pavel Vlasov
 *
 */
public interface EditorProvider {
		
	/**
	 * Provider name.
	 * @return
	 */
	String getName(String mimeType);
	
	/**
	 * True if given mime type is supported.
	 * @param mimeType
	 * @return
	 */
	boolean supports(String mimeType);
	
	/**
	 * Creates editor for given mime type.
	 * @param mimeType
	 * @return
	 */
	Editor createEditor(String mimeType);
	
	/**
	 * @return Provider priority.
	 */
	int getPriority(String mimeType);

}
