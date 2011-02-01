package dsa.steigerung

import dsa.held.Held;
import dsa.historie.Spieleinheit;


class Steigerung {
	
	Steigerbar steigerbar
	
	int von
	
	int nach
	
	Lernmethode lernmethode

	Spieleinheit spieleeinheit

	static belongsTo = [ held: Held ]
	
	
    static constraints = {
		von(min:-7,max:30)
		nach(min:0,max:31)
    }
	
}
