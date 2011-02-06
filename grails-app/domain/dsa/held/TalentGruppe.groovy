package dsa.held

import dsa.steigerung.SKT;
import dsa.util.EnumHelper;


enum TalentGruppe {

	KAMPF(null), KOERPER(SKT.D), GESELLSCHAFT(SKT.B), NATUR(SKT.B), WISSEN(SKT.A),
	SPRACHEN(SKT.A), SCHRIFTEN(SKT.A), HANDWERK(SKT.B), GABEN(SKT.G), RITUALKENNTNIS(SKT.E)

	final String name

	SKT kosten

	TalentGruppe(SKT kosten) {
		this.kosten = kosten
		this.name = EnumHelper.enumToString(this)
	}

	String toString() {
		return name
	}
}
