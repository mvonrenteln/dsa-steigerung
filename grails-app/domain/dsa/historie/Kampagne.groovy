package dsa.historie


import java.util.SortedSet;

class Kampagne {
	
	String titel
	
	List abenteuer
	
	static hasMany = [abenteuer:Abenteuer]

}
