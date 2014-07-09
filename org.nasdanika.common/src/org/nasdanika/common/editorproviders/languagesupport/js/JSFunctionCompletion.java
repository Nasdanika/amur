/*
 * 02/25/2012
 *
 * Copyright (C) 2012 Robert Futrell
 * robert_futrell at users.sourceforge.net
 * http://fifesoft.com/rsyntaxtextarea
 *
 * This library is distributed under a modified BSD license.  See the included
 * RSTALanguageSupport.License.txt file for details.
 */
package org.nasdanika.common.editorproviders.languagesupport.js;

import javax.swing.Icon;
import javax.swing.text.JTextComponent;

import org.fife.rsta.ac.js.IconFactory;
import org.fife.rsta.ac.js.JavaScriptHelper;
import org.fife.rsta.ac.js.completion.JSCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.FunctionCompletion;


public class JSFunctionCompletion extends FunctionCompletion implements	JSCompletion {

	private String enclosingClassName;
	private Icon icon;

	public JSFunctionCompletion(
			CompletionProvider provider,
			String name,
			String type,
			String enclosingClassName,
			Icon icon) {
		super(provider, name, type);
		this.enclosingClassName = enclosingClassName;
		this.icon = icon;
	}

	/**
	 * {@inheritDoc}
	 */
	public int compareTo(Completion o) {
		int rc = -1;
		if (o==this) {
			rc = 0;
		}
		else if (o instanceof JSCompletion) {
			JSCompletion c2 = (JSCompletion)o;
			rc = getLookupName().compareTo(c2.getLookupName());
		}
		else if (o instanceof Completion) {
			Completion c2 = (Completion) o;
			rc = toString().compareTo(c2.toString());
			if (rc == 0) { // Same text value
				String clazz1 = getClass().getName();
				clazz1 = clazz1.substring(clazz1.lastIndexOf('.'));
				String clazz2 = c2.getClass().getName();
				clazz2 = clazz2.substring(clazz2.lastIndexOf('.'));
				rc = clazz1.compareTo(clazz2);
			}
		}

		return rc;
	}

	public boolean equals(Object obj) {
		return (obj instanceof JSCompletion)
				&& ((JSCompletion) obj).getLookupName().equals(
						getLookupName());
	}

	public String getAlreadyEntered(JTextComponent comp) {
		String temp = getProvider().getAlreadyEnteredText(comp);
		int lastDot = JavaScriptHelper.findLastIndexOfJavaScriptIdentifier(temp);
		if (lastDot > -1) {
			temp = temp.substring(lastDot + 1);
		}
		return temp;
	}

	public String getLookupName() {
		return enclosingClassName==null ? getName() : enclosingClassName+"."+getName();
	}

	public int hashCode() {
		return getLookupName().hashCode();
	}
	
	public Icon getIcon() {
		return icon==null ? IconFactory.getIcon(IconFactory.DEFAULT_VARIABLE_ICON) : icon;
	}

	public String getEnclosingClassName(boolean fullyQualified) {
		if (fullyQualified || enclosingClassName==null) {
			return enclosingClassName; 
		}
		int idx = enclosingClassName.lastIndexOf('.');
		return enclosingClassName.substring(idx+1); 
	}

	public String getType(boolean qualified) {
		if (qualified || getType()==null) {
			return getType(); 
		}
		int idx = getType().lastIndexOf('.');
		return getType().substring(idx+1); 
	}

}