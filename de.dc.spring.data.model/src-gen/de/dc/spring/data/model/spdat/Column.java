/**
 */
package de.dc.spring.data.model.spdat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#isNullable <em>Nullable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#getScale <em>Scale</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#isUpdatable <em>Updatable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#getLength <em>Length</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.Column#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Insertable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertable</em>' attribute.
	 * @see #setInsertable(boolean)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Insertable()
	 * @model default="true"
	 * @generated
	 */
	boolean isInsertable();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#isInsertable <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertable</em>' attribute.
	 * @see #isInsertable()
	 * @generated
	 */
	void setInsertable(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Nullable()
	 * @model default="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Unique()
	 * @model default="true"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Precision()
	 * @model default="0"
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_ColumnDefinition()
	 * @model default=""
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#getColumnDefinition <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Scale()
	 * @model default="0"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Updatable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updatable</em>' attribute.
	 * @see #setUpdatable(boolean)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Updatable()
	 * @model default="true"
	 * @generated
	 */
	boolean isUpdatable();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#isUpdatable <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updatable</em>' attribute.
	 * @see #isUpdatable()
	 * @generated
	 */
	void setUpdatable(boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"255"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Length()
	 * @model default="255"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getColumn_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link de.dc.spring.data.model.spdat.Column#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

} // Column
