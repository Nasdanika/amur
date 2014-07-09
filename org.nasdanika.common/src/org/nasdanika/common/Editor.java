package org.nasdanika.common;

/**
 * Editor for property values of different types.
 * @author Pavel Vlasov
 *
 */
public interface Editor {

	/**
	 * @return Edited value.
	 */
	Object getValue();
	
	void setValue(Object value);
	
	void setEnabled(boolean enabled);
	
	String getName();
}
