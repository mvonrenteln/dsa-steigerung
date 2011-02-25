package dsa.held

import grails.test.*

class SonderfertigkeitTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testMerkmalskenntnis() {
		for (merkmal in Merkmal) {
			assert merkmal.kosten > 99
		}
    }
}
