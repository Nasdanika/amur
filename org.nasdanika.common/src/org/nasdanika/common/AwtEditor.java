package org.nasdanika.common;

import javax.swing.JRootPane;

import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * AWT/Swing editor.
 * @author Pavel Vlasov
 *
 */
public interface AwtEditor extends Editor {

	/**
	 * Creates editor GUI.
	 * @param root Root pane.
	 */
	void createAwtContent(JRootPane root, Object value, CompletionProviderFactory autoCompletionProvider);
	
}
