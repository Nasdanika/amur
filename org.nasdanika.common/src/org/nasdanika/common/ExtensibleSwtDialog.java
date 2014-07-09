package org.nasdanika.common;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * Dialog which uses Editor to create content
 * @author Pavel Vlasov
 *
 */
public class ExtensibleSwtDialog extends Dialog {
	
	private String title;
	
	private SwtEditor editor;
	private Object value;

	private AdapterFactory adapterFactory;

	private CompletionProviderFactory completionProvider;

	public ExtensibleSwtDialog(
			Shell parentShell, 
			String title, 
			SwtEditor editor, 
			Object value, 
			AdapterFactory adapterFactory,
			CompletionProviderFactory completionProvider) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.editor = editor;
		this.value = value;	
		this.adapterFactory = adapterFactory;
		this.completionProvider = completionProvider;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Control root = super.createDialogArea(parent);
		editor.createSwtContent(root, value, adapterFactory, completionProvider);
		return root;
	}
	
	public Object getValue() {
		return editor.getValue();
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
	
}
