package org.nasdanika.amur.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.nasdanika.amur.diagram.part.AmurVisualIDRegistry;

/**
 * @generated
 */
public class AmurNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof AmurNavigatorItem) {
			AmurNavigatorItem item = (AmurNavigatorItem) element;
			return AmurVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
