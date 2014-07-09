package org.nasdanika.common.objectbrowser;

import java.util.List;

/**
 * Item containing other items.
 * @author Pavel
 *
 */
public interface ObjectBrowserCompositeItem extends ObjectBrowserItem {

	List<ObjectBrowserItem> getChildren();
	
}
