package org.nasdanika.common.editorproviders.languagesupport.js;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.text.JTextComponent;

import org.fife.rsta.ac.java.JarManager;
import org.fife.rsta.ac.js.JavaScriptHelper;
import org.fife.rsta.ac.js.PreProcesssingScripts;
import org.fife.rsta.ac.js.SourceCompletionProvider;
import org.fife.rsta.ac.js.ast.jsType.JavaScriptType;
import org.fife.rsta.ac.js.ast.jsType.JavaScriptTypesFactory;
import org.fife.rsta.ac.js.ast.type.TypeDeclaration;
import org.fife.rsta.ac.js.ast.type.TypeDeclarationFactory;
import org.fife.rsta.ac.js.completion.JSCompletion;
import org.fife.rsta.ac.js.resolver.JavaScriptCompletionResolver;
import org.fife.rsta.ac.js.resolver.JavaScriptResolver;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.Completion;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.autocomplete.ParameterChoicesProvider;
import org.fife.ui.autocomplete.ParameterizedCompletion.Parameter;
import org.fife.ui.autocomplete.ShorthandCompletion;
import org.fife.ui.autocomplete.VariableCompletion;
import org.nasdanika.common.autocomplete.CompletionProvider;
import org.nasdanika.common.autocomplete.Scope;

public class JsCompletionBridge {
	
	protected CompletionProvider completionProvider;
	protected SourceCompletionProvider sourceCompletionProvider;

	public JsCompletionBridge(final CompletionProvider completionProvider, final SourceCompletionProvider sourceCompletionProvider) {
		this.completionProvider = completionProvider;
		this.sourceCompletionProvider = sourceCompletionProvider;
					
		sourceCompletionProvider.setJavaScriptTypesFactory(new JavaScriptTypesFactory(sourceCompletionProvider.getTypesFactory()) {
			
			@Override
			public JavaScriptType getCachedType(
					TypeDeclaration type,
					JarManager manager, 
					DefaultCompletionProvider provider,
					String text) {
				
				if (cachedTypes.containsKey(type)) {
					return (JavaScriptType) cachedTypes.get(type);
				}
				
				Scope scope = completionProvider.resolveScope(type.getQualifiedName());
				if (scope!=null) {
					JavaScriptType jsType = scope2JsType(scope, type, cachedTypes);
					return jsType;
				}
				
				return super.getCachedType(type, manager, provider, text);
			}
			
		});
		
		sourceCompletionProvider.setJavaScriptEngine(new org.fife.rsta.ac.js.engine.EMCAJavaScriptEngine() {
			@Override
			public JavaScriptResolver getJavaScriptResolver(SourceCompletionProvider provider) {
				return new JavaScriptCompletionResolver(provider) {
					
					@Override
					public JavaScriptType compileText(String text) throws IOException {
						String txt = JavaScriptHelper.removeLastDotFromText(text);
						for (org.nasdanika.common.autocomplete.Completion c: completionProvider.getCompletions()) {
							String cText = null;
							if (c instanceof org.nasdanika.common.autocomplete.BasicCompletion) {
								cText = ((org.nasdanika.common.autocomplete.BasicCompletion) c).getReplacementText();
							} else if (c instanceof VariableCompletion) {
								cText = ((org.nasdanika.common.autocomplete.VariableCompletion) c).getName();								
							}
							if (cText!=null && cText.equals(txt)) {
								Scope typeScope = completionProvider.resolveScope(c.getType());
								if (typeScope!=null) {
									lastJavaScriptType = provider.getJavaScriptTypesFactory().getCachedType(
											scope2Type(typeScope), 
											sourceCompletionProvider.getJarManager(), 
											sourceCompletionProvider, 
											cText);
									return lastJavaScriptType;
								}
							}
						}
						return super.compileText(text);
					}
				};
			}
		});
		
		final Set<Completion> completions = new HashSet<>();
		
		for (org.nasdanika.common.autocomplete.Completion c: completionProvider.getCompletions()) {
			completions.add(wrap(c));
		}
				
		sourceCompletionProvider.setParameterChoicesProvider(new ParameterChoicesProvider() {

			@Override
			public List<Completion> getParameterChoices(JTextComponent tc, final Parameter param) {
//				org.nasdanika.common.autocomplete.Parameter prm = new org.nasdanika.common.autocomplete.Parameter() {
//					
//					@Override
//					public String getType() {
//						return param.getType();
//					}
//					
//					@Override
//					public String getName() {
//						return param.getName();
//					}
//					
//					@Override
//					public String getDescription() {
//						return param.getDescription();
//					}
//				};
				List<Completion> ret = new ArrayList<>();
				if (completions!=null) {
					for (Completion c: completions) {
						ret.add(c);
					}
				}
				return ret;
			}
		});
				
		PreProcesssingScripts preProcessing = new PreProcesssingScripts(sourceCompletionProvider) {
			@Override
			public Set getCompletions() {
				return completions;
			}
		};
		
		sourceCompletionProvider.setPreProcessingScripts(preProcessing);
		
		if (completionProvider.getScope()!=null) {
			sourceCompletionProvider.setSelf(completionProvider.getScope().getId());
			addTypeDeclaration(completionProvider.getScope());
		}
	}
	
	private Map<String, TypeDeclaration> scopeId2TypeMap = new HashMap<>();
	
	protected TypeDeclaration scope2Type(Scope scope) {
		String id = scope.getId();
		TypeDeclaration ret = scopeId2TypeMap.get(id);
		if (ret==null) {
			int idx = id.lastIndexOf('.');		
			ret = new TypeDeclaration(idx==-1 ? null : id.substring(0, idx), idx==-1 ? id : id.substring(idx+1), scope.getName());
			scopeId2TypeMap.put(id, ret);
		}
		return ret;
	}

	protected TypeDeclaration scopeId2Type(String id) {
		Scope scope = completionProvider.resolveScope(id);
		return scope==null ? null : scope2Type(scope);
	}
	
	protected JavaScriptType scope2JsType(Scope scope, TypeDeclaration type, HashMap cachedTypes) {
		JavaScriptType ret = new JavaScriptType(type);
		for (org.nasdanika.common.autocomplete.VariableCompletion c: scope.getCompletions()) {
			ret.addCompletion(wrap(c, scope.getId()));
		}
		for (Scope bs: scope.getBaseScopes()) {			
			ret.addExtension(scope2JsType(bs, scope2Type(bs), cachedTypes));
		}
		cachedTypes.put(type, ret);
		return ret;
	}

	protected Completion wrap(final org.nasdanika.common.autocomplete.Completion completion) {
		
		if (completion instanceof org.nasdanika.common.autocomplete.ShorthandCompletion) {
			final org.nasdanika.common.autocomplete.ShorthandCompletion sc = (org.nasdanika.common.autocomplete.ShorthandCompletion) completion;
			return new ShorthandCompletion(sourceCompletionProvider, sc.getInputText(), sc.getReplacementText(), sc.getShortDescription(), sc.getSummary()) {
				public Icon getIcon() {
					return sc.getIcon();
				}
				
				@Override
				public String getToolTipText() {
					return sc.getSummary(); 
				}
				
				@Override
				public int getRelevance() {
					return completion.getRelevance();
				}
				
			};
		}
		
		if (completion instanceof org.nasdanika.common.autocomplete.BasicCompletion) {
			final org.nasdanika.common.autocomplete.BasicCompletion bc = (org.nasdanika.common.autocomplete.BasicCompletion) completion;
			return new BasicCompletion(sourceCompletionProvider, bc.getReplacementText(), bc.getShortDescription(), bc.getSummary()) {
				public Icon getIcon() {
					return bc.getIcon();
				}
				
				@Override
				public String getToolTipText() {
					return bc.getSummary(); 
				}
				
				@Override
				public int getRelevance() {
					return completion.getRelevance();
				}
			};
		}
				
		if (completion instanceof org.nasdanika.common.autocomplete.VariableCompletion) {
			return (Completion) wrap((org.nasdanika.common.autocomplete.VariableCompletion) completion, null);
		}
		
		throw new IllegalArgumentException("Unsupported completion type: "+completion.getClass().getName());
		
	}

	protected JSCompletion wrap(final org.nasdanika.common.autocomplete.VariableCompletion completion, String enclosingClassName) {
		
		if (completion instanceof org.nasdanika.common.autocomplete.FunctionCompletion) {
			final org.nasdanika.common.autocomplete.FunctionCompletion fc = (org.nasdanika.common.autocomplete.FunctionCompletion) completion;
			addTypeDeclaration(fc.getType());
			JSFunctionCompletion ret = new JSFunctionCompletion(sourceCompletionProvider, fc.getName(), fc.getType(), enclosingClassName, fc.getIcon());
			if (enclosingClassName!=null) {
				Scope enclosingScope = completionProvider.resolveScope(enclosingClassName);
				if (enclosingScope!=null) {
					ret.setDefinedIn(enclosingScope.getName());
				}
			}
			ret.setRelevance(fc.getRelevance());
			ret.setReturnValueDescription(fc.getReturnValueDescription());
			ret.setShortDescription(fc.getShortDescription());
			ret.setSummary(fc.getSummary());
			
			List<Parameter> params = new ArrayList<>();
			for (org.nasdanika.common.autocomplete.Parameter p: fc.getParameters()) {
				addTypeDeclaration(p.getType());
				Parameter prm = new Parameter(p.getType(), p.getName()); // End flag???
				prm.setDescription(p.getDescription());
				params.add(prm);
			}
			ret.setParams(params);
			return ret;
		}
		
		final org.nasdanika.common.autocomplete.VariableCompletion vc = (org.nasdanika.common.autocomplete.VariableCompletion) completion;
		JSFieldCompletion ret = new JSFieldCompletion(sourceCompletionProvider, vc.getName(), vc.getType(), enclosingClassName, vc.getIcon());
		ret.setShortDescription(vc.getShortDescription());
		ret.setRelevance(vc.getRelevance());
		ret.setSummary(vc.getSummary());	
		addTypeDeclaration(vc.getType());
		if (enclosingClassName!=null) {
			Scope enclosingScope = completionProvider.resolveScope(enclosingClassName);
			if (enclosingScope!=null) {
				ret.setDefinedIn(enclosingScope.getName());
			}
		}
		return ret;
		
	}
	
	private void addTypeDeclaration(String type) {
		if (type!=null) {
			addTypeDeclaration(completionProvider.resolveScope(type));
		}
	}
	
	protected void addTypeDeclaration(Scope scope) {
		if (scope!=null) {
			TypeDeclarationFactory typesFactory = sourceCompletionProvider.getTypesFactory();
			if (typesFactory.getTypeDeclaration(scope.getId()) == null) {
				typesFactory.addType(scope.getId(), scope2Type(scope));
				for (Scope bs: scope.getBaseScopes()) {
					addTypeDeclaration(bs);
				}
			}
		}		
	}
	
}
