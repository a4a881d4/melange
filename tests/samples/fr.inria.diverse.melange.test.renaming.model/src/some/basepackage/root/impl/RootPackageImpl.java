/**
 */
package some.basepackage.root.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import some.basepackage.root.ClassA;
import some.basepackage.root.RootFactory;
import some.basepackage.root.RootPackage;

import some.basepackage.root.subpackage.SubpackagePackage;

import some.basepackage.root.subpackage.impl.SubpackagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootPackageImpl extends EPackageImpl implements RootPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classAEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see some.basepackage.root.RootPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RootPackageImpl() {
		super(eNS_URI, RootFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RootPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RootPackage init() {
		if (isInited) return (RootPackage)EPackage.Registry.INSTANCE.getEPackage(RootPackage.eNS_URI);

		// Obtain or create and register package
		RootPackageImpl theRootPackage = (RootPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RootPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RootPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SubpackagePackageImpl theSubpackagePackage = (SubpackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI) instanceof SubpackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI) : SubpackagePackage.eINSTANCE);

		// Create package meta-data objects
		theRootPackage.createPackageContents();
		theSubpackagePackage.createPackageContents();

		// Initialize created meta-data
		theRootPackage.initializePackageContents();
		theSubpackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRootPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RootPackage.eNS_URI, theRootPackage);
		return theRootPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassA() {
		return classAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootFactory getRootFactory() {
		return (RootFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classAEClass = createEClass(CLASS_A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SubpackagePackage theSubpackagePackage = (SubpackagePackage)EPackage.Registry.INSTANCE.getEPackage(SubpackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSubpackagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(classAEClass, ClassA.class, "ClassA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RootPackageImpl
