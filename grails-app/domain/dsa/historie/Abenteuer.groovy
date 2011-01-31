package dsa.historie


import java.util.SortedSet;

class Abenteuer extends Spieleinheit {
	
	List kapitel
	
	SortedSet abende
	
	static hasMany = [kapitel:Kapitel, abende:Spielabend]

}
