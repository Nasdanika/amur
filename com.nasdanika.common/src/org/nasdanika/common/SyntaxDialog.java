package org.nasdanika.common;

import javax.swing.JRootPane;

import org.eclipse.swt.widgets.Shell;
import org.syntax.jedit.JEditTextArea;
import org.syntax.jedit.tokenmarker.TokenMarker;

/**
 * Text dialog with syntax highlighting.
 * @author Pavel Vlasov
 *
 */
public class SyntaxDialog extends AwtDialog {
	
	private JEditTextArea jEditTextArea;
	private String text;
	private TokenMarker tokenMarker;
	
	public SyntaxDialog(Shell parentShell, String title, String text, int contentWidth, int contentHeight, TokenMarker tokenMarker) {
		super(parentShell, title, contentWidth, contentHeight);
		this.text = text;
		this.tokenMarker = tokenMarker;
	}

	@Override
	protected void createAwtContent(JRootPane root) {
		jEditTextArea = new JEditTextArea();
		if (tokenMarker!=null) {
			jEditTextArea.setTokenMarker(tokenMarker);
		}
        if (text!=null) {
        	jEditTextArea.setText(text);
        }
        root.getContentPane().add(jEditTextArea);
	}
	
	public String getText() {
		return jEditTextArea==null ? null : jEditTextArea.getText();
	}

}
