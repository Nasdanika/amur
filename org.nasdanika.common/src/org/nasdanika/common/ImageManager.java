package org.nasdanika.common;


/**
 * Manages saving images to disk without creating duplicates.
 * @author Pavel
 *
 */
public interface ImageManager {
	
	String saveImage(Object imageObject, String nameHint) throws Exception;

}
