package dsa

import java.util.SortedSet;

class Kapitel extends Spieleinheit {
	
	SortedSet abende
	
	static hasMany = [abende:Spielabend]
	
}
