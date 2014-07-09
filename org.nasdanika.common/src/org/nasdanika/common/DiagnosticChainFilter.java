package org.nasdanika.common;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

public abstract class DiagnosticChainFilter implements DiagnosticChain {
	
	private DiagnosticChain target;

	public DiagnosticChainFilter(DiagnosticChain target) {
		this.target = target;
	}

	@Override
	public void add(Diagnostic diagnostic) {
		target.add(filter(diagnostic));

	}

	protected abstract  Diagnostic filter(Diagnostic diagnostic);

	@Override
	public void addAll(Diagnostic diagnostic) {
		target.addAll(filter(diagnostic));
	}

	@Override
	public void merge(Diagnostic diagnostic) {
		target.merge(filter(diagnostic));
	}

}
