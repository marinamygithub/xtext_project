/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Array Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.SharedArrayDef#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getSharedArrayDef()
 * @model
 * @generated
 */
public interface SharedArrayDef extends SharedDef
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' reference.
   * @see #setExpression(VariableDef)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getSharedArrayDef_Expression()
   * @model
   * @generated
   */
  VariableDef getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.SharedArrayDef#getExpression <em>Expression</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(VariableDef value);

} // SharedArrayDef
