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



class Eigenschaft extends Charakteristik {

	public static final Eigenschaft MU = new Eigenschaft(kuerzel: "MU", name: "Mut")
	public static final Eigenschaft KL = new Eigenschaft(kuerzel: "KL", name: "Klugheit")
	public static final Eigenschaft IN = new Eigenschaft(kuerzel: "IN", name: "Intuition")
	public static final Eigenschaft CH = new Eigenschaft(kuerzel: "CH", name: "Charisma")
	public static final Eigenschaft FF = new Eigenschaft(kuerzel: "FF", name: "Fingerfertigkeit")
	public static final Eigenschaft GE = new Eigenschaft(kuerzel: "GE", name: "Gewandtheit")
	public static final Eigenschaft KO = new Eigenschaft(kuerzel: "KO", name: "Konstitution")
	public static final Eigenschaft KK = new Eigenschaft(kuerzel: "KK", name: "Körperkraft")

	String kuerzel

	static constraints = {
	}
}
