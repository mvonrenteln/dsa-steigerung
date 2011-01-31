package dsa.historie


import java.util.SortedSet;

class Kapitel extends Spieleinheit {
	
	SortedSet abende
	
	static hasMany = [abende:Spielabend]
	
}
