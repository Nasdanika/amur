package org.nasdanika.amur.docgen.html;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.image.ImageFileFormat;
import org.eclipse.gmf.runtime.diagram.ui.image.PartPositionInfo;
import org.eclipse.gmf.runtime.diagram.ui.render.util.CopyToHTMLImageUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.AbstractConnectionSource;
import org.nasdanika.amur.AbstractConnectionTarget;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.Node;
import org.nasdanika.common.Activator;
import org.nasdanika.common.ImageManager;

public class GenerationHelper {
			
	public static final String IMAGE_EXTENSION = ".png";
    public static ImageFileFormat IMAGE_FORMAT = ImageFileFormat.PNG;
	private File resourceContainer;
	private AdapterFactory adapterFactory;
	private Object viewResource;
	private boolean singlePage;
	private IProgressMonitor progressMonitor;
    
    public GenerationHelper(
    		File resourceContainer, 
    		AdapterFactory adapterFactory,
    		Object viewResource,
    		boolean singlePage,
    		IProgressMonitor progressMonitor) {
		this.resourceContainer = resourceContainer;
		this.adapterFactory = adapterFactory;
		if (this.adapterFactory instanceof ComposeableAdapterFactory) {
			this.adapterFactory = ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory();
		}
		this.viewResource = viewResource;
		this.singlePage = singlePage;
		this.progressMonitor = progressMonitor;
	}
	
    private Map<Object, File> resourceMap = new HashMap<Object, File>();
    
    public File saveIcon(Component diagramElement) throws Exception {
    	if (adapterFactory!=null) {
    		Object adapter = adapterFactory.adapt(diagramElement, IItemLabelProvider.class);
    		if (adapter instanceof IItemLabelProvider) {
    			Object imageObject = ((IItemLabelProvider) adapter).getImage(diagramElement);
    			if (imageObject!=null) {
    				Image img = org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getInstance().getImage(imageObject);
    				if (img!=null) {
        				File imgFile = resourceMap.get(img);
        				if (imgFile == null) {
	        				ImageLoader imageLoader = new ImageLoader();
	    					imageLoader.data = new ImageData[] {img.getImageData()};
	    					String imageName = diagramElement.getId()+"_icon.png";
	    					imgFile = new File(resourceContainer, imageName);
	    					FileOutputStream fos = new FileOutputStream(imgFile);
	    					imageLoader.save(fos, SWT.IMAGE_PNG);
	    					fos.close();
	    					resourceMap.put(img, imgFile);
        				}
        				
	    				return imgFile;
    				}
    			}
    		}
    	}
    	return null;
    }
    
    public String genDescription(Component diagramElement) {
    	String ret = diagramElement.getDescription();
    	if (ret==null) {
    		return "";
    	}
    	String rl = ret.toLowerCase();
    	int boidx = rl.indexOf("<body>");
    	if (boidx==-1) {
    		return ret;
    	}
    	int bcidx = rl.lastIndexOf("</body>");
    	if (bcidx>boidx) {
    		return ret.substring(boidx+"<body>".length(), bcidx);
    	}
    	return ret;
    }
    
    public String genLink(Component diagramElement) throws Exception {
    	StringBuilder sb = new StringBuilder("<a style=\"text-decoration:none\" href=\"");
    	if (singlePage) {
    		sb.append("#");
    		sb.append(diagramElement.getId());
    	} else {
    		sb.append(resourceContainer.getName()+"/"+diagramElement.getId());
    		sb.append(".html");
    	}
    	sb.append("\">");
    	sb.append(genLabel(diagramElement));
    	sb.append("</a>");
    	return sb.toString();
    }
    
    public String genModelTree(Component diagramElement) throws Exception {
    	StringBuilder sb = new StringBuilder("<LI>");
    	sb.append(genLink(diagramElement));

    	List<Component> children = new ArrayList<>();
    	if (diagramElement instanceof Composite) {
    		children.addAll(((Composite) diagramElement).getChildren());
			Collections.sort(children, componentComparator);
    	}
    	List<Connection> outboundConnections = new ArrayList<>();
    	if (diagramElement instanceof AbstractConnectionSource) {
    		outboundConnections.addAll(((AbstractConnectionSource) diagramElement).getOutboundConnections());
			Collections.sort(outboundConnections, componentComparator);
    	}
    	
    	if (!children.isEmpty() || !outboundConnections.isEmpty()) {
    		sb.append("<UL>");
			for (Component c: children) {
				if (!(c instanceof Connection)) {
					sb.append(genModelTree(c));
				}
			}
			Map<String, List<String>> portMap = new TreeMap<>();
			List<String> portlessConnections = new ArrayList<>();
			OC: for (Connection c: outboundConnections) {
				StringBuilder connectionBuilder = new StringBuilder();
				connectionBuilder.append("<LI>");
				connectionBuilder.append(genLink(c));
				connectionBuilder.append(" to ");
				connectionBuilder.append(genLink((Component) c.getTarget()));
								
				connectionBuilder.append("</LI>");
												
				portlessConnections.add(connectionBuilder.toString());				
			}
			
			for (Entry<String, List<String>> pe: portMap.entrySet()) {
				sb.append("<LI><I>");
				sb.append(pe.getKey());
				sb.append("</I><UL>");
				Collections.sort(pe.getValue());
				for (String cli: pe.getValue()) {
					sb.append(cli);
				}				
				sb.append("</UL></LI>");
			}
			
			Collections.sort(portlessConnections);
			for (String cli: portlessConnections) {
				sb.append(cli);
			}
    		sb.append("</UL>");
    	}
    	    	
    	sb.append("</LI>");
    	return sb.toString();
    }
    
	private static Comparator<Component> componentComparator = new Comparator<Component>() {

		@Override
		public int compare(Component o1, Component o2) {
			if (o1.getName()==null) {
				if (o2.getName()==null) {
					return o1.getId().compareTo(o2.getId());
				}
				return 1;
			}
			if (o2.getName()==null) {
				return -1;
			}
			return o1.getName().compareTo(o2.getName());
		}
	};    
    
    public List<Component> allContent(Component diagramElement) throws Exception {
    	List<Component> ret = new ArrayList<>();
    	ret.add(diagramElement);
    	
    	List<Connection> outboundConnections = new ArrayList<>();
    	if (diagramElement instanceof AbstractConnectionSource) {
    		outboundConnections.addAll(((AbstractConnectionSource) diagramElement).getOutboundConnections());
			Collections.sort(outboundConnections, componentComparator);
			ret.addAll(outboundConnections);
    	}
    	
    	List<Component> children = new ArrayList<>();
    	if (diagramElement instanceof Composite) {
    		children.addAll(((Composite) diagramElement).getChildren());
			Collections.sort(children, componentComparator);
			for (Component c: children) {
				if (!(c instanceof Connection)) {
					ret.addAll(allContent(c));
				}
			}
    	}
    	    	
    	return ret;
    }    
    
    private ImageManager imageManager = new ImageManager() {

		@Override
		public String saveImage(Object imageObject, String nameHint) throws Exception {
			if (imageObject!=null) {
   				Image image = org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getInstance().getImage(imageObject);
   				if (image!=null) {
					File imgFile = resourceMap.get(image);
					if (imgFile == null) {
	    				ImageLoader imageLoader = new ImageLoader();
						imageLoader.data = new ImageData[] {image.getImageData()};
						String imageName = nameHint+IMAGE_EXTENSION;
						imgFile = new File(resourceContainer, imageName);
						int counter = 0;
						while (imgFile.exists()) {
							imgFile = new File(resourceContainer, imageName+"_"+(++counter));							
						}
						FileOutputStream fos = new FileOutputStream(imgFile);
						imageLoader.save(fos, SWT.IMAGE_PNG);
						fos.close();
						resourceMap.put(image, imgFile);
					}
					
					return resourceContainer.getName()+"/"+imgFile.getName();
				}
			}
			return null;
		}
    	
    };
       
    public String genLabel(Component diagramElement) throws Exception {
    	if (adapterFactory!=null) {
    		Object adapter = adapterFactory.adapt(diagramElement, IItemLabelProvider.class);
    		if (adapter instanceof IItemLabelProvider) {
    			Object imageObject = ((IItemLabelProvider) adapter).getImage(diagramElement);
    	    	StringBuilder sb = new StringBuilder();
    			if (imageObject!=null) {
    				Image img = org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getInstance().getImage(imageObject);
    				if (img!=null) {
        				File imgFile = resourceMap.get(img);
        				if (imgFile == null) {
	        				ImageLoader imageLoader = new ImageLoader();
	    					imageLoader.data = new ImageData[] {img.getImageData()};
	    					String imageName = diagramElement.getId()+"_icon.png";
	    					imgFile = new File(resourceContainer, imageName);
	    					FileOutputStream fos = new FileOutputStream(imgFile);
	    					imageLoader.save(fos, SWT.IMAGE_PNG);
	    					fos.close();
	    					resourceMap.put(img, imgFile);
        				}
        				
	    				sb.append("<img src=\""+resourceContainer.getName()+"/"+imgFile.getName()+"\" border=\"0\"> ");
    				}
    			}
    			
    			String text = ((IItemLabelProvider) adapter).getText(diagramElement);
    			if (text==null) {
    				text = diagramElement.getName();
    			}
    			
    			if (text!=null) {
    				sb.append(StringEscapeUtils.escapeHtml4(text));
    			}
    			
    			return sb.toString();
    		}
    	} 
    	return diagramElement.getName()==null ? "" : StringEscapeUtils.escapeHtml4(diagramElement.getName());
    }    
    
    public String genIconTag(Component diagramElement) throws Exception {
    	File imgFile = saveIcon(diagramElement);
    	if (imgFile==null) {
    		return null;
    	}
    	
    	return "<img src=\""+resourceContainer.getName()+"/"+imgFile.getName()+"\" border=\"0\">";
    }
    
    
	/**
	 * Writes diagram for a node, if a node has associated diagram.
	 * @param diagramEP 
	 * @param node
	 * @return rendered HTML image map or null if there is no diagram for the node.
	 * @throws CoreException 
	 */
	public String writeDiagram(Component diagramElement) throws Exception {
		
		if (diagramElement instanceof Node) {
			for (final View view: getViews(diagramElement)) {
				if (view instanceof Diagram) {
				    String imageNamePrefix = "diagram_"+diagramElement.getId();
					final File baseFile = new File(resourceContainer, imageNamePrefix+IMAGE_EXTENSION);
					final AtomicReference<List<List<List<PartPositionInfo>>>> partPositionsRef = new AtomicReference<List<List<List<PartPositionInfo>>>>();
					Display.getDefault().syncExec(new Runnable() {

						@SuppressWarnings("unchecked")
						@Override
						public void run() {
						    CopyToHTMLImageUtil ctiu = new CopyToHTMLImageUtil();
							try {
								partPositionsRef.set(ctiu.copyToImage((Diagram) view, new Path(baseFile.getAbsolutePath()), IMAGE_FORMAT, progressMonitor, PreferencesHint.USE_DEFAULTS));
							} catch (CoreException e) {
								partPositionsRef.set(Collections.EMPTY_LIST);
								e.printStackTrace();
							}							
						}
						
					});
					// Possibly multiple tiles
					StringBuilder tableBuilder = new StringBuilder();
					StringBuilder mapBuilder = new StringBuilder();
					tableBuilder.append("<table>\n");
					int rowIdx=0;
					for (List<List<PartPositionInfo>> row: partPositionsRef.get()) {
						tableBuilder.append("<tr>\n");
						int colIdx=0;
						for (List<PartPositionInfo> col: row) {
							tableBuilder.append("<td>");
							tableBuilder.append("<img style='border:solid 1px silver' src=\""+resourceContainer.getName()+"/"+imageNamePrefix+"_"+rowIdx+"_"+colIdx+IMAGE_EXTENSION+"\" border=\"0\" usemap=\"#Map_"+diagramElement.getId()+"\">\n");
							
							mapBuilder.append("<map name=\"Map_"+diagramElement.getId()+"\">\n");
							for (PartPositionInfo ppi: col) {
								mapBuilder.append("<area shape=\"");
								List<Point> polyline = ppi.getPolyline();
								if (polyline!=null && !polyline.isEmpty()) {
									mapBuilder.append("poly\" coords=\"");
									for (int i=0, l=polyline.size(); i<l; ++i) {
										if (i>0) {
											mapBuilder.append(", ");
										}
										Point point = polyline.get(i);
										mapBuilder.append(point.x+","+point.y);
									}
									mapBuilder.append("\" ");
								} else {
									mapBuilder.append("rect\" coords=\"");
									int right = ppi.getPartX()+ppi.getPartWidth();
									int bottom = ppi.getPartY() + ppi.getPartHeight();
									mapBuilder.append(ppi.getPartX() + "," + ppi.getPartY() + "," + right + "," + bottom + "\" ");									
								}
								
								if (singlePage) {
									mapBuilder.append("href=\"#"+((Component) ppi.getSemanticElement()).getId()+"\" ");
								} else {
									mapBuilder.append("href=\""+((Component) ppi.getSemanticElement()).getId()+".html\" ");
								}
								
								String title = imageTitle((Component) ppi.getSemanticElement());
								if (title!=null) {
									mapBuilder.append("title='");
									mapBuilder.append(StringEscapeUtils.escapeHtml4(title));
									mapBuilder.append("' ");
								}
								mapBuilder.append("/>\n");
							}
							mapBuilder.append("</map>");
							
							++colIdx;
							tableBuilder.append("</td>");
						}
						++rowIdx;
						tableBuilder.append("</tr>\n");
					}
					tableBuilder.append("</table>\n");
					return tableBuilder.toString()+"\n"+mapBuilder.toString();
				}
			}
		}
		return "";
	}	
	
	/**
	 * Image title - the first sentence in description if it doesn't contain tags.
	 * Commented out - no support for international characters in simple tooltip. Maybe add HTML tooltip later.
	 * @param semanticElement
	 * @return
	 */
	private String imageTitle(Component semanticElement) {
//		String descr = genDescription(semanticElement);
//		if (descr!=null) {
//			int dotIdx = descr.indexOf('.');
//			int exclIdx = descr.indexOf('!');
//			if (exclIdx!=-1 && (exclIdx<dotIdx || dotIdx==-1)) {
//				dotIdx = exclIdx;
//			}
//			int qIdx = descr.indexOf('?');
//			if (qIdx!=-1 && (qIdx<dotIdx || qIdx==-1)) {
//				dotIdx = qIdx;
//			}
//			if (dotIdx!=-1) {
//				int ltIdx = descr.indexOf('<');
//				if (ltIdx==-1 || ltIdx>dotIdx) {
//					return descr.substring(0, dotIdx+1);
//				}				
//			}
//		}
		return null;
	}

	private EList<View> getViews(Component component) {
		EList<View> ret = new BasicEList<View>();
		TreeIterator<Notifier> cit = null;
		
		if (viewResource instanceof EObject) {			
			cit = ((EObject) viewResource).eResource().getResourceSet().getAllContents();
		} else if (viewResource instanceof Resource) {
			cit = ((Resource) viewResource).getResourceSet().getAllContents();
		} else if (viewResource instanceof ResourceSet) {
			cit = ((ResourceSet) viewResource).getAllContents();
		}
		
		if (cit!=null) {
			while (cit.hasNext()) {
				Notifier next = cit.next();
				if (next instanceof View && ((View) next).getElement() instanceof Component && ((Component) ((View) next).getElement()).getId().equals(component.getId())) {
			    	Resource resource = ((View) next).eResource();
			    	if( resource instanceof XMLResource ) {
			    		String id = ((XMLResource) resource).getID((EObject) next);
			    		if (id==null) {
			    			((XMLResource) resource).setID((EObject) next, component.getId()+"_diagram_"+ret.size());
			    		}
			    	}

					ret.add((View) next);
				}				
			}
		}
		return ret;
	}
//	
//	
//	private static final String IMAGE_EXTENSION = ".png";
//    protected ImageFileFormat format = ImageFileFormat.PNG;
//
//	public ComponentDocumentationGenerationCommand(T component) {
//		super(component, GenerationCommandType.documentation, ".html");
//	}
//	
//	@Override
//	protected Object doExecute(
//			GenerationContext context,
//			Object... args) throws Exception {
//		
//		if (context.lookup("indexWritten")==null) {
//			((MutableContext) context).bind("indexWritten", Boolean.TRUE);
//			
//			Map<String, Object> bindings = createBindings(context, args);
//			
//			Object index = scriptProcessor.eval("index", bindings, context.lookup(Locale.class));
//			CompositeResource res = lookupCompositeResource(context);
//			if (res==null) {
//				throw new NullPointerException("Output resource is null");
//			}
//			String resName = "index.html";
//			com.hammurapi.resource.Resource outputRes = res.lookupOrCreate(resName, false);
//			if (outputRes instanceof GenericResource) {
//				((GenericResource) outputRes).setContent(index);
//			} else {
//				throw new IllegalArgumentException("Cannot output to resource of type "+outputRes.getClass().getName());
//			}
//			
//			
//			Object outline = scriptProcessor.eval("rootOutline", bindings, context.lookup(Locale.class));
//			String oresName = "outline.html";
//			com.hammurapi.resource.Resource oRes = res.lookup(oresName);
//			if (oRes==null) {
//				oRes = res.createChild(false);
//				oRes.setName(oresName);
//				oRes.setParent(res);
//			}
//			if (oRes instanceof GenericResource) {
//				((GenericResource) oRes).setContent(outline);
//			} else {
//				throw new IllegalArgumentException("Cannot output to resource of type "+oRes.getClass().getName());
//			}
//			
//			ZipInputStream rStream = new ZipInputStream(classResourceLoader.getResourceStream("resources", "zip"));
//			ZipEntry entry;
//			while ((entry = rStream.getNextEntry())!=null) {
//				if (!entry.isDirectory()) {
//					ByteArrayOutputStream rOut = new ByteArrayOutputStream();
//					byte[] buf = new byte[4096];
//					int len;
//					while ((len=rStream.read(buf))!=-1) {
//						rOut.write(buf, 0, len);
//					}
//					rOut.close();
//					toRes(res, entry.getName(), rOut.toByteArray());
//				}
//			}
//			rStream.close();
//			
//		}
//				
//		return super.doExecute(context, args);
//	}
//	
//	private void toRes(CompositeResource res, String name, byte[] content) {
//		com.hammurapi.resource.Resource out = res.lookupOrCreate(name, false);
//		if (out instanceof GenericResource) {
//			((GenericResource) out).setContent(content);
//		} else if (out==null) {
//			throw new NullPointerException("Cannot create resource "+name);
//		} else {		
//			throw new IllegalArgumentException("Cannot output to resource of type "+out.getClass().getName());
//		}
//	}
//
//	private EList<View> getViews(Component component, Object context) {
//		EList<View> ret = new BasicEList<View>();
//		TreeIterator<Notifier> cit = null;
//		
//		if (context instanceof EObject) {			
//			cit = ((EObject) context).eResource().getResourceSet().getAllContents();
//		} else if (context instanceof Resource) {
//			cit = ((Resource) context).getResourceSet().getAllContents();
//		} else if (context instanceof ResourceSet) {
//			cit = ((ResourceSet) context).getAllContents();
//		}
//		
//		if (cit!=null) {
//			while (cit.hasNext()) {
//				Notifier next = cit.next();
//				if (next instanceof View && ((View) next).getElement() instanceof Component && ((Component) ((View) next).getElement()).getId().equals(component.getId())) {
//					ret.add((View) next);
//				}
//				
//			}
//		}
//		return ret;
//	}
//	
//	/**
//	 * Writes diagram for a node, if a node has associated diagram.
//	 * @param diagramEP 
//	 * @param node
//	 * @return rendered HTML image map or null if there is no diagram for the node.
//	 * @throws CoreException 
//	 */
//	public String writeDiagram(
//			Component diagramElement, 
//			boolean singlePage, 
//			Object viewResource, 
//			final IProgressMonitor progressMonitor, 
//			IFolder container) throws Exception {
//		
//		if (diagramElement instanceof Node) {
//			for (final View view: getViews(diagramElement, viewResource)) {
//				if (view instanceof Diagram) {
//				    String imageNamePrefix = "diagram_"+diagramElement.getId();
//					final IFile baseFile = container.getFile(imageNamePrefix+IMAGE_EXTENSION);
//					final AtomicReference<List<List<List<PartPositionInfo>>>> partPositionsRef = new AtomicReference<List<List<List<PartPositionInfo>>>>();
//					Display.getDefault().syncExec(new Runnable() {
//
//						@SuppressWarnings("unchecked")
//						@Override
//						public void run() {
//						    CopyToHTMLImageUtil ctiu = new CopyToHTMLImageUtil();
//							try {
//								partPositionsRef.set(ctiu.copyToImage((Diagram) view, baseFile.getLocation(), format, progressMonitor, PreferencesHint.USE_DEFAULTS));
//							} catch (CoreException e) {
//								partPositionsRef.set(Collections.EMPTY_LIST);
//								e.printStackTrace();
//							}							
//						}
//						
//					});
//					// Possibly multiple tiles
//					StringBuilder tableBuilder = new StringBuilder();
//					StringBuilder mapBuilder = new StringBuilder();
//					tableBuilder.append("<table>\n");
//					int rowIdx=0;
//					for (List<List<PartPositionInfo>> row: partPositionsRef.get()) {
//						tableBuilder.append("<tr>\n");
//						int colIdx=0;
//						for (List<PartPositionInfo> col: row) {
//							tableBuilder.append("<td>");
//							tableBuilder.append("<img src=\""+imageNamePrefix+"_"+rowIdx+"_"+colIdx+IMAGE_EXTENSION+"\" border=\"0\" usemap=\"#Map_"+diagramElement.getId()+"\">\n");
//							
//							mapBuilder.append("<map name=\"Map_"+diagramElement.getId()+"\">\n");
//							for (PartPositionInfo ppi: col) {
//								mapBuilder.append("<area shape=\"");
//								List<Point> polyline = ppi.getPolyline();
//								if (polyline!=null && !polyline.isEmpty()) {
//									mapBuilder.append("poly\" coords=\"");
//									for (int i=0, l=polyline.size(); i<l; ++i) {
//										if (i>0) {
//											mapBuilder.append(", ");
//										}
//										Point point = polyline.get(i);
//										mapBuilder.append(point.x+","+point.y);
//									}
//									mapBuilder.append("\" ");
//								} else {
//									mapBuilder.append("rect\" coords=\"");
//									int right = ppi.getPartX()+ppi.getPartWidth();
//									int bottom = ppi.getPartY() + ppi.getPartHeight();
//									mapBuilder.append(ppi.getPartX() + "," + ppi.getPartY() + "," + right + "," + bottom + "\" ");									
//								}
//								
//								if (singlePage) {
//									mapBuilder.append("href=\"#"+((Component) ppi.getSemanticElement()).getId()+"\" ");
//								} else {
//									mapBuilder.append("href=\""+((Component) ppi.getSemanticElement()).getId()+".html\" ");
//								}
//								mapBuilder.append("/>\n");
//							}
//							mapBuilder.append("</map>");
//							
//							++colIdx;
//							tableBuilder.append("</td>");
//						}
//						++rowIdx;
//						tableBuilder.append("</tr>\n");
//					}
//					tableBuilder.append("</table>\n");
//					return tableBuilder.toString()+"\n"+mapBuilder.toString();
//				}
//			}
//		}
//		return "";
//	}	
//	
//	@Override
//	protected Object createHelper(GenerationContext context, Map<String, Object> bindings, Object[] args) throws Exception {
//		return new DocumentationRenderHelper(context, bindings, args);
//	}
//	
//	/**
//	 * Helper to render model documentation
//	 * @author Pavel Vlasov
//	 *
//	 */
//	public class DocumentationRenderHelper extends Helper {
//		
//		private static final String IMAGE_EXTENSION = ".png";
//		private static final String TOKEN_END = "]]";
//		private static final String TOKEN_START = "[[";
//		private com.hammurapi.resource.CompositeResource container;
//		private ResourceSet viewResourceSet;
//		private IProgressMonitor progressMonitor;
//	    ImageFileFormat format = ImageFileFormat.PNG;
//		private AdapterFactory adapterFactory;
////		private Map<String, Object> env;
//		private Locale locale;
//		
//		@SuppressWarnings("unchecked")
//		public DocumentationRenderHelper(GenerationContext generationContext, Map<String, Object> bindings, Object[] args) {
//			super(generationContext, bindings, args);
//			locale = generationContext.lookup(Locale.class);
//			adapterFactory = generationContext.lookup(AdapterFactory.class);
//			container = (CompositeResource) generationContext.lookup(com.hammurapi.resource.Resource.class);
//			DiagramEditor diagramEditor = (DiagramEditor) generationContext.lookup("diagramEditor");
//			if (diagramEditor!=null) {
//				viewResourceSet = diagramEditor.getDiagram().eResource().getResourceSet();
//			} else {
//				viewResourceSet = component.eResource().getResourceSet();
//			}
//			progressMonitor = generationContext.lookup(IProgressMonitor.class);
//		}
//				
//		/**
//		 * Writes diagram for a node, if a node has associated diagram.
//		 * @param diagramEP 
//		 * @param node
//		 * @return rendered HTML image map or null if there is no diagram for the node.
//		 * @throws CoreException 
//		 */
//		public String writeDiagram(Component diagramElement, boolean singlePage) throws Exception {
//			return ComponentDocumentationGenerationCommand.this.writeDiagram(diagramElement, singlePage, viewResourceSet, progressMonitor, container);
//		}
//		
//		public String outlineLabel(Component diagramElement) {
//			String ret = diagramElement.getName();
//			if (ret==null || ret.trim().length()==0) {
//				ret = elementTypeName(diagramElement);
//			}
//			
//			return escapeHtml(ret);
//		}
//
//		public String label(Component diagramElement) {
//			String ret = diagramElement.getName();
//			if (ret==null || ret.trim().length()==0) {
//				return "(unnamed)";
//			}
//			
//			return escapeHtml(ret);
//		}
//		
//		public String elementTypeName(Component diagramElement) {
//			String ret;
//			String className = diagramElement.getClass().getName();
//			int idx = className.lastIndexOf('.');
//			int idx2 = className.lastIndexOf("Impl");
//			ret = className.substring(idx+1, idx2);
//			return ret;
//		}
//		
//		public String getImageName(Component diagramElement) throws Exception {
//			if (adapterFactory!=null) {
//				Object adapter = adapterFactory.adapt(diagramElement, IItemLabelProvider.class);
//				if (adapter instanceof IItemLabelProvider) {
//					Object imageObject = ((IItemLabelProvider) adapter).getImage(diagramElement);
//					if (imageObject!=null) {
//						Image img = org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry.getInstance().getImage(imageObject);
//						if (img!=null) {
//							ImageLoader imageLoader = new ImageLoader();
//							imageLoader.data = new ImageData[] {img.getImageData()};
//							String imageName = diagramElement.getId()+"_icon.png";
//							ByteArrayOutputStream baos = new ByteArrayOutputStream();
//							imageLoader.save(baos, SWT.IMAGE_PNG);
//							baos.close();
//							com.hammurapi.resource.Resource ir = container.lookupOrCreate(imageName, false);
//							((GenericResource) ir).setContent(baos.toByteArray());
//							return imageName;
//						}
//					}
//				}
//			}
//			return hasChildren(diagramElement) ? "dhtmlgoodies_folder.gif" : "dhtmlgoodies_sheet.gif";
//		}
//			
//		public boolean hasChildren(Component diagramElement) {
//			if (diagramElement instanceof Composite && !((Composite) diagramElement).getChildren().isEmpty()) {
//				for (Component child: ((Composite) diagramElement).getChildren()) {
//					if (!(child instanceof Connection)) {
//						return true;
//					}
//				}
//			}
//			return false;
//		}
//		
//		private Comparator<Component> diagramElementComparator = new Comparator<Component>() {
//
//			@Override
//			public int compare(Component de0, Component de1) {
//				if (de0.getName()==null || de0.getName().trim().length()==0) {
//					if (de1.getName()==null || de1.getName().trim().length()==0) {
//						return de0.getId().compareTo(de1.getId());
//					}
//					return 1;
//				} 
//				
//				if (de1.getName()==null || de1.getName().trim().length()==0) {
//					return -1;
//				}
//				return de0.getName().compareTo(de1.getName());
//			}
//		};
//		
//		public List<Component> sortChildren(Component diagramElement) {
//			List<Component> ret = new ArrayList<Component>();
//			if (diagramElement instanceof Composite) {
//				List<Component> tmp = new ArrayList<Component>();
//				for (Component child: ((Composite) diagramElement).getChildren()) {
//					if (!(child instanceof Connection)) {
//						tmp.add(child);
//					}
//				}
//				
//				Collections.sort(tmp, diagramElementComparator);
//				ret.addAll(tmp);
//			}
//			
//			return ret;
//		}
//		
//		public String escapeHtml(String txt) {
//			if (txt==null) {
//				return null;
//			}
//			
//			StringBuffer ret = new StringBuffer();
//			char[] chars=txt.toCharArray();
//			for (int i=0; i<chars.length; ++i) {
//				switch (chars[i]) {
//				case '<':
//					ret.append("&lt;");
//					break;
//				case '>':
//					ret.append("&gt;");
//					break;
//				case '&':
//					if (i<chars.length-1 && '#'==chars[i+1]) { // Do not double-escape (&#...;)
//						ret.append(chars[i]);
//					} else {
//						ret.append("&amp;");
//					}
//					break;
//				case '\'':
//					ret.append("&#039;");
//					break;
//				case '\\':
//					ret.append("&#092;");
//					break;
//				case '\"':
//					ret.append("&quot;");
//					break;
//				default:
//					ret.append("&#"+((int) chars[i])+";");
//				}
//			}
//			return ret.toString();
//		}	
//
////		/**
////		 * Renders outline for the current object to a writer.
////		 * @param obj Source object.
////		 * @param writer Output writer.
////		 * @throws RenderingException
////		 */
////		public void renderOutline(Object obj, Writer writer) throws RenderingException {
////			WriterRenderer renderer = ConvertingService.convert(obj, WriterRenderer.class);
////			if (renderer!=null) {
////				renderer.render(writer, env, context, "wbpoutline", locale, outputDir);
////			}
////		}		
//		
//		public class Properties {
//
//			private Component diagramElement;
//
//			public Properties(Component diagramElement, List<IItemPropertyDescriptor> propertyDescriptors) {
//				this.diagramElement = diagramElement;
//				for (IItemPropertyDescriptor ipd: propertyDescriptors) {
//					if (ipd.getPropertyValue(diagramElement)!=null) { 
//						String categoryName = ipd.getCategory(diagramElement);
//						if (categoryName==null || categoryName.trim().length()==0) {
//							categoryName = "Misc";
//						}
//						Category cat = categories.get(categoryName);
//						if (cat==null) {
//							cat = new Category(categoryName);
//							categories.put(categoryName, cat);
//						}
//						cat.addPropertyDescriptor(ipd);
//					}
//				}
//				
//				for (Category cat: categories.values()) {
//					Collections.sort(cat.properties);
//				}
//			}
//
//			public boolean hasProperties() {
//				return !categories.isEmpty();
//			}
//			
//			private Map<String, Category> categories = new TreeMap<String, Category>();
//			
//			public Collection<Category> getCategories() {
//				return categories.values();
//			}
//			
//			public class Category {
//				
//				private String name;
//				private List<Property> properties = new ArrayList<Property>(); 
//
//				public Category(String name) {
//					this.name = name;
//				}
//				
//				public void addPropertyDescriptor(IItemPropertyDescriptor ipd) {
//					properties.add(new Property(ipd));				
//				}
//
//				public String getName() {
//					return escapeHtml(name);
//				}
//				
//				public List<Property> getProperties() {
//					return properties;
//				}
//				
//				public class Property implements Comparable<Property> {
//					
//					private IItemPropertyDescriptor propertyDescriptor;
//					private String name;
//
//					public Property(IItemPropertyDescriptor ipd) {
//						this.propertyDescriptor = ipd;
//						this.name=propertyDescriptor.getDisplayName(diagramElement);
//					}
//					
//					public String getLabel() {
//						return escapeHtml(name);
//					}
//					
//					public String getName() {
//						return name;
//					}
//					
//					public String getValue() {
//						// TODO Render with property profile.
//						Object propertyValue = propertyDescriptor.getPropertyValue(diagramElement);
//						if (propertyValue instanceof PropertyValueWrapper) {
//							return escapeHtml(((PropertyValueWrapper) propertyValue).getText(diagramElement));
//						}
//						return escapeHtml(String.valueOf(propertyValue));
//					}
//
//					@Override
//					public int compareTo(Property anotherProperty) {					
//						return getName().compareTo(anotherProperty.getName());
//					}
//				}
//			}
//		}
//
//		/**
//		 * Collects properties excluding name, id and description.
//		 * @param diagramElement
//		 * @return
//		 */
//		public Properties getProperties(Component diagramElement) {	
//			List<IItemPropertyDescriptor> propertyDescriptors = new ArrayList<IItemPropertyDescriptor>();
//			if (adapterFactory!=null) {
//				Object adapter = adapterFactory.adapt(diagramElement, IItemPropertySource.class);
//				if (adapter instanceof IItemPropertySource) {
//					for (IItemPropertyDescriptor ipd: ((IItemPropertySource) adapter).getPropertyDescriptors(diagramElement)) {
//						Object feature = ipd.getFeature(diagramElement);
//						if (feature instanceof EStructuralFeature) {
//							propertyDescriptors.add(ipd);
//						}
//					}
//				}
//			}
//			return new Properties(diagramElement, propertyDescriptors);
//		}
//		
//		public boolean hasInboundConnections(Component de) {
//			return de instanceof AbstractConnectionTarget && !((AbstractConnectionTarget) de).getInboundConnections().isEmpty();
//		}
//		
//		public boolean hasOutboundConnections(Component de) {
//			return de instanceof AbstractConnectionSource && !((AbstractConnectionSource) de).getOutboundConnections().isEmpty();
//		}
//		
//		public String expandWikiTokens(String text, Component diagramElement, boolean singlePage) throws Exception {
//			StringBuilder sb = new StringBuilder(text);
//			int idx=0;
//			do {
//				idx=sb.indexOf(TOKEN_START, idx);
//				if (idx!=-1) {
//					int endIdx = sb.indexOf(TOKEN_END, idx);
//					if (endIdx!=-1) {
//						int pipeIdx = sb.indexOf("|", idx);
//						String id;
//						if (pipeIdx==-1 || pipeIdx>endIdx) {
//							id = sb.substring(idx+TOKEN_START.length(), endIdx).trim();
//						} else {
//							id = sb.substring(idx+TOKEN_START.length(), pipeIdx).trim();
//						}
//						TreeIterator<EObject> ti = diagramElement.eResource().getAllContents();
//						while (ti.hasNext()) {
//							EObject next = ti.next();
//							if (next instanceof Component && ((Component) next).getId().equals(id)) {
//								Component target = (Component) next;
//								StringBuilder aContents = new StringBuilder();
//								if (pipeIdx==-1 || pipeIdx>endIdx) {
//									aContents.append("<img border=\"0\" src=\"images/"+getImageName(target)+"\"> ");
//								}
//								aContents.append("<a href=\"");
//								if (singlePage) {
//									aContents.append("#");
//								}
//								aContents.append(target.getId());
//								if (!singlePage) {
//									aContents.append(".html");
//								}
//								aContents.append("\">"); 
//								if (pipeIdx==-1 || pipeIdx>endIdx) {
//									aContents.append(outlineLabel(target));
//								} else {
//									aContents.append(sb.substring(pipeIdx+1, endIdx));
//								}
//								aContents.append("</a>");
//								sb.replace(idx, endIdx+TOKEN_END.length(), aContents.toString());
//								idx+=aContents.length(); 
//								break;
//							}
//						}
//					}
//					
//				}
//			} while (idx!=-1);
//			return sb.toString();
//		}
//	}

	public Object genSource(Component component) throws Exception {
		if (component instanceof Connection) {
			return "Source: "+genLink((Component) ((Connection) component).getSource())+"<BR/>";
		}
		return "";
	}

	public Object genTarget(Component component) throws Exception {
		if (component instanceof Connection) {
			return "Target: "+genLink((Component) ((Connection) component).getTarget())+"<BR/>";
		}
		return "";
	}

	public Object genInboundConnections(Component component) throws Exception {
		if (component instanceof AbstractConnectionTarget) {
			ArrayList<Connection> connections = new ArrayList<>(((AbstractConnectionTarget) component).getInboundConnections());
			if (!connections.isEmpty()) {
				StringBuilder sb = new StringBuilder("<H2>Inbound connections</H2>");
				sb.append("<UL>");
				Collections.sort(connections, componentComparator);
				for (Connection c: connections) {
					sb.append("<LI>");
					sb.append(genLink(c));
					
					sb.append(" from ");
					sb.append(genLink((Component) c.getSource()));
																									
					sb.append("</LI>");
				}
				sb.append("</UL>");
				return sb.toString();
			}
		}
		return "";
	}

	public Object genOutboundConnections(Component component) throws Exception {
		if (component instanceof AbstractConnectionSource) {
			ArrayList<Connection> connections = new ArrayList<>(((AbstractConnectionSource) component).getOutboundConnections());
			if (!connections.isEmpty()) {
				StringBuilder sb = new StringBuilder("<H2>Outbound connections</H2>");
				sb.append("<UL>");
				Collections.sort(connections, componentComparator);
				for (Connection c: connections) {
					sb.append("<LI>");
					sb.append(genLink(c));
										
					sb.append(" to ");
					sb.append(genLink((Component) c.getTarget()));
																			
					sb.append("</LI>");
				}
				sb.append("</UL>");
				return sb.toString();
			}
		}
		return "";
	}

	public Object genImplementationType(Component component) throws Exception {
		ImplementationType implementationType = component.getImplementationType();
		if (implementationType==null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder("Implementation type: ");
		String itName = implementationType.getName();
		if (itName==null || itName.trim().length()==0) {
			itName = ((EObject) implementationType).eClass().getName();
		}
		sb.append(StringEscapeUtils.escapeHtml4(itName));
		sb.append("<BR/>");
		
	   	if (adapterFactory!=null) {
    		Object adapter = adapterFactory.adapt(implementationType, IItemPropertySource.class);
    		if (adapter instanceof IItemPropertySource) {    			
    			IItemPropertySource itemPropertySource = (IItemPropertySource) adapter;
    			Map<String, Map<String, String>> categories = new TreeMap<>();
    			List<IItemPropertyDescriptor> propertyDescriptors = itemPropertySource.getPropertyDescriptors(implementationType);
    			for (IItemPropertyDescriptor pd: propertyDescriptors) {
    				genItemPropertyDescriptor(implementationType, categories, pd);
    			}
    			if (!categories.isEmpty()) {
    				sb.append("<H2>Properties</H2>");
    				sb.append("<table cellspacing='1' cellpadding='3' border='0' class='standard'>");
    				sb.append("<tr class='standard'><th class='standard'>Name</th><th class='standard'>Value</th></tr>");
    				for (Entry<String, Map<String, String>> ce: categories.entrySet()) {
    					if (categories.size()>1) {
    						sb.append("<tr class='standard'><th class='standard' colspan='2'><I>");
    						sb.append(StringEscapeUtils.escapeHtml4(ce.getKey()));
    						sb.append("</I></th></tr>");
    					}
    					for (Entry<String, String> pe: ce.getValue().entrySet()) {
    						sb.append("<tr class='standard'><td class='standard'><B>");
    						sb.append(StringEscapeUtils.escapeHtml4(pe.getKey()));
    						sb.append("</B></td><td class='standard'>");
    						sb.append(pe.getValue());
    						sb.append("</td></tr>");
    					}
    				}
    				sb.append("</table>");
    			}
    		}
    	} 
		
		return sb.toString();
	}

	private void genItemPropertyDescriptor(
			ImplementationType implementationType,
			Map<String, Map<String, String>> categories,
			IItemPropertyDescriptor pd) throws Exception {
		EStructuralFeature feature = (EStructuralFeature) pd.getFeature(implementationType);
		if (pd.isPropertySet(implementationType) && !AmurPackage.eINSTANCE.getImplementationType().equals(feature.getEContainingClass())) {
			Object propertyValue = pd.getPropertyValue(implementationType);
			Object editableValue = propertyValue instanceof PropertyValueWrapper ? ((PropertyValueWrapper) propertyValue).getEditableValue(implementationType) : propertyValue;
			String valHtml = editableValue instanceof String ? null : Activator.renderHtml(
					editableValue, 
					resourceContainer, 
					imageManager, 
					adapterFactory,
					null);
			
			if (valHtml == null) {
				IItemLabelProvider labelProvider = pd.getLabelProvider(implementationType);
				if (labelProvider == null && propertyValue instanceof IItemLabelProvider) {
					 labelProvider = (IItemLabelProvider) propertyValue; 
				}
				if (labelProvider!=null) {
					StringBuilder labelBuilder = new StringBuilder();
					String imagePath = imageManager.saveImage(labelProvider.getImage(propertyValue), ((EObject) implementationType).eClass().getName()+"_"+feature.getName());
					if (imagePath!=null) {
						labelBuilder.append("<img src=\""+imagePath+"\"> ");
					}
					String lText = labelProvider.getText(propertyValue);
					if (lText!=null) {
						labelBuilder.append(StringEscapeUtils.escapeHtml4(lText));
					}
					if (lText!=null && lText.trim().length()>0) {
						valHtml = labelBuilder.toString();
					}
				}
			}
			if (valHtml!=null && valHtml.trim().length()>0) {
				String category = pd.getCategory(implementationType);
				if (category==null) {
					category = "General";
				}
				Map<String, String> categoryProperties = categories.get(category);
				if (categoryProperties==null) {
					categoryProperties = new TreeMap<>();
					categories.put(category, categoryProperties);
				}
				categoryProperties.put(pd.getDisplayName(implementationType), valHtml);
			}
		}
	}
	
	
}
