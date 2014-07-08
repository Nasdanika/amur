package org.nasdanika.common.objectbrowser;

/**
 * Object browser item which creates a code snippet to be inserted into code editor.
 * @author Pavel
 *
 */
public interface Snippet extends ObjectBrowserItem {

	/**
	 * Code to insert into code editor.
	 * @return
	 */
	String getCode();
	
}
