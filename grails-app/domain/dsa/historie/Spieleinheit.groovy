package dsa.historie



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