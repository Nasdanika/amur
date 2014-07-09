package org.nasdanika.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * SWT editor.
 * @author Pavel Vlasov
 *
 */
public interface SwtEditor extends Editor {

	/**
	 * Creates editor GUI.
	 * @param root Root control.
	 */
	void createSwtContent(Control root, Object value, AdapterFactory adapterFactory, CompletionProviderFactory completionProvider);
	
}
