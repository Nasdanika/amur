package org.nasdanika.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class ExtensibleDialogItemPropertyDescriptor extends DialogItemPropertyDescriptorImpl {
	
	private List<EditorProvider> providers = new ArrayList<EditorProvider>();
	private Map<EditorProvider, String> providerMimeType = new HashMap<EditorProvider, String>();
	int selectedProvider = -1;

	private String[] mimeTypes;

	public ExtensibleDialogItemPropertyDescriptor(IItemPropertyDescriptor master, EditorProvider defaultEditorProvider, CompletionProviderFactory autoCompletionProvider, final String... mimeTypes) {
		super(master, autoCompletionProvider);
		
		if (defaultEditorProvider!=null) {
			providers.add(defaultEditorProvider);
		}
		
		this.mimeTypes = mimeTypes;
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EditorProvider.class.getName());
		try {
			Z: for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof EditorProvider) {
					for (String mimeType: mimeTypes) {
						for (String mt: split(mimeType)) {
							if (((EditorProvider) o).supports(mt)) {
								providers.add((EditorProvider) o);
								providerMimeType.put((EditorProvider) o, mt);
								continue Z;
							}
						}
					}
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}		
		
		Collections.sort(providers, new Comparator<EditorProvider>() {

			@Override
			public int compare(EditorProvider o1, EditorProvider o2) {
				return o1.getName(providerMimeType.get(o1)).compareTo(o2.getName(providerMimeType.get(o2)));
			}
		});
		
		EditorProvider preferredProvider = null;
		int idx = 0;
		for (EditorProvider ep: providers) {
			String epmt = providerMimeType.get(ep);
			String pmt = preferredProvider==null ? null : providerMimeType.get(preferredProvider);
			if (preferredProvider==null 
					|| pmt.length()<epmt.length()
					|| (pmt.length()==epmt.length() && ep.getPriority(epmt)>preferredProvider.getPriority(pmt))) {
				preferredProvider=ep;
				selectedProvider = idx;
			} 
			++idx;
		}
	}
	
	private static Collection<String> split(String mimeType) {
		Collection<String> ret = new ArrayList<String>();
		ret.add(mimeType);
		for (int i=mimeType.indexOf('/'); i!=-1; i=mimeType.indexOf('/', i+1)) {
			ret.add(mimeType.substring(0, i));
		}
		return ret;
	}
	
	@Override
	public Button customizeButton(Button button) {
		if (providers.isEmpty()) {
			button.setEnabled(false);
			button.setToolTipText("No editors found for content type(s) "+Arrays.toString(mimeTypes));
		} else if (providers.size()>1) {
			MenuManager contextMenu = new MenuManager("Editors");
			int idx = 0;
			for (EditorProvider provider: providers) {
				createItem(contextMenu, provider, idx++, button);
			}
			Menu menu= contextMenu.createContextMenu(button);
			button.setMenu(menu);
		}
		
		return super.customizeButton(button);
	}
	
	private void createItem(MenuManager contextMenu, EditorProvider provider, final int idx, final Button button) {		
		Action action = new Action(provider.getName(mimeTypes[0]), Action.AS_RADIO_BUTTON) {
			
			@Override
			public void run() {
				if (isChecked()) {
					selectedProvider = idx;
					button.notifyListeners(SWT.Selection, null);
				}
			}
		};
		
		action.setChecked(idx==selectedProvider);
		
		contextMenu.add(action);
	}

	@Override
	public Object openDialogBox(Control cellEditorWindow, Object initialValue, AdapterFactory adapterFactory) {
		if (providers.isEmpty()) {
			return null; // No providers.
		}
		
		EditorProvider provider = providers.get(selectedProvider);
		
		String pMimeType = providerMimeType.get(provider);
		Editor editor = provider.createEditor(pMimeType);
		if (editor!=null) {
			editor.setEnabled(master.canSetProperty(initialValue instanceof EObject ? initialValue : null));
		}
		if (editor instanceof AwtEditor) {
			ExtensibleAwtDialog dialog = new ExtensibleAwtDialog(
					cellEditorWindow.getShell(), 
					getDisplayName(initialValue)+" ("+provider.getName(pMimeType)+")",
					(AwtEditor) editor,
					initialValue, 
					autoCompletionProvider,
					600, 
					400);		
			
			return dialog.open()==Dialog.OK ? dialog.getValue() : null;
		} else if (editor instanceof SwtEditor) {
			ExtensibleSwtDialog dialog = new ExtensibleSwtDialog(
					cellEditorWindow.getShell(), 
					getDisplayName(initialValue)+" ("+provider.getName(pMimeType)+")",
					(SwtEditor) editor,
					initialValue, 
					adapterFactory,
					autoCompletionProvider);
			
			return dialog.open()==Dialog.OK ? dialog.getValue() : null;
		} else {
			// Problem!!!
			throw new IllegalArgumentException("Unexpected editor type: "+editor);
		}		
	}
	
}	
