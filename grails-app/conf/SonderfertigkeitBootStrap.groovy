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
			createSonderfertigkeit("Aufmerksamkeit",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Ausfall",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Ausweichen I",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Ausweichen II",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Ausweichen III",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Befreiungsschlag",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Beidhändiger Kampf I",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Beidhändiger Kampf II",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Berittener Schütze",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Betäubungsschlag",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Binden",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Blindkampf",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Defensiver Kampfstil",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Doppelangriff",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Eisenhagel",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Entwaffnen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Festnageln",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Finte",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Formation",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Gegenhalten",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Geschützmeister",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Gezielter Stich",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Halbschwert",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Hammerschlag",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit( "Improvisierte Waffen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Kampf Im Wasser",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Kampfgespür",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Kampfreflexe",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Klingensturm",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Klingentänzer",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Klingenwand",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Kriegsreiterei",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Linkhand",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Meisterliches Entwaffnen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Meisterparade",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Meisterschütze",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Niederwerfen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Parierwaffen I",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Parierwaffen II",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Reiterkampf",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Rüstungsgewöhnung I",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Rüstungsgewöhnung II",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Rüstungsgewöhnung III",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Scharfschütze",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schildkampf I",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schildkampf II",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schildspalter",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schnellladen",Sonderfertigkeit.Typ.KAMPF );

			//			createSonderfertigkeit("Schnellladen",Talent.ARMBRUST,Sonderfertigkeit.Typ.KAMPF );
			//
			//			createSonderfertigkeit("Schnellladen",Talent.BOGEN,Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Spießgespann",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Sturmangriff",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Schnellziehen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Tod von Links",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Todesstoß",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Turnierreiterei",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Umreißen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Unterwasserkampf",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Waffe zerbrechen",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Waffenmeister",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Waffenspezialisierung",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Windmühle",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Wuchtschlag",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Wuchtschlag",Sonderfertigkeit.Typ.KAMPF );


			/**
			 * Kampf (waffenlos)
			 */
			createSonderfertigkeit("Hammerfaust",Sonderfertigkeit.Typ.KAMPF );

			createSonderfertigkeit("Unauer Schule",Sonderfertigkeit.Typ.KAMPF );


			/**
			 * Allgemein			
			 */
			createSonderfertigkeit("Akklimatisierung Kälte",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Akklimatisierung Hitze",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Dschungelkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Eiskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Gebirgskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Grosse Meditation",Sonderfertigkeit.Typ.MAGISCH );

			createSonderfertigkeit("Höhlenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Kulturkunde",Sonderfertigkeit.Typ.KULTURKUNDE );

			createSonderfertigkeit("Maraskankundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Meereskundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Meister Der Improvisation",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Nandusgefaelliges Wissen",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Ortskenntnis",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Regeneration I",Sonderfertigkeit.Typ.MAGISCH );

			createSonderfertigkeit("Repraesentation",Sonderfertigkeit.Typ.MAGISCH );

			createSonderfertigkeit("Standfest",Sonderfertigkeit.Typ.ALLGEMEIN );

			createSonderfertigkeit("Steppenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Sumpfkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Waldkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );

			createSonderfertigkeit("Wüstenkundig",Sonderfertigkeit.Typ.GELAENDEKUNDE );
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
