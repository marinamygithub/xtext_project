/*
 * generated by Xtext 2.9.0
 */
package org.xtext.example.mydsl1


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ADSLStandaloneSetup extends ADSLStandaloneSetupGenerated {

	def static void doSetup() {
		new ADSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}