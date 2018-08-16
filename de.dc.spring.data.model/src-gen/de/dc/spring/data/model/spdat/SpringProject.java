/**
 */
package de.dc.spring.data.model.spdat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.SpringProject#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.SpringProject#getDatas <em>Datas</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.SpringProject#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.data.model.spdat.SpdatPackage#getSpringProject()
 * @model
 * @generated
 */
public interface SpringProject extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getSpringProject_PackagePath()
	 * @model
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.SpringProject#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.data.model.spdat.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference list.
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getSpringProject_Datas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getDatas();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.data.model.spdat.Repository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' containment reference list.
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getSpringProject_Repositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Repository> getRepositories();

} // SpringProject
