/**
 */
package de.dc.spring.data.model.spdat.impl;

import de.dc.spring.data.model.spdat.Data;
import de.dc.spring.data.model.spdat.Repository;
import de.dc.spring.data.model.spdat.SpdatPackage;
import de.dc.spring.data.model.spdat.SpringProject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.SpringProjectImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.SpringProjectImpl#getDatas <em>Datas</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.SpringProjectImpl#getRepositories <em>Repositories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpringProjectImpl extends NamedElementImpl implements SpringProject {
	/**
	 * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected String packagePath = PACKAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatas() <em>Datas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> datas;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdatPackage.Literals.SPRING_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePath() {
		return packagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePath(String newPackagePath) {
		String oldPackagePath = packagePath;
		packagePath = newPackagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.SPRING_PROJECT__PACKAGE_PATH,
					oldPackagePath, packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getDatas() {
		if (datas == null) {
			datas = new EObjectContainmentEList<Data>(Data.class, this, SpdatPackage.SPRING_PROJECT__DATAS);
		}
		return datas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList<Repository>(Repository.class, this,
					SpdatPackage.SPRING_PROJECT__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpdatPackage.SPRING_PROJECT__DATAS:
			return ((InternalEList<?>) getDatas()).basicRemove(otherEnd, msgs);
		case SpdatPackage.SPRING_PROJECT__REPOSITORIES:
			return ((InternalEList<?>) getRepositories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdatPackage.SPRING_PROJECT__PACKAGE_PATH:
			return getPackagePath();
		case SpdatPackage.SPRING_PROJECT__DATAS:
			return getDatas();
		case SpdatPackage.SPRING_PROJECT__REPOSITORIES:
			return getRepositories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdatPackage.SPRING_PROJECT__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		case SpdatPackage.SPRING_PROJECT__DATAS:
			getDatas().clear();
			getDatas().addAll((Collection<? extends Data>) newValue);
			return;
		case SpdatPackage.SPRING_PROJECT__REPOSITORIES:
			getRepositories().clear();
			getRepositories().addAll((Collection<? extends Repository>) newValue);
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
		case SpdatPackage.SPRING_PROJECT__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		case SpdatPackage.SPRING_PROJECT__DATAS:
			getDatas().clear();
			return;
		case SpdatPackage.SPRING_PROJECT__REPOSITORIES:
			getRepositories().clear();
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
		case SpdatPackage.SPRING_PROJECT__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		case SpdatPackage.SPRING_PROJECT__DATAS:
			return datas != null && !datas.isEmpty();
		case SpdatPackage.SPRING_PROJECT__REPOSITORIES:
			return repositories != null && !repositories.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (packagePath: ");
		result.append(packagePath);
		result.append(')');
		return result.toString();
	}

} //SpringProjectImpl
