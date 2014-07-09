package org.nasdanika.common;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.nasdanika.common"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;		
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
		
	public static List<EditorProvider> getEditorProviders(EditorProvider defaultEditorProvider, final String... mimeTypes) {
		List<EditorProvider> providers = new ArrayList<EditorProvider>();
		final Map<EditorProvider, String> providerMimeType = new HashMap<EditorProvider, String>();

		if (defaultEditorProvider!=null) {
			providers.add(defaultEditorProvider);
		}
		
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry!=null) {
			IConfigurationElement[] config = extensionRegistry.getConfigurationElementsFor(EditorProvider.class.getName());
			try {
				Z: for (IConfigurationElement e : config) {
					final Object o = e.createExecutableExtension("class");
					if (o instanceof EditorProvider) {
						for (String mimeType: mimeTypes) {
							for (String mt: split(mimeType)) {
								if (((EditorProvider) o).supports(mt)) {
									providers.add((EditorProvider) o);
									providerMimeType.put((EditorProvider) o, mt);
									continue Z;
								}
							}
						}
					}
				}
			} catch (CoreException ex) {
				System.out.println(ex.getMessage());
			}		
			
			Collections.sort(providers, new Comparator<EditorProvider>() {
	
				@Override
				public int compare(EditorProvider o1, EditorProvider o2) {
					String mimeType1 = providerMimeType.get(o1);
					String mimeType2 = providerMimeType.get(o2);
					if (mimeType1.equals(mimeType2)) {
						int pcr = o2.getPriority(mimeType2)-o1.getPriority(mimeType1);
						if (pcr==0) {
							return o1.getName(mimeType1).compareTo(o2.getName(mimeType2));
						}
						return pcr;
					} else if (mimeType1.length()==mimeType2.length()) {
						return mimeType1.compareTo(mimeType2);
					}
					return mimeType2.length()-mimeType1.length();
				}
			});
		}
		
		return providers; 
	}
	
	private static Collection<String> split(String mimeType) {
		Collection<String> ret = new ArrayList<String>();
		ret.add(mimeType);
		for (int i=mimeType.indexOf('/'); i!=-1; i=mimeType.indexOf('/', i+1)) {
			ret.add(mimeType.substring(0, i));
		}
		return ret;
	}
	
	
	private static final long START = System.currentTimeMillis();
	private static AtomicLong ID_COUNTER = new AtomicLong();	
	private static String ID_PREFIX;
	
	static {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			
			md.update(InetAddress.getLocalHost().getAddress());
			String vmName = ManagementFactory.getRuntimeMXBean().getName();
			md.update(vmName.getBytes());
			
			md.update((":"+System.currentTimeMillis()).getBytes());
			
			ID_PREFIX = toString(md).replace('-', '_');
		} catch (Exception e) {
			ID_PREFIX=Long.toString(START, Character.MAX_RADIX);
			e.printStackTrace();
		}
	}
	
	public static String nextId() {
		return ID_PREFIX+"_"+Long.toString(System.currentTimeMillis()- START, Character.MAX_RADIX)+"_"+Long.toString(ID_COUNTER.incrementAndGet(), Character.MAX_RADIX);
	}
	
	public static String toString(MessageDigest md) {
		return toString(md.digest());		
	}
	
	public static String toString(byte[] bytes) {	
		String charMap = "ABCDEFGHGKLMNOPQRSTVWXYZ1234567890";
		BitSet bs = new BitSet(bytes.length*8);
		for (int i=0; i<bytes.length; ++i) {
			for (int j=0; j<8; ++j) {
				int bitToCheck = 1 << j;
				if ((bytes[i] & bitToCheck) != 0) {
					bs.set(i*8+j);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<bytes.length*8; i+=5) {
			if (i % 20 ==  0 && i>0) {
				sb.append("-");
			}
			int idx = 0;
			for (int j=0; j<5; ++j) {
				if (bs.get(i+j)) {
					idx+= 1 << j;					
				}
			}
			sb.append(charMap.charAt(idx));
		}
		return sb.toString();
	}	
	
    private static final String SYMBS = "`1234567890-=qwertyuiop[]\\asdfghjkl;zxcvbnm,./~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:ZXCVBNM<>?\"' ";

    public static String encrypt(String str, byte[] key) throws Exception {
    	byte[] k = new byte[8];
    	System.arraycopy(key, 0, k, 0, Math.min(key.length, k.length));
        Cipher ecipher = Cipher.getInstance("DES");
        SecretKeySpec sks = new SecretKeySpec(k, "DES");
        ecipher.init(Cipher.ENCRYPT_MODE, sks);
        StringBuilder sb = new StringBuilder();
        byte[] bytes = ecipher.doFinal(str.getBytes("UTF8"));
        for (int i=0; i<bytes.length; ++i) {
        	int offset = i % (SYMBS.length()-64);
			sb.append(SYMBS.charAt(offset + ((bytes[i] & 0xff) >> 2)));			
        	sb.append(SYMBS.charAt((bytes[i] & 3) * (1+i % (SYMBS.length()/4))));
        }   
        return sb.toString();
    }

    public static String decrypt(String str, byte[] key) throws Exception {
    	byte[] k = new byte[8];
    	System.arraycopy(key, 0, k, 0, Math.min(key.length, k.length));
        Cipher dcipher = Cipher.getInstance("DES");
        SecretKeySpec sks = new SecretKeySpec(k, "DES");
        dcipher.init(Cipher.DECRYPT_MODE, sks);
        byte[] bytes = new byte[str.length()/2];
        for (int i=0; i<str.length(); i+=2) {
        	int offset = (i/2) % (SYMBS.length()-64);
			bytes[i/2] = (byte) ((SYMBS.indexOf(str.charAt(i)) - offset) << 2 | (SYMBS.indexOf(str.charAt(i+1)) / (1+(i/2) % (SYMBS.length()/4))));
        }
        return new String(dcipher.doFinal(bytes), "UTF8");
    }
    
	public static String renderHtml(
			Object obj, 
			File resourceContainer, 
			ImageManager imageManager,
			AdapterFactory adapterFactory,
			Map<Object, Object> context) throws Exception {
		HtmlRenderer<Object> currentRenderer = null;
		
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		if (extensionRegistry!=null) {
			IConfigurationElement[] config = extensionRegistry.getConfigurationElementsFor(HtmlRenderer.class.getName());
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof HtmlRenderer) {
					@SuppressWarnings("unchecked")
					HtmlRenderer<Object> candidate = (HtmlRenderer<Object>) o;
					if (candidate.getRendereeType().isInstance(obj) && candidate.accept(obj)) {
						if (currentRenderer==null) {
							currentRenderer = candidate;							
						} else if (currentRenderer.getRendereeType().isAssignableFrom(candidate.getRendereeType())) {
							if (candidate.getRendereeType().isAssignableFrom(currentRenderer.getRendereeType())) {
								// types are equal
								if (currentRenderer.getClass().isAssignableFrom(candidate.getClass())) {
									// Candidate is more specific
									currentRenderer = candidate;
								} else if (candidate.compareTo(currentRenderer) < 0) { // Lower - higher priority.
									currentRenderer = candidate;
								}
							} else {
								currentRenderer = candidate;
							}
						}
					}
				}
			}
		}			
		
		return currentRenderer == null ? null : currentRenderer.renderHtml(obj, resourceContainer, imageManager, adapterFactory, context); 
	}    
	
//    public static void main(String[] args) throws Exception {
//    	byte[] key = "popa".getBytes();
//		String e = encrypt("mama mila ramu i uehala v panamu", key);
//    	System.out.println(e);
//    	System.out.println(decrypt(e, key));
//    	
//    }
}
