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

import dsa.held.Charakteristik;
import dsa.held.Held;
import dsa.historie.Spieleinheit;

/**
 * Eine Steigerung stellt die Änderung eines 
 * Talent/Zauber/Eigenschafts-Wertes von einem bestimmten
 * Wert auf einen neuen Wert dar oder den Zukauf einer Sonderfertigkeit
 * 
 * Steigerungen sind einem Helden zugeordnet und sortiert. Es lässt
 * sich also auch später genau die Reihenfolge von Steigerungen
 * nachvollziehen und ggf. nachrechnen.
 * 
 * Die Kosten einer Steigerung werden nicht dynamisch berechnet, sondern
 * in der Steigerung gespeichert. Dies hat zwei Gründe: Erstens ist die
 * Reihenfolge der Steigerungen ausschlaggebend, so sind z.B. die Kosten
 * für eine Steigerung eines Zaubers teurer, bevor man sich ein passendes
 * Merkmal geholt hat. Hierdurch werden die früheren Steigerungen nicht
 * modifiziert. Deswegen müsste man für eine dynamiche Berechnung stets
 * die gesamte Abfolge der Steigerungen analysieren. Zweitens soll den
 * Spielern die Möglcihkeit gegeben werden, die Kosten anzupassen. Dies 
 * trägt Hausregeln und Sonderabreden in Einzelfällen Rechnung.
 * 
 * @author marcvonrenteln
 *
 */
class Steigerung {

	/**
	 * Charakterwert, der gesteigert wird.
	 */
	Charakteristik charakteristik

	/**
	 * Startwert der Steigerung (Kosten fallen also erstmals für 
	 * von+1 an). 
	 */
	int von

	/**
	 * Wert, bis zu dem die Steigerung erfolgt ist.
	 */
	int nach

	/**
	 * Die Lernmethode mit der diese Steigerung erfolgt ist.
	 */
	Lernmethode lernmethode

	/**
	 * Die Gesamtkosten nach Berücksichtigung von Lernmethode und Ver-
	 * günstigungen durch Sonderfähigkeiten und Vorteile des Helden.
	 */
	int kosten
	
	/**
	 * Zeigt an, ob die automatische Berechnung vom Spieler händisch 
	 * angepasst worden ist.
	 */
	boolean modifiziert = false

	/**
	 * Abenteuer/Spieleabend nach dem diese Steigerung vorgenommen wurde.
	 */
	Spieleinheit spieleeinheit

	static belongsTo = [ held: Held ]

	static constraints = {
		von(min:-7,max:30)
		nach(min:0,max:31)
		spieleeinheit(nullable:true)
	}
}
