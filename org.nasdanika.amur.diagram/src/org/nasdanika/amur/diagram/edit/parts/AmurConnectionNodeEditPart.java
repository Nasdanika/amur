package org.nasdanika.amur.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;

import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.provider.IFigureFilter;
import org.nasdanika.amur.provider.IFigureFilterProvider;

abstract class AmurConnectionNodeEditPart extends ConnectionNodeEditPart {

	protected AmurConnectionNodeEditPart(View view) {
		super(view);
		IFigureFilterProvider figureFilterProvider = (IFigureFilterProvider) AmurDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory()
				.adapt(view.getElement(), IFigureFilterProvider.class);	
		if (figureFilterProvider!=null) {
			figureFilter = figureFilterProvider.getFigureFilter(view.getElement());
		}
	}

	private IFigureFilter figureFilter;
	
	@Override
	public IFigure getFigure() {
		if (figure == null) {
			IFigure fig = createFigure();
			EObject se = resolveSemanticElement();
			if (figureFilter != null && se instanceof Component) {
				figureFilter.filter((Component) se, fig);
				ImplementationType it = ((Component) se).getImplementationType();
				if (it!=null) {
					it.eAdapters().add(implementationTypeAdapter);
				}
			}
			
			setFigure(fig);
		}
		
		return figure;
	}
	
	private Adapter implementationTypeAdapter = new AdapterImpl() {
		
		public void notifyChanged(Notification msg) {
			EObject semanticElement = resolveSemanticElement();
			if (figureFilter!=null 
					&& semanticElement instanceof Component 
					&& figure!=null) { 
				figureFilter.filter((Component) semanticElement, figure);
			}			
		}
		
	};

	@Override
	public void notifyChanged(Notification notification) {
		if (AmurPackage.eINSTANCE.getComponent_ImplementationType().equals(notification.getFeature())) {
			EObject semanticElement = resolveSemanticElement();
			IFigureFilterProvider figureFilterProvider = (IFigureFilterProvider) AmurDiagramEditorPlugin
					.getInstance()
					.getItemProvidersAdapterFactory()
					.adapt(semanticElement,	IFigureFilterProvider.class);
			
			if (figureFilter!=null && notification.getOldValue() instanceof ImplementationType) {
				((ImplementationType) notification.getOldValue()).eAdapters().remove(implementationTypeAdapter);
			}
			
			figureFilter = figureFilterProvider==null ? null : figureFilterProvider.getFigureFilter(semanticElement);
			
			if (figureFilter!=null && notification.getNewValue() instanceof ImplementationType) {
				((ImplementationType) notification.getNewValue()).eAdapters().add(implementationTypeAdapter);				
			}
			
			if (figureFilter!=null 
					&& semanticElement instanceof Component 
					&& figure!=null) { 
				figureFilter.filter((Component) semanticElement, figure);
			}
		} 
		super.notifyChanged(notification);
	}

}
