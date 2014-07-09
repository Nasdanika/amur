package org.nasdanika.common;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;

public class Awt2SwtEditorAdapter implements SwtEditor {

	private AwtEditor awtEditor;

	public Awt2SwtEditorAdapter(AwtEditor awtEditor) {
		this.awtEditor = awtEditor;
	}

	@Override
	public Object getValue() {
		final Object[] ret = { null };
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					ret[0] = awtEditor.getValue();
					
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			throw new RuntimeException("Error getting editor value", e);
		}
		return ret[0];
	}

	@Override
	public void setEnabled(final boolean enabled) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				awtEditor.setEnabled(enabled);				
			}
		});
		
	}

	@Override
	public void createSwtContent(Control swtRoot, final Object value, AdapterFactory adapterFactory, final CompletionProviderFactory completionProvider) {
		Composite awtBridge = new Composite((Composite) swtRoot, SWT.NO_BACKGROUND | SWT.EMBEDDED);
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		awtBridge.setLayoutData(data);
		
		Frame awtFrame = SWT_AWT.new_Frame(awtBridge);
		Panel panel = new Panel(new BorderLayout()) {
            public void update(java.awt.Graphics g) {
                paint(g);
            }
        };
        awtFrame.add(panel);
        final JRootPane root = new JRootPane();
        panel.add(root);
        
        try {
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
			        awtEditor.createAwtContent(root, value, completionProvider);
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			throw new RuntimeException("Error creating AWT content", e);
		}
        awtBridge.setFocus();
	}

	@Override
	public void setValue(final Object value) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				awtEditor.setValue(value);				
			}
		});		
	}

	@Override
	public String getName() {
		return awtEditor.getName();
	}

}
