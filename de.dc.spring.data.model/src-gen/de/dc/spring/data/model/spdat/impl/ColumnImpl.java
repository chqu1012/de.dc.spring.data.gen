/**
 */
package de.dc.spring.data.model.spdat.impl;

import de.dc.spring.data.model.spdat.Column;
import de.dc.spring.data.model.spdat.SpdatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#isUpdatable <em>Updatable</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#getLength <em>Length</em>}</li>
 *   <li>{@link de.dc.spring.data.model.spdat.impl.ColumnImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends NamedElementImpl implements Column {
	/**
	 * The default value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSERTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsertable()
	 * @generated
	 * @ordered
	 */
	protected boolean insertable = INSERTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULLABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DEFINITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDefinition()
	 * @generated
	 * @ordered
	 */
	protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected int scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdatable()
	 * @generated
	 * @ordered
	 */
	protected boolean updatable = UPDATABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdatPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsertable() {
		return insertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertable(boolean newInsertable) {
		boolean oldInsertable = insertable;
		insertable = newInsertable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__INSERTABLE, oldInsertable,
					insertable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__NULLABLE, oldNullable,
					nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__PRECISION, oldPrecision,
					precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnDefinition() {
		return columnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnDefinition(String newColumnDefinition) {
		String oldColumnDefinition = columnDefinition;
		columnDefinition = newColumnDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__COLUMN_DEFINITION,
					oldColumnDefinition, columnDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(int newScale) {
		int oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdatable() {
		return updatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatable(boolean newUpdatable) {
		boolean oldUpdatable = updatable;
		updatable = newUpdatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__UPDATABLE, oldUpdatable,
					updatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpdatPackage.COLUMN__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdatPackage.COLUMN__INSERTABLE:
			return isInsertable();
		case SpdatPackage.COLUMN__NULLABLE:
			return isNullable();
		case SpdatPackage.COLUMN__UNIQUE:
			return isUnique();
		case SpdatPackage.COLUMN__PRECISION:
			return getPrecision();
		case SpdatPackage.COLUMN__COLUMN_DEFINITION:
			return getColumnDefinition();
		case SpdatPackage.COLUMN__SCALE:
			return getScale();
		case SpdatPackage.COLUMN__UPDATABLE:
			return isUpdatable();
		case SpdatPackage.COLUMN__LENGTH:
			return getLength();
		case SpdatPackage.COLUMN__TABLE:
			return getTable();
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
		case SpdatPackage.COLUMN__INSERTABLE:
			setInsertable((Boolean) newValue);
			return;
		case SpdatPackage.COLUMN__NULLABLE:
			setNullable((Boolean) newValue);
			return;
		case SpdatPackage.COLUMN__UNIQUE:
			setUnique((Boolean) newValue);
			return;
		case SpdatPackage.COLUMN__PRECISION:
			setPrecision((Integer) newValue);
			return;
		case SpdatPackage.COLUMN__COLUMN_DEFINITION:
			setColumnDefinition((String) newValue);
			return;
		case SpdatPackage.COLUMN__SCALE:
			setScale((Integer) newValue);
			return;
		case SpdatPackage.COLUMN__UPDATABLE:
			setUpdatable((Boolean) newValue);
			return;
		case SpdatPackage.COLUMN__LENGTH:
			setLength((Integer) newValue);
			return;
		case SpdatPackage.COLUMN__TABLE:
			setTable((String) newValue);
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
		case SpdatPackage.COLUMN__INSERTABLE:
			setInsertable(INSERTABLE_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__NULLABLE:
			setNullable(NULLABLE_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__COLUMN_DEFINITION:
			setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__SCALE:
			setScale(SCALE_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__UPDATABLE:
			setUpdatable(UPDATABLE_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__LENGTH:
			setLength(LENGTH_EDEFAULT);
			return;
		case SpdatPackage.COLUMN__TABLE:
			setTable(TABLE_EDEFAULT);
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
		case SpdatPackage.COLUMN__INSERTABLE:
			return insertable != INSERTABLE_EDEFAULT;
		case SpdatPackage.COLUMN__NULLABLE:
			return nullable != NULLABLE_EDEFAULT;
		case SpdatPackage.COLUMN__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
		case SpdatPackage.COLUMN__PRECISION:
			return precision != PRECISION_EDEFAULT;
		case SpdatPackage.COLUMN__COLUMN_DEFINITION:
			return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null
					: !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
		case SpdatPackage.COLUMN__SCALE:
			return scale != SCALE_EDEFAULT;
		case SpdatPackage.COLUMN__UPDATABLE:
			return updatable != UPDATABLE_EDEFAULT;
		case SpdatPackage.COLUMN__LENGTH:
			return length != LENGTH_EDEFAULT;
		case SpdatPackage.COLUMN__TABLE:
			return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
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
		result.append(" (insertable: ");
		result.append(insertable);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", unique: ");
		result.append(unique);
		result.append(", precision: ");
		result.append(precision);
		result.append(", columnDefinition: ");
		result.append(columnDefinition);
		result.append(", scale: ");
		result.append(scale);
		result.append(", updatable: ");
		result.append(updatable);
		result.append(", length: ");
		result.append(length);
		result.append(", table: ");
		result.append(table);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
