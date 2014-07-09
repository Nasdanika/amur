package org.nasdanika.common;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.widgets.Button;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

/**
 * Item property descriptor with custom property edit dialog.
 * @author Pavel Vlasov
 *
 */
public abstract class DialogItemPropertyDescriptorImpl extends ResolvingItemPropertyDescriptor implements DialogItemPropertyDescriptor {
	
	protected CompletionProviderFactory autoCompletionProvider;
    
    /* (non-Javadoc)
	 * @see org.nasdanika.common.DialogItemPropertyDescriptor#customizeButton(org.eclipse.swt.widgets.Button)
	 */
    @Override
	public Button customizeButton(Button button) {
    	return button;
    }

	public DialogItemPropertyDescriptorImpl(IItemPropertyDescriptor master, CompletionProviderFactory autoCompletionProvider) {
		super(master);
		this.autoCompletionProvider = autoCompletionProvider;
	}
	
}
