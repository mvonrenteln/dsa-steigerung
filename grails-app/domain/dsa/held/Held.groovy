package dsa.held


import dsa.steigerung.Steigerung;

class Held {

	String name
	
	List steigerungen
	
	static hasMany = [steigerungen : Steigerung]
	
    static constraints = {
    }
}
