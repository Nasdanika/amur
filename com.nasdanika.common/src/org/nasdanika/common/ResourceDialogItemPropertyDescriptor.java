package org.nasdanika.common;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class ResourceDialogItemPropertyDescriptor extends DialogItemPropertyDescriptorImpl {

	public ResourceDialogItemPropertyDescriptor(
			IItemPropertyDescriptor master, 
			CompletionProviderFactory autoCompletionProvider) {
		super(master, autoCompletionProvider);		
	}

	@Override
	public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
		IAdaptable res;
		if (initialValue instanceof String) {
			res = root.findMember(new Path((String) initialValue));
			if (res==null) {
				res = root;
			}
		} else {
			res = root;
		}
		
		ResourceSelectionDialog rsd = new ResourceSelectionDialog(
				cellEditorWindow.getShell(), 
				res, 
				master.getDisplayName(initialValue));
		if (rsd.open() == Window.OK) {
			Object[] ret = rsd.getResult();
			if (ret.length==1 && ret[0] instanceof IResource) {
				return ((IResource) ret[0]).getFullPath().toPortableString();
			}
		}
		
		return initialValue;
	}

}
