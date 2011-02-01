package dsa.held



class Talent extends Charakteristik {
	
	enum Typ {
		BASIS, SPEZIAL, BERUF, META
	}
	
	Typ typ
	
	TalentGruppe talentGruppe

    static constraints = {
    }
}
