package dsa.historie


import dsa.historie.Spielabend;
import grails.test.*

class SpielabendTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testValidation() {
		mockDomain(Spielabend)
		
		Spielabend abend = new Spielabend()
		
		assertFalse "Sollte ohne datum nicht gehen", abend.validate()
		
		assertEquals "nullable", abend.errors.datum
    }
}
