import dsa.Quelle
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

			createTalent("Bogen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Dolche", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Fechtwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Hiebwaffen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Infanteriewaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL,  SKT.D)

			createTalent("Kettenwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Lanzenreiten", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Raufen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Ringen", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Säbel", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.D)

			createTalent("Schwerter", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			createTalent("Speere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Stäbe", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Wurfbeile", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("Wurfmesser", TalentGruppe.KAMPF, Talent.Typ.BASIS, SKT.C)

			createTalent("Wurfspeere", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.C)

			createTalent("ZweihandHiebwaffen", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.D)

			createTalent("Zweihandschwerter", TalentGruppe.KAMPF, Talent.Typ.SPEZIAL, SKT.E)

			/*
			 * KOERPERLICHE TALENTE
			 */
			createTalent("Akrobatik", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Athletik", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Gaukeleien", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Klettern", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Koerperbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Reiten", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Schleichen", TalentGruppe.KOERPER, Talent.Typ.BASIS);

			createTalent("Schwimmen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Selbstbeherrschung", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("SichVerstecken", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Singen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Sinnenschaerfe", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("StimmenImitieren", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Tanzen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			createTalent("Taschendiebstahl", TalentGruppe.KOERPER, Talent.Typ.SPEZIAL)

			createTalent("Zechen", TalentGruppe.KOERPER, Talent.Typ.BASIS)

			/*
			 * GESELLSCHAFTLICHE TALENTE
			 */
			createTalent("Betoeren", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Etikette", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Gassenwissen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Lehren", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Menschenkenntnis", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS)

			createTalent("SichVerkleiden", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			createTalent("Ueberreden", TalentGruppe.GESELLSCHAFT, Talent.Typ.BASIS)

			createTalent("Ueberzeugen", TalentGruppe.GESELLSCHAFT, Talent.Typ.SPEZIAL)

			/*
			 * NATUR-TALENTE
			 */
			createTalent("Faehrtensuchen", TalentGruppe.NATUR, Talent.Typ.BASIS)

			createTalent("Fallenstellen", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("FesselnEntfesseln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("FischenAngeln", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Orientierung", TalentGruppe.NATUR, Talent.Typ.BASIS)

			createTalent("Wettervorhersage", TalentGruppe.NATUR, Talent.Typ.SPEZIAL)

			createTalent("Wildnisleben", TalentGruppe.NATUR, Talent.Typ.BASIS)

			/*
			 * WISSENS-TALENTE
			 */
			createTalent("Anatomie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("BrettWuerfelspiele", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geographie", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Geschichtswissen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Gesteinskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("GoetterKulte", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Heraldik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Kriegskunst", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Magiekunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Mechanik", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Pflanzenkunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("Rechnen", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Rechtskunde", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

			createTalent("SagenLegenden", TalentGruppe.WISSEN, Talent.Typ.BASIS)

			createTalent("Schaetzen", TalentGruppe.WISSEN, Talent.Typ.SPEZIAL)

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

			createTalent("BooteFahren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("FahrzeugLenken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Falschspiel", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Feinmechanik", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Fleischer", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("GerberKuerschner", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Grobschmied", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("HeilkundeGift", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("HeilkundeKrankheiten", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("HeilkundeSeele", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("HeilkundeWunden", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Holzbearbeitung", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Kartographie", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Kochen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Lederarbeiten", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("MalenZeichnen", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Musizieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("SchloesserKnacken", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Schneidern", TalentGruppe.HANDWERK, Talent.Typ.BASIS)

			createTalent("Seefahrt", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Steinmetz", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Steinschneider", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

			createTalent("Taetowieren", TalentGruppe.HANDWERK, Talent.Typ.SPEZIAL)

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

	void createSprache(String name) {
		createSprache name, null
	}

	void createSprache(String name, SKT kosten) {
		new Sprache(name: name, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}

	void createSchrift(String name) {
		createSchrift name, null
	}

	void createSchrift(String name, SKT kosten) {
		new Schrift(name: name, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}


	void createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ) {
		createTalent name, talentGruppe, typ, null
	}

	void createTalent(String name, TalentGruppe talentGruppe, Talent.Typ typ, SKT kosten) {
		new Talent(name: name, talentGruppe: talentGruppe, typ: typ, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}


	def destroy = {
	}
}
