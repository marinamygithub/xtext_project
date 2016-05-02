package org.xtext.example.mydsl1.lib

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.xtext.example.mydsl1.aDSL.XClass
import org.xtext.example.mydsl1.scoping.ADSLIndex

import static extension org.xtext.example.mydsl1.util.ADSLUtil.*

class ADSLLib {
	@Inject Provider<ResourceSet> resourceSetProvider;
	
	@Inject extension ADSLIndex
	
	@Inject extension IQualifiedNameProvider	
	
	public val static LIB_PACKAGE = "adsl.lang"
	
	public val static LIB_OBJECT = LIB_PACKAGE + ".Object"
	
	public val static LIB_STRING = LIB_PACKAGE + ".String"
	
	public val static LIB_INTEGER = LIB_PACKAGE + ".Integer"
	
	public val static LIB_BOOLEAN = LIB_PACKAGE + ".Boolean"
	
	public val static LIB_PLACE = LIB_PACKAGE + ".Place"
	
	public val static MAIN_LIB = "adsl/lang/main.adsl"
	
	def loadLib() {
		val stream = getClass().getClassLoader().getResourceAsStream(MAIN_LIB)
		
		resourceSetProvider.get() => [
			resourceSet |
			
			val resource = resourceSet.createResource(URI::createURI(MAIN_LIB))
			resource.load(stream, resourceSet.getLoadOptions())
		]
	}
	
	def getClassHierarchyWithObject(XClass c) {
		var hierarchy = c.classHierarchy
		if (hierarchy.last?.fullyQualifiedName?.toString != LIB_OBJECT) {
			val adslObjectClass = getADSLObjectClass(c)
			if (adslObjectClass != null)
				hierarchy += adslObjectClass
		}
		hierarchy
	}

	def getSuperclassOrObject(XClass c) {
		c.superclass ?: getADSLObjectClass(c)
	}

	def getADSLObjectClass(EObject context) {
		val desc = context.getVisibleClassesDescriptions.findFirst[
			qualifiedName.toString == LIB_OBJECT]
		
		if (desc == null)
			return null
		
		var o = desc.EObjectOrProxy
		if (o.eIsProxy)
			o = context.eResource.resourceSet.getEObject(desc.EObjectURI, true)
		
		o as XClass
	}

}
