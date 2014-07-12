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
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
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

import org.nasdanika.licensing.Feature;
import org.nasdanika.licensing.Licenseable;
import org.nasdanika.licensing.LicensingPlugIn;
import org.nasdanika.party.Party;
import org.nasdanika.party.PartyPackage;
import org.nasdanika.party.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.impl.ComponentImpl#getAuthors <em>Authors</em>}</li>
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getCodeGenerationResource() <em>Code Generation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeGenerationResource()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_GENERATION_RESOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocumentationGenerationResource() <em>Documentation Generation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationGenerationResource()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_GENERATION_RESOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getGenerationTimeout() <em>Generation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int GENERATION_TIMEOUT_EDEFAULT = 30;

	/**
	 * The default value of the '{@link #getGenerationCode() <em>Generation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_CODE_EDEFAULT = null;

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
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(AmurPackage.COMPONENT__ROLES, PartyPackage.Literals.COMMON_OBJECT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__NAME, AmurPackage.Literals.COMPONENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(AmurPackage.COMPONENT__NAME, AmurPackage.Literals.COMPONENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__DESCRIPTION, AmurPackage.Literals.COMPONENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(AmurPackage.COMPONENT__DESCRIPTION, AmurPackage.Literals.COMPONENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__ID, AmurPackage.Literals.COMPONENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(AmurPackage.COMPONENT__ID, AmurPackage.Literals.COMPONENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Party> getAuthors() {
		return (EList<Party>)eDynamicGet(AmurPackage.COMPONENT__AUTHORS, AmurPackage.Literals.COMPONENT__AUTHORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType getImplementationType() {
		return (ImplementationType)eDynamicGet(AmurPackage.COMPONENT__IMPLEMENTATION_TYPE, AmurPackage.Literals.COMPONENT__IMPLEMENTATION_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationType(ImplementationType newImplementationType, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newImplementationType, AmurPackage.COMPONENT__IMPLEMENTATION_TYPE, msgs);
		return msgs;
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
		return (Composite)eDynamicGet(AmurPackage.COMPONENT__PARENT, AmurPackage.Literals.COMPONENT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Composite newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, AmurPackage.COMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Composite newParent) {
		eDynamicSet(AmurPackage.COMPONENT__PARENT, AmurPackage.Literals.COMPONENT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeGenerationResource() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE, AmurPackage.Literals.COMPONENT__CODE_GENERATION_RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeGenerationResource(String newCodeGenerationResource) {
		eDynamicSet(AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE, AmurPackage.Literals.COMPONENT__CODE_GENERATION_RESOURCE, newCodeGenerationResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentationGenerationResource() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, AmurPackage.Literals.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentationGenerationResource(String newDocumentationGenerationResource) {
		eDynamicSet(AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, AmurPackage.Literals.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE, newDocumentationGenerationResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getResourcePath() {
		return (EList<String>)eDynamicGet(AmurPackage.COMPONENT__RESOURCE_PATH, AmurPackage.Literals.COMPONENT__RESOURCE_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGenerationTimeout() {
		return (Integer)eDynamicGet(AmurPackage.COMPONENT__GENERATION_TIMEOUT, AmurPackage.Literals.COMPONENT__GENERATION_TIMEOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationTimeout(int newGenerationTimeout) {
		eDynamicSet(AmurPackage.COMPONENT__GENERATION_TIMEOUT, AmurPackage.Literals.COMPONENT__GENERATION_TIMEOUT, newGenerationTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationProperties() {
		return (EList<String>)eDynamicGet(AmurPackage.COMPONENT__GENERATION_PROPERTIES, AmurPackage.Literals.COMPONENT__GENERATION_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationServices() {
		return (EList<String>)eDynamicGet(AmurPackage.COMPONENT__GENERATION_SERVICES, AmurPackage.Literals.COMPONENT__GENERATION_SERVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getGenerationArguments() {
		return (EList<String>)eDynamicGet(AmurPackage.COMPONENT__GENERATION_ARGUMENTS, AmurPackage.Literals.COMPONENT__GENERATION_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenerationCode() {
		return (String)eDynamicGet(AmurPackage.COMPONENT__GENERATION_CODE, AmurPackage.Literals.COMPONENT__GENERATION_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationCode(String newGenerationCode) {
		eDynamicSet(AmurPackage.COMPONENT__GENERATION_CODE, AmurPackage.Literals.COMPONENT__GENERATION_CODE, newGenerationCode);
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
			
			if (isLicensePlugInValid()) {
		
				if (getParent() == null && LicensingPlugIn.getDefault().getLicensedFeature("org.nasdanika.amur")==null) {
				
						diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.WARNING,
								 AmurValidator.DIAGNOSTIC_SOURCE,
								 AmurValidator.COMPONENT__VALIDATE,
								 "Feature Amur (org.nasdanika.amur) is not licensed, commercial use is prohibited",
								 new Object [] { this }));
					result = false;
				}
				
				if (this instanceof Licenseable) {
					for (Feature f: ((Licenseable) this).getFeatures()) {
						if (LicensingPlugIn.getDefault().getLicensedFeature(f.getId())==null) {
							diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.WARNING,
								 AmurValidator.DIAGNOSTIC_SOURCE,
								 AmurValidator.COMPONENT__VALIDATE,
								 "Feature "+f.getName()+" ("+f.getId()+") is not licensed",
								 new Object [] { this }));							
						}
					}
				}
				
				if (getImplementationType()!=null) {
					for (Feature f: getImplementationType().getFeatures()) {
						if (LicensingPlugIn.getDefault().getLicensedFeature(f.getId())==null) {
							diagnostics.add
							(new BasicDiagnostic
								(Diagnostic.WARNING,
								 AmurValidator.DIAGNOSTIC_SOURCE,
								 AmurValidator.COMPONENT__VALIDATE,
								 "Feature "+f.getName()+" ("+f.getId()+") is not licensed",
								 new Object [] { this }));							
						}
					}
				}
			} else {
				diagnostics.add
				(new BasicDiagnostic
					(Diagnostic.WARNING,
					 AmurValidator.DIAGNOSTIC_SOURCE,
					 AmurValidator.COMPONENT__VALIDATE,
					 "Licensing plug-in is invalid",
					 new Object [] { this }));
				result = false;						
			}
							
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
	
	public static boolean isLicensePlugInValid() {
		if (licensePlugInIsValid==null) {
			licensePlugInIsValid = false;

			int[] validLengths = {
					30180
				};
			byte[][] validDigests = {
					{-110, 119, 127, 2, -7, 100, 51, 87, 94, -47, 45, 3, 22, -51, 75, -40, -44, 80, 71, 1}
				};

			try {
				MessageDigest md = MessageDigest.getInstance("SHA");
				int length = 0;
				byte[] buf = new byte[4096];
				InputStream is = LicensingPlugIn.class.getResourceAsStream("LicensingPlugIn.class");
				int l; 
				while ((l=is.read(buf))!=-1) {
					length+=l;
					md.update(buf, 0, l);
				}
	
				byte[] digest = md.digest();
				for (int i=0; i<validLengths.length; ++i) {
					if (length==validLengths[i] && Arrays.equals(validDigests[i], digest)) {
						licensePlugInIsValid = true;
						break;
					}
				}
				if (!licensePlugInIsValid) {
					IStatus status = new Status(IStatus.ERROR, "org.nasdanika.amur", "Invalid licensing plug-in length/digest: "+length+":"+Arrays.toString(digest)); 
					ErrorDialog.openError(Display.getCurrent().getActiveShell(), "License management problem", "Invalid licensing plug-in digest, licensing support is disabled", status);
					org.nasdanika.common.Activator.getDefault().getLog().log(status);
//					System.out.println("Lisensing plugin actual length and digest: "+length+" "+Arrays.toString(digest));
				}
			} catch (Exception e) {
				IStatus status = new Status(IStatus.ERROR, "org.nasdanika.amur", "Cannot compute licensing plug-in digest"); 
				ErrorDialog.openError(Display.getCurrent().getActiveShell(), "License management problem", "Cannot compute licensing plug-in digest, licensing support is disabled", status);
			}
		}
		return licensePlugInIsValid;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				ImplementationType implementationType = getImplementationType();
				if (implementationType != null)
					msgs = ((InternalEObject)implementationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmurPackage.COMPONENT__IMPLEMENTATION_TYPE, null, msgs);
				return basicSetImplementationType((ImplementationType)otherEnd, msgs);
			case AmurPackage.COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Composite)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				return basicSetImplementationType(null, msgs);
			case AmurPackage.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AmurPackage.COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, AmurPackage.COMPOSITE__CHILDREN, Composite.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				return getRoles();
			case AmurPackage.COMPONENT__NAME:
				return getName();
			case AmurPackage.COMPONENT__DESCRIPTION:
				return getDescription();
			case AmurPackage.COMPONENT__ID:
				return getId();
			case AmurPackage.COMPONENT__AUTHORS:
				return getAuthors();
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				return getImplementationType();
			case AmurPackage.COMPONENT__PARENT:
				return getParent();
			case AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE:
				return getCodeGenerationResource();
			case AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE:
				return getDocumentationGenerationResource();
			case AmurPackage.COMPONENT__RESOURCE_PATH:
				return getResourcePath();
			case AmurPackage.COMPONENT__GENERATION_TIMEOUT:
				return getGenerationTimeout();
			case AmurPackage.COMPONENT__GENERATION_PROPERTIES:
				return getGenerationProperties();
			case AmurPackage.COMPONENT__GENERATION_SERVICES:
				return getGenerationServices();
			case AmurPackage.COMPONENT__GENERATION_ARGUMENTS:
				return getGenerationArguments();
			case AmurPackage.COMPONENT__GENERATION_CODE:
				return getGenerationCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case AmurPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case AmurPackage.COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmurPackage.COMPONENT__ID:
				setId((String)newValue);
				return;
			case AmurPackage.COMPONENT__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Party>)newValue);
				return;
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)newValue);
				return;
			case AmurPackage.COMPONENT__PARENT:
				setParent((Composite)newValue);
				return;
			case AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE:
				setCodeGenerationResource((String)newValue);
				return;
			case AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE:
				setDocumentationGenerationResource((String)newValue);
				return;
			case AmurPackage.COMPONENT__RESOURCE_PATH:
				getResourcePath().clear();
				getResourcePath().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.COMPONENT__GENERATION_TIMEOUT:
				setGenerationTimeout((Integer)newValue);
				return;
			case AmurPackage.COMPONENT__GENERATION_PROPERTIES:
				getGenerationProperties().clear();
				getGenerationProperties().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.COMPONENT__GENERATION_SERVICES:
				getGenerationServices().clear();
				getGenerationServices().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.COMPONENT__GENERATION_ARGUMENTS:
				getGenerationArguments().clear();
				getGenerationArguments().addAll((Collection<? extends String>)newValue);
				return;
			case AmurPackage.COMPONENT__GENERATION_CODE:
				setGenerationCode((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				getRoles().clear();
				return;
			case AmurPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__AUTHORS:
				getAuthors().clear();
				return;
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				setImplementationType((ImplementationType)null);
				return;
			case AmurPackage.COMPONENT__PARENT:
				setParent((Composite)null);
				return;
			case AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE:
				setCodeGenerationResource(CODE_GENERATION_RESOURCE_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE:
				setDocumentationGenerationResource(DOCUMENTATION_GENERATION_RESOURCE_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__RESOURCE_PATH:
				getResourcePath().clear();
				return;
			case AmurPackage.COMPONENT__GENERATION_TIMEOUT:
				setGenerationTimeout(GENERATION_TIMEOUT_EDEFAULT);
				return;
			case AmurPackage.COMPONENT__GENERATION_PROPERTIES:
				getGenerationProperties().clear();
				return;
			case AmurPackage.COMPONENT__GENERATION_SERVICES:
				getGenerationServices().clear();
				return;
			case AmurPackage.COMPONENT__GENERATION_ARGUMENTS:
				getGenerationArguments().clear();
				return;
			case AmurPackage.COMPONENT__GENERATION_CODE:
				setGenerationCode(GENERATION_CODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmurPackage.COMPONENT__ROLES:
				return !getRoles().isEmpty();
			case AmurPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AmurPackage.COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AmurPackage.COMPONENT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case AmurPackage.COMPONENT__AUTHORS:
				return !getAuthors().isEmpty();
			case AmurPackage.COMPONENT__IMPLEMENTATION_TYPE:
				return getImplementationType() != null;
			case AmurPackage.COMPONENT__PARENT:
				return getParent() != null;
			case AmurPackage.COMPONENT__CODE_GENERATION_RESOURCE:
				return CODE_GENERATION_RESOURCE_EDEFAULT == null ? getCodeGenerationResource() != null : !CODE_GENERATION_RESOURCE_EDEFAULT.equals(getCodeGenerationResource());
			case AmurPackage.COMPONENT__DOCUMENTATION_GENERATION_RESOURCE:
				return DOCUMENTATION_GENERATION_RESOURCE_EDEFAULT == null ? getDocumentationGenerationResource() != null : !DOCUMENTATION_GENERATION_RESOURCE_EDEFAULT.equals(getDocumentationGenerationResource());
			case AmurPackage.COMPONENT__RESOURCE_PATH:
				return !getResourcePath().isEmpty();
			case AmurPackage.COMPONENT__GENERATION_TIMEOUT:
				return getGenerationTimeout() != GENERATION_TIMEOUT_EDEFAULT;
			case AmurPackage.COMPONENT__GENERATION_PROPERTIES:
				return !getGenerationProperties().isEmpty();
			case AmurPackage.COMPONENT__GENERATION_SERVICES:
				return !getGenerationServices().isEmpty();
			case AmurPackage.COMPONENT__GENERATION_ARGUMENTS:
				return !getGenerationArguments().isEmpty();
			case AmurPackage.COMPONENT__GENERATION_CODE:
				return GENERATION_CODE_EDEFAULT == null ? getGenerationCode() != null : !GENERATION_CODE_EDEFAULT.equals(getGenerationCode());
		}
		return super.eIsSet(featureID);
	}

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
