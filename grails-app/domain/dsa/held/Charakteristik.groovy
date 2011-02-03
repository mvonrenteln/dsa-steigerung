package dsa.held


class Charakteristik {

	String name

	String beschreibung

	static constraints = {
		name(unique:true, nullable:false, blank:false, maxLength:30)
		beschreibung(nullable:true, maxLength:255)
	}

	static mapping = { tablePerHierarchy false }

	String toString() {
		return name
	}
}
