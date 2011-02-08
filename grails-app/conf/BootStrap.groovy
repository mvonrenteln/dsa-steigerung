import dsa.Quelle
import dsa.held.Eigenschaft

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

class BootStrap {

	def init = { servletContext ->

		if (!Eigenschaft.count()) {
			new Eigenschaft(kuerzel: "MU", name: "Mut", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "KL", name: "Klugheit", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "IN", name: "Intuition", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "CH", name: "Charisma", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "FF", name: "Fingerfertigkeit", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "GE", name: "Gewandtheit", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "KO", name: "Konstitution", quelle: Quelle.OFFIZIELL).save(failOnError: true);
			new Eigenschaft(kuerzel: "KK", name: "Körperkraft", quelle: Quelle.OFFIZIELL).save(failOnError: true);
		}

		environments {
			production {
				servletContext.setAttribute("env", "prod")
			}
			development {
				servletContext.setAttribute("env", "dev")
			}
		}
	}
	def destroy = {
	}
}
