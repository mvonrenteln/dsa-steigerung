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
package dsa.historie



class Spieleinheit {

	String titel

	String beschreibung

	List ap

	List ze

	List se

	static hasMany = [ap:AP, ze:ZE, se:SE]

	static constraints = { titel(nullable:false) }

	static mapping = { tablePerHierarchy false }
}