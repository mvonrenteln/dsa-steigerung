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

package dsa.util

import org.apache.commons.lang.WordUtils

class EnumHelper {

	public static String enumToString(def instance) {
		def name = instance.name()?.replaceAll("_", " ")
		name = name?.replaceAll("_", " ")
		name = name?.replaceAll("AE", "Ä")
		name = name?.replaceAll("OE", "Ö")
		name = name?.replaceAll("UE", "Ü")
		return WordUtils.capitalizeFully(name)
	}
}
