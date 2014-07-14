package org.nasdanika.amur.provider;

import org.eclipse.draw2d.IFigure;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.Connection;

/**
 * Interface to adjust appearance of connection figure by the source/target component.
 * @author Pavel
 *
 */
public interface IConnectionFigureFilter {
	
	void filter(Component component, Connection connection, IFigure connectionFigure);
}
