package dsa.held

import dsa.util.EnumHelper

class Sonderfertigkeit extends Charakteristik {

	enum Typ {
		ALLGEMEIN, KAMPF, WAFFENLOSER_KAMPF, GELAENDEKUNDE,
		RITUAL, MAGISCH, OBJEKTRITUAL,
		GEWEIHT

		final String name

		private Typ() {
			this.name = EnumHelper.enumToString(this)
		}

		String toString() {
			return name
		}
	}

	int kosten

	Typ typ

	static constraints = {
		kosten(min:0)
		typ(nullable:false)
	}
}
