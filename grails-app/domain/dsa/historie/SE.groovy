package dsa.historie


import dsa.held.Charakteristik;
import dsa.held.Held;

class SE {
	
	Charakteristik ziel
	
	static hasMany = [helden:Held]
	
	String grund
	
	static constraints = {
		ziel(nullable:false)
		helden(minSize:1)
	}
}
