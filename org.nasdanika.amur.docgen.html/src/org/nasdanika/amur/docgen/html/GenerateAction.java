package org.nasdanika.amur.docgen.html;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.ComponentActionWithProgress;

public class GenerateAction implements ComponentActionWithProgress<String> {
		
	/**
	 * Name of the output file or null if cancelled.
	 */
	@Override
	public String configure(Component target) {
		FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
		fileDialog.setFilterExtensions(new String[] { "*.html", "*.htm" });
		String fileName = fileDialog.open();
		if (fileName==null) {
			return fileName;
		}
		File file = new File(fileName);
		if (file.exists()) {
			return MessageDialog.openConfirm(Display.getCurrent().getActiveShell(), "Confirm overwrite", "File exists, overwrite?") ? fileName : null;
		}
		return fileName;
	}
	
	private static void delete(File file) {
		File[] children = file.listFiles();
		if (children!=null) {
			for (File c: children) {
				delete(c);
			}
		}
		file.delete();
	}

	@Override
	public IStatus run(Component component, String out, String actionId, IProgressMonitor monitor, Map<Object, Object> context) {		
		monitor.beginTask("Generating "+component.getName()+" HTML documentation", 2); // TODO - number of steps.		
		MultiStatus status = new MultiStatus("org.nasdanika.amur.it.js.gen", Status.OK, "HTML documentation generation - "+component.getName(), null);
		try {
		
			File outFile = new File(out);
			File resourceContainerFile = new File(out+"_files");
			IContainer container = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(new Path(out));			
			if (container!=null) {
				container.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
			IContainer rContainer = ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(new Path(resourceContainerFile.getAbsolutePath()));			
			if (rContainer!=null) {
				rContainer.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
			
			if (resourceContainerFile.exists()) {
				delete(resourceContainerFile);
			}		
			resourceContainerFile.mkdir();
			
			if (rContainer!=null) {
				rContainer.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
			
			Map<Object, Object> genContext = new HashMap<>();
			if (context!=null) {
				genContext.putAll(context);
			}
			
			GenerationHelper helper = new GenerationHelper(resourceContainerFile, (AdapterFactory) context.get("adapterFactory"), context.get("diagram"), true, monitor);
										
			Writer writer = new OutputStreamWriter(new FileOutputStream(outFile), "UTF-8");			
			writer.write(new DocumentRenderer().generate(component, helper, genContext));	
			writer.close();
			
			if (container!=null) {
				container.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
			if (rContainer!=null) {
				rContainer.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			}
		} catch (Exception e) {
			status.add(new Status(Status.ERROR, "org.nasdanika.amur.docgen.html", "HTML Documentation Generation Failed: "+e, e));
			e.printStackTrace();
		} finally {
			monitor.done();
		}		
		
		return status;
	}

	@Override
	public org.nasdanika.amur.AmurActionBase.Mode getMode(Component target) {
		return Mode.ENABLED;
	}
		
}
