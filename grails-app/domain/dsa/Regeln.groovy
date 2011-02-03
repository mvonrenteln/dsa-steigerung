package dsa

import dsa.held.Charakteristik;

class Regeln {

	public static final Regeln DSA4 = new Regeln("DSA 4")
	public static final Regeln DSA4_1 = new Regeln("DSA 4.1")

	protected Regeln() {
	}

	private Regeln(String name) {
		this.name = name
	}

	String name

	static hasMany = [charakteristiken: Charakteristik]

	static constraints = { name(maxLength:10) }

	String toString() {
		return name
	}
}
