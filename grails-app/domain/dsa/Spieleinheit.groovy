package dsa

abstract class Spieleinheit {
	
	String titel
	
	String beschreibung
	
	List ap
	
	List ze
	
	List se
	
	static hasMany = [ap:AP, ze:ZE, se:SE]

    static constraints = {
		titel(nullable:false)
    }
	
	static mapping = {
		tablePerHierarchy false
	}
	
}


class SE {
	
	Charakteristik ziel
	
	static hasMany = [helden:Held]
	
	String grund
	
	static constraints = {
		ziel(nullable:false)
		helden(minSize:1)
	}
}

class AP {
	
	int aps
	
	String grund
	
}

class ZE {
	
	int zes
	
	static hasMany = [helden:Held]
	
	String einschraenkung
	
	static constraints = {
		zes(min:1)
		helden(minSize:1)
	}
}