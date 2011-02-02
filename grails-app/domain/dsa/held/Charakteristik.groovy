package dsa.held


class Charakteristik {

	String name
	
    static constraints = {
		name(unique:true, nullable:false, blank:false)
    }
	
	static mapping = {
		tablePerHierarchy false
	}
}
