package dsa.held

class Charakteristikwert {
	
	Charakteristik ref

	/**
	 * Der Bonus, der durch die Rasse gewährt wird.	
	 */
	int rassenBonus = 0
	
	/**
	 * Der Bonus, der durch die Kultur gewährt wird.
	 */
	int kulturBonus = 0
	
	/**
	 * Der Bonus, der durch die Profession(en) gewährt wird.
	 */
	int professionsBonus = 0
	
	/**
	 * Der Basiswert, der sich nach Aufsummierung der Boni ergibt.
	 */
	int basis = 0

	/**
	 * Der Wert, mit dem der Held nach der Erschaffung ins Abenteuerleben startet.
	 */
	int start = 0
	
	/**
	 * Der aktuelle Wert.
	 */
	int wert = 0
	
	static belongsTo = Held
	
	public String toString() {
		return ref?.name
	}

    static constraints = {
		rassenBonus(nullable:false, min:-10, max:+10)
		kulturBonus(nullable:false, min:-10, max:+10)
		professionsBonus(nullable:false, min:-10, max:+10)
		basis(nullable:false, min:-30, max:+40)
		start(nullable:false, min:-30, max:+40)
    }
}
