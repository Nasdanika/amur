/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.nasdanika.amur;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.nasdanika.party.CommonObject;
import org.nasdanika.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.amur.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getAuthors <em>Authors</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getImplementationType <em>Implementation Type</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getCodeGenerationResource <em>Code Generation Resource</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getDocumentationGenerationResource <em>Documentation Generation Resource</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getResourcePath <em>Resource Path</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getGenerationTimeout <em>Generation Timeout</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getGenerationProperties <em>Generation Properties</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getGenerationServices <em>Generation Services</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getGenerationArguments <em>Generation Arguments</em>}</li>
 *   <li>{@link org.nasdanika.amur.Component#getGenerationCode <em>Generation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.amur.AmurPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends CommonObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique element ID, auto-generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_Id()
	 * @model default="" id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.party.Party}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see org.nasdanika.amur.AmurPackage#getComponent_Authors()
	 * @model
	 * @generated
	 */
	EList<Party> getAuthors();

	/**
	 * Returns the value of the '<em><b>Implementation Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.ImplementationType#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Type</em>' containment reference.
	 * @see #setImplementationType(ImplementationType)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_ImplementationType()
	 * @see org.nasdanika.amur.ImplementationType#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	ImplementationType getImplementationType();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getImplementationType <em>Implementation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Type</em>' containment reference.
	 * @see #getImplementationType()
	 * @generated
	 */
	void setImplementationType(ImplementationType value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.amur.Composite#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Composite)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_Parent()
	 * @see org.nasdanika.amur.Composite#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Composite getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Composite value);

	/**
	 * Returns the value of the '<em><b>Code Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Generation Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Generation Resource</em>' attribute.
	 * @see #setCodeGenerationResource(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_CodeGenerationResource()
	 * @model
	 * @generated
	 */
	String getCodeGenerationResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getCodeGenerationResource <em>Code Generation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Generation Resource</em>' attribute.
	 * @see #getCodeGenerationResource()
	 * @generated
	 */
	void setCodeGenerationResource(String value);

	/**
	 * Returns the value of the '<em><b>Documentation Generation Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Generation Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Generation Resource</em>' attribute.
	 * @see #setDocumentationGenerationResource(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_DocumentationGenerationResource()
	 * @model
	 * @generated
	 */
	String getDocumentationGenerationResource();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getDocumentationGenerationResource <em>Documentation Generation Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation Generation Resource</em>' attribute.
	 * @see #getDocumentationGenerationResource()
	 * @generated
	 */
	void setDocumentationGenerationResource(String value);

	/**
	 * Returns the value of the '<em><b>Resource Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Path</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Path</em>' attribute list.
	 * @see org.nasdanika.amur.AmurPackage#getComponent_ResourcePath()
	 * @model
	 * @generated
	 */
	EList<String> getResourcePath();

	/**
	 * Returns the value of the '<em><b>Generation Timeout</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Timeout</em>' attribute.
	 * @see #setGenerationTimeout(int)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_GenerationTimeout()
	 * @model default="30"
	 * @generated
	 */
	int getGenerationTimeout();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getGenerationTimeout <em>Generation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Timeout</em>' attribute.
	 * @see #getGenerationTimeout()
	 * @generated
	 */
	void setGenerationTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Generation Properties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Properties</em>' attribute list.
	 * @see org.nasdanika.amur.AmurPackage#getComponent_GenerationProperties()
	 * @model
	 * @generated
	 */
	EList<String> getGenerationProperties();

	/**
	 * Returns the value of the '<em><b>Generation Services</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Services</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Services</em>' attribute list.
	 * @see org.nasdanika.amur.AmurPackage#getComponent_GenerationServices()
	 * @model
	 * @generated
	 */
	EList<String> getGenerationServices();

	/**
	 * Returns the value of the '<em><b>Generation Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Arguments</em>' attribute list.
	 * @see org.nasdanika.amur.AmurPackage#getComponent_GenerationArguments()
	 * @model
	 * @generated
	 */
	EList<String> getGenerationArguments();

	/**
	 * Returns the value of the '<em><b>Generation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Code</em>' attribute.
	 * @see #setGenerationCode(String)
	 * @see org.nasdanika.amur.AmurPackage#getComponent_GenerationCode()
	 * @model
	 * @generated
	 */
	String getGenerationCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.amur.Component#getGenerationCode <em>Generation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Code</em>' attribute.
	 * @see #getGenerationCode()
	 * @generated
	 */
	void setGenerationCode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates element for execution/generation. Adds messages to diagnostics and 
	 * @param diagnostics Diagnostics to add validation messages to.
	 * @param context Validation context.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createGenerationCommand(Object key);

} // Component
