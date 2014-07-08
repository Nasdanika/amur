package org.nasdanika.common;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;

public interface HtmlRenderer<T> extends Comparable<HtmlRenderer<T>> {
	
	String renderHtml(
			T obj, 
			File resourceContainer, 
			ImageManager imageManager,
			AdapterFactory adapterFactory, 
			Map<Object, Object> context) throws Exception;

	boolean accept(T candidate);
	
	Class<T> getRendereeType();
}
