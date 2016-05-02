/**
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1.aDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.Reference#getBase <em>Base</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.Reference#isIsarray <em>Isarray</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.aDSL.Reference#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Expression
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(VarDef)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getReference_Base()
   * @model
   * @generated
   */
  VarDef getBase();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.Reference#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(VarDef value);

  /**
   * Returns the value of the '<em><b>Isarray</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isarray</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isarray</em>' attribute.
   * @see #setIsarray(boolean)
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getReference_Isarray()
   * @model
   * @generated
   */
  boolean isIsarray();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.aDSL.Reference#isIsarray <em>Isarray</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Isarray</em>' attribute.
   * @see #isIsarray()
   * @generated
   */
  void setIsarray(boolean value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.aDSL.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.mydsl1.aDSL.ADSLPackage#getReference_Params()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParams();

} // Reference