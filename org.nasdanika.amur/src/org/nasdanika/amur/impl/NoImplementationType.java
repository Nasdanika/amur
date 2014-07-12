package org.nasdanika.amur.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.validation.internal.modeled.model.validation.Feature;
import org.eclipse.jface.action.IMenuManager;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;

public class NoImplementationType extends CDOObjectImpl implements ImplementationType {

	private String description;
	private String name = "No implementation type";

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public String getName() {
		return name; 
	}

	@Override
	public void setName(String value) {
		name = value;

	}

	@Override
	public String getId() {
		return "org.nasdanika.amur.ImplementationType.NO_IMPLEMENTATION_TYPE";
	}

	@Override
	public void setId(String value) {
		// NOP

	}

	@Override
	public void init(ImplementationType prevImplementationType) {
		// NOP

	}

	@Override
	public void contributeToPopupMenu(IMenuManager menu, Object... context) {
		// NOP

	}

	@Override
	public Component getOwner() {
		// NOP
		return null;
	}

	@Override
	public void setOwner(Component value) {
		// NOP
		
	}

	@Override
	public boolean isComposite() {
		// NOP
		return false;
	}

	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// NOP
		return true;
	}

	@Override
	public String getDescription() {		
		return description;
	}

	@Override
	public void setDescription(String value) {
		this.description = value;
		
	}
	
	@Override
	public void destroy() {
		// NOP
		
	}

	@Override
	public org.eclipse.draw2d.IFigure getTooltip() {
		return null;
	}

	@Override
	public boolean acceptOwner(Component owner) {
		return true;
	}


}
