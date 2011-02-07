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

import java.util.HashSet;

class Sprache extends Talent {

	/**
	 *  Die Komplexität bis zu der die Sprache gesteigert werden kann.
	 */
	int komplexitaet;

	/**
	 *  Die Sprachfamilie der Sprache. 
	 */
	Sprachfamilie sprachfamilie

	static hasMany = [schriften:Schrift]

	Sprache() {
		talentGruppe = TalentGruppe.SPRACHEN
		typ = Talent.Typ.SPEZIAL
	}

	static constraints = {
		komplexitaet(min:0,max:30)
		sprachfamilie(nullable:true)
	}
}
