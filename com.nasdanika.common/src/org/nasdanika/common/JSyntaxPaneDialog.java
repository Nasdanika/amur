package org.nasdanika.common;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JEditorPane;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;

import jsyntaxpane.DefaultSyntaxKit;

import org.eclipse.swt.widgets.Shell;

/**
 * Text dialog with syntax highlighting.
 * @author Pavel Vlasov
 *
 */
public class JSyntaxPaneDialog extends AwtDialog {
	private JEditorPane codeEditor;
	
	private String text;

	private String contentType;
	
	public JSyntaxPaneDialog(Shell parentShell, String title, String text, String contentType, int contentWidth, int contentHeight) {
		super(parentShell, title, contentWidth, contentHeight);
		this.text = text;
		this.contentType = contentType;
	}

	@Override
	protected void createAwtContent(JRootPane root) {
		final Container c = root.getContentPane();
		c.setLayout(new BorderLayout());
		
		DefaultSyntaxKit.initKit();

		codeEditor = new JEditorPane();
		JScrollPane scrPane = new JScrollPane(codeEditor);
		c.add(scrPane, BorderLayout.CENTER);
		c.doLayout();

		if (contentType != null) {
			codeEditor.setContentType(contentType);
		}
		if (text != null) {
			codeEditor.setText(text);
		}
	}
	
	public String getText() {
		return codeEditor==null ? null : codeEditor.getText();
	}

}
