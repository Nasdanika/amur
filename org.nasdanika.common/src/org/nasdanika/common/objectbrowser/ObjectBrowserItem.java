package org.nasdanika.common.objectbrowser;

import java.util.Set;


/**
 * Tree item in the object browser.
 * @author Pavel
 *
 */
public interface ObjectBrowserItem {
	
	// TODO - item ID, merge trees by ID.

	/**
	 * Item name.
	 * @return
	 */
	String getName();
	
	/**
	 * Item icon image.
	 * @param imageType
	 * @return
	 */
	<T> T getImage(Class<T> imageType);
	
	/**
	 * Description in HTML format.
	 * @return
	 */
	String getDescription();
	
	/**
	 * Keywords for search.
	 * @return
	 */
	Set<String> getKeywords();
}
