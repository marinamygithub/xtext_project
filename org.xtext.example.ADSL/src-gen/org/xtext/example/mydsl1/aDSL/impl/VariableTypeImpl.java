/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.aDSL.ADSLPackage;
import org.xtext.example.mydsl1.aDSL.VariableType;
import org.xtext.example.mydsl1.aDSL.XClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableTypeImpl#isIsarray <em>Isarray</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableTypeImpl#getInnerType <em>Inner Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableTypeImpl extends VarDefImpl implements VariableType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected XClass type;

  /**
   * The default value of the '{@link #isIsarray() <em>Isarray</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsarray()
   * @generated
   * @ordered
   */
  protected static final boolean ISARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsarray() <em>Isarray</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsarray()
   * @generated
   * @ordered
   */
  protected boolean isarray = ISARRAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getInnerType() <em>Inner Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerType()
   * @generated
   * @ordered
   */
  protected VariableType innerType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ADSLPackage.Literals.VARIABLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (XClass)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADSLPackage.VARIABLE_TYPE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XClass basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(XClass newType)
  {
    XClass oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_TYPE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsarray()
  {
    return isarray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsarray(boolean newIsarray)
  {
    boolean oldIsarray = isarray;
    isarray = newIsarray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_TYPE__ISARRAY, oldIsarray, isarray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getInnerType()
  {
    return innerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInnerType(VariableType newInnerType, NotificationChain msgs)
  {
    VariableType oldInnerType = innerType;
    innerType = newInnerType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_TYPE__INNER_TYPE, oldInnerType, newInnerType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInnerType(VariableType newInnerType)
  {
    if (newInnerType != innerType)
    {
      NotificationChain msgs = null;
      if (innerType != null)
        msgs = ((InternalEObject)innerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_TYPE__INNER_TYPE, null, msgs);
      if (newInnerType != null)
        msgs = ((InternalEObject)newInnerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_TYPE__INNER_TYPE, null, msgs);
      msgs = basicSetInnerType(newInnerType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_TYPE__INNER_TYPE, newInnerType, newInnerType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ADSLPackage.VARIABLE_TYPE__INNER_TYPE:
        return basicSetInnerType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ADSLPackage.VARIABLE_TYPE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ADSLPackage.VARIABLE_TYPE__ISARRAY:
        return isIsarray();
      case ADSLPackage.VARIABLE_TYPE__INNER_TYPE:
        return getInnerType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ADSLPackage.VARIABLE_TYPE__TYPE:
        setType((XClass)newValue);
        return;
      case ADSLPackage.VARIABLE_TYPE__ISARRAY:
        setIsarray((Boolean)newValue);
        return;
      case ADSLPackage.VARIABLE_TYPE__INNER_TYPE:
        setInnerType((VariableType)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ADSLPackage.VARIABLE_TYPE__TYPE:
        setType((XClass)null);
        return;
      case ADSLPackage.VARIABLE_TYPE__ISARRAY:
        setIsarray(ISARRAY_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_TYPE__INNER_TYPE:
        setInnerType((VariableType)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ADSLPackage.VARIABLE_TYPE__TYPE:
        return type != null;
      case ADSLPackage.VARIABLE_TYPE__ISARRAY:
        return isarray != ISARRAY_EDEFAULT;
      case ADSLPackage.VARIABLE_TYPE__INNER_TYPE:
        return innerType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isarray: ");
    result.append(isarray);
    result.append(')');
    return result.toString();
  }

} //VariableTypeImpl
