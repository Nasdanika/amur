/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Connection;
import org.nasdanika.amur.ImplementationType;

/**
 * This is the central singleton for the Amur edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class AmurEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AmurEditPlugin INSTANCE = new AmurEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmurEditPlugin() {
		super
		  (new ResourceLocator [] { });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}	
	
	/**
	 * Adjust image according to implementation type.
	 * @param object
	 * @param thisImage
	 */
	public Object adjustImage(Object object, AdapterFactory adapterFactory, Object thisImage) {
		if (object instanceof Component && adapterFactory != null) {
			ImplementationType implType = ((Component) object).getImplementationType();
			if (implType!=null) {
				if (adapterFactory instanceof ComposeableAdapterFactory) {
					adapterFactory = ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory();
				}
				
				IItemLabelProvider iilp = (IItemLabelProvider) adapterFactory.adapt(implType, IItemLabelProvider.class);
				
				if (iilp!=null) {
					Object itImage = ((IItemLabelProvider) iilp).getImage(implType);
					if (thisImage==null) {
						return itImage;
					}
					if (itImage!=null) {
						boolean compose=false;
						try {
							compose = iilp.getClass().getMethod("getImage", new Class[] {Object.class}).getAnnotation(ComposeImage.class)!=null;
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (!compose) {
							return itImage;
						}
						Collection<Object> images = new ArrayList<Object>();
						images.add(thisImage);
						images.add(itImage);
						return new ComposedImage(images);
					}
				}
			}
		}
		return thisImage;
	}
	
	public IFigureFilter getFigureFilter(final Object object, AdapterFactory adapterFactory) {
		final List<IFigureFilter> accumulator = new ArrayList<IFigureFilter>();
		if (object instanceof Component && adapterFactory!=null) {
			if (((Component) object).getImplementationType()!=null) {
				ImplementationType implementationType = ((Component) object).getImplementationType();
				
				if (adapterFactory instanceof ComposeableAdapterFactory) {
					adapterFactory = ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory();
				}
				
				Adapter adapted = adapterFactory.adapt(implementationType, IFigureFilter.class);
				if (adapted instanceof IFigureFilter) {
					accumulator.add((IFigureFilter) adapted);
				}
			}
			
			if (object instanceof Connection) {
				final IConnectionFigureFilter sf = getConnectionFigureFilter(((Connection) object).getSource(), adapterFactory);
				if (sf!=null) {
					accumulator.add(new IFigureFilter() {

						@Override
						public void filter(Component component, IFigure figure) {							
							sf.filter((Component) ((Connection) object).getSource(), (Connection) object, figure);
						}
						
					});
				}
				final IConnectionFigureFilter tf = getConnectionFigureFilter(((Connection) object).getTarget(), adapterFactory);
				if (tf!=null) {
					accumulator.add(new IFigureFilter() {

						@Override
						public void filter(Component component, IFigure figure) {							
							tf.filter((Component) ((Connection) object).getTarget(), (Connection) object, figure);
						}
						
					});
				}
			}
		}
		
		if (accumulator.isEmpty()) {
			return null;
		}
		
		if (accumulator.size()==1) {
			return accumulator.get(0);
		}
		
		return new IFigureFilter() {

			@Override
			public void filter(Component component, IFigure figure) {
				for (IFigureFilter f: accumulator) {
					f.filter(component, figure);
				}
			}
			
		};
	}

	private IConnectionFigureFilter getConnectionFigureFilter(Object object, AdapterFactory adapterFactory) {
		if (object instanceof Component && adapterFactory!=null) {
			if (((Component) object).getImplementationType()!=null) {
				ImplementationType implementationType = ((Component) object).getImplementationType();
				
				if (adapterFactory instanceof ComposeableAdapterFactory) {
					adapterFactory = ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory();
				}
				
				Adapter adapted = adapterFactory.adapt(implementationType, IConnectionFigureFilter.class);
				if (adapted instanceof IConnectionFigureFilter) {
					return (IConnectionFigureFilter) adapted;
				}
			}
		}
		return null;
	}
	
}
