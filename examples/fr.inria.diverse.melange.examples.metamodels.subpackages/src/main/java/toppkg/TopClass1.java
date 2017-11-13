/**
 */
package toppkg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import toppkg.subpkg1.Subpkg1Class1;

import toppkg.subpkg2.Subpkg2Class1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link toppkg.TopClass1#getMyTopClass2 <em>My Top Class2</em>}</li>
 *   <li>{@link toppkg.TopClass1#getMySubPkg1Class1 <em>My Sub Pkg1 Class1</em>}</li>
 *   <li>{@link toppkg.TopClass1#getMySubpkg2Class1 <em>My Subpkg2 Class1</em>}</li>
 * </ul>
 * </p>
 *
 * @see toppkg.ToppkgPackage#getTopClass1()
 * @model
 * @generated
 */
public interface TopClass1 extends EObject {
	/**
	 * Returns the value of the '<em><b>My Top Class2</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.TopClass2}.
	 * It is bidirectional and its opposite is '{@link toppkg.TopClass2#getMyTopClass1 <em>My Top Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Top Class2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Top Class2</em>' containment reference list.
	 * @see toppkg.ToppkgPackage#getTopClass1_MyTopClass2()
	 * @see toppkg.TopClass2#getMyTopClass1
	 * @model opposite="myTopClass1" containment="true"
	 * @generated
	 */
	EList<TopClass2> getMyTopClass2();

	/**
	 * Returns the value of the '<em><b>My Sub Pkg1 Class1</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.subpkg1.Subpkg1Class1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Sub Pkg1 Class1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Sub Pkg1 Class1</em>' containment reference list.
	 * @see toppkg.ToppkgPackage#getTopClass1_MySubPkg1Class1()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg1Class1> getMySubPkg1Class1();

	/**
	 * Returns the value of the '<em><b>My Subpkg2 Class1</b></em>' containment reference list.
	 * The list contents are of type {@link toppkg.subpkg2.Subpkg2Class1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Subpkg2 Class1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Subpkg2 Class1</em>' containment reference list.
	 * @see toppkg.ToppkgPackage#getTopClass1_MySubpkg2Class1()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subpkg2Class1> getMySubpkg2Class1();

} // TopClass1
