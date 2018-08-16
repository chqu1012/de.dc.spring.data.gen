/**
 */
package de.dc.spring.data.model.spdat.impl;

import de.dc.spring.data.model.spdat.Data;
import de.dc.spring.data.model.spdat.PathElement;
import de.dc.spring.data.model.spdat.Repository;
import de.dc.spring.data.model.spdat.SpdatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.RepositoryImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.RepositoryImpl#getAssociatedData <em>Associated Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends NamedElementImpl implements Repository {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAssociatedData() <em>Associated Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedData()
	 * @generated
	 * @ordered
	 */
	protected Data associatedData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdatPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.REPOSITORY__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getAssociatedData() {
		if (associatedData != null && associatedData.eIsProxy()) {
			InternalEObject oldAssociatedData = (InternalEObject) associatedData;
			associatedData = (Data) eResolveProxy(oldAssociatedData);
			if (associatedData != oldAssociatedData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpdatPackage.REPOSITORY__ASSOCIATED_DATA,
							oldAssociatedData, associatedData));
			}
		}
		return associatedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetAssociatedData() {
		return associatedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedData(Data newAssociatedData) {
		Data oldAssociatedData = associatedData;
		associatedData = newAssociatedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.REPOSITORY__ASSOCIATED_DATA,
					oldAssociatedData, associatedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdatPackage.REPOSITORY__PATH:
			return getPath();
		case SpdatPackage.REPOSITORY__ASSOCIATED_DATA:
			if (resolve)
				return getAssociatedData();
			return basicGetAssociatedData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdatPackage.REPOSITORY__PATH:
			setPath((String) newValue);
			return;
		case SpdatPackage.REPOSITORY__ASSOCIATED_DATA:
			setAssociatedData((Data) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SpdatPackage.REPOSITORY__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case SpdatPackage.REPOSITORY__ASSOCIATED_DATA:
			setAssociatedData((Data) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SpdatPackage.REPOSITORY__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case SpdatPackage.REPOSITORY__ASSOCIATED_DATA:
			return associatedData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PathElement.class) {
			switch (derivedFeatureID) {
			case SpdatPackage.REPOSITORY__PATH:
				return SpdatPackage.PATH_ELEMENT__PATH;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PathElement.class) {
			switch (baseFeatureID) {
			case SpdatPackage.PATH_ELEMENT__PATH:
				return SpdatPackage.REPOSITORY__PATH;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
