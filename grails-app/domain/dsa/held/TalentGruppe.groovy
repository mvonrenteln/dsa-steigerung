package dsa.held

import dsa.steigerung.SKT;


enum TalentGruppe {
	
	KAMPF(null), KOERPER(SKT.D), GESELLSCHAFT(SKT.B), NATUR(SKT.B), WISSEN(SKT.A), 
	SPRACHEN(SKT.A), SCHRIFTEN(SKT.A), HANDWERK(SKT.B), GABEN(SKT.G), RITUALKENNTNIS(SKT.E)
	
	TalentGruppe(SKT kosten) {
		this.kosten = kosten
	}
	
	SKT kosten
}
