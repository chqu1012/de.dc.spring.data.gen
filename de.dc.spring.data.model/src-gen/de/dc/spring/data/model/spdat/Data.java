/**
 */
package de.dc.spring.data.model.spdat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.Data#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see de.dc.spring.data.model.spdat.SpdatPackage#getData()
 * @model
 * @generated
 */
public interface Data extends NamedElement, PathElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.spring.data.model.spdat.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see de.dc.spring.data.model.spdat.SpdatPackage#getData_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Data
