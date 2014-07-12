/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur.impl;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.validation.internal.modeled.model.validation.Feature;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.nasdanika.amur.AmurException;
import org.nasdanika.amur.AmurPackage;
import org.nasdanika.amur.Component;
import org.nasdanika.amur.Composite;
import org.nasdanika.amur.ImplementationType;
import org.nasdanika.amur.ValidationContributor;
import org.nasdanika.amur.util.AmurValidator;
import org.nasdanika.common.Activator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getCodeGenerationResource <em>Code Generation Resource</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getDocumentationGenerationResource <em>Documentation Generation Resource</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getGenerationTimeout <em>Generation Timeout</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getGenerationProperties <em>Generation Properties</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getGenerationServices <em>Generation Services</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getGenerationArguments <em>Generation Arguments</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getGenerationCode <em>Generation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends CDOObjectImpl implements Component {
	private static final String RESOURCE_PREFIX = "res:";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentImpl() {
		super();
		
		setId(Activator.nextId());
		
		// Prevent duplicate ID's.
		eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getFeature() instanceof EReference && "children".equals(((EReference) notification.getFeature()).getName())) {
					switch (notification.getEventType()) {
					case Notification.ADD:
					case Notification.ADD_MANY:
					case Notification.SET:
						Component root = ComponentImpl.this;
						while (root.getParent()!=null) {
							root = root.getParent();
						}
						
						dedup(root, new HashSet<String>());
					}
				}
			}

			private void dedup(Component cmp, HashSet<String> ids) {
				if (cmp.getId()==null) {
					cmp.setId(Activator.nextId());
				}
				while (!ids.add(cmp.getId())) {
					cmp.setId(Activator.nextId());
				}
				if (cmp instanceof Composite) {
					for (Component child: ((Composite) cmp).getChildren()) {
						dedup(child, ids);
					}
				}
			}
			
		});
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmurPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(AmurPackage.Literals.COMPONENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(AmurPackage.Literals.COMPONENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(AmurPackage.Literals.COMPONENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return (ImplementationType)eGet(AmurPackage.Literals.COMPONENT__IMPLEMENTATION_TYPE, true);
	}

	// TODO - init/destroy implementation type - notifications.
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setImplementationType(ImplementationType newImplementationType) {
		ImplementationType oldImplementationType = getImplementationType();
		if (newImplementationType != oldImplementationType) {
			if (newImplementationType!=null) {
				newImplementationType.init(oldImplementationType);
			}
			if (oldImplementationType!=null) {
				oldImplementationType.destroy();
			}
		}
		eDynamicSet(AmurPackage.COMPONENT__IMPLEMENTATION_TYPE, AmurPackage.Literals.COMPONENT__IMPLEMENTATION_TYPE, newImplementationType);
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public void setImplementationType(ImplementationType newImplementationType) {
//		if (newImplementationType != implementationType) {
//			if (newImplementationType!=null) {
//				newImplementationType.init(implementationType);
//			}
//			if (implementationType!=null) {
//				implementationType.destroy();
//			}
//			
//			NotificationChain msgs = null;
//			if (implementationType != null)
//				msgs = ((InternalEObject)implementationType).eInverseRemove(this, AmurPackage.IMPLEMENTATION_TYPE__OWNER, ImplementationType.class, msgs);
//			if (newImplementationType != null)
//				msgs = ((InternalEObject)newImplementationType).eInverseAdd(this, AmurPackage.IMPLEMENTATION_TYPE__OWNER, ImplementationType.class, msgs);
//			msgs = basicSetImplementationType(newImplementationType, msgs);
//			if (msgs != null) msgs.dispatch();
//		}
//		else if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, AmurPackage.COMPONENT__IMPLEMENTATION_TYPE, newImplementationType, newImplementationType));
//				
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite getParent() {
		return (Composite)eGet(AmurPackage.Literals.COMPONENT__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Composite newParent) {
		eSet(AmurPackage.Literals.COMPONENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeGenerationResource() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__CODE_GENERATION_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeGenerationResource(String newCodeGenerationResource) {
		eSet(AmurPackage.Literals.COMPONENT__CODE_GENERATION_RESOURCE, newCodeGenerationResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentationGenerationResource() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentationGenerationResource(String newDocumentationGenerationResource) {
		eSet(AmurPackage.Literals.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, newDocumentationGenerationResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getResourcePath() {
		return (EList<String>)eGet(AmurPackage.Literals.COMPONENT__RESOURCE_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGenerationTimeout() {
		return (Integer)eGet(AmurPackage.Literals.COMPONENT__GENERATION_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationTimeout(int newGenerationTimeout) {
		eSet(AmurPackage.Literals.COMPONENT__GENERATION_TIMEOUT, newGenerationTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationProperties() {
		return (EList<String>)eGet(AmurPackage.Literals.COMPONENT__GENERATION_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationServices() {
		return (EList<String>)eGet(AmurPackage.Literals.COMPONENT__GENERATION_SERVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationArguments() {
		return (EList<String>)eGet(AmurPackage.Literals.COMPONENT__GENERATION_ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationCode() {
		return (String)eGet(AmurPackage.Literals.COMPONENT__GENERATION_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationCode(String newGenerationCode) {
		eSet(AmurPackage.Literals.COMPONENT__GENERATION_CODE, newGenerationCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;		
		if (diagnostics != null) {
			
//			diagnostics.add
//			(new BasicDiagnostic
//				(Diagnostic.ERROR,
//				 AmurValidator.DIAGNOSTIC_SOURCE,
//				 AmurValidator.COMPONENT__VALIDATE,
//				 "Test, test, test",
//				 new Object [] { this }));
//			result = false;			
										
			for (String sd: getGenerationServices()) {
				// format type = expr|closure;
				int idx = sd.indexOf("=");
				if (idx==-1) {
					diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 AmurValidator.DIAGNOSTIC_SOURCE,
							 AmurValidator.COMPONENT__VALIDATE,
							 "Service definition shall be in the form <type> = <expression|{method body}>: "+sd,
							 new Object [] { this }));
					
					result = false;
//				} else {
//					try {
//						@SuppressWarnings("unchecked")
//						Class<Object> st = (Class<Object>) getResourceLoader().loadClass(sd.substring(0, idx).trim());
//						ComponentGenerationCommand.createEvaluator("Service "+sd.substring(0, idx), sd.substring(idx+1).trim(), st, getResourceLoader());
//					} catch (Exception e) {
//						e.printStackTrace();
//						diagnostics.add
//							(new BasicDiagnostic
//								(Diagnostic.ERROR,
//								 AmurValidator.DIAGNOSTIC_SOURCE,
//								 AmurValidator.COMPONENT__VALIDATE,
//								 "Error "+e.getMessage()+" in service definition: "+sd,
//								 new Object [] { this }));		
//						
//						result = false;
//					}
				}
			}
			
			for (String pd: getGenerationProperties()) {
				// format type = expr|closure;
				int idx = pd.indexOf("=");
				if (idx==-1) {
					diagnostics.add
						(new BasicDiagnostic
							(Diagnostic.ERROR,
							 AmurValidator.DIAGNOSTIC_SOURCE,
							 AmurValidator.COMPONENT__VALIDATE,
							 "Property definition shall be in the form <name> = <expression|{method body}>: "+pd,
							 new Object [] { this }));
					result = false;
//				} else {
//					try {
//						ComponentGenerationCommand.createEvaluator("Property definition "+pd.substring(0, idx), pd.substring(idx+1).trim(), Object.class, getResourceLoader());
//					} catch (Exception e) {
//						e.printStackTrace();
//						diagnostics.add
//							(new BasicDiagnostic
//								(Diagnostic.ERROR,
//								 AmurValidator.DIAGNOSTIC_SOURCE,
//								 AmurValidator.COMPONENT__VALIDATE,
//								 "Error "+e.getMessage()+" in property definition: "+pd,
//								 new Object [] { this }));		
//						
//						result = false;
//					}
				}
			}		
//			for (String ad: getGenerationArguments()) {
//				try {
//					ComponentGenerationCommand.createEvaluator("Argument definition "+ad, ad, Object.class, getResourceLoader());
//				} catch (Exception e) {
//					e.printStackTrace();
//					diagnostics.add
//						(new BasicDiagnostic
//							(Diagnostic.ERROR,
//							 AmurValidator.DIAGNOSTIC_SOURCE,
//							 AmurValidator.COMPONENT__VALIDATE,
//							 "Error "+e.getMessage()+" in argument definition: "+ad,
//							 new Object [] { this }));		
//					
//					result = false;
//				}
//			}
//			if (getGenerationCode()!=null && !getGenerationCode().trim().isEmpty()) {
//				try {
//					ComponentGenerationCommand.createCodeEvaluator(this, getResourceLoader());
//				} catch (Exception e) {
//					e.printStackTrace();
//					diagnostics.add
//						(new BasicDiagnostic
//							(Diagnostic.ERROR,
//							 AmurValidator.DIAGNOSTIC_SOURCE,
//							 AmurValidator.COMPONENT__VALIDATE,
//							 "Error in generation code: "+e.getMessage(),
//							 new Object [] { this }));		
//					
//					result = false;
//				}				
//			}	
			
			Composite parent = getParent();
			if (parent!=null) {
				ImplementationType pit = parent.getImplementationType();
				if (pit instanceof ValidationContributor) {
					result = ((ValidationContributor) pit).validate(this, AmurPackage.eINSTANCE.getComposite_Children(), diagnostics, context) && result;
				}
			}
		}
						
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGenerationCommand(Object key) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	private static Boolean licensePlugInIsValid;
	
	private ClassLoader resourceLoader;
	
	protected ClassLoader getResourceLoader() {
		if (resourceLoader==null) {
			if (getParent() instanceof ComponentImpl) {
				resourceLoader = ((ComponentImpl) getParent()).getResourceLoader();
			} else {
				resourceLoader = getClass().getClassLoader();
			}
			if (getResourcePath()!=null && !getResourcePath().isEmpty()) {
			    URL[] ua = new URL[getResourcePath().size()];
			    org.eclipse.emf.ecore.resource.Resource res = eResource();
			    URI base = res==null ? null : res.getURI();
			    int i=0;
			    for (String pathStr: getResourcePath()) {
			        URI pathElement = URI.createURI(pathStr);
			        if (base!=null) {
			            pathElement = pathElement.resolve(base);
			        }
			        try {
						ua[i++]=new URL(pathElement.toString());
					} catch (MalformedURLException e) {
						throw new AmurException(e);
					}
			    }
			    resourceLoader = new URLClassLoader(ua);
			}
		}
		return resourceLoader;
	}

} //ComponentImpl
