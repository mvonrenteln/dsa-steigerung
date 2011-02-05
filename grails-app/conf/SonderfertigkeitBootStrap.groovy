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
			createSonderfertigkeit("Aufmerksamkeit",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Ausfall",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Ausweichen I",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Ausweichen II",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Ausweichen III",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Befreiungsschlag",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Beidhändiger Kampf I",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Beidhändiger Kampf II",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Berittener Schütze",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Betäubungsschlag",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Binden",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Blindkampf",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Defensiver Kampfstil",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Doppelangriff",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Eisenhagel",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Entwaffnen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Festnageln",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Finte",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Formation",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Gegenhalten",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Geschützmeister",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Gezielter Stich",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Halbschwert",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Hammerschlag",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit( "Improvisierte Waffen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Kampf Im Wasser",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Kampfgespür",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Kampfreflexe",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Klingensturm",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Klingentänzer",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Klingenwand",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Kriegsreiterei",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Linkhand",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Meisterliches Entwaffnen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Meisterparade",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Meisterschütze",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Niederwerfen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Parierwaffen I",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Parierwaffen II",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Reiterkampf",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Rüstungsgewöhnung I",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Rüstungsgewöhnung II",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Rüstungsgewöhnung III",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Scharfschütze",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schildkampf I",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schildkampf II",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schildspalter",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schnellladen Armbrust",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schnellladen Bogen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Spießgespann",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Sturmangriff",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Tod von Links",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Todesstoß",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Turnierreiterei",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Umreißen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Unterwasserkampf",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Waffe zerbrechen",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Waffenmeister",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Waffenspezialisierung",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Windmühle",Sonderfertigkeit.Typ.KAMPF);

			createSonderfertigkeit("Wuchtschlag",Sonderfertigkeit.Typ.KAMPF);

			/**
			 * Kampf (waffenlos)
			 */
			createSonderfertigkeit("Auspendeln",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Beinarbeit",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Biss",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Block",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Bornländisch",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Doppelschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Eisenarm",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Fußfeger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Gerade",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Gladiatorenstil",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Griff",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Halten",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Hammerfaust",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Handkante",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Hoher Tritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Hruruzat",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Klammer",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Knaufschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Knie",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Kopfstoß",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Kreuzblock",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Mercenario",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Niederringen",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schmetterschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schmutzige Tricks",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schwanzfeger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schwanzschlag",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schwinger",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Schwitzkasten",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Sprung",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Sprungtritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Tritt",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Unauer Schule",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Versteckte Klinge",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Wurf",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			createSonderfertigkeit("Würgegriff",Sonderfertigkeit.Typ.KAMPF_WAFFENLOS);

			/**
			 * Magische
			 */
			createSonderfertigkeit("Astrale Meditation",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Atem der Mutter",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Aura verhüllen",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Blutmagie",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Chimärenmeister",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Dämonenbindung I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Dämonenbindung II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Druidenrache",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Elementarharmonisierte Aura",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Fernzauberei",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Form der Formlosigkeit",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Geber der Gestalt",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Gefäß der Sterne",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Golembauer",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Große Meditation",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Höhere Dämonenbindung",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Hypervehemenz",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Invocatio Integra",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Kontakt zum Großen Geist",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Konzentrationsstärke",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Kraftkontrolle",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Kraftlinienmagie I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Kraftlinienmagie II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Kraftspeicher",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Lockeres Zaubern",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Matrixgeber",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Matrixkontrolle",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Matrixregeneration I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Matrixregeneration II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Matrixverständnis",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Meisterliche Regeneration",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Meisterliche Zauberkontrolle I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Meisterliche Zauberkontrolle II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Merkmalskenntnis",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Nekromant",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Ottagaldr",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Regeneration I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Regeneration II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Repräsentation",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Ritualkenntnis",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Runenkunde",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Salasandra",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Semipermanenz I",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Semipermanenz II",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Signaturkenntnis",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Simultanzaubern",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Stapeleffekt",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Sumus Blut",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Sumus Fülle",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Tanz der Mada",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Tierischer Begleiter",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Traumgänger",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Verbotene Pforten",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Vertrautenbindung",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Vielfache Ladungen",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauber bereithalten",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauber unterbrechen",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauber vereinigen",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauberkontrolle",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauberroutine",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauberspezialisierung",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zaubertanz",Sonderfertigkeit.Typ.MAGISCH);

			createSonderfertigkeit("Zauberzeichen",Sonderfertigkeit.Typ.MAGISCH);

			/**
			 * Geweihte
			 */
			createSonderfertigkeit("Akoluth",Sonderfertigkeit.Typ.GEWEIHT);

			createSonderfertigkeit("Aura der Heiligkeit",Sonderfertigkeit.Typ.GEWEIHT);

			createSonderfertigkeit("Exorzist",Sonderfertigkeit.Typ.GEWEIHT);

			createSonderfertigkeit("Karmalqueste",Sonderfertigkeit.Typ.GEWEIHT);

			createSonderfertigkeit("Liturgiekenntnis",Sonderfertigkeit.Typ.GEWEIHT);

			createSonderfertigkeit("Spätweihe (alveranische Gottheit)",Sonderfertigkeit.Typ.GEWEIHT);

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
