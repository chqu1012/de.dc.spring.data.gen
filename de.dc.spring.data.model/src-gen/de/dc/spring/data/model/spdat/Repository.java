/**
 */
package de.dc.spring.data.model.spdat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.Repository#getAssociatedData <em>Associated Data</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.data.model.spdat.SpdatPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedElement, PathElement {
	/**
	 * Returns the value of the '<em><b>Associated Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Data</em>' reference.
	 * @see #setAssociatedData(Data)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getRepository_AssociatedData()
	 * @model required="true"
	 * @generated
	 */
	Data getAssociatedData();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Repository#getAssociatedData <em>Associated Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Data</em>' reference.
	 * @see #getAssociatedData()
	 * @generated
	 */
	void setAssociatedData(Data value);

} // Repository
