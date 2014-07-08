package org.nasdanika.common;

import java.util.Map;

import org.syntax.jedit.tokenmarker.TokenMarker;

/**
 * Provider of token markers for JEdit Syntax
 * @author Pavel Vlasov
 *
 */
public interface TokenMarkerProvider {
	
	Map<String, TokenMarker> getMarkers();		

}
