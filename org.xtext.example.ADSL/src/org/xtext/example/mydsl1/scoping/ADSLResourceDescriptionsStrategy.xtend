package org.xtext.example.mydsl1.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.xtext.example.mydsl1.aDSL.Program

/*
 * If you enable this strategy, the NamesAreUniqueValidator will not
 * work as expected.
 */
@Singleton
class ADSLResourceDescriptionsStrategy extends DefaultResourceDescriptionStrategy {
	
	@Inject extension IQualifiedNameProvider
	
	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Program) {
			(eObject as Program).xclass.forEach[
				XClass |
				val fullyQualifiedName = XClass.fullyQualifiedName
				if (fullyQualifiedName != null)
					acceptor.accept(
						EObjectDescription::create(
							fullyQualifiedName, XClass
						)
					)
			]
//				val fullyQualifiedName = (eObject as Program).xclass.fullyQualifiedName
//				if (fullyQualifiedName != null)
//					acceptor.accept(
//						EObjectDescription::create(
//							fullyQualifiedName, (eObject as Program).xclass
//						)
//					)
			
			
			true
		} else
			false
	}
}