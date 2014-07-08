package org.nasdanika.common.editorproviders;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.ui.text.JavaSourceViewerConfiguration;
import org.eclipse.jdt.ui.text.JavaTextTools;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.nasdanika.common.Editor;
import org.nasdanika.common.EditorProvider;
import org.nasdanika.common.SwtEditor;
import org.nasdanika.common.autocomplete.CompletionProviderFactory;


public class SourceViewerProvider implements EditorProvider {

	@Override
	public String getName(String mimeType) {
		return "Source viewer";
	}
	
	@Override
	public boolean supports(String mimeType) {
		return "text".equalsIgnoreCase(mimeType)
				|| "text/java".equalsIgnoreCase(mimeType);
	}

	@Override
	public Editor createEditor(final String mimeType) {
		
		return new SwtEditor() {

			private Document document;
			private SourceViewer sw;

			@Override
			public Object getValue() {
				return document.get();
			}
			
			@Override
			public void setValue(Object value) {
				document.set(value==null ? "" : value.toString());				
			}
			
			@Override
			public void createSwtContent(Control root, Object value, AdapterFactory adapterFactory, CompletionProviderFactory completionProvider) {
				document = new Document(value==null ? "" : String.valueOf(value));
				int styles = SWT.V_SCROLL | SWT.H_SCROLL; 
				sw = new SourceViewer((Composite) root, null, styles);
				
				sw.setDocument(document);
				
				sw.setEditable(true);//No effect! (2) 

				//Something for layout... 
				GridData gridData = new GridData(); 
				gridData.horizontalSpan = 1; 
				gridData.horizontalAlignment = SWT.FILL; 
				gridData.grabExcessHorizontalSpace = true; 
				gridData.verticalAlignment = SWT.FILL; 
				gridData.grabExcessVerticalSpace = true; 
				gridData.widthHint = 600;
				gridData.heightHint = 400;
				sw.getControl().setLayoutData(gridData);
				
				if ("text/java".equalsIgnoreCase(mimeType)) {
					// Setting up the Java Syntax Highlighting 
					JavaTextTools tools = JavaPlugin.getDefault().getJavaTextTools(); 
					tools.setupJavaDocumentPartitioner(document); 
					JavaSourceViewerConfiguration config = new JavaSourceViewerConfiguration(
							tools.getColorManager(), 
							JavaPlugin.getDefault().getCombinedPreferenceStore(), 
							null, 
							null) {

// TODO - Implement content assistant.						
//						private IContentAssistProcessor contextVariableProcessor = new ContextVariableProcessor();
//
//						public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
//
//							ContentAssistant assistant= new ContentAssistant();
//							assistant.enableAutoActivation(true);
//							assistant.enableAutoInsert(true);
//							assistant.setContentAssistProcessor(contextVariableProcessor, IDocument.DEFAULT_CONTENT_TYPE);
//							return assistant;
//						}
						
					};
					
					sw.configure(config); 					
				}
			}
			
			@Override
			public void setEnabled(boolean enabled) {
				if (sw!=null) {
					sw.setEditable(enabled);
				}
				
			}

			@Override
			public String getName() {
				return "Source Viewer";
			}
		};
	}

	@Override
	public int getPriority(String mimeType) {
		return 1;
	}


}
