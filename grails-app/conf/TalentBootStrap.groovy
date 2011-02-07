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

import dsa.Quelle
import dsa.Regeln;
import dsa.held.Charakteristik;
import dsa.held.Schrift
import dsa.held.Sprache
import dsa.held.Talent
import dsa.held.TalentGruppe
import dsa.steigerung.SKT

class TalentBootStrap {

	def init = { servletContext ->

		if (!Talent.count()) {

			/*
			 * Kampf-TALENTE
			 */
			createTalent("Anderthalbhänder", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Armbrust", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Belagerungswaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Blasrohr", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Bogen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Diskus", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Dolche", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Fechtwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Infanteriewaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL,  SKT.D)

			createTalent("Kettenstäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Kettenwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Lanzenreiten", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Peitsche", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Raufen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Ringen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Säbel", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Schleuder", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Schwerter", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Speere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Stäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Wurfbeile", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Wurfmesser", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Wurfspeere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Zweihandflegel", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Zweihand-Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)


			createTalent("Zweihandschwerter/-säbel", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			/*
			 * KOERPERLICHE TALENTE
			 */
			createTalent("Akrobatik", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Athletik", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Fliegen", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Gaukeleien", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Klettern", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Körperbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Reiten", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Schleichen", TalentGruppe.KOERPER, Talent.Typ.BASIS);

			createTalent("Schwimmen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Selbstbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Sich Verstecken", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Singen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Sinnenschärfe", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Skifahren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Stimmen Imitieren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Tanzen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Taschendiebstahl", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Zechen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			/*
			 * GESELLSCHAFTLICHE TALENTE
			 */
			createTalent("Betören", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Etikette", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Gassenwissen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Lehren", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Menschenkenntnis", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS)

			createTalent("Schauspielerei", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Schriftlicher Ausdruck", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Sich Verkleiden", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Überreden", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS)

			createTalent("Überzeugen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			/*
			 * NATUR-TALENTE
			 */
			createTalent("Fährtensuchen", TalentGruppe.NATUR, Talent.Typ.BASIS)

			createTalent("Fallenstellen", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Fesseln/Entfesseln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Fischen/Angeln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Orientierung", TalentGruppe.NATUR, Talent.Typ.BASIS)

			createTalent("Wettervorhersage", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Wildnisleben", TalentGruppe.NATUR, Talent.Typ.BASIS)

			/*
			 * WISSENS-TALENTE
			 */
			createTalent("Anatomie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Baukunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Brettspiel", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geschichtswissen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Gesteinskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Götter/Kulte", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Heraldik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Hüttenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Kriegskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Kryptographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Magiekunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Mechanik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Pflanzenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Philosophie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Rechnen", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Rechtskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Sagen/Legenden", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Schätzen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Sprachenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Staatskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Sternkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Tierkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			/*
			 * SPRACHEN
			 */
			createSprache("Alaani", 21)

			createSprache("Altes Kemi", 18)

			createSprache("Angram", 21);

			createSprache("Asdharia", 24, SKT.B);

			createSprache("Atak", 12)

			createSprache("Aureliani", 21)

			createSprache("Bosparano", 21)

			createSprache("Drachisch", 21) // nur unter Magie-Einsatz

			createSprache("Ferkina", 16)

			createSprache("Füchsisch", 12)

			createSprache("Garethi", 18)

			createSprache("Goblinisch", 12)

			createSprache("Grolmisch", 17)

			createSprache("Hjaldingsch", 18)

			createSprache("Isdira", 21)

			createSprache("Koboldisch", 15) // nur unter Magie-Einsatz

			createSprache("Mahrisch", 20)

			// Zusammenfassung von Waldmenschen-Sprachen (Tocamuyac, Puka-Puka)
			createSprache("Mohisch", 15)

			createSprache("Molochisch", 17)

			createSprache("Neckergesang", 24) // nur unter Magie-Einsatz

			createSprache("Nujuka", 15)

			createSprache("Oloarkh", 10)

			createSprache("Ologhaijan", 15)

			createSprache("Rabensprache", 15)

			createSprache("Rissoal", 20)

			createSprache("Rogolan", 21)

			createSprache("Rssahh", 18)

			createSprache("Ruuz", 18)

			createSprache("Thorwalsch", 18)

			createSprache("Trollisch", 15)

			createSprache("Tulamidya", 18)

			createSprache("UrTulamidya", 21)

			createSprache("Z'Lit", 17)

			createSprache("Zelemja", 18)

			createSprache("Zhayad", 15)

			createSprache("Zhulchammaqra", 15)

			createSprache("Zyklopäisch", 18)

			/*
			 *  SCHRIFTEN
			 */
			createSchrift("Altes Alaani", 18)

			createSchrift("Altes Kemi Schrift", 21)

			createSchrift("Amulashtra modern", 11)

			createSchrift("Amulashtra historisch", 17)

			createSchrift("Angram-Glyphen", 21)

			createSchrift("Arkanil", 24, SKT.C) //Rohalsschrift

			createSchrift("Chrmk", 18); //Zelemja

			createSchrift("Chuchas", 18, SKT.B); //Proto-Zelemja, Yash-Hualay-Glyphen

			createSchrift("Drakhard-Glyphen", 9)

			createSchrift("Drakned-Glyphen", 15, SKT.B)

			createSchrift("Geheiligte Glyphen von Unau", 13)

			createSchrift("Gimaril", 10)

			createSchrift("Gjalskische Runen", 14)

			createSchrift("Hjaldingsche Runen", 10)

			createSchrift("Imperiale Zeichen", 12) //Alt-Güldenländisch

			createSchrift("Isdira Lautschrift", 15)

			createSchrift("Asdharia Lautschrift", 18)

			createSchrift("Kusliker Zeichen", 10)

			createSchrift("Mahrische Glyphen", 15, SKT.B)

			createSchrift("Nanduria", 10)

			createSchrift("Rogolan-Runen", 11)

			createSchrift("Trollische Raumbilderschrift", 24, SKT.C)

			createSchrift("Tulamidya Silbenzeichen", 14)

			createSchrift("Ur-Tulamidya Silbenzeichen", 16)

			createSchrift("Zhayad Schrift", 18)

			/*
			 * HANDWERKS-TALENTE
			 */
			createTalent("Abrichten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Ackerbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Alchimie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Bergbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Bogenbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Boote Fahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Brauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Drucker", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Fahrzeug Lenken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Falschspiel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Feinmechanik", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Feuersteinbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Fleischer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Gerber/Kürschner", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Glaskunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Grobschmied", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Handel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Hauswirtschaft", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Gift", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Krankheiten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Seele", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Wunden", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Holzbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Instrumentenbauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Kartographie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Kochen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Kristallzucht", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Lederarbeiten", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Malen/Zeichnen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Maurer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Metallguss", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Musizieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Schlösser Knacken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Schnaps brennen", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Schneidern", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Seefahrt", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Seiler", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Steinmetz", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Steinschneider/Juwelier", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Stellmacher", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Stoffe Färben", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Tätowieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Töpfern", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Viezucht", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Webkunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Winzer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Zimmermann", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			/*
			 * GABEN
			 */
			createTalent("Gefahreninstinkt", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Magiegespür", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Prophezeien", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Zwergennase", TalentGruppe.GABEN, Talent.Typ.GABE)

			/*
			 * RITUALKENNTNIS
			 */
			// fremde Repräs., eigene Spalte D/E, fremde Spalte G, Kauf: 250
			createTalent("Ritualkenntnis", TalentGruppe.RITUALKENNTNIS, Talent.Typ.RITUALKENNTNIS)
		}
	}

	Talent createSprache(String name, int komplexitaet) {
		return createSprache(name, komplexitaet, null)
	}

	Talent createSprache(String name, int komplexitaet, SKT kosten) {
		return new Sprache(name: name, komplexitaet: komplexitaet, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	Talent createSchrift(String name, int komplexitaet) {
		return createSchrift (name, komplexitaet, null)
	}

	Talent createSchrift(String name, int komplexitaet, SKT kosten) {
		return new Schrift(name: name, komplexitaet: komplexitaet, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}


	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ) {
		return createTalent (name, talentGruppe, typ, null)
	}

	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, SKT kosten) {
		return new Talent(name: name, talentGruppe: talentGruppe, typ: typ, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	def destroy = {
	}
}
