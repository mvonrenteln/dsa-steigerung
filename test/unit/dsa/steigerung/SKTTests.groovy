package dsa.steigerung


import java.util.EnumSet;

import grails.test.*

class SKTTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testAktivierungsfaktorIsKosten0() {
		for (SKT skt : EnumSet.allOf(SKT)) {
			assertEquals "Erwarte $skt.aktivierungsfaktor * 5 = $skt.kosten[0]", skt.aktivierungsfaktor*5, skt.kosten[0]
		}
    }
	
	void testSize() {
		for (SKT skt : EnumSet.allOf(SKT)) {
			assertEquals 32, skt.kosten.size()
		}
	}
	
	void testGetAt() {
		for (SKT skt : EnumSet.allOf(SKT)) {
			31.each { 
				assertEquals skt[it], skt.kosten[it]
			}
		}
	}
	
	void testPlus() {
		assertEquals SKT.B, SKT.A + 1
		assertEquals "Erwarte, dass H + 1 = H", SKT.H, SKT.H + 1
		
	}
	
	void testMinus() {
		assertEquals SKT.A, SKT.B - 1
		assertEquals "Erwarte, dass A* - 1 = A*", SKT.A_STERN, SKT.A_STERN - 1
		
	}
	
	void testGetAtPlus() {
		assertEquals SKT.B[0], (SKT.A + 1)[0]
	}
}
