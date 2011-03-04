package dsa.held

import grails.test.*
import dsa.Quelle

class EigenschaftTests extends GrailsUnitTestCase {
	protected void setUp() {
		super.setUp()
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testGetInstanz() {
		mockDomain(Eigenschaft)

		def mu = new Eigenschaft(kuerzel: "MU", name: "Mut", quelle: Quelle.OFFIZIELL).save(failOnError: true);

		assert Eigenschaft[Eigenschaft.Instanz.MU] == mu
	}
}
