package org.nasdanika.amur.diagram.edit.parts;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.diagram.part.AmurDiagramEditorPlugin;
import org.nasdanika.amur.diagram.providers.AmurElementTypes;

import org.nasdanika.amur.Component;

class AmurCompartmentEditPart extends CompartmentEditPart {

	protected AmurCompartmentEditPart(EObject model) {
		super(model);
	}
	
	protected Image getLabelIcon() {
		EObject parserElement = resolveSemanticElement();
		if (parserElement == null) {
			return null;
		}

		TransactionalEditingDomain eDomain = getEditingDomain();
		AdapterFactory adapterFactory = eDomain instanceof AdapterFactoryEditingDomain ? ((AdapterFactoryEditingDomain) eDomain).getAdapterFactory() : AmurDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
		IItemLabelProvider iilp = (IItemLabelProvider) adapterFactory.adapt(parserElement, IItemLabelProvider.class);
		if (iilp != null) {
			Object iData = iilp.getImage(parserElement);
			return ExtendedImageRegistry.getInstance().getImage(iData);
		}

		return AmurElementTypes.getImage(parserElement.eClass());
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshTooltip();
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		if (event.getFeature() instanceof EAttribute && "description".equals(((EAttribute) event.getFeature()).getName())) {
			refreshTooltip();
		}
	}

	private void refreshTooltip() {
		IFigure labelFigure = getFigure();
		if (labelFigure!=null) {
			String text = null;
			EObject parserElement = resolveSemanticElement();
			if (parserElement instanceof Component) {
				Component component = (Component) parserElement;
//				if (component.getImplementationType()!=null) {
//					IFigure tt = component.getImplementationType().getTooltip();
//					if (tt!=null) {
//						labelFigure.setToolTip(tt);
//						return;
//					}
//				}
				text = component.getDescription();
				
			}
			if (text==null || text.trim().isEmpty()) {
				labelFigure.setToolTip(null);
			} else {
				try {
					int width = 300;
					int height = 200;
					BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
					java.awt.Graphics gr = bi.getGraphics();
					JEditorPane htmlPane = new JEditorPane("text/html", text);
					htmlPane.setSize(width, height);
					java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
					htmlPane.setBackground(transparent);
					htmlPane.setEditable(false);
					htmlPane.paint(gr);
					
					int maxHeight = height;
					Y: do {
						for (int i = 0; i<width; ++i) {
							if (transparent.getRGB() != bi.getRGB(i, maxHeight-1)) {
								break Y;
							}							
						}
					} while (--maxHeight>=0);
					
					int maxWidth = width;
					X: do {
						for (int i = 0; i<maxHeight; ++i) {
							if (transparent.getRGB() != bi.getRGB(maxWidth-1, i)) {
								break X;
							}							
						}
					} while (--maxWidth>=0);
					
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					ImageIO.write(bi.getSubimage(0, 0, Math.min(maxWidth+5, width), Math.min(maxHeight+5, height)), "PNG", baos);
					baos.close();
					final byte[] imageData = baos.toByteArray();
					Figure f = new ImageFigure(new Image(Display.getCurrent(), new ByteArrayInputStream(imageData)));			
					labelFigure.setToolTip(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
//	private void refreshTooltip() {
//		IFigure labelFigure = getFigure();
//		if (labelFigure!=null) {
//			IFigure tooltip = null;
//			EObject parserElement = resolveSemanticElement();
//			if (parserElement instanceof Component) {				
//				Component component = (Component) parserElement;
//				if (component.getImplementationType()!=null) {
//					tooltip = component.getImplementationType().getTooltip();
//				}
//				if (tooltip==null) {
//					String text = component.getDescription();
//					if (text!=null && text.trim().length()>0) {
//						try {
//							BufferedImage bi = new BufferedImage(300, 200, BufferedImage.TYPE_INT_ARGB);
//							java.awt.Graphics gr = bi.getGraphics();
//							JEditorPane htmlPane = new JEditorPane("text/html", text);
//							htmlPane.setSize(300, 200);
//							java.awt.Color transparent = new java.awt.Color(0, 0, 0, 0);
//							htmlPane.setBackground(transparent);
//							htmlPane.setEditable(false);
//							htmlPane.paint(gr);
//							ByteArrayOutputStream baos = new ByteArrayOutputStream();
//							ImageIO.write(bi, "PNG", baos);
//							baos.close();
//							final byte[] imageData = baos.toByteArray();
//							Figure f = new ImageFigure(new Image(Display.getCurrent(), new ByteArrayInputStream(imageData)));			
//							labelFigure.setToolTip(f);
//						} catch (Exception e) {
//							e.printStackTrace();
//						}							
//					}
//				}
//			}
//			labelFigure.setToolTip(null);
//		}
//	}

}
