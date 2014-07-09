package org.nasdanika.common;

import javax.swing.JRootPane;

import org.eclipse.swt.widgets.Shell;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * Dialog which uses Editor to create content
 * @author Pavel Vlasov
 *
 */
public class ExtensibleAwtDialog extends AwtDialog {
	
	private AwtEditor editor;
	private Object value;
	private CompletionProviderFactory autoCompletionProvider;

	public ExtensibleAwtDialog(Shell parentShell, String title, AwtEditor editor, Object value, CompletionProviderFactory autoCompletionProvider, int contentWidth, int contentHeight) {
		super(parentShell, title, contentWidth, contentHeight);
		this.editor = editor;
		this.value = value;		
		this.autoCompletionProvider = autoCompletionProvider;
	}
	
	@Override
	protected void createAwtContent(JRootPane root) {
		editor.createAwtContent(root, value, autoCompletionProvider);
	}
	
	public Object getValue() {
		return editor.getValue();
	}

}
