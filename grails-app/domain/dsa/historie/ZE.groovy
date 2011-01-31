package dsa.historie


import dsa.held.Held;

class ZE {
	
	int zes
	
	static hasMany = [helden:Held]
	
	String einschraenkung
	
	static constraints = {
		zes(min:1)
		helden(minSize:1)
	}
}
