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
import dsa.held.Merkmal;
import dsa.held.Schrift
import dsa.held.Sonderfertigkeit;
import dsa.held.Sprache
import dsa.held.Talent
import dsa.held.TalentGruppe
import dsa.steigerung.SKT

class SonderfertigkeitBootStrap {

	def init = { servletContext ->

		if (!Sonderfertigkeit.count()) {

			/**
			 * Kampf
			 */
			createSonderfertigkeit("Aufmerksamkeit",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Ausfall",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Ausweichen I",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Ausweichen II",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Ausweichen III",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Befreiungsschlag",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Beidhändiger Kampf I",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Beidhändiger Kampf II",Sonderfertigkeit.Typ.NAHKAMPF, 400);

			createSonderfertigkeit("Berittener Schütze",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Betäubungsschlag",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Binden",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Blindkampf",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Defensiver Kampfstil",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit( "Doppelangriff",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit( "Eisenhagel",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			createSonderfertigkeit( "Entwaffnen",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit( "Festnageln",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit( "Finte",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit( "Formation",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit( "Gegenhalten",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit( "Geschützmeister",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit( "Gezielter Stich",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit( "Halbschwert",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			createSonderfertigkeit( "Hammerschlag",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit( "Improvisierte Waffen",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Kampf Im Wasser",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Kampfgespür",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Kampfreflexe",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Klingensturm",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Klingentänzer",Sonderfertigkeit.Typ.NAHKAMPF, 400);

			createSonderfertigkeit("Klingenwand",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Kriegsreiterei",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Linkhand",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Meisterliches Entwaffnen",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Meisterparade",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Meisterschütze",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Niederwerfen",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Parierwaffen I",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Parierwaffen II",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Reiterkampf",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Rüstungsgewöhnung I",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			createSonderfertigkeit("Rüstungsgewöhnung II",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Rüstungsgewöhnung III",Sonderfertigkeit.Typ.NAHKAMPF, 450);

			createSonderfertigkeit("Scharfschütze",Sonderfertigkeit.Typ.NAHKAMPF, 300);

			createSonderfertigkeit("Schildkampf I",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Schildkampf II",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Schildspalter",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Schnellladen Armbrust",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Schnellladen Bogen",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Spießgespann",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Sturmangriff",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Tod von Links",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Todesstoß",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Turnierreiterei",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Umreißen",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Unterwasserkampf",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Waffe zerbrechen",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			//pro Waffe, Schild!!
			createSonderfertigkeit("Waffenmeister",Sonderfertigkeit.Typ.NAHKAMPF, 400);

			//pro Waffe!! 20*AKT für die erste, 40*AKT für die zweite etc...
			createSonderfertigkeit("Waffenspezialisierung",Sonderfertigkeit.Typ.NAHKAMPF);

			createSonderfertigkeit("Windmühle",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Wuchtschlag",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			/**
			 * Waffenlose Kampf
			 */
			createSonderfertigkeit("Auspendeln",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Beinarbeit",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Biss",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Block",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Doppelschlag",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Eisenarm",Sonderfertigkeit.Typ.MANOEVER, 60);

			createSonderfertigkeit("Fußfeger",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Gerade",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Griff",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Halten",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Handkante",Sonderfertigkeit.Typ.MANOEVER, 60);

			createSonderfertigkeit("Hoher Tritt",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Klammer",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Knaufschlag",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Knie",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Kopfstoß",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Kreuzblock",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Niederringen",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Schmetterschlag",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Schmutzige Tricks",Sonderfertigkeit.Typ.MANOEVER, 60);

			createSonderfertigkeit("Schwanzfeger",Sonderfertigkeit.Typ.MANOEVER, 20);

			createSonderfertigkeit("Schwanzschlag",Sonderfertigkeit.Typ.MANOEVER, 10);

			createSonderfertigkeit("Schwinger",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Schwitzkasten",Sonderfertigkeit.Typ.MANOEVER, 20);

			createSonderfertigkeit("Sprung",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Sprungtritt",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Tritt",Sonderfertigkeit.Typ.MANOEVER, 30);

			createSonderfertigkeit("Versteckte Klinge",Sonderfertigkeit.Typ.MANOEVER, 50);

			createSonderfertigkeit("Wurf",Sonderfertigkeit.Typ.MANOEVER, 40);

			createSonderfertigkeit("Würgegriff",Sonderfertigkeit.Typ.MANOEVER, 30);

			/**
			 * Waffenlose Kampfstile
			 */
			createSonderfertigkeit("Waffenloser Kampfstil: Bornländisch",Sonderfertigkeit.Typ.NAHKAMPF, 100);

			createSonderfertigkeit("Waffenloser Kampfstil: Gladiatorenstil",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			createSonderfertigkeit("Waffenloser Kampfstil: Hammerfaust",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			createSonderfertigkeit("Waffenloser Kampfstil: Hruruzat",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Waffenloser Kampfstil: Mercenario",Sonderfertigkeit.Typ.NAHKAMPF, 200);

			createSonderfertigkeit("Waffenloser Kampfstil: Unauer Schule",Sonderfertigkeit.Typ.NAHKAMPF, 150);

			/**
			 * Magische
			 */
			createSonderfertigkeit("Astrale Meditation",Sonderfertigkeit.Typ.MAGISCH, 100);

			// = Große Mditation
			createSonderfertigkeit("Atem der Mutter",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Aura verhüllen",Sonderfertigkeit.Typ.MAGISCH, 500);

			createSonderfertigkeit("Blutmagie",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Chimärenmeister",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Dämonenbindung I",Sonderfertigkeit.Typ.MAGISCH, 150);

			createSonderfertigkeit("Dämonenbindung II",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Druidenrache",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Elementarharmonisierte Aura",Sonderfertigkeit.Typ.MAGISCH, 700);

			createSonderfertigkeit("Exorzist",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Fernzauberei",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Form der Formlosigkeit",Sonderfertigkeit.Typ.MAGISCH, 150);

			createSonderfertigkeit("Geber der Gestalt",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Gefäß der Sterne",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Golembauer",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Große Meditation",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Höhere Dämonenbindung",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Hypervehemenz",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Invocatio Integra",Sonderfertigkeit.Typ.MAGISCH, 200);

			// Wo???
			createSonderfertigkeit("Kontakt zum Großen Geist",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Konzentrationsstärke",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Kraftkontrolle",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Kraftlinienmagie I",Sonderfertigkeit.Typ.MAGISCH, 50);

			createSonderfertigkeit("Kraftlinienmagie II",Sonderfertigkeit.Typ.MAGISCH, 400);

			// Wo???
			createSonderfertigkeit("Kraftspeicher",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Lockeres Zaubern",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Matrixgeber",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Matrixkontrolle",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Matrixregeneration I",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Matrixregeneration II",Sonderfertigkeit.Typ.MAGISCH, 500);

			createSonderfertigkeit("Matrixverständnis",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Meisterliche Regeneration",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Meisterliche Zauberkontrolle I",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Meisterliche Zauberkontrolle II",Sonderfertigkeit.Typ.MAGISCH, 300);

			for (merkmal in Merkmal) {
				createSonderfertigkeit("Merkmalskenntnis $merkmal.name",Sonderfertigkeit.Typ.MERKMALSKENNTNIS, merkmal.kosten);
			}

			createSonderfertigkeit("Nekromant",Sonderfertigkeit.Typ.MAGISCH, 250);

			// Zauberer
			createSonderfertigkeit("Ottagaldr",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Regeneration I",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Regeneration II",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Repräsentation",Sonderfertigkeit.Typ.MAGISCH, 2000);

			createSonderfertigkeit("Runenkunde",Sonderfertigkeit.Typ.MAGISCH, 200);

			// fremde Sippe, eigene 0 AP
			createSonderfertigkeit("Salasandra",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Semipermanenz I",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Semipermanenz II",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Signaturkenntnis",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Simultanzaubern",Sonderfertigkeit.Typ.MAGISCH, 150);

			createSonderfertigkeit("Stapeleffekt",Sonderfertigkeit.Typ.MAGISCH, 200);

			// = Große Meditation
			createSonderfertigkeit("Sumus Blut",Sonderfertigkeit.Typ.MAGISCH, 100);

			// = Gefäß der Sterne
			createSonderfertigkeit("Sumus Fülle",Sonderfertigkeit.Typ.MAGISCH, 250);

			createSonderfertigkeit("Tanz der Mada",Sonderfertigkeit.Typ.MAGISCH, 50);

			// 100 für Erstes, je 200 für Weitere
			createSonderfertigkeit("Tierischer Begleiter",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Traumgänger",Sonderfertigkeit.Typ.MAGISCH, 150);

			createSonderfertigkeit("Verbotene Pforten",Sonderfertigkeit.Typ.MAGISCH, 100);

			// zum Binden AP je nach Tierart / Fähigkeiten
			createSonderfertigkeit("Vertrautenbindung",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Vielfache Ladungen",Sonderfertigkeit.Typ.MAGISCH, 75);

			createSonderfertigkeit("Zauber bereithalten",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Zauberkontrolle",Sonderfertigkeit.Typ.MAGISCH, 50);

			createSonderfertigkeit("Zauberroutine",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Zauber unterbrechen",Sonderfertigkeit.Typ.MAGISCH, 300);

			createSonderfertigkeit("Zauber vereinigen",Sonderfertigkeit.Typ.MAGISCH, 100);

			// 20*Anzahl*AKT
			createSonderfertigkeit("Zauberspezialisierung",Sonderfertigkeit.Typ.MAGISCH);
			
			/**
			* Objektrituale
			*/
			createSonderfertigkeit("Apport",Sonderfertigkeit.Typ.OBJEKTRITUAL, 200);
			
			createSonderfertigkeit("Bannschwert",Sonderfertigkeit.Typ.OBJEKTRITUAL, 200);
			
			createSonderfertigkeit("Zauberzeichen",Sonderfertigkeit.Typ.OBJEKTRITUAL, 200);

			/**
			 * Geweihte
			 */
			createSonderfertigkeit("Akoluth",Sonderfertigkeit.Typ.GEWEIHT, 50);

			createSonderfertigkeit("Aura der Heiligkeit",Sonderfertigkeit.Typ.GEWEIHT, 250);

			// Durchführung 300 / 250
			createSonderfertigkeit("Karmalqueste",Sonderfertigkeit.Typ.GEWEIHT, 50);

			// Spalte F
			createSonderfertigkeit("Liturgiekenntnis",Sonderfertigkeit.Typ.GEWEIHT);

			// eigene Spalte E, fremde G
			createSonderfertigkeit("Liturgiekenntnis (Schamanentradition)",Sonderfertigkeit.Typ.GEWEIHT, 250);

			// 1000 / 1500 / 2000
			createSonderfertigkeit("Spätweihe (alveranische Gottheit)",Sonderfertigkeit.Typ.GEWEIHT);

			// 700 / 1000 / 1500
			createSonderfertigkeit("Spätweihe (nicht-alveranische Gottheit)",Sonderfertigkeit.Typ.GEWEIHT);


			/**
			 * Allgemein			
			 */
			createSonderfertigkeit("Akklimatisierung Hitze",Sonderfertigkeit.Typ.ALLGEMEIN, 150);

			createSonderfertigkeit("Akklimatisierung Kälte",Sonderfertigkeit.Typ.ALLGEMEIN, 150);

			createSonderfertigkeit("Aurapanzer",Sonderfertigkeit.Typ.ALLGEMEIN, 500);

			createSonderfertigkeit("Berufsgeheimnis",Sonderfertigkeit.Typ.ALLGEMEIN, 100);

			createSonderfertigkeit("Eiserner Wille I",Sonderfertigkeit.Typ.ALLGEMEIN, 200);

			createSonderfertigkeit("Eiserner Wille II",Sonderfertigkeit.Typ.ALLGEMEIN, 300);

			createSonderfertigkeit("Fälscher",Sonderfertigkeit.Typ.ALLGEMEIN, 100);

			createSonderfertigkeit("Gedankenschutz",Sonderfertigkeit.Typ.ALLGEMEIN, 250);

			createSonderfertigkeit("Kulturkunde",Sonderfertigkeit.Typ.ALLGEMEIN, 150);

			createSonderfertigkeit("Meister der Improvisation",Sonderfertigkeit.Typ.ALLGEMEIN, 200);

			createSonderfertigkeit("Nandusgefälliges Wissen",Sonderfertigkeit.Typ.ALLGEMEIN, 200);

			// 150 für Erste, 100 für alle Weiteren
			createSonderfertigkeit("Ortskenntnis",Sonderfertigkeit.Typ.ALLGEMEIN, 150);

			createSonderfertigkeit("Rosstäuscher",Sonderfertigkeit.Typ.ALLGEMEIN, 100);

			createSonderfertigkeit("Standfest",Sonderfertigkeit.Typ.ALLGEMEIN, 200);

			createSonderfertigkeit("Talentspezialisierung",Sonderfertigkeit.Typ.ALLGEMEIN);

			/**
			 * Geländekunde
			 */
			// 150 für das Erste, 100 für alle Weiteren
			createSonderfertigkeit("Dschungelkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Eiskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Gebirgskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Höhlenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Maraskankundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Meereskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Steppenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Sumpfkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Waldkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);

			createSonderfertigkeit("Wüstenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE, 150);
		}
	}


	Sonderfertigkeit createSonderfertigkeit(String name, Sonderfertigkeit.Typ typ) {
		return createSonderfertigkeit(name, typ, 0);
	}

	Sonderfertigkeit createSonderfertigkeit(String name, Sonderfertigkeit.Typ typ, int kosten) {
		return new Sonderfertigkeit(name: name, typ: typ, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	def destroy = {
	}
}
