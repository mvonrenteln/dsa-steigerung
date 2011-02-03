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

			dsa4_1(createTalent("Belagerungswaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			dsa4_1(createTalent("Blasrohr", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			createTalent("Bogen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			dsa4_1(createTalent("Diskus", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			createTalent("Dolche", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Fechtwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Infanteriewaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL,  SKT.D)

			dsa4_1(createTalent("Kettenstäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			createTalent("Kettenwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Lanzenreiten", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			dsa4_1(createTalent("Peitsche", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			createTalent("Raufen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Ringen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Säbel", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			dsa4_1(createTalent("Schleuder", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C))

			createTalent("Schwerter", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Speere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Stäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Wurfbeile", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Wurfmesser", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Wurfspeere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Zweihand-Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Zweihandschwerter/-säbel", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			/*
			 * KOERPERLICHE TALENTE
			 */
			createTalent("Akrobatik", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Athletik", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			dsa4_1(createTalent("Fliegen", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL))

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

			dsa4_1(createTalent("Skifahren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL))

			createTalent("Stimmen Imitieren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Tanzen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Taschendiebstahl", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Zechen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			/*
			 * GESELLSCHAFTLICHE TALENTE
			 */
			createTalent("Betören", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Etikette", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			dsa4(createTalent("Galanterie", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL))

			createTalent("Gassenwissen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Lehren", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Menschenkenntnis", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS)

			dsa4_1(createTalent("Schauspielerei", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Schriftlicher Ausdruck", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL))

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

			dsa4_1(createTalent("Seefischerei", TalentGruppe.NATUR, Talent.Typ.SPEZIAL))

			createTalent("Wettervorhersage", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Wildnisleben", TalentGruppe.NATUR, Talent.Typ.BASIS)

			/*
			 * WISSENS-TALENTE
			 */
			createTalent("Anatomie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Baukunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL))

			createTalent("Brettspiel", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geschichtswissen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Gesteinskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Götter/Kulte", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Heraldik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Hüttenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL))

			createTalent("Kriegskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Kryptographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL))

			createTalent("Magiekunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Mechanik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Pflanzenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Philosophie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL))

			createTalent("Rechnen", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Rechtskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Sagen/Legenden", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Schätzen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Schiffsbau", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL))

			createTalent("Sprachenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Staatskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Sternkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Tierkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			/*
			 * SPRACHEN
			 */
			createSprache("Alaani")

			createSprache("Asdharia", SKT.B);

			createSprache("Atak")

			createSprache("Bosparano")

			createSprache("Fuechsisch")

			createSprache("Garethi")

			createSprache("Goblinisch")

			createSprache("Isdira")

			createSprache("Mohisch")

			createSprache("Nujuka")

			createSprache("Oloarkh")

			createSprache("Ologhaijan")

			createSprache("Rogolan")

			createSprache("Rssahh")

			createSprache("Thorwalsch")

			createSprache("Tulamidya")

			createSprache("UrTulamidya")

			createSprache("Zhayad")

			/*
			 *  SCHRIFTEN
			 */
			createSchrift("AsdhariaSchrift")

			createSchrift("Chrmk", SKT.B);

			createSchrift("GlyphenVonUnau")

			createSchrift("HjaldingscheRunen")

			createSchrift("IsdiraSchrift")

			createSchrift("KuslikerZeichen")

			createSchrift("Nanduria")

			createSchrift("RogolanSchrift")

			createSchrift("TulamidyaSchrift")

			createSchrift("UrTulamidyaSchrift")

			createSchrift("ZhayadSchrift")

			/*
			 * HANDWERKS-TALENTE
			 */
			createTalent("Abrichten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Ackerbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Alchimie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Bergbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Bogenbau", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Boote Fahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Brauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Drucker", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Eissegler Fahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Fahrzeug Lenken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Falschspiel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Feinmechanik", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Feuersteinbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Fleischer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Gerber/Kürschner", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Glaskunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Grobschmied", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Handel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Hauswirtschaft", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Heilkunde Gift", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Krankheiten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Seele", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Heilkunde Wunden", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Holzbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			dsa4_1(createTalent("Hundeschlitten fahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Instrumentenbauer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Kapellmeister", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Kartographie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Kochen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			dsa4_1(createTalent("Kristallzüchter", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Lederarbeiten", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Malen/Zeichnen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			dsa4_1(createTalent("Maurer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Metallguss", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Musizieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Schloesser Knacken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Schnaps brennen", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Schneidern", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Seefahrt", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Seiler", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Steinmetz", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Steinschneider/Juwelier", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Stellmacher", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Steuermann", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Stoffe Färben", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Tätowieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			dsa4_1(createTalent("Töpfern", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Viezucht", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Webkunst", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			dsa4_1(createTalent("Winzer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL))

			createTalent("Zimmermann", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			/*
			 * GABEN
			 */
			createTalent("Gefahreninstinkt", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Magiegespuer", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Prophezeien", TalentGruppe.GABEN, Talent.Typ.GABE)

			createTalent("Zwergennase", TalentGruppe.GABEN, Talent.Typ.GABE)

			/*
			 * RITUALKENNTNIS
			 */
			createTalent("Ritualkenntnis", TalentGruppe.RITUALKENNTNIS, Talent.Typ.RITUALKENNTNIS)
		}
	}

	Talent createSprache(String name) {
		return createSprache(name, null)
	}

	Talent createSprache(String name, SKT kosten) {
		return new Sprache(name: name, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	Talent createSchrift(String name) {
		return createSchrift (name, null)
	}

	Talent createSchrift(String name, SKT kosten) {
		return new Schrift(name: name, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}


	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ) {
		return createTalent (name, talentGruppe, typ, null)
	}

	Talent createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, SKT kosten) {
		return new Talent(name: name, talentGruppe: talentGruppe, typ: typ, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	/**
	 * Fügt die Charakteristik dem DSA 4-Regelsystem zu.
	 * 
	 */
	void dsa4(Charakteristik charakteristik) {
		Regeln.DSA4.addToCharakteristiken(charakteristik).save()
	}

	/**
	 * Fügt die Charakteristik dem DSA 4.1-Regelsystem zu.
	 *
	 */
	void dsa4_1(Charakteristik charakteristik) {
		Regeln.DSA4_1.addToCharakteristiken(charakteristik).save()
	}


	def destroy = {
	}
}
