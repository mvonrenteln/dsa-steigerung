package dsa.held

import dsa.Quelle;
import dsa.steigerung.SKT;
import dsa.util.EnumHelper;


class Talent extends Charakteristik {

	enum Typ {
		BASIS, SPEZIAL, META, GABE, RITUALKENNTNIS

		final String name

		private Typ() {
			this.name = EnumHelper.enumToString(this)
		}

		String toString() {
			return name
		}
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
