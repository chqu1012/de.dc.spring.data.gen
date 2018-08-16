/**
 */
package de.dc.spring.data.model.spdat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.Property#getType <em>Type</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Property#getColumn <em>Column</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Property#isId <em>Id</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.data.model.spdat.SpdatPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(Column)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getProperty_Column()
	 * @model containment="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Property#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(boolean)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getProperty_Id()
	 * @model
	 * @generated
	 */
	boolean isId();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Property#isId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isId()
	 * @generated
	 */
	void setId(boolean value);

} // Property
