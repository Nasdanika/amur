package org.nasdanika.common;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class ElementTreeDialogItemPropertyDescriptor extends DialogItemPropertyDescriptorImpl {

	private IPath basePath;

	public ElementTreeDialogItemPropertyDescriptor(
			IItemPropertyDescriptor master, 			
			CompletionProviderFactory autoCompletionProvider,
			IPath basePath) {
		super(master, autoCompletionProvider);	
		this.basePath = basePath;
	}

	public ElementTreeDialogItemPropertyDescriptor(
			IItemPropertyDescriptor master, 			
			CompletionProviderFactory autoCompletionProvider,
			EObject baseObject) {
		super(master, autoCompletionProvider);	
		Resource eResource = baseObject.eResource();
		if (eResource!=null) {
			URI resourceUri = eResource.getURI();
			if (resourceUri!=null) {
				resourceUri = URI.createURI(".").resolve(resourceUri); // To avoid ../ in front of resources.
				if (resourceUri.isFile()) {
					String fileString = resourceUri.toFileString();
					if (fileString!=null) {
						basePath = new Path(fileString);
					}
				} else if (resourceUri.isPlatform()) {
					String platformString = resourceUri.toPlatformString(true);
					if (platformString!=null) {
						basePath = new Path(platformString);
					}
				}
			}				
		}
	}
	
	@Override
	public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();		
		IAdaptable res;
		if (initialValue instanceof String) {
			res = root.findMember(basePath==null ? new Path((String) initialValue) : basePath.append((String) initialValue));
			if (res==null) {
				res = root;
			}
		} else {
			res = root;
		}
		
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(cellEditorWindow.getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider()) {
			
			@Override
			protected void createButtonsForButtonBar(Composite parent) {
				super.createButtonsForButtonBar(parent);
				createButton(parent, IDialogConstants.SKIP_ID, "Clear", false);
			}
			
			@Override
			protected void buttonPressed(int buttonId) {
				if (IDialogConstants.SKIP_ID == buttonId) {
					setReturnCode(IDialogConstants.SKIP_ID);
					close();
				} else {
					super.buttonPressed(buttonId);
				}
			}
		};
		dialog.setTitle(master.getDisplayName(initialValue));
		dialog.setInput(root);
		dialog.setInitialSelection(res);
		
		int result = dialog.open();
		if (result == Window.OK) {
			Object[] ret = dialog.getResult();
			if (ret.length==1 && ret[0] instanceof IResource) {
				IPath retPath = ((IResource) ret[0]).getFullPath();
				if (basePath!=null) {
					retPath = retPath.makeRelativeTo(basePath);
				}
				return retPath.toPortableString();
			}
		} else if (result == IDialogConstants.SKIP_ID) {
			return ""; // Clear.
		}
				
		return initialValue;
	}

}
