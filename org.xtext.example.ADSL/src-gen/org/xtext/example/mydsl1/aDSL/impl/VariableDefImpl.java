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
import org.xtext.example.mydsl1.aDSL.Expression;
import org.xtext.example.mydsl1.aDSL.VariableDef;
import org.xtext.example.mydsl1.aDSL.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#isIsstatic <em>Isstatic</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#getVartype <em>Vartype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#isIstyped <em>Istyped</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#isIsinit <em>Isinit</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.VariableDefImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDefImpl extends MemberImpl implements VariableDef
{
  /**
   * The default value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsstatic()
   * @generated
   * @ordered
   */
  protected static final boolean ISSTATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsstatic() <em>Isstatic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsstatic()
   * @generated
   * @ordered
   */
  protected boolean isstatic = ISSTATIC_EDEFAULT;

  /**
   * The default value of the '{@link #getVartype() <em>Vartype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVartype()
   * @generated
   * @ordered
   */
  protected static final String VARTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVartype() <em>Vartype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVartype()
   * @generated
   * @ordered
   */
  protected String vartype = VARTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIstyped() <em>Istyped</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIstyped()
   * @generated
   * @ordered
   */
  protected static final boolean ISTYPED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIstyped() <em>Istyped</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIstyped()
   * @generated
   * @ordered
   */
  protected boolean istyped = ISTYPED_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected VariableType type;

  /**
   * The default value of the '{@link #isIsinit() <em>Isinit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsinit()
   * @generated
   * @ordered
   */
  protected static final boolean ISINIT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsinit() <em>Isinit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsinit()
   * @generated
   * @ordered
   */
  protected boolean isinit = ISINIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefImpl()
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
    return ADSLPackage.Literals.VARIABLE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsstatic()
  {
    return isstatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsstatic(boolean newIsstatic)
  {
    boolean oldIsstatic = isstatic;
    isstatic = newIsstatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__ISSTATIC, oldIsstatic, isstatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVartype()
  {
    return vartype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVartype(String newVartype)
  {
    String oldVartype = vartype;
    vartype = newVartype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__VARTYPE, oldVartype, vartype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIstyped()
  {
    return istyped;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIstyped(boolean newIstyped)
  {
    boolean oldIstyped = istyped;
    istyped = newIstyped;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__ISTYPED, oldIstyped, istyped));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(VariableType newType, NotificationChain msgs)
  {
    VariableType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(VariableType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsinit()
  {
    return isinit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsinit(boolean newIsinit)
  {
    boolean oldIsinit = isinit;
    isinit = newIsinit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__ISINIT, oldIsinit, isinit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_DEF__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.VARIABLE_DEF__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.VARIABLE_DEF__EXPRESSION, newExpression, newExpression));
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
      case ADSLPackage.VARIABLE_DEF__TYPE:
        return basicSetType(null, msgs);
      case ADSLPackage.VARIABLE_DEF__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case ADSLPackage.VARIABLE_DEF__ISSTATIC:
        return isIsstatic();
      case ADSLPackage.VARIABLE_DEF__VARTYPE:
        return getVartype();
      case ADSLPackage.VARIABLE_DEF__NAME:
        return getName();
      case ADSLPackage.VARIABLE_DEF__ISTYPED:
        return isIstyped();
      case ADSLPackage.VARIABLE_DEF__TYPE:
        return getType();
      case ADSLPackage.VARIABLE_DEF__ISINIT:
        return isIsinit();
      case ADSLPackage.VARIABLE_DEF__EXPRESSION:
        return getExpression();
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
      case ADSLPackage.VARIABLE_DEF__ISSTATIC:
        setIsstatic((Boolean)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__VARTYPE:
        setVartype((String)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__NAME:
        setName((String)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__ISTYPED:
        setIstyped((Boolean)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__TYPE:
        setType((VariableType)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__ISINIT:
        setIsinit((Boolean)newValue);
        return;
      case ADSLPackage.VARIABLE_DEF__EXPRESSION:
        setExpression((Expression)newValue);
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
      case ADSLPackage.VARIABLE_DEF__ISSTATIC:
        setIsstatic(ISSTATIC_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_DEF__VARTYPE:
        setVartype(VARTYPE_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_DEF__ISTYPED:
        setIstyped(ISTYPED_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_DEF__TYPE:
        setType((VariableType)null);
        return;
      case ADSLPackage.VARIABLE_DEF__ISINIT:
        setIsinit(ISINIT_EDEFAULT);
        return;
      case ADSLPackage.VARIABLE_DEF__EXPRESSION:
        setExpression((Expression)null);
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
      case ADSLPackage.VARIABLE_DEF__ISSTATIC:
        return isstatic != ISSTATIC_EDEFAULT;
      case ADSLPackage.VARIABLE_DEF__VARTYPE:
        return VARTYPE_EDEFAULT == null ? vartype != null : !VARTYPE_EDEFAULT.equals(vartype);
      case ADSLPackage.VARIABLE_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ADSLPackage.VARIABLE_DEF__ISTYPED:
        return istyped != ISTYPED_EDEFAULT;
      case ADSLPackage.VARIABLE_DEF__TYPE:
        return type != null;
      case ADSLPackage.VARIABLE_DEF__ISINIT:
        return isinit != ISINIT_EDEFAULT;
      case ADSLPackage.VARIABLE_DEF__EXPRESSION:
        return expression != null;
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
    result.append(" (isstatic: ");
    result.append(isstatic);
    result.append(", vartype: ");
    result.append(vartype);
    result.append(", name: ");
    result.append(name);
    result.append(", istyped: ");
    result.append(istyped);
    result.append(", isinit: ");
    result.append(isinit);
    result.append(')');
    return result.toString();
  }

} //VariableDefImpl
