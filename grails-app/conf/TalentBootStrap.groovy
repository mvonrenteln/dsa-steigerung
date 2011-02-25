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
import dsa.held.Eigenschaft;
import dsa.held.Schrift
import dsa.held.Sprache
import dsa.held.Talent
import dsa.held.TalentGruppe
import dsa.steigerung.SKT

class TalentBootStrap {

	def init = { servletContext ->

		if (!Talent.count()) {
			
			
			/**
			 * Eigenschaften-Kurzform
			 */
			def MU = Eigenschaft[Eigenschaft.Instanz.MU]
			def KL = Eigenschaft[Eigenschaft.Instanz.KL]
			def IN = Eigenschaft[Eigenschaft.Instanz.IN]
			def CH = Eigenschaft[Eigenschaft.Instanz.CH]
			def FF = Eigenschaft[Eigenschaft.Instanz.FF]
			def GE = Eigenschaft[Eigenschaft.Instanz.GE]
			def KO = Eigenschaft[Eigenschaft.Instanz.KO]
			def KK = Eigenschaft[Eigenschaft.Instanz.KK]

			/*
			 * Kampf-TALENTE
			 */
			createTalent("Anderthalbhänder", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Armbrust", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C, [GE, FF, KK])

			createTalent("Belagerungswaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, FF, KK])

			createTalent("Blasrohr", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, FF, KK])

			createTalent("Bogen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, FF, KK])

			createTalent("Diskus", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, FF, KK])

			createTalent("Dolche", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D, [GE, GE, KK])

			createTalent("Fechtwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D, [GE, GE, KK])

			createTalent("Infanteriewaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL,  SKT.D, [GE, GE, KK])

			createTalent("Kettenstäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Kettenwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, GE, KK])

			createTalent("Lanzenreiten", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Peitsche", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Raufen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C, [GE, GE, KK])

			createTalent("Ringen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D, [GE, GE, KK])

			createTalent("Säbel", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D, [GE, GE, KK])

			createTalent("Schleuder", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, FF, KK])

			createTalent("Schwerter", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			createTalent("Speere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, GE, KK])

			createTalent("Stäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, GE, KK])

			createTalent("Wurfbeile", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C, [GE, FF, KK])

			createTalent("Wurfmesser", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C, [GE, FF, KK])

			createTalent("Wurfspeere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C, [GE, FF, KK])

			createTalent("Zweihandflegel", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, GE, KK])

			createTalent("Zweihand-Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D, [GE, GE, KK])


			createTalent("Zweihandschwerter/-säbel", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E, [GE, GE, KK])

			/*
			 * KOERPERLICHE TALENTE
			 */
			createTalent("Akrobatik", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [MU, GE, KK])

			createTalent("Athletik", TalentGruppe.KOERPER, Talent.Typ.BASIS, [GE, KO, KK])

			createTalent("Fliegen", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [MU, IN, GE])

			createTalent("Gaukeleien", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [MU, CH, FF])

			createTalent("Klettern", TalentGruppe.KOERPER, Talent.Typ.BASIS, [MU, GE, KK])

			createTalent("Körperbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS, [MU, IN, GE])

			createTalent("Reiten", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [CH, GE, KK])

			createTalent("Schleichen", TalentGruppe.KOERPER, Talent.Typ.BASIS, [MU, IN, GE]);

			createTalent("Schwimmen", TalentGruppe.KOERPER, Talent.Typ.BASIS, [GE, KO, KK])

			createTalent("Selbstbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS, [MU, KO, KK])

			createTalent("Sich Verstecken", TalentGruppe.KOERPER, Talent.Typ.BASIS, [MU, IN, GE])

			createTalent("Singen", TalentGruppe.KOERPER, Talent.Typ.BASIS, [IN, CH, CH])

			createTalent("Sinnenschärfe", TalentGruppe.KOERPER, Talent.Typ.BASIS, [KL, IN, IN])

			createTalent("Skifahren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [GE, GE, KO])

			createTalent("Stimmen Imitieren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Tanzen", TalentGruppe.KOERPER, Talent.Typ.BASIS, [CH, GE, GE])

			createTalent("Taschendiebstahl", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL, [MU, IN, FF])

			createTalent("Zechen", TalentGruppe.KOERPER, Talent.Typ.BASIS, [IN, KO, KK])

			/*
			 * GESELLSCHAFTLICHE TALENTE
			 */
			createTalent("Betören", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [IN, CH, CH])

			createTalent("Etikette", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Gassenwissen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Lehren", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Menschenkenntnis", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS, [KL, IN, CH])

			createTalent("Schauspielerei", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [MU, KL, CH])

			createTalent("Schriftlicher Ausdruck", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [KL, IN, IN])

			createTalent("Sich Verkleiden", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [MU, CH, GE])

			createTalent("Überreden", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS, [MU, IN, CH])

			createTalent("Überzeugen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL, [KL, IN, CH])

			/*
			 * NATUR-TALENTE
			 */
			createTalent("Fährtensuchen", TalentGruppe.NATUR, Talent.Typ.BASIS, [KL, IN, KO])

			createTalent("Fallenstellen", TalentGruppe.NATUR, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Fesseln/Entfesseln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL, [FF, GE, KK])

			createTalent("Fischen/Angeln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL, [IN, FF, KK])

			createTalent("Orientierung", TalentGruppe.NATUR, Talent.Typ.BASIS, [KL, IN, IN])

			createTalent("Wettervorhersage", TalentGruppe.NATUR, Talent.Typ.SPEZIAL, [KL, IN, IN])

			createTalent("Wildnisleben", TalentGruppe.NATUR, Talent.Typ.BASIS, [IN, GE, KO])

			/*
			 * WISSENS-TALENTE
			 */
			createTalent("Anatomie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [MU, KL, FF])

			createTalent("Baukunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, FF])

			createTalent("Brettspiel", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Geographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Geschichtswissen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Gesteinskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Götter/Kulte", TalentGruppe.WISSEN, Talent.Typ.BASIS, [KL, KL, IN])

			createTalent("Heraldik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, FF])

			createTalent("Hüttenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, IN, KO])

			createTalent("Kriegskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [MU, KL, CH])

			createTalent("Kryptographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Magiekunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Mechanik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, FF])

			createTalent("Pflanzenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Philosophie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Rechnen", TalentGruppe.WISSEN, Talent.Typ.BASIS, [KL, KL, IN])

			createTalent("Rechtskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Sagen/Legenden", TalentGruppe.WISSEN, Talent.Typ.BASIS, [KL, IN, CH])

			createTalent("Schätzen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, IN, IN])

			createTalent("Sprachenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Staatskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Sternkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [KL, KL, IN])

			createTalent("Tierkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL, [MU, KL, IN])

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
			createTalent("Abrichten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [MU, IN, CH])

			createTalent("Ackerbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, FF, KO])

			createTalent("Alchimie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [MU, KL, FF])

			createTalent("Bergbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, KO, KK])

			createTalent("Bogenbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Boote Fahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [GE, KO, KK])

			createTalent("Brauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Drucker", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Fahrzeug Lenken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, CH, FF])

			createTalent("Falschspiel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [MU, CH, FF])

			createTalent("Feinmechanik", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, FF])

			createTalent("Feuersteinbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, FF])

			createTalent("Fleischer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Gerber/Kürschner", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KO])

			createTalent("Glaskunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, FF, KO])

			createTalent("Grobschmied", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, KO, KK])

			createTalent("Handel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, CH])

			createTalent("Hauswirtschaft", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, CH, FF])

			createTalent("Heilkunde Gift", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [MU, KL, IN])

			createTalent("Heilkunde Krankheiten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [MU, KL, CH])

			createTalent("Heilkunde Seele", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, CH, CH])

			createTalent("Heilkunde Wunden", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, CH, FF])

			createTalent("Holzbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, FF, KK])

			createTalent("Instrumentenbauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Kartographie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, KL, FF])

			createTalent("Kochen", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, IN, FF])

			createTalent("Kristallzucht", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Lederarbeiten", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, FF, FF])

			createTalent("Malen/Zeichnen", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, IN, FF])

			createTalent("Maurer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, GE, KK])

			createTalent("Metallguss", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Musizieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, CH, FF])

			createTalent("Schlösser Knacken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, FF, FF])

			createTalent("Schnaps brennen", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, FF])

			createTalent("Schneidern", TalentGruppe.HANDWERK, Talent.Typ.BASIS, [KL, FF, FF])

			createTalent("Seefahrt", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, GE, KK])

			createTalent("Seiler", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, FF, KK])

			createTalent("Steinmetz", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, FF, KK])

			createTalent("Steinschneider/Juwelier", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, FF, FF])

			createTalent("Stellmacher", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Stoffe Färben", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Tätowieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [IN, FF, FF])

			createTalent("Töpfern", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, FF])

			createTalent("Viehzucht", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, IN, KK])

			createTalent("Webkunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [FF, FF, KK])

			createTalent("Winzer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			createTalent("Zimmermann", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL, [KL, FF, KK])

			/*
			 * GABEN
			 */
			createTalent("Gefahreninstinkt", TalentGruppe.GABEN, Talent.Typ.GABE, [])

			createTalent("Magiegespür", TalentGruppe.GABEN, Talent.Typ.GABE, [])

			createTalent("Prophezeien", TalentGruppe.GABEN, Talent.Typ.GABE, [])

			createTalent("Zwergennase", TalentGruppe.GABEN, Talent.Typ.GABE, [])

			/*
			 * RITUALKENNTNIS
			 */
			// fremde Repräs., eigene Spalte D/E, fremde Spalte G, Kauf: 250
			createTalent("Ritualkenntnis", TalentGruppe.RITUALKENNTNIS, Talent.Typ.RITUALKENNTNIS, [])
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


	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, List eigenschaften) {
		return createTalent (name, talentGruppe, typ, null, eigenschaften)
	}

	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, SKT kosten, List eigenschaften) {
		def talent = new Talent(name: name, talentGruppe: talentGruppe, typ: typ, kosten: kosten, eigenschaften: eigenschaften, quelle: Quelle.OFFIZIELL)
		return talent.save(failOnError: true);
	}

	def destroy = {
	}
}
