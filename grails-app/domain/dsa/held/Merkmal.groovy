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

	ANTIMAGIE(TYP2), BESCHWOERUNG(TYP2), DAEMONISCH(TYP3), EIGENSCHAFTEN(TYP2), EINFLUSS(TYP2), ELEMENTAR(TYP3),
	DAEMONISCH_AGRIMOTH(TYP1),DAEMONISCH_AMAZEROTH(TYP1),DAEMONISCH_ASFALOTH(TYP1),DAEMONISCH_BELHALHAR(TYP1),
	DAEMONISCH_BELZHORASH(TYP1),DAEMONISCH_BLAKHARAZ(TYP1),DAEMONISCH_LOLGRAMOTH(TYP1),DAEMONISCH_TARGUNITOTH(TYP1),
	ELEMENTAR_EIS(TYP1), ELEMENTAR_ERZ(TYP1), ELEMENTAR_FEUER(TYP1), ELEMENTAR_HUMUS(TYP1), ELEMENTAR_LUFT(TYP1), ELEMENTAR_WASSER(TYP1),
	FORM(TYP2), GEISTERWESEN(TYP1), HEILUNG(TYP1), HELLSICHT(TYP2)/*??*/, HERBEIRUFUNG(TYP1), HERRSCHAFT(TYP2), 
	ILLUSION(TYP1), KRAFT(TYP2), LIMBUS(TYP3), METAMAGIE(TYP2)/*??*/, OBJEKT(TYP2), SCHADEN(TYP1), TELEKINESE(TYP1), 
	TEMPORAL(TYP3), UMWELT(TYP2), VERSTAENDIGUNG(TYP1)

	String name
	
	int kosten
	
	private static final int TYP1 = 100
	private static final int TYP2 = 200
	private static final int TYP3 = 300

	Merkmal(int kosten) {
		this.name = EnumHelper.enumToString(this)
		this.kosten = kosten
	}

	String toString() {
		return name
	}
}
