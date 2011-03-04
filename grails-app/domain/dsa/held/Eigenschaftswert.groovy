package dsa.held

class Eigenschaftswert extends Charakteristikwert {
	
	Eigenschaft eigenschaft
	
    static constraints = {
		eigenschaft(nullable:false)
    }
}
