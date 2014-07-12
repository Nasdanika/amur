package org.nasdanika.amur.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.nasdanika.amur.Component;

import org.nasdanika.licensing.Feature;
import org.nasdanika.licensing.Licenseable;
import org.nasdanika.licensing.LicensingFactory;
import org.nasdanika.licensing.LicensingPlugIn;

public class LicenseDialog extends Dialog {

	private Table licenseTable;
	private List<Feature> features = new ArrayList<Feature>();
	private IWorkbenchSite site;

	public LicenseDialog(IShellProvider parentShell) {
		super(parentShell);
	}

	public LicenseDialog(Shell parentShell, EObject component, IWorkbenchSite site) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		
		collectFeatures((Component) component);
		
		Collections.sort(features, new Comparator<Feature>() {

			@Override
			public int compare(Feature f0, Feature f1) {
				return f0.getId().compareTo(f1.getId());
			}
		});
		
		this.site = site;
		
	}
	
	private void collectFeatures(Component de) {
		String featureId = "org.nasdanika.amur";
		Feature amurFeature = ComponentImpl.isLicensePlugInValid() ? LicensingPlugIn.getDefault().getLicensedFeature(featureId) : null;
		if (amurFeature == null) {
			amurFeature = LicensingFactory.eINSTANCE.createFeature();
			amurFeature.setId(featureId);
			amurFeature.setName("Amur");
			amurFeature.setLicensed(false);
			amurFeature.setUrl("http://www.nasdanika.com/store/index.php?route=product/product&path=17&product_id=50");
		}
		addFeature(amurFeature);
		
		if (de instanceof Licenseable) {
			for (Feature f: ((Licenseable) de).getFeatures()) {
				addFeature(f);
			}
		}
		
		if (de.getImplementationType()!=null) {
			for (Feature f: de.getImplementationType().getFeatures()) {
				addFeature(f);
			}
		}
		if (de instanceof org.nasdanika.amur.Composite) {
			for (Component child: ((org.nasdanika.amur.Composite) de).getChildren()) {
				collectFeatures(child);
			}
		}
	}
	
	private void addFeature(Feature feature) {
//		feature.setLicensed(LicensingPlugIn.getDefault().getLicensedFeature(feature.getId())!=null);
		Iterator<Feature> fit = features.iterator();
		while (fit.hasNext()) {
			Feature next = fit.next();
			if (next.getId().equals(feature.getId())) {
				if (next.isLicensed()) {
					if (!feature.isLicensed()) {
						// Feature conflict, choose unlicensed.
						fit.remove();
						features.add(feature);
					}
				}
				return;
			}
		}
		features.add(feature);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite ret = (Composite) super.createDialogArea(parent);
		licenseTable = new Table(ret, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		final TableColumn featureColumn = new TableColumn(licenseTable, SWT.LEFT);
		featureColumn.setWidth(400);
		featureColumn.setText("Feature");
				
		licenseTable.setHeaderVisible(false);
		
		for (Feature f: features) {
			TableItem ti = new TableItem(licenseTable, SWT.NONE);
			ti.setText(new String[] {f.getName()+(f.getId()==null || f.getId().trim().length()==0 ? "" : " ("+f.getId()+")")});
			ti.setData(f);
			if (f.isLicensed()) {
				ti.setImage(org.nasdanika.common.Activator.getImageDescriptor("icons/essen/16x16/check.png").createImage());				
			} else if (f.getUrl()!=null && f.getUrl().trim().length()>0) {
				ti.setImage(org.nasdanika.common.Activator.getImageDescriptor("icons/led/link.png").createImage());
			}
		}
		
		licenseTable.setToolTipText("Double-click on unlicensed feature with a link icon to open feature URL");
		
		GridData gd = new GridData(GridData.FILL, GridData.FILL, true, true);
		gd.heightHint = 200;
		gd.widthHint = 410;
		licenseTable.setLayoutData(gd);
		
		licenseTable.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				super.mouseDoubleClick(e);
				if (e.button==1) {
					Point point = new Point(e.x, e.y); 
					TableItem item = licenseTable.getItem(point);
					if (item!=null) {
						Feature f = (Feature) item.getData();
						if (!f.isLicensed() && f.getUrl()!=null && f.getUrl().trim().length()>0) {
						    IWorkbenchBrowserSupport browserSupport = site
									 .getWorkbenchWindow()
									 .getWorkbench()
									 .getBrowserSupport();

					         try {
					            URL webUrl = new URL(f.getUrl());
						        IWebBrowser browser = browserSupport.getExternalBrowser();
					            browser.openURL(webUrl);
					         } catch (Exception ex) {
					        	 ex.printStackTrace();
					         }									
						}
					}
					
				}
			}
			
		});
		
		featureColumn.setWidth(licenseTable.getBounds().width-4);
		
		licenseTable.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				super.controlResized(e);
				featureColumn.setWidth(licenseTable.getBounds().width-4);
			}
		});
		
		
		return ret;
	}
	
	@Override
	protected Control createButtonBar(Composite parent) {
		Control ret = super.createButtonBar(parent);
		getButton(Dialog.OK).setVisible(false);
		getButton(Dialog.CANCEL).setText("Close");
		return ret;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (newShell!=null) {
			newShell.setText("License features summary");
		}
	}
	
}
