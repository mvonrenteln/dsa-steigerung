package dsa.historie


class Spielabend extends Spieleinheit implements Comparable<Spielabend> {

	Date datum
	
	int compareTo(o) {
		return datum > o.datum ? 1 : -1
	}
	
    static constraints = {
		datum(nullable:false)
    }
}
