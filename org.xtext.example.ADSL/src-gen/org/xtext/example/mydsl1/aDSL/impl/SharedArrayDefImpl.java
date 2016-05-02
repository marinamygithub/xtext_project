/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.aDSL.ADSLPackage;
import org.xtext.example.mydsl1.aDSL.SharedArrayDef;
import org.xtext.example.mydsl1.aDSL.VariableDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Array Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.SharedArrayDefImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedArrayDefImpl extends SharedDefImpl implements SharedArrayDef
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected VariableDef expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SharedArrayDefImpl()
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
    return ADSLPackage.Literals.SHARED_ARRAY_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDef getExpression()
  {
    if (expression != null && expression.eIsProxy())
    {
      InternalEObject oldExpression = (InternalEObject)expression;
      expression = (VariableDef)eResolveProxy(oldExpression);
      if (expression != oldExpression)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION, oldExpression, expression));
      }
    }
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDef basicGetExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(VariableDef newExpression)
  {
    VariableDef oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION, oldExpression, expression));
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
      case ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION:
        if (resolve) return getExpression();
        return basicGetExpression();
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
      case ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION:
        setExpression((VariableDef)newValue);
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
      case ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION:
        setExpression((VariableDef)null);
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
      case ADSLPackage.SHARED_ARRAY_DEF__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //SharedArrayDefImpl