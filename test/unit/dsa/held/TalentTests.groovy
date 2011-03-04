package dsa.held


import java.util.List;

import dsa.Quelle;
import dsa.steigerung.SKT;
import grails.test.*

class TalentTests extends GrailsUnitTestCase {
	protected void setUp() {
		super.setUp()
		mockDomain(Talent)
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testGetByTyp() {
		createTalent("Akrobatik", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [])
		createTalent("Athletik", TalentGruppe.KOERPER, Talent.Typ.BASIS, [])
		createTalent("Fliegen", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [])
		createTalent("Gaukeleien", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [])
		createTalent("Klettern", TalentGruppe.KOERPER, Talent.Typ.BASIS, [])
		createTalent("Körperbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS, [])
		
		def basisTalente = Talent.findAllByTyp(Talent.Typ.BASIS)
		assert basisTalente?.size() == 3
	}

	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, List eigenschaften) {
		def talent = new Talent(name: name, talentGruppe: talentGruppe, typ: typ, eigenschaften: eigenschaften, quelle: Quelle.OFFIZIELL)
		return talent.save(failOnError: true);
	}
}
