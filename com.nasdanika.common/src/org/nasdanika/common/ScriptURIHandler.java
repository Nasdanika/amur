package org.nasdanika.common;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

/**
 * This class handles <code>script</code> protocol/schema and evaluates expressions using Java Scripting framework. 
 * Expression language extension is passed as authority and expression is passed as path, e.g. <code>script://java/myObject.toString()</code>.
 * Evaluation result is converted to input stream in the following way: 
 * a) If it is input stream then it is returned as is. 
 * b) If it is Reader then it is wrapped into input stream.
 * c) If it is null, then null is returned.
 * d) Result is converted to String with toString() method and string bytes are returned as input stream.  
 * @author Pavel Vlasov
 *
 */
public class ScriptURIHandler extends URIHandlerImpl {

	public static final String SCRIPT_SCHEMA = "script";
	private Bindings bindings;
	private ScriptEngineManager scriptEngineManager;
	
	@Override
	public boolean canHandle(URI uri) {
		return uri!=null && SCRIPT_SCHEMA.equals(uri.scheme());
	}
	
	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		String authority = uri.authority();
		if (authority==null) {
			return null;
		}
		
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByExtension(authority);
		if (scriptEngine==null) {
			throw new IOException("Cannot create script engine for extension "+authority);
		}
		
		String expr = uri.path();
		if (expr.startsWith("/")) {
			expr = expr.substring(1);
		}
		try {
			Object res = scriptEngine.eval(expr, bindings);
			if (res==null) {
				return null;
			}
			if (res instanceof InputStream) {
				return (InputStream) res;
			}
			
			if (res instanceof Reader) {
				StringWriter sw = new StringWriter();
				char[] cbuf = new char[4096];
				int l;
				while ((l=((Reader) res).read(cbuf))!=-1) {
					sw.write(cbuf, 0, l);
				}
				((Reader) res).close();
				sw.close();
				res = sw.toString();
			}
			
			return new ByteArrayInputStream(res.toString().getBytes());
		} catch (ScriptException e) {
			throw new IOException("Cannot evaluate "+expr, e);
		}
				
	}
	
	/**
	 * 
	 * @param classLoader ClassLoader to use to load script engines and other classes.
	 * @param bindings Bindings for evaluating script expression.
	 */
	public ScriptURIHandler(ClassLoader classLoader, Map<String, Object> bindings) {
		this.bindings = bindings==null ? new SimpleBindings() : new SimpleBindings(bindings);
		this.scriptEngineManager = new ScriptEngineManager(classLoader);
	}
	
	/**
	 * 
	 * @param bindings Bindings for evaluating script expression.
	 */
	public ScriptURIHandler(Map<String, Object> bindings) {
		this.bindings = bindings==null ? new SimpleBindings() : new SimpleBindings(bindings);
		this.scriptEngineManager = new ScriptEngineManager();
	}

	/**
	 * Injects ScriptURIHandler as first handler to the resource set.
	 * @param classLoader
	 * @param bindings
	 * @param resourceSet
	 */
	public static void inject(ClassLoader classLoader, Map<String, Object> bindings, ResourceSet resourceSet) {
		resourceSet.getURIConverter().getURIHandlers().add(0, new ScriptURIHandler(classLoader, bindings));
	}
	
	/**
	 * Injects ScriptURIHandler as first handler to the resource set.
	 * @param bindings
	 * @param resourceSet
	 */
	public static void inject(Map<String, Object> bindings, ResourceSet resourceSet) {
		resourceSet.getURIConverter().getURIHandlers().add(0, new ScriptURIHandler(bindings));
	}
	
	// For testing.
	public static void main(String[] args) throws Exception {
		Map<String, Object> env = new HashMap<String, Object>();
		env.put("z", "366");
		ScriptURIHandler suh = new ScriptURIHandler(null, env);
		URI testURI = URI.createURI("script://js/z.length");
		InputStream is = suh.createInputStream(testURI, null);
		byte[] buf = new byte[40];
		is.read(buf);
		System.out.println(Arrays.toString(buf));
		
	}
	
}
