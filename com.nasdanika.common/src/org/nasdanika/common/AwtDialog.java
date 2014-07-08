package org.nasdanika.common;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JRootPane;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.keys.IBindingService;

/** 
 * Resizable dialog with AWT components.
 * @author Pavel Vlasov
 *
 */
public abstract class AwtDialog extends Dialog {
	
	private String title;
	private int contentHeight;
	private int contentWidth;
	private boolean keyFilterEnables;
	private IBindingService iBindingService;

	public AwtDialog(Shell parentShell, String title, int contentWidth, int contentHeight) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.title = title;
		this.contentHeight = contentHeight;
		this.contentWidth = contentWidth;
		
//		iBindingService = (IBindingService) Activator.getDefault().getWorkbench().getService(IBindingService.class);
//		keyFilterEnables = iBindingService.isKeyFilterEnabled();
//		iBindingService.setKeyFilterEnabled(false);
	}
	
//	@Override
//	public boolean close() {
//		iBindingService.setKeyFilterEnabled(keyFilterEnables);
//		return super.close();
//	}

	@Override
	protected Control createDialogArea(Composite parent) {		
		Composite ret = (Composite) super.createDialogArea(parent);
		Composite awtBridge = new Composite(ret, SWT.NO_BACKGROUND | SWT.EMBEDDED);
		GridData data = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		data.heightHint = contentHeight;
		data.widthHint = contentWidth;
		awtBridge.setLayoutData(data);
		
		Frame awtFrame = SWT_AWT.new_Frame(awtBridge);
		Panel panel = new Panel(new BorderLayout()) {
            public void update(java.awt.Graphics g) {
                paint(g);
            }
        };
        awtFrame.add(panel);
        JRootPane root = new JRootPane();
        panel.add(root);
        
        createAwtContent(root);
        
        awtBridge.setFocus();
		
		return ret;
	}
	
	/**
	 * 
	 * @param root
	 * @return
	 */
	protected abstract void createAwtContent(JRootPane root);

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		if (title!=null) {
			newShell.setText(title);
		}
	}
}
