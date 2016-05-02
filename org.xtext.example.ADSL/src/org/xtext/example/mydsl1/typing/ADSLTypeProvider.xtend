package org.xtext.example.mydsl1.typing


import org.xtext.example.mydsl1.aDSL.Expression
import org.xtext.example.mydsl1.aDSL.StringConstant
import org.xtext.example.mydsl1.aDSL.IntConstant
import org.xtext.example.mydsl1.aDSL.Reference
import org.xtext.example.mydsl1.aDSL.VarDef
import org.xtext.example.mydsl1.aDSL.VariableDef
import org.xtext.example.mydsl1.aDSL.XClass
import org.xtext.example.mydsl1.aDSL.ADSLFactory
import org.xtext.example.mydsl1.aDSL.This
import org.xtext.example.mydsl1.aDSL.BoolConstant
import org.xtext.example.mydsl1.aDSL.MemberSelection
import org.xtext.example.mydsl1.aDSL.Null
import org.xtext.example.mydsl1.aDSL.New

import static extension org.xtext.example.mydsl1.util.ADSLUtil.*

import org.xtext.example.mydsl1.aDSL.Member
import org.xtext.example.mydsl1.aDSL.SharedDef
import org.xtext.example.mydsl1.aDSL.Method
import org.xtext.example.mydsl1.aDSL.DeRef
import org.xtext.example.mydsl1.aDSL.Here
import org.xtext.example.mydsl1.aDSL.Parameter
import org.xtext.example.mydsl1.aDSL.SharedVarDef
import org.xtext.example.mydsl1.aDSL.SharedArrayDef
import org.xtext.example.mydsl1.aDSL.ADSLPackage
import com.google.inject.Inject

import org.xtext.example.mydsl1.lib.ADSLLib
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import com.google.common.base.Predicates
import org.eclipse.xtext.naming.QualifiedName

class ADSLTypeProvider {
	
	@Inject extension ADSLLib 
	
	@Inject IGlobalScopeProvider globalScopeProvider
		
	val ep = ADSLPackage::eINSTANCE
	
	public static val stringType = 
		ADSLFactory::eINSTANCE.createXClass => [name = 'String']
	public static val intType = 
		ADSLFactory::eINSTANCE.createXClass => [name = 'Boolean']
	public static val booleanType = 
		ADSLFactory::eINSTANCE.createXClass => [name = 'Integer']
	public static val nullType = 
		ADSLFactory::eINSTANCE.createXClass => [name = 'String']
	public static val placeType = 
		ADSLFactory::eINSTANCE.createXClass => [name = 'Place']
	
		
	def typeFor(Expression e) {
		switch (e) {
			This : e.containingXClass
			Reference: if (!e.isarray) e.base.switchVarType else e.base.innerType()
			New: e.type?.type
			MemberSelection: e.member.switchType
			DeRef: e.ref.innerType()
			Null: nullType
			StringConstant: stringType
			IntConstant: intType
			BoolConstant: booleanType
			Here : e.here
		}
	}
	
	def XClass getHere(EObject e) {
		var result = globalScopeProvider.getScope(e.eResource, EcoreFactory.eINSTANCE.createEReference => [EType = ADSLPackage.Literals.XCLASS] , Predicates.alwaysTrue).getSingleElement(QualifiedName.create("Place")).EObjectOrProxy as XClass
		return EcoreUtil.resolve(result, e.eResource.resourceSet) as XClass
	}
	
	def innerType(VarDef v) {
		switch(v) {
			VariableDef: v.type?.innerType.type
			SharedArrayDef: v.type?.innerType.type
			default: nullType
		}		
	}
	
	def switchVarType(VarDef v) {		
		switch(v) {
			VariableDef : v.type?.type
			XClass : v
			Parameter: v.type?.type
			SharedVarDef: v.type?.type
			SharedArrayDef: v.type?.type
			default : nullType			
		}		
	}
	
	def switchType(Member m) {		
		switch(m) {			
			VariableDef : m.type?.type
			SharedDef : m.type?.type
			Method : m.type?.type
			default : nullType				
		}		
	}
	
}