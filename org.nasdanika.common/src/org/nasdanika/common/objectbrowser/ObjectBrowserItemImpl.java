package org.nasdanika.common.objectbrowser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Simple implementation of ObjectBrowserItem.
 * @author Pavel
 *
 */
public class ObjectBrowserItemImpl implements ObjectBrowserItem {

	static class ObjectBrowserCompositeItemImpl extends ObjectBrowserItemImpl implements ObjectBrowserCompositeItem {
		
		protected ObjectBrowserCompositeItemImpl(List<ObjectBrowserItem> children) {
			this.children = children;
		}
		
	}

	static class SnippetImpl extends ObjectBrowserItemImpl implements Snippet {
		
		SnippetImpl(String code) {
			this.code = code;
		}
		
	}
			
	static class CompositeSnippetImpl extends ObjectBrowserCompositeItemImpl implements Snippet {

		protected CompositeSnippetImpl(List<ObjectBrowserItem> children, String code) {
			super(children);
			this.code = code;
		}
		
	}
	
	protected ObjectBrowserItemImpl() {
		
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	
	@Override
	public String toString() {
		return getName();
	}

	private String description;
	private Set<String> keyWords = new HashSet<String>();
	private String name;
	protected List<ObjectBrowserItem> children;
	protected String code;
	private byte[] imageData;
	private ImageIcon imageIcon;

	@Override
	public String getDescription() {
		return description;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getImage(Class<T> imageType) {
		if (byte[].class.equals(imageType)) {
			return (T) imageData;
		}
		
		if (Icon.class.equals(imageType)) {
			if (imageIcon==null && imageData!=null) {
				imageIcon = new ImageIcon(imageData);
			}
			return (T) imageIcon;
		}

		if (imageData!=null) {
			throw new IllegalArgumentException("Unsupported image type: "+imageType);
		}
		
		return null;
	}

	@Override
	public Set<String> getKeywords() {
		return keyWords;
	}

	@Override
	public String getName() {
		return name;
	}

	public List<ObjectBrowserItem> getChildren() {
		return children;
	}

	public String getCode() {
		return code;
	}
	
	/**
	 * Factory method to create an instance of appropriate type depending on parameters.
	 * @param children
	 * @param code
	 * @return
	 */
	public static ObjectBrowserItemImpl createItem(List<ObjectBrowserItem> children, String code) {
		if (code==null || code.trim().length()==0) {
			if (children==null || children.isEmpty()) {
				return new ObjectBrowserItemImpl();
			}
			
			return new ObjectBrowserCompositeItemImpl(children);			
		}
		
		if (children==null || children.isEmpty()) {
			return new SnippetImpl(code);
		}
		
		return new CompositeSnippetImpl(children, code);
	}

}
