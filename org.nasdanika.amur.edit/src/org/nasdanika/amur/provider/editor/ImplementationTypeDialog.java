package org.nasdanika.amur.provider.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.util.AmurUtil;
import org.nasdanika.amur.util.AmurUtil.FeatureFilter;

public class ImplementationTypeDialog extends org.eclipse.jface.dialogs.Dialog {

	private ImplementationType value;
	private ImplementationTypeComposite implementationTypeComposite;
	private Component target;
	private String title;
	private AdapterFactory adapterFactory;
	private static final FeatureFilter SUPER_CLASS_FEATURE_FILTER = new AmurUtil.SuperClassFeatureFilter(AmurPackage.eINSTANCE.getImplementationType());
	
	public ImplementationTypeDialog(
			Shell parentShell, 
			String title,
			Component target,
			AdapterFactory adapterFactory) {
		super(parentShell);		
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.value = target.getImplementationType();
		this.title = title;
		this.target = target;
		this.adapterFactory = adapterFactory;
	}
	
	AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	Component getTarget() {
		return target;
	}
	
	public void setValue(ImplementationType value) {
		if (value!=null && this.value!=null) {
//			value = EcoreUtil.copy(value);
			AmurUtil.pumpFeatures(this.value, value, false, false, SUPER_CLASS_FEATURE_FILTER);
		}
		this.value = value;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		try {
			implementationTypeComposite = new ImplementationTypeComposite(root, SWT.NULL, this);
		} catch (Exception e) {
			throw new AmurException(e);
		}
		root.layout();
		return root;
	}
	
	@Override
	protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
		Button ret = super.createButton(parent, id, label, defaultButton);
		if (id == IDialogConstants.OK_ID) {
			implementationTypeComposite.setOkButton(ret);
		}
		return ret;
	}
	
	public ImplementationType getValue() {
		return value;
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
	
}
