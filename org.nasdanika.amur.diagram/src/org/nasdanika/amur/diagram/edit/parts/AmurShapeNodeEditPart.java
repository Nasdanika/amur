package org.nasdanika.amur.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.provider.IFigureFilter;
import org.nasdanika.amur.provider.IFigureFilterProvider;

abstract class AmurShapeNodeEditPart extends ShapeNodeEditPart {
	
	protected IFigure primaryShape;	

	protected AmurShapeNodeEditPart(View view) {
		super(view);
		IFigureFilterProvider figureFilterProvider = (IFigureFilterProvider) AmurDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory()
				.adapt(view.getElement(), IFigureFilterProvider.class);	
		if (figureFilterProvider!=null) {
			figureFilter = figureFilterProvider.getFigureFilter(view.getElement());
		}
	}
	
	private IFigureFilter figureFilter;

	// TODO - Consider filtering @ creation time by providing filter() method in this class and invoking it from createNodeFigure
	@Override
	public IFigure getFigure() {
		if (figure == null) {
			EObject se = resolveSemanticElement();
			IFigure fig = createFigure();
			
			if (figureFilter != null && se instanceof Component) {
				figureFilter.filter((Component) se, fig);
			}
			setFigure(fig);
		}
		
		return figure;
	}

	@Override
	public void notifyChanged(Notification notification) {
		Object feature = notification.getFeature();
		if (feature instanceof EStructuralFeature) {
			EStructuralFeature structuralFeature = (EStructuralFeature) feature;
			if (Component.class.equals(structuralFeature.getContainerClass())
					&& ("implementationType".equals(structuralFeature.getName()) || "name".equals(structuralFeature.getName()))) { // name is a trick for notifications from impl type
				
				EObject semanticElement = resolveSemanticElement();
				IFigureFilterProvider figureFilterProvider = (IFigureFilterProvider) AmurDiagramEditorPlugin
						.getInstance()
						.getItemProvidersAdapterFactory()
						.adapt(semanticElement,	IFigureFilterProvider.class);
				
				figureFilter = figureFilterProvider==null ? null : figureFilterProvider.getFigureFilter(semanticElement);
				
				handleMajorSemanticChange();
			}
		}
		super.notifyChanged(notification);
	}

}
