package org.nasdanika.amur;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EReference;

/**
 * Contributes validation to related object.
 * 
 * @author Pavel
 * 
 */
public interface ValidationContributor {

	/**
	 * 
	 * @param validationTarget Object being validated.
	 * @param targetRole Target's role in source, e.g. outboundConnections.
	 */
	boolean validate(Object validationTarget, EReference targetRole, DiagnosticChain diagnostics, Map<Object, Object> context);

}
