package dsa.held

import dsa.Quelle;
import dsa.steigerung.SKT;


class Talent extends Charakteristik {
	
	enum Typ {
		BASIS, SPEZIAL, BERUF, META, GABE, RITUALKENNTNIS
	}
	
	Typ typ
	
	TalentGruppe talentGruppe
	
	Quelle quelle
	
	SKT kosten
	
	SKT getKosten() {
		return kosten ?: talentGruppe?.kosten
	}

    static constraints = {
    	typ(nullable:false)
    	talentGruppe(nullable:false)
    	quelle(nullable:false)
		kosten(nullable:true)
    }
}
