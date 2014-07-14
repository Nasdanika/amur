package org.nasdanika.amur.provider;

import org.eclipse.draw2d.IFigure;

import org.nasdanika.amur.Component;

/**
 * Interface to adjust figure appearance.
 * @author Pavel
 *
 */
public interface IFigureFilter {
	
	void filter(Component component, IFigure figure);
}
