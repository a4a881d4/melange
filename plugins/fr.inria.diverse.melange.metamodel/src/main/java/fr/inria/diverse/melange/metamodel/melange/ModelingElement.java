/**
 */
package fr.inria.diverse.melange.metamodel.melange;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri <em>Ecore Uri</em>}</li>
 *   <li>{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getGenmodelUris <em>Genmodel Uris</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelingElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelingElement extends Element {
	/**
	 * Returns the value of the '<em><b>Ecore Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecore Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecore Uri</em>' attribute.
	 * @see #setEcoreUri(String)
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelingElement_EcoreUri()
	 * @model
	 * @generated
	 */
	String getEcoreUri();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melange.metamodel.melange.ModelingElement#getEcoreUri <em>Ecore Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecore Uri</em>' attribute.
	 * @see #getEcoreUri()
	 * @generated
	 */
	void setEcoreUri(String value);

	/**
	 * Returns the value of the '<em><b>Genmodel Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genmodel Uris</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genmodel Uris</em>' attribute list.
	 * @see fr.inria.diverse.melange.metamodel.melange.MelangePackage#getModelingElement_GenmodelUris()
	 * @model
	 * @generated
	 */
	EList<String> getGenmodelUris();

} // ModelingElement
