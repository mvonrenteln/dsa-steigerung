package dsa.held

import java.util.HashSet;

class Sprache extends Talent {

	/**
	 *  Die Komplexität bis zu der die Sprache gesteigert werden kann.
	 */
	int komplexitaet;

	/**
	 *  Die Sprachfamilie der Sprache. 
	 */
	Sprachfamilie sprachfamilie

	static hasMany = [schriften:Schrift]

	Sprache() {
		talentGruppe = TalentGruppe.SPRACHEN
		typ = Talent.Typ.SPEZIAL
	}

	static constraints = {
		komplexitaet(min:0,max:30)
		sprachfamilie(nullable:true)
	}
}
