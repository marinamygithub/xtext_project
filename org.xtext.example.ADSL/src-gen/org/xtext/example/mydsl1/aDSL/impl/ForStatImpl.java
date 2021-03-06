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
import org.xtext.example.mydsl1.aDSL.Block;
import org.xtext.example.mydsl1.aDSL.Expression;
import org.xtext.example.mydsl1.aDSL.ForStat;
import org.xtext.example.mydsl1.aDSL.VariableDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.ForStatImpl#getTemp <em>Temp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.ForStatImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.ForStatImpl#getFinalexp <em>Finalexp</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.impl.ForStatImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatImpl extends StatementImpl implements ForStat
{
  /**
   * The cached value of the '{@link #getTemp() <em>Temp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemp()
   * @generated
   * @ordered
   */
  protected VariableDef temp;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getFinalexp() <em>Finalexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalexp()
   * @generated
   * @ordered
   */
  protected Expression finalexp;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Block body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatImpl()
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
    return ADSLPackage.Literals.FOR_STAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDef getTemp()
  {
    return temp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemp(VariableDef newTemp, NotificationChain msgs)
  {
    VariableDef oldTemp = temp;
    temp = newTemp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__TEMP, oldTemp, newTemp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemp(VariableDef newTemp)
  {
    if (newTemp != temp)
    {
      NotificationChain msgs = null;
      if (temp != null)
        msgs = ((InternalEObject)temp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__TEMP, null, msgs);
      if (newTemp != null)
        msgs = ((InternalEObject)newTemp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__TEMP, null, msgs);
      msgs = basicSetTemp(newTemp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__TEMP, newTemp, newTemp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFinalexp()
  {
    return finalexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinalexp(Expression newFinalexp, NotificationChain msgs)
  {
    Expression oldFinalexp = finalexp;
    finalexp = newFinalexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__FINALEXP, oldFinalexp, newFinalexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinalexp(Expression newFinalexp)
  {
    if (newFinalexp != finalexp)
    {
      NotificationChain msgs = null;
      if (finalexp != null)
        msgs = ((InternalEObject)finalexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__FINALEXP, null, msgs);
      if (newFinalexp != null)
        msgs = ((InternalEObject)newFinalexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__FINALEXP, null, msgs);
      msgs = basicSetFinalexp(newFinalexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__FINALEXP, newFinalexp, newFinalexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Block newBody, NotificationChain msgs)
  {
    Block oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Block newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ADSLPackage.FOR_STAT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ADSLPackage.FOR_STAT__BODY, newBody, newBody));
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
      case ADSLPackage.FOR_STAT__TEMP:
        return basicSetTemp(null, msgs);
      case ADSLPackage.FOR_STAT__CONDITION:
        return basicSetCondition(null, msgs);
      case ADSLPackage.FOR_STAT__FINALEXP:
        return basicSetFinalexp(null, msgs);
      case ADSLPackage.FOR_STAT__BODY:
        return basicSetBody(null, msgs);
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
      case ADSLPackage.FOR_STAT__TEMP:
        return getTemp();
      case ADSLPackage.FOR_STAT__CONDITION:
        return getCondition();
      case ADSLPackage.FOR_STAT__FINALEXP:
        return getFinalexp();
      case ADSLPackage.FOR_STAT__BODY:
        return getBody();
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
      case ADSLPackage.FOR_STAT__TEMP:
        setTemp((VariableDef)newValue);
        return;
      case ADSLPackage.FOR_STAT__CONDITION:
        setCondition((Expression)newValue);
        return;
      case ADSLPackage.FOR_STAT__FINALEXP:
        setFinalexp((Expression)newValue);
        return;
      case ADSLPackage.FOR_STAT__BODY:
        setBody((Block)newValue);
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
      case ADSLPackage.FOR_STAT__TEMP:
        setTemp((VariableDef)null);
        return;
      case ADSLPackage.FOR_STAT__CONDITION:
        setCondition((Expression)null);
        return;
      case ADSLPackage.FOR_STAT__FINALEXP:
        setFinalexp((Expression)null);
        return;
      case ADSLPackage.FOR_STAT__BODY:
        setBody((Block)null);
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
      case ADSLPackage.FOR_STAT__TEMP:
        return temp != null;
      case ADSLPackage.FOR_STAT__CONDITION:
        return condition != null;
      case ADSLPackage.FOR_STAT__FINALEXP:
        return finalexp != null;
      case ADSLPackage.FOR_STAT__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatImpl
