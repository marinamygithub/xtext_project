/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Negative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.IntegerNegative#isIsneg <em>Isneg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.IntegerNegative#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getIntegerNegative()
 * @model
 * @generated
 */
public interface IntegerNegative extends EObject
{
  /**
   * Returns the value of the '<em><b>Isneg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isneg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isneg</em>' attribute.
   * @see #setIsneg(boolean)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getIntegerNegative_Isneg()
   * @model
   * @generated
   */
  boolean isIsneg();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.IntegerNegative#isIsneg <em>Isneg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isneg</em>' attribute.
   * @see #isIsneg()
   * @generated
   */
  void setIsneg(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getIntegerNegative_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.IntegerNegative#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntegerNegative