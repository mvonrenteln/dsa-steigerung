/**
 *  DSA-Steigerung an inofficial fan project based on content of the  
 *  german roleplaying game Das Schwarze Auge ® (DSA) (The Black Eye) 
 *  owned by Ulisses Medien & Spiel Distribution GmbH.
 *  
 *  Copyright (C) 2011  Marc von Renteln (Code)
 *  Copyright (C) 2007  Ulisses Medien & Spiel Distribution GmbH (Rules)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dsa.steigerung


import java.util.Map;

enum SKT {
	
	
	//Spaltenname,AKT,   0,  1,   2,   3,   4,   5,   6,   7,   8,   9,  10,  11,  12,  13,  14,  15,  16,  17,  18,  19,  20,  21,  22,  23,  24,  25,  26,  27,  28,  29,  30,   31
	A_STERN ("A*", 1, [  5,  1,   1,   1,   2,   4,   5,   6,   8,   9,  11,  12,  14,  15,  17,  19,  20,  22,  24,  25,  27,  29,  31,  32,  34,  36,  38,  40,  42,  43,  45,   48].asImmutable()),
	A (      "A",  1, [  5,  1,   2,   3,   4,   6,   7,   8,  10,  11,  13,  14,  16,  17,  19,  21,  22,  24,  26,  27,  29,  31,  33,  34,  36,  38,  40,  42,  44,  45,  47,   50].asImmutable()),
	B (      "B",  2, [ 10,  2,   4,   6,   8,  11,  14,  17,  19,  22,  25,  28,  32,  35,  38,  41,  45,  48,  51,  55,  58,  62,  65,  69,  73,  76,  80,  84,  87,  91,  95,  100].asImmutable()),	
	C (      "C",  3, [ 15,  2,   6,   9,  13,  17,  21,  25,  29,  34,  38,  43,  47,  51,  55,  60,  65,  70,  75,  80,  85,  95, 100, 105, 110, 115, 120, 125, 130, 135, 140,  150].asImmutable()),
	D (      "D",  4, [ 20,  3,   7,  12,  17,  22,  27,  33,  39,  45,  50,  55,  65,  70,  75,  85,  90,  95, 105, 110, 115, 125, 130, 140, 145, 150, 160, 165, 170, 180, 190,  200].asImmutable()),
	E (      "E",  5, [ 25,  4,   9,  15,  21,  28,  34,  41,  48,  55,  65,  70,  80,  85,  95, 105, 110, 120, 130, 135, 145, 155, 165, 170, 180, 190, 200, 210, 220, 230, 240,  250].asImmutable()),
	F (      "F",  8, [ 40,  6,  14,  22,  32,  41,  50,  60,  75,  85,  95, 105, 120, 130, 140, 155, 165, 180, 195, 210, 220, 230, 250, 260, 270, 290, 300, 310, 330, 340, 350,  375].asImmutable()),
	G (      "G", 10, [ 50,  8,  18,  30,  42,  55,  70,  85,  95, 110, 125, 140, 160, 175, 190, 210, 220, 240, 260, 270, 290, 310, 330, 340, 360, 380, 400, 420, 440, 460, 480,  500].asImmutable()),
	H (      "H", 20, [100, 16,  35,  60,  85, 110, 140, 165, 195, 220, 250, 280, 320, 350, 380, 410, 450, 480, 510, 550, 580, 620, 650, 690, 720, 760, 800, 830, 870, 910, 950, 1000].asImmutable()),
//	NONE ("NONE",  0, [  0,  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,    0].asImmutable())
	
	
	SKT(String name, def aktivierungsfaktor, def kosten) {
		this.name = name
		this.aktivierungsfaktor = aktivierungsfaktor
		this.kosten = kosten
	}
	
	int aktivierungsfaktor
	
	List kosten
	
	String name
	
	private static final Map index = [:]
	
	
	SKT minus(def minus) {
		if (minus instanceof Number) {
			initIndex()
			return index[this.ordinal()-minus] ?: this
		}
	}
	
	SKT plus(def plus) {
		if (plus instanceof Number) {
			initIndex()
			return index[this.ordinal()+plus] ?: this
		}
	}
	
	int getAt(def id) {
		return kosten[id]
	}
	
	void initIndex() {
		if (index.isEmpty()) {
			for (SKT skt : EnumSet.allOf(SKT)) {
				index.put(skt.ordinal(), skt)
			}
		}
	}
	
	public String toString() {
		return name
	}
}
