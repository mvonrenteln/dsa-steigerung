import dsa.Quelle
import dsa.Regeln;
import dsa.held.Charakteristik;
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
			createSonderfertigkeit("Aufmerksamkeit",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Ausfall",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Ausweichen I",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Ausweichen II",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Ausweichen III",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Befreiungsschlag",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Beidhändiger Kampf I",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Beidhändiger Kampf II",Sonderfertigkeit.Typ.KAMPF, 400);

			createSonderfertigkeit("Berittener Schütze",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Betäubungsschlag",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Binden",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Blindkampf",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Defensiver Kampfstil",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit( "Doppelangriff",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit( "Eisenhagel",Sonderfertigkeit.Typ.KAMPF, 150);

			createSonderfertigkeit( "Entwaffnen",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit( "Festnageln",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit( "Finte",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit( "Formation",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit( "Gegenhalten",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit( "Geschützmeister",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit( "Gezielter Stich",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit( "Halbschwert",Sonderfertigkeit.Typ.KAMPF, 150);

			createSonderfertigkeit( "Hammerschlag",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit( "Improvisierte Waffen",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Kampf Im Wasser",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Kampfgespür",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Kampfreflexe",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Klingensturm",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Klingentänzer",Sonderfertigkeit.Typ.KAMPF, 400);

			createSonderfertigkeit("Klingenwand",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Kriegsreiterei",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Linkhand",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Meisterliches Entwaffnen",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Meisterparade",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Meisterschütze",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Niederwerfen",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Parierwaffen I",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Parierwaffen II",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Reiterkampf",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Rüstungsgewöhnung I",Sonderfertigkeit.Typ.KAMPF, 150);

			createSonderfertigkeit("Rüstungsgewöhnung II",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Rüstungsgewöhnung III",Sonderfertigkeit.Typ.KAMPF, 450);

			createSonderfertigkeit("Scharfschütze",Sonderfertigkeit.Typ.KAMPF, 300);

			createSonderfertigkeit("Schildkampf I",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Schildkampf II",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Schildspalter",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Schnellladen Armbrust",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Schnellladen Bogen",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Spießgespann",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Sturmangriff",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Tod von Links",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Todesstoß",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Turnierreiterei",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Umreißen",Sonderfertigkeit.Typ.KAMPF, 100);

			createSonderfertigkeit("Unterwasserkampf",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Waffe zerbrechen",Sonderfertigkeit.Typ.KAMPF, 200);

			//pro Waffe, Schild!!
			createSonderfertigkeit("Waffenmeister",Sonderfertigkeit.Typ.KAMPF, 400);

			//pro Waffe!! 20*AKT für die erste, 40*AKT für die zweite etc...
			createSonderfertigkeit("Waffenspezialisierung",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Windmühle",Sonderfertigkeit.Typ.KAMPF, 200);

			createSonderfertigkeit("Wuchtschlag",Sonderfertigkeit.Typ.KAMPF, 200);

			/**
			 * Kampf (waffenlos)
			 */
			createSonderfertigkeit("Auspendeln",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Beinarbeit",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Biss",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Block",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Doppelschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Eisenarm",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 60);

			createSonderfertigkeit("Fußfeger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Gerade",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Griff",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Halten",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Handkante",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 60);

			createSonderfertigkeit("Hoher Tritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Klammer",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Knaufschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Knie",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Kopfstoß",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Kreuzblock",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Niederringen",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Schmetterschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Schmutzige Tricks",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 60);

			createSonderfertigkeit("Schwanzfeger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 20);

			createSonderfertigkeit("Schwanzschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 10);

			createSonderfertigkeit("Schwinger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Schwitzkasten",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 20);

			createSonderfertigkeit("Sprung",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Sprungtritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Tritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			createSonderfertigkeit("Versteckte Klinge",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 50);

			createSonderfertigkeit("Wurf",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 40);

			createSonderfertigkeit("Würgegriff",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 30);

			/**
			 * Kampftechniken (waffenlos)
			 */
			createSonderfertigkeit("Bornländisch",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 100);

			createSonderfertigkeit("Gladiatorenstil",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 150);

			createSonderfertigkeit("Hammerfaust",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 150);

			createSonderfertigkeit("Hruruzat",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 200);

			createSonderfertigkeit("Mercenario",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 200);

			createSonderfertigkeit("Unauer Schule",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS, 150);

			/**
			 * Magische
			 */
			createSonderfertigkeit("Apport",Sonderfertigkeit.Typ.OBJEKTRITUAL, 200);

			createSonderfertigkeit("Astrale Meditation",Sonderfertigkeit.Typ.MAGISCH, 100);

			// = Große Mditation
			createSonderfertigkeit("Atem der Mutter",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Aura verhüllen",Sonderfertigkeit.Typ.MAGISCH, 500);

			createSonderfertigkeit("Bannschwert",Sonderfertigkeit.Typ.OBJEKTRITUAL, 200);

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

			//Je nach Merkmal 100/200/300
			createSonderfertigkeit("Merkmalskenntnis",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Nekromant",Sonderfertigkeit.Typ.MAGISCH, 250);

			// Zauberer
			createSonderfertigkeit("Ottagaldr",Sonderfertigkeit.Typ.MAGISCH, 200);

			createSonderfertigkeit("Regeneration I",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Regeneration II",Sonderfertigkeit.Typ.MAGISCH, 100);

			createSonderfertigkeit("Repräsentation",Sonderfertigkeit.Typ.MAGISCH, 2000);

			// fremde Repräs., eigene Spalte D/E, fremde Spalte G, eigl. Talent?
			createSonderfertigkeit("Ritualkenntnis",Sonderfertigkeit.Typ.MAGISCH, 250);

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

			createSonderfertigkeit("Zauberzeichen",Sonderfertigkeit.Typ.MAGISCH, 200);

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
			createSonderfertigkeit("Akklimatisierung Hitze",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Akklimatisierung Kälte",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Aurapanzer",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Berufsgeheimnis",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Eiserner Wille I",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Eiserner Wille II",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Fälscher",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Gedankenschutz",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Kulturkunde",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Meister der Improvisation",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Nandusgefälliges Wissen",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Ortskenntnis",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Rosstäuscher",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Standfest",Sonderfertigkeit.Typ.ALLGEMEIN);

			createSonderfertigkeit("Talentspezialisierung",Sonderfertigkeit.Typ.ALLGEMEIN);

			/**
			 * Geländekunde
			 */
			createSonderfertigkeit("Dschungelkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Eiskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Gebirgskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Höhlenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Maraskankundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Meereskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Steppenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Sumpfkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Waldkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);

			createSonderfertigkeit("Wüstenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE);
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
