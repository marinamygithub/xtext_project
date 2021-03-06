/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.New#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.New#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getNew()
 * @model
 * @generated
 */
public interface New extends Expression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(VariableType)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getNew_Type()
   * @model containment="true"
   * @generated
   */
  VariableType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.New#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(VariableType value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.aDSL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getNew_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // New
