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
package dsa.held

import dsa.util.EnumHelper;

enum Merkmal {

	ANTIMAGIE(200), BESCHWOERUNG(200), DAEMONISCH(300), EIGENSCHAFTEN(200), EINFLUSS(200), ELEMENTAR(300),
	DAEMONISCH_AGRIMOTH(100),DAEMONISCH_AMAZEROTH(100),DAEMONISCH_ASFALOTH(100),DAEMONISCH_BELHALHAR(100),
	DAEMONISCH_BELZHORASH(100),DAEMONISCH_BLAKHARAZ(100),DAEMONISCH_LOLGRAMOTH(100),DAEMONISCH_TARGUNITOTH(100),
	ELEMENTAR_EIS(100), ELEMENTAR_ERZ(100), ELEMENTAR_FEUER("Elementar Feuer", 100), ELEMENTAR_HUMUS(100), ELEMENTAR_LUFT(100), ELEMENTAR_WASSER(100),
	FORM(200), GEISTERWESEN(100), HEILUNG(100), HELLSICHT(200)/*??*/, HERBEIRUFUNG(100), HERRSCHAFT(200), 
	ILLUSION(100), KRAFT(200), LIMBUS(300), METAMAGIE(200)/*??*/, OBJEKT(200), SCHADEN(100), TELEKINESE(100), 
	TEMPORAL(300), UMWELT(200), VERSTAENDIGUNG(100)

	String name
	
	int kosten
	
	Merkmal(int kosten) {
		this.name = EnumHelper.enumToString(this)
		this.kosten = kosten
	}
	
	Merkmal(String name, int kosten) {
		this.name = name
		this.kosten = kosten
	}

	String toString() {
		return name
	}
}
