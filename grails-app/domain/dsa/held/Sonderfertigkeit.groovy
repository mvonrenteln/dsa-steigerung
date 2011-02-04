package dsa.held

class Sonderfertigkeit extends Charakteristik {

	enum Typ {
		ALLGEMEIN ( "Allgemein" ),
		ELFENLIED ( "Elfenlied" ),
		GELAENDEKUNDE ( "Geländekunde" ),
		KAMPF ( "Kampf" ),
		KULTURKUNDE ( "Kulturkunde" ),
		MAGISCH ( "Magisch" ),
		OBJEKTRITUAL ( "Objektritual" ),
		TALENTSPEZIALISIERUNG ("Talentspezialisierung" ),
		WAFFENSPEZIALISIERUNG ( "Waffenspezialisierng" ),

		final String name

		private Typ(String name) {
			this.name = name
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
