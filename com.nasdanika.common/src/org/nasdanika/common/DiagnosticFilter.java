package org.nasdanika.common;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;

public class DiagnosticFilter implements Diagnostic {

	private Diagnostic target;

	public int getSeverity() {
		return target.getSeverity();
	}

	public String getMessage() {
		return target.getMessage();
	}

	public String getSource() {
		return target.getSource();
	}

	public int getCode() {
		return target.getCode();
	}

	public Throwable getException() {
		return target.getException();
	}

	public List<?> getData() {
		return target.getData();
	}

	public List<Diagnostic> getChildren() {
		return target.getChildren();
	}

	public DiagnosticFilter(Diagnostic target) {
		this.target = target;
	}

}
