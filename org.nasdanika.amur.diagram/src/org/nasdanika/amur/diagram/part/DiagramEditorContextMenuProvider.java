package org.nasdanika.amur.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchPart;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.common.ui.services.action.contributionitem.ContributionItemService;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramContextMenuProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentAction;
import org.nasdanika.amur.ComponentActionWithProgress;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ImplementationTypeAction;
import org.nasdanika.amur.ImplementationTypeActionWithProgress;

/**
 * @generated
 */
public class DiagramEditorContextMenuProvider extends
		DiagramContextMenuProvider {

	/**
	 * @generated
	 */
	private IWorkbenchPart part;

	/**
	 * @generated
	 */
	private DeleteElementAction deleteAction;

	/**
	 * @generated
	 */
	public DiagramEditorContextMenuProvider(IWorkbenchPart part,
			EditPartViewer viewer) {
		super(part, viewer);
		this.part = part;
		deleteAction = new DeleteElementAction(part);
		deleteAction.init();
	}

	/**
	 * @generated
	 */
	public void dispose() {
		if (deleteAction != null) {
			deleteAction.dispose();
			deleteAction = null;
		}
		super.dispose();
	}

	/**
	 * @generated NOT
	 */
	public void buildContextMenu(final IMenuManager menu) {
		getViewer().flush();
		try {
		
			/* 
			 * Contributing to context menu
			 * Always take contributions from the diagram element.
			 * If there is single selection, take contributions from it.
			 */
			DiagramImpl model = (DiagramImpl) getViewer().getContents().getModel();
			final EObject modelElement = model.getElement();
			List<?> selectedEditParts = getViewer().getSelectedEditParts();
			final Object selectedSemanticElement = selectedEditParts.size() == 1 ? selectedEditParts.iterator().next() : null;
			final EditPart contextPart = selectedEditParts.size() == 1 ? (EditPart) selectedEditParts.get(0) : getViewer().getContents();
		
			TransactionUtil.getEditingDomain(
					(EObject) getViewer().getContents().getModel())
					.runExclusive(new Runnable() {

						public void run() {
							ContributionItemService
									.getInstance()
									.contributeToPopupMenu(
											DiagramEditorContextMenuProvider.this,
											part);
							menu.remove(ActionIds.ACTION_DELETE_FROM_MODEL);
							menu.appendToGroup("editGroup", deleteAction);
							
							if (modelElement instanceof Component) {
								
								Component ctxCmp = null;
								if (contextPart!=null) {
									Object ctxModel = contextPart.getModel();
									if (ctxModel instanceof View) {
										EObject ctxElement = ((View) ctxModel).getElement();
										if (ctxElement instanceof Component) {
											ctxCmp = (Component) ctxElement;
										}
									}
								}
								
								final Component contextComponent = ctxCmp==null ? (Component) modelElement : ctxCmp;
								
								MenuEntry root = new MenuEntry(menu);
								
								componentActions(root, contextPart, contextComponent);

								if (contextComponent.getImplementationType()!=null) {
									contextComponent.getImplementationType().contributeToPopupMenu(
											menu,
											DiagramEditorContextMenuProvider.this,
											part, 
											contextPart,
											AmurDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
									

									implementationTypeActions(root, contextPart, contextComponent);									
								}
							}
							if (selectedSemanticElement instanceof Component) {
								Component sse = (Component) selectedSemanticElement;
								if (sse.getImplementationType()!=null) {
									sse.getImplementationType().contributeToPopupMenu(
											menu,
											DiagramEditorContextMenuProvider.this,
											part, 
											contextPart,
											AmurDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
								}
							}
							
						}
					});
		} catch (Exception e) {
			AmurDiagramEditorPlugin.getInstance().logError(
					"Error building context menu", e);
		}
	}
	
	
	private class MenuEntry {
		
		private IMenuManager menu;

		MenuEntry(IMenuManager menu) {
			this.menu = menu;
		}
		
		private Map<String, MenuEntry> children = new HashMap<>();
		
		void add(String path, IAction action) {
			int idx = path.indexOf('/');
			if (idx==-1) {
				menu.add(action);
			} else {
				String childName = path.substring(0, idx);
				MenuEntry child = children.get(childName);
				if (child==null) {
					MenuManager childMenu = new MenuManager(childName, null);
					menu.add(childMenu);
					child = new MenuEntry(childMenu);
					children.put(childName, child);					
				}
				child.add(path.substring(idx+1), action);
			}
		}
	}
	
	private void implementationTypeActions(
			final MenuEntry root,
			final EditPart contextPart, 
			final Component contextComponent) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IMPLEMENTATION_TYPE_ACTION_ID);
		
		for (IConfigurationElement ce: config) {
			try {
				String implementationTypeClassName = ce.getAttribute("implementationType");
				if (!isBlank(implementationTypeClassName)) {
					IContributor contributor = ce.getContributor();		
					Bundle bundle = Platform.getBundle(contributor.getName());
					@SuppressWarnings("unchecked")
					Class<ImplementationType> itc = (Class<ImplementationType>) bundle.loadClass(implementationTypeClassName.trim());
					if (!itc.isInstance(contextComponent.getImplementationType())) {
						continue;
					}
				}
				
				String componentClassName = ce.getAttribute("component");
				if (!isBlank(componentClassName)) {
					IContributor contributor = ce.getContributor();		
					Bundle bundle = Platform.getBundle(contributor.getName());
					@SuppressWarnings("unchecked")
					Class<ImplementationType> cc = (Class<ImplementationType>) bundle.loadClass(componentClassName.trim());
					if (!cc.isInstance(contextComponent)) {
						continue;
					}
				}
				
				final Map<Object, Object> context = new HashMap<>();
				context.put("provider", DiagramEditorContextMenuProvider.this);
				context.put("part", part);
				AdapterFactory adapterFactory = AmurDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
				if (part instanceof DiagramDocumentEditor) {
					DiagramDocumentEditor diagramDocumentEditor = (DiagramDocumentEditor) part;
					context.put("diagram", diagramDocumentEditor.getDiagram());
					TransactionalEditingDomain editingDomain = diagramDocumentEditor.getEditingDomain();
					if (editingDomain instanceof AdapterFactoryEditingDomain) {
						adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
					}
					
				}
				context.put("contextPart", contextPart);
				if (adapterFactory instanceof ComposedAdapterFactory) {
					adapterFactory = ((ComposedAdapterFactory) adapterFactory).getRootAdapterFactory();
				}
				context.put("adapterFactory", adapterFactory);
				
				String selector = ce.getAttribute("selector");
				if (!isBlank(selector)) {
			        ScriptEngine engine = manager.getEngineByName("JavaScript");
					Bindings bindings = new SimpleBindings();
					bindings.put("implementationType", contextComponent.getImplementationType());
					bindings.put("context", context);
					Object res = engine.eval(selector, bindings);
					if (Boolean.FALSE.equals(res)) {
						continue;
					}
				}
				
				final String actionId = ce.getAttribute("id");
				final String actionName = ce.getAttribute("name");
				
				switch (ce.getName()) {
				case "implementation_type_action": {
					final ImplementationTypeAction ita = (ImplementationTypeAction) ce.createExecutableExtension("class");
					
					IAction itAction = new Action(actionName.substring(actionName.lastIndexOf('/')+1)) {
						
						@Override
						public void run() {
							ita.run(contextComponent.getImplementationType(), actionId, context);
						}
						
					};
					
					switch (ita.getMode(contextComponent.getImplementationType())) {
					case DISABLED:
						itAction.setEnabled(false);
						root.add(actionName, itAction);
						break;
					case ENABLED:
						root.add(actionName, itAction);
						break;
					case HIDDEN:
						break;
					default:
						break;					
					}
					
					break;
				}
				case "implementation_type_action_with_progress": {
					@SuppressWarnings("unchecked")
					final ImplementationTypeActionWithProgress<Object> ita = (ImplementationTypeActionWithProgress<Object>) ce.createExecutableExtension("class");
					
					IAction itAction = new Action(actionName.substring(actionName.lastIndexOf('/')+1)) {
						
						@Override
						public void run() {
							final Object config = ita.configure(contextComponent.getImplementationType());
							if (config!=null) {
								Job job = new Job(contextComponent.getName()+": "+actionName+" ["+contextComponent.getImplementationType().eClass().getName()+"]") {
	
									@Override
									protected IStatus run(IProgressMonitor monitor) {
										return ita.run(contextComponent.getImplementationType(), config, actionId, monitor, context);
									}
									
								};
								job.setUser(true);
								job.schedule();
							}
						}
						
					};
					
					switch (ita.getMode(contextComponent.getImplementationType())) {
					case DISABLED:
						itAction.setEnabled(false);
						root.add(actionName, itAction);
						break;
					case ENABLED:
						root.add(actionName, itAction);
						break;
					case HIDDEN:
						break;
					default:
						break;					
					}
					
					break;
				}
				default:
					ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Unsupported action type", ce.getName(), Status.CANCEL_STATUS);
				}									
								
			} catch (Exception e) {								
				ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Action error", e.toString(), Status.CANCEL_STATUS);
			}							
		}
	}
	
	
	private void componentActions(
			final MenuEntry root,
			final EditPart contextPart, 
			final Component contextComponent) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(COMPONENT_ACTION_ID);
		for (IConfigurationElement ce: config) {
			try {
				String componentClassName = ce.getAttribute("component");
				if (!isBlank(componentClassName)) {
					IContributor contributor = ce.getContributor();		
					Bundle bundle = Platform.getBundle(contributor.getName());
					@SuppressWarnings("unchecked")
					Class<ImplementationType> cc = (Class<ImplementationType>) bundle.loadClass(componentClassName.trim());
					if (!cc.isInstance(contextComponent)) {
						continue;
					}
				}
				
				final Map<Object, Object> context = new HashMap<>();
				context.put("provider", DiagramEditorContextMenuProvider.this);
				context.put("part", part);
				AdapterFactory adapterFactory = AmurDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
				if (part instanceof DiagramDocumentEditor) {
					DiagramDocumentEditor diagramDocumentEditor = (DiagramDocumentEditor) part;
					context.put("diagram", diagramDocumentEditor.getDiagram());
					TransactionalEditingDomain editingDomain = diagramDocumentEditor.getEditingDomain();
					if (editingDomain instanceof AdapterFactoryEditingDomain) {
						adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
					}
					
				}
				context.put("contextPart", contextPart);
				if (adapterFactory instanceof ComposedAdapterFactory) {
					adapterFactory = ((ComposedAdapterFactory) adapterFactory).getRootAdapterFactory();
				}
				context.put("adapterFactory", adapterFactory);
				
				String selector = ce.getAttribute("selector");
				if (!isBlank(selector)) {
			        ScriptEngine engine = manager.getEngineByName("JavaScript");
					Bindings bindings = new SimpleBindings();
					bindings.put("component", contextComponent);
					bindings.put("context", context);
					Object res = engine.eval(selector, bindings);
					if (Boolean.FALSE.equals(res)) {
						continue;
					}
				}
				
				final String actionId = ce.getAttribute("id");
				final String actionName = ce.getAttribute("name");
				
				switch (ce.getName()) {
				case "component_action": {
					final ComponentAction ca = (ComponentAction) ce.createExecutableExtension("class");
					
					IAction cAction = new Action(actionName.substring(actionName.lastIndexOf('/')+1)) {
						
						@Override
						public void run() {
							ca.run(contextComponent, actionId, context);
						}
						
					};
					
					switch (ca.getMode(contextComponent)) {
					case DISABLED:
						cAction.setEnabled(false);
						root.add(actionName, cAction);
						break;
					case ENABLED:
						root.add(actionName, cAction);
						break;
					case HIDDEN:
						break;
					default:
						break;					
					}
					
					break;
				}
				case "component_action_with_progress": {
					@SuppressWarnings("unchecked")
					final ComponentActionWithProgress<Object> ita = (ComponentActionWithProgress<Object>) ce.createExecutableExtension("class");
					
					IAction cAction = new Action(actionName.substring(actionName.lastIndexOf('/')+1)) {
						
						@Override
						public void run() {
							final Object config = ita.configure(contextComponent);
							if (config!=null) {
								Job job = new Job(contextComponent.getName()+": "+actionName+" ["+contextComponent.eClass().getName()+"]") {
	
									@Override
									protected IStatus run(IProgressMonitor monitor) {
										return ita.run(contextComponent, config, actionId, monitor, context);
									}
									
								};
								job.setUser(true);
								job.schedule();
							}
						}
						
					};
					
					switch (ita.getMode(contextComponent)) {
					case DISABLED:
						cAction.setEnabled(false);
						root.add(actionName, cAction);
						break;
					case ENABLED:
						root.add(actionName, cAction);
						break;
					case HIDDEN:
						break;
					default:
						break;					
					}
					
					break;
				}
				default:
					ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Unsupported action type", ce.getName(), Status.CANCEL_STATUS);
				}									
								
			} catch (Exception e) {								
				ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Action error", e.toString(), Status.CANCEL_STATUS);
			}							
		}
	}
	
	private static boolean isBlank(String str) {
		return str==null || str.trim().length()==0;
	}
	
    protected ScriptEngineManager manager = new ScriptEngineManager();
	
	private static final String COMPONENT_ACTION_ID = "org.nasdanika.amur.component_action";	
	private static final String IMPLEMENTATION_TYPE_ACTION_ID = "org.nasdanika.amur.implementation_type_action";	
		
}
