package org.nasdanika.common.editorproviders.languagesupport.js;

import javax.swing.Icon;
import javax.swing.text.JTextComponent;

import org.fife.rsta.ac.js.IconFactory;
import org.fife.rsta.ac.js.JavaScriptHelper;
import org.fife.rsta.ac.js.completion.JSCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.VariableCompletion;


public class JSFieldCompletion extends VariableCompletion implements JSCompletion {

	private String enclosingClassName;
	private Icon icon;

	public JSFieldCompletion(
			CompletionProvider provider, 
			String name, 
			String type, 
			String enclosingClassName,
			Icon icon) {
		super(provider, name, type);
		this.enclosingClassName = enclosingClassName;
		this.icon = icon;
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

	public String getType(boolean qualified) {
		if (qualified || getType()==null) {
			return getType(); 
		}
		int idx = getType().lastIndexOf('.');
		return getType().substring(idx+1); 
	}
	
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj instanceof JSFieldCompletion) {
			JSFieldCompletion jsComp = (JSFieldCompletion) obj;
			return getLookupName().equals(jsComp.getLookupName());
		}
		return super.equals(obj);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public int compareTo(Completion o) {
		if (o==this) {
			return 0;
		}
		else if (o instanceof JSFieldCompletion) {
			JSFieldCompletion c2 = (JSFieldCompletion)o;
			return getLookupName().compareTo(c2.getLookupName());
		}
		else if (o instanceof Completion) {
			Completion c2 = (Completion)o;
			return toString().compareTo(c2.toString());
		}
		return -1;
	}

	public int hashCode() {
		return getLookupName().hashCode();
	}
	
}
