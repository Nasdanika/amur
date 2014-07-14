package org.nasdanika.amur.provider.editor;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.common.Activator;

public class ImplementationTypeComposite extends org.eclipse.swt.widgets.Composite {
	private Text filterText;
	private Label filterLabel;
	private Tree implementationTypesTree;
	private ImplementationTypeDialog owner;
	private Button okButton;
	
	public static boolean notBlank(String str) {
		return str!=null && str.trim().length()>0;
	}
	
	private boolean strMatches(String str) {
		return str!=null && str.trim().length()>0 && str.toLowerCase().contains(filterText.getText().toLowerCase());
	}
	
    protected ScriptEngineManager manager = new ScriptEngineManager();
	
	private class ImplementationTypeEntry {
		
		private String selector;
		String url;

		@SuppressWarnings("unchecked")
		ImplementationTypeEntry(IConfigurationElement ce) throws Exception {
			implementationType = (ImplementationType) ce.createExecutableExtension("class");			
			String targetClassName = ce.getAttribute("target");
			if (notBlank(targetClassName)) {
				IContributor contributor = ce.getContributor();		
				Bundle bundle = Platform.getBundle(contributor.getName());
				target = (Class<Component>) bundle.loadClass(targetClassName.trim());
			}
			String iconName = ce.getAttribute("icon");
			if (notBlank(iconName)) {
				IExtension extension = ce.getDeclaringExtension();
				String extendingPluginId = extension.getContributor().getName();
				org.eclipse.jface.resource.ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(extendingPluginId, iconName);
				image = imageDescriptor.createImage();
			} else if (owner.getAdapterFactory()!=null) {
				IItemLabelProvider labelProvider = (IItemLabelProvider) owner.getAdapterFactory().adapt(implementationType, IItemLabelProvider.class);
				if (labelProvider!=null) {
					image = ExtendedImageRegistry.getInstance().getImage(labelProvider.getImage(implementationType));
				}				
			}
			
			category = ce.getAttribute("category");
			keywords = ce.getAttribute("keywords");
			selector = ce.getAttribute("selector");
			url = ce.getAttribute("url");
			implementationType.setId(ce.getAttribute("id"));
			implementationType.setName(ce.getAttribute("name"));
			implementationType.setDescription(ce.getAttribute("description"));
		}
		
		boolean matches() {
			if (this.target!=null && !this.target.isInstance(owner.getTarget())) {
				return false;
			}
			
			if (!implementationType.acceptOwner(owner.getTarget())) {
				return false;
			}
			
			if (notBlank(selector)) {
		        ScriptEngine engine = manager.getEngineByName("JavaScript");
		        try {
					Bindings bindings = new SimpleBindings();
					bindings.put("target", owner.getTarget());
					Object res = engine.eval(selector, bindings);
					if (Boolean.FALSE.equals(res)) {
						return false;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			return strMatches(keywords) 
					|| strMatches(implementationType.getName())
					|| strMatches(implementationType.getDescription());			
		}
		
		ImplementationType implementationType;
		Image image;
		Class<Component> target;
		String category;
		String keywords;
		
		void createTreeItem(TreeItem parent) {			
			if (matches()) {
				TreeItem iItem = parent == null ? new TreeItem(implementationTypesTree, 0) : new TreeItem(parent, 0);
				iItem.setText(implementationType.getName()==null ? "" : implementationType.getName());
				if (image!=null) {
					iItem.setImage(image);
				}
				iItem.setData(this);
				Font font = iItem.getFont();
				FontData[] fontData = font.getFontData();
				for (FontData fd: fontData) {
					fd.setStyle(SWT.BOLD);
				}
				Font newFont = new Font(font.getDevice(), fontData);
				iItem.setFont(newFont);
				if (uidsEqual(implementationType, owner.getValue())) {
					implementationTypesTree.setSelection(iItem);
				} else if (implementationTypesTree.getSelection().length==0) {
					implementationTypesTree.setSelection(iItem);
				}
			}
		}
	}
	
	private class Category {
		String id;
		String parentId;
		String name;
		String description;
		String url;
		Image image;
		
		Category() {
			// For root category.
		}
		
		Category(IConfigurationElement e) throws Exception {			
			id = e.getAttribute("id");
			parentId = e.getAttribute("parent");
			name = e.getAttribute("name");
			description = e.getAttribute("description");
			url = e.getAttribute("url");

			String iconName = e.getAttribute("icon");
			if (notBlank(iconName)) {
				IExtension extension = e.getDeclaringExtension();
				String extendingPluginId = extension.getContributor().getName();
				org.eclipse.jface.resource.ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(extendingPluginId, iconName);
				image = imageDescriptor.createImage();
			} else {
				image = Activator.getImageDescriptor("icons/fugue/icons/folder-open.png").createImage();
			}
			
			for (IConfigurationElement ce: e.getChildren()) {
				if ("category".equals(ce.getName())) {
					children.add(new Category(ce));
				} else if ("implementation_type".equals(ce.getName())) {
					implementationTypes.add(new ImplementationTypeEntry(ce));
				}
			}
		}
		
		List<Category> children = new ArrayList<ImplementationTypeComposite.Category>();
		List<ImplementationTypeEntry> implementationTypes = new ArrayList<ImplementationTypeEntry>();
		
		int matchingImplementationTypes() {
			int ret = 0; 
			for (ImplementationTypeEntry ie: implementationTypes) {
				if (ie.matches()) {
					++ret;
				}
			}
			for (Category c: children) {
				ret+=c.matchingImplementationTypes();
			}
			return ret;
		}
		
		/**
		 * Merges argument category into this category or one of child categories.
		 * @param cat
		 * @return
		 */
		boolean merge(Category cat) {
			if (this.id != null && cat.id != null && this.id.equals(cat.id)) {
				Z: for (Category cc : cat.children) {
					for (Category c : children) {
						if (c.merge(cc)) {
							continue Z;
						}
					}
					children.add(cc);
				}

				Y: for (ImplementationTypeEntry cie : cat.implementationTypes) {
					for (ImplementationTypeEntry ie : implementationTypes) {
						if (cie.implementationType.getId() != null	&& cie.implementationType.getId().equals(ie.implementationType.getId())) {
							continue Y;
						}
					}
					implementationTypes.add(cie);
				}
				return true;
			}

			for (Category c : children) {
				if (c.merge(cat)) {
					return true;
				}
			}
			
			if (cat.parentId!=null && cat.parentId.equals(this.id)) {
				children.add(cat);
				return true;
			}
			return false;
		}
		
		/**
		 * Merges argument category into this category or one of child categories.
		 * @param cat
		 * @return
		 */
		boolean add(ImplementationTypeEntry ite) {
			if (ite.implementationType.getId() != null 
					&& this.id != null 
					&& ite.category != null 
					&& this.id.equals(ite.category)) {
				
				for (ImplementationTypeEntry ie : implementationTypes) {
					if (ite.implementationType.getId().equals(ie.implementationType.getId())) {
						continue;
					}
				}
				implementationTypes.add(ite);
				return true;
			}

			for (Category c : children) {
				if (c.add(ite)) {
					return true;
				}
			}
			return false;
		}

		public void sort() {
			Collections.sort(children, new Comparator<Category>() {

				@Override
				public int compare(Category o1, Category o2) {
					if (o1==null) {
						return o2==null ? 0 : 1;
					}
					if (o2==null) {
						return -1;
					}
					String n1 = o1.name;
					String n2 = o2.name;
					if (n1==null) {
						return n2==null ? o1.hashCode()-o2.hashCode() : 1;
					}
					if (n2==null) {
						return -1;
					}
					
					return n1.compareTo(n2);
				}
				
			});	
			
			Collections.sort(implementationTypes, new Comparator<ImplementationTypeEntry>() {

				@Override
				public int compare(ImplementationTypeEntry o1, ImplementationTypeEntry o2) {
					if (o1==null) {
						return o2==null ? 0 : 1;
					}
					if (o2==null) {
						return -1;
					}
					String n1 = o1.implementationType.getName();
					String n2 = o2.implementationType.getName();
					if (n1==null) {
						return n2==null ? o1.hashCode()-o2.hashCode() : 1;
					}
					if (n2==null) {
						return -1;
					}
					
					return n1.compareTo(n2);
				}
				
			});		
			
			for (Category c: children) {
				c.sort();
			}
		}
		
		void createTreeItem(TreeItem parent) {			
			if (matchingImplementationTypes()>0) {
				TreeItem iItem = parent == null ? new TreeItem(implementationTypesTree, 0) : new TreeItem(parent, 0);
				iItem.setText(name==null ? "" : name);
				iItem.setData(this);
				if (image!=null) {
					iItem.setImage(image);
				}
				for (Category child: children) {
					child.createTreeItem(iItem);
				}
				for (ImplementationTypeEntry ite: implementationTypes) {
					ite.createTreeItem(iItem);
				}
			}
		}
				
	}
	
	private Category rootCategory = new Category();
	private Label descriptionLabel;
	private Link link;
	
	public ImplementationTypeComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style, 
			final ImplementationTypeDialog owner) throws Exception {
		super(parent, style);		
		this.owner = owner;
		
		loadCategoriesAndImplementationTypes();
		
		GridLayout thisLayout = new GridLayout(2, false);
		this.setLayout(thisLayout);
		this.setSize(310, 373);

		filterLabel = new Label(this, SWT.NONE);
		GridData filterLabelLData = new GridData();
		filterLabel.setLayoutData(filterLabelLData);
		filterLabel.setText("Filter");
		filterText = new Text(this, SWT.BORDER);
		GridData filterTextLData = new GridData();
		filterTextLData.verticalAlignment = GridData.BEGINNING;
		filterTextLData.horizontalAlignment = GridData.FILL;
		filterTextLData.grabExcessHorizontalSpace = true;
		filterText.setLayoutData(filterTextLData);
		filterText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent evt) {
				loadTree();
			}
		});
		GridData opTreeLData = new GridData();
		opTreeLData.horizontalSpan = 2;
		opTreeLData.horizontalAlignment = GridData.FILL;
		opTreeLData.verticalAlignment = GridData.FILL;
		opTreeLData.grabExcessHorizontalSpace = true;
		opTreeLData.grabExcessVerticalSpace = true;
		opTreeLData.heightHint = 200;
		opTreeLData.widthHint = 300;
		implementationTypesTree = new Tree(this, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		implementationTypesTree.setLayoutData(opTreeLData);
		implementationTypesTree.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if (okButton!=null & okButton.isEnabled()) {
					okButton.notifyListeners(SWT.Selection, new Event());
				}
			}
			
		});
		
		descriptionLabel = new Label(this, SWT.WRAP);
		GridData descriptionLabelLData = new GridData();
		descriptionLabelLData.verticalAlignment = GridData.FILL;
		descriptionLabelLData.horizontalAlignment = GridData.FILL;
		descriptionLabelLData.horizontalSpan = 2;
		descriptionLabelLData.grabExcessHorizontalSpace = true;
		descriptionLabelLData.grabExcessVerticalSpace = true;
		descriptionLabelLData.heightHint=70;
		descriptionLabel.setLayoutData(descriptionLabelLData);
							
		link = new Link(this, SWT.WRAP);
		GridData linkLData = new GridData();
		linkLData.verticalAlignment = GridData.FILL;
		linkLData.horizontalAlignment = GridData.FILL;
		linkLData.horizontalSpan = 2;
		linkLData.grabExcessHorizontalSpace = true;
		linkLData.grabExcessVerticalSpace = true;
		link.setLayoutData(linkLData);	
		link.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {			
			    IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
			    try {
		            URL webUrl = new URL((String) link.getData());
			        IWebBrowser browser = browserSupport.getExternalBrowser();
		            browser.openURL(webUrl);
			    } catch (Exception ex) { 
			    	ex.printStackTrace(); 
			    }
				
			}
		});
		
		implementationTypesTree.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				onTreeItemSelection();
			}
			
		});
		
		this.layout();
		loadTree();
	}
		
	private static final String IMPLEMENTATION_TYPE_ID = "org.nasdanika.amur.edit.implementation_type";	
	
	private void loadCategoriesAndImplementationTypes() throws Exception {		
		List<Category> categories = new ArrayList<Category>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IMPLEMENTATION_TYPE_ID);
		for (IConfigurationElement ce: config) {
			if ("category".equals(ce.getName())) {
				Category cat = new Category(ce);
				if (!rootCategory.merge(cat)) {
					categories.add(cat);
				}
			}
		}

		Iterator<Category> rcit = categories.iterator();
		while (rcit.hasNext()) {
			Category prc = rcit.next();
			if (!notBlank(prc.parentId)) {
				rootCategory.children.add(prc);
				rcit.remove();
			}
		}
		
		boolean changed;
		do {
			changed = false;
			Iterator<Category> cit = categories.iterator();
			while (cit.hasNext()) {
				if (rootCategory.merge(cit.next())) {
					changed = true;
					cit.remove();
				}
			}			
		} while (changed && !categories.isEmpty());
		
		config = Platform.getExtensionRegistry().getConfigurationElementsFor(IMPLEMENTATION_TYPE_ID);
		for (IConfigurationElement ce: config) {
			if ("implementation_type".equals(ce.getName())) {
				ImplementationTypeEntry ite = new ImplementationTypeEntry(ce);
				if (!rootCategory.add(ite)) {
					rootCategory.implementationTypes.add(ite);
				}
			}
		}
		
		while (rootCategory.children.size()==1 && rootCategory.implementationTypes.isEmpty()) {
			rootCategory = rootCategory.children.get(0);
		}
		
		rootCategory.sort();
	}

	private boolean typeMatch(Object obj) {
		return obj instanceof ImplementationTypeEntry;
	}
	
	private void enableOk(boolean ok) {
		if (okButton!=null) {
			okButton.setEnabled(ok);
		}
	}
	
	public void setOkButton(Button okButton) {
		this.okButton = okButton;
		this.okButton.setEnabled(false);
	}

	static boolean uidsEqual(ImplementationType e1, ImplementationType e2) {
		if (e1 != null && e2 != null) {
			String id1 = e1.getId();
			String id2 = e2.getId();
			return id1!=null && id2!=null && id1.trim().equals(id2.trim());			
		}
		return false;
	}
	
	protected void loadTree() {
		enableOk(false);
		implementationTypesTree.removeAll();		
		for (Category rc: rootCategory.children) {
			rc.createTreeItem(null);
		}
		for (ImplementationTypeEntry rite: rootCategory.implementationTypes) {
			rite.createTreeItem(null);
		}
		onTreeItemSelection();
	}

	private void onTreeItemSelection() {
		descriptionLabel.setText("");
		link.setText("");
		link.setData(null);
		if (implementationTypesTree.getSelectionCount()==1) {
			Object data = implementationTypesTree.getSelection()[0].getData();
			String descr = data instanceof ImplementationTypeEntry ? ((ImplementationTypeEntry) data).implementationType.getDescription() : data instanceof Category ? ((Category) data).description : String.valueOf(data);
			if (notBlank(descr)) {
				descriptionLabel.setText(descr);
			}
			String url = data instanceof ImplementationTypeEntry ? ((ImplementationTypeEntry) data).url : data instanceof Category ? ((Category) data).url : null;
			if (notBlank(url)) {
				link.setText("<a>More info...</a>");
				link.setData(url);
			}
		}
		if (okButton!=null) {
			okButton.setEnabled(implementationTypesTree.getSelectionCount()==1 && typeMatch(implementationTypesTree.getSelection()[0].getData()));
			if (okButton.isEnabled()) {
				owner.setValue(((ImplementationTypeEntry) implementationTypesTree.getSelection()[0].getData()).implementationType);
			}
		}
	}

}
