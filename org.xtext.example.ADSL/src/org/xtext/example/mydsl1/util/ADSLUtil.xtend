package org.xtext.example.mydsl1.util

import org.xtext.example.mydsl1.aDSL.XClass

import static extension org.eclipse.xtext.EcoreUtil2.*
import org.xtext.example.mydsl1.aDSL.Method
import org.eclipse.emf.ecore.EObject
import org.xtext.example.mydsl1.aDSL.Program
import org.xtext.example.mydsl1.aDSL.Block
import org.xtext.example.mydsl1.aDSL.VariableDef
import org.xtext.example.mydsl1.aDSL.SharedDef

class ADSLUtil {
	
	
	def static classHierarchy(XClass c) {
		val visited = <XClass>newArrayList()

		var current = c.superclass
		while (current != null && !visited.contains(current)) {
			visited.add(current)
			current = current.superclass
		}

		visited
	}

	def static fields(XClass c) {
		c.members.filter(typeof(VariableDef))
		+ c.members.filter(typeof(SharedDef))
	}

	def static methods(XClass c) {
		c.members.filter(typeof(Method))
	}

//	def static returnStatement(Method m) {
//		m.body.statements.typeSelect(typeof(Return)).head
//	}

	def static containingXClass(EObject e) {
		e.getContainerOfType(typeof(XClass))
	}

	def static containingMethod(EObject e) {
		e.getContainerOfType(typeof(Method))
	}

	def static containingProgram(EObject e) {
		e.getContainerOfType(typeof(Program))
	}

	def static containingBlock(EObject e) {
		e.getContainerOfType(typeof(Block))
	}

//	def static memberAsString(Member m) {
//		switch (m) {
//			Field: m.name
//			Method: m.name + "(" +
//				m.paramsTypesAsString + ")"
//		}
//	}
//	
//	def static paramsTypesAsString(Method m) {
//		m.params.map[type?.name].join(", ")
//	}
//
//	def static memberAsStringWithType(Member m) {
//		m.memberAsString + " : " + m.type.name
//	}

}
