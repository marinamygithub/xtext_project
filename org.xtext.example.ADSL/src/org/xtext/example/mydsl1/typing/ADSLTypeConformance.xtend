package org.xtext.example.mydsl1.typing

import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.example.mydsl1.lib.ADSLLib


import static org.xtext.example.mydsl1.typing.ADSLTypeProvider.*

import static extension org.xtext.example.mydsl1.util.ADSLUtil.*
import org.xtext.example.mydsl1.aDSL.XClass

class ADSLTypeConformance {
	
	@Inject extension IQualifiedNameProvider
	
	def isConformant(XClass c1, XClass c2) {
		c1 == nullType || // null can be assigned to everything
		(conformToLibraryTypes(c1, c2)) ||
		c1 == c2 ||
		c2.fullyQualifiedName.toString == ADSLLib::LIB_OBJECT ||
		c1.isSubclassOf(c2)
	}

	def conformToLibraryTypes(XClass c1, XClass c2) {
		(c1.conformsToString && c2.conformsToString) ||
		(c1.conformsToInt && c2.conformsToInt) ||
		(c1.conformsToBoolean && c2.conformsToBoolean)
	}

	def conformsToString(XClass c) {
		c == stringType ||
		c.fullyQualifiedName.toString == ADSLLib::LIB_STRING
	}

	def conformsToInt(XClass c) {
		c == intType ||
		c.fullyQualifiedName.toString == ADSLLib::LIB_INTEGER
	}

	def conformsToBoolean(XClass c) {
		c == booleanType ||
		c.fullyQualifiedName.toString == ADSLLib::LIB_BOOLEAN
	}

	def isSubclassOf(XClass c1, XClass c2) {
		c1.classHierarchy.contains(c2)
	}

}
