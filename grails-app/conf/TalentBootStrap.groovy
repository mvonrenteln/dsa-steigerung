import dsa.Quelle;
import dsa.held.Schrift;
import dsa.held.Sprache;
import dsa.held.Talent;
import dsa.held.TalentGruppe;
import dsa.steigerung.SKT;

class TalentBootStrap {

    def init = { servletContext ->
		
		if (!Talent.count()) {
			
		   /*
			* Kampf-TALENTE
			*/
		   Talent ANDERTHALBHAENDER =
			   new Talent( name: "Anderthalbhänder",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.E,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent ARMBRUST =
			   new Talent( name: "Armbrust",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.C,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent BOGEN =
			   new Talent( name: "Bogen",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.E,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent DOLCHE =
			   new Talent( name: "Dolche",
					   typ: Talent.Typ.BASIS, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent FECHTWAFFEN =
			   new Talent( name: "Fechtwaffen",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.E,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent HIEBWAFFEN =
			   new Talent( name: "Hiebwaffen",
					   typ: Talent.Typ.BASIS, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent INFANTERIEWAFFEN =
			   new Talent( name: "Infanteriewaffen",
					   typ: Talent.Typ.SPEZIAL,  kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent KETTENWAFFEN =
			   new Talent( name: "Kettenwaffen",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent LANZENREITEN =
			   new Talent( name: "Lanzenreiten",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent RAUFEN =
			   new Talent( name: "Raufen",
					   typ: Talent.Typ.BASIS, kosten: SKT.C,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent RINGEN =
			   new Talent( name: "Ringen",
					   typ: Talent.Typ.BASIS, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent SAEBEL =
			   new Talent( name: "Säbel",
					   typ: Talent.Typ.BASIS, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent SCHWERTER =
			   new Talent( name: "Schwerter",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.E,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent SPEERE =
			   new Talent( name: "Speere",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent STAEBE =
			   new Talent( name: "Stäbe",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent WURFBEILE =
			   new Talent( name: "Wurfbeile",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.C,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent WURFMESSER =
			   new Talent( name: "Wurfmesser",
					   typ: Talent.Typ.BASIS, kosten: SKT.C,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent WURFSPEERE =
			   new Talent( name: "Wurfspeere",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.C,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent ZWEIHAND_HIEBWAFFEN =
			   new Talent( name: "ZweihandHiebwaffen",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.D,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	   
		   Talent ZWEIHANDSCHWERTER =
			   new Talent( name: "Zweihandschwerter",
					   typ: Talent.Typ.SPEZIAL, kosten: SKT.E,
					   talentGruppe: TalentGruppe.KAMPF, quelle: Quelle.OFFIZIELL).save(failOnError: true);
				   
		   /*
		   * KOERPERLICHE TALENTE
		   */
		  Talent AKROBATIK = new Talent(
				  name: "Akrobatik",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ATHLETIK = new Talent(
				  name: "Athletik",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GAUKELEIEN = new Talent(
				  name: "Gaukeleien",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent KLETTERN = new Talent(
				  name: "Klettern",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent KOERPERBEHERRSCHUNG = new Talent(
				  name: "Koerperbeherrschung",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent REITEN = new Talent(
				  name: "Reiten",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SCHLEICHEN = new Talent(
				  name: "Schleichen",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS);
	  
		  Talent SCHWIMMEN = new Talent(
				  name: "Schwimmen",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SELBSTBEHERRSCHUNG = new Talent(
				  name: "Selbstbeherrschung",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SICH_VERSTECKEN = new Talent(
				  name: "SichVerstecken",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SINGEN = new Talent(
				  name: "Singen",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SINNENSCHAERFE = new Talent(
				  name: "Sinnenschaerfe",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent STIMMEN_IMITIEREN = new Talent(
				  name: "StimmenImitieren",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent TANZEN = new Talent(
				  name: "Tanzen",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent TASCHENDIEBSTAHL = new Talent(
				  name: "Taschendiebstahl",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ZECHEN = new Talent(
				  name: "Zechen",
				  talentGruppe: TalentGruppe.KOERPER,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * GESELLSCHAFTLICHE TALENTE
		   */
		  Talent BETOEREN = new Talent(
				  name: "Betoeren",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ETIKETTE = new Talent(
				  name: "Etikette",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GASSENWISSEN = new Talent(
				  name: "Gassenwissen",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent LEHREN = new Talent(
				  name: "Lehren",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MENSCHENKENNTNIS = new Talent(
				  name: "Menschenkenntnis",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SICH_VERKLEIDEN = new Talent(
				  name: "SichVerkleiden",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent UEBERREDEN = new Talent(
				  name: "Ueberreden",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent UEBERZEUGEN = new Talent(
				  name: "Ueberzeugen",
				  talentGruppe: TalentGruppe.GESELLSCHAFT,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * NATUR-TALENTE
		   */
		  Talent FAEHRTENSUCHEN = new Talent(
				  name: "Faehrtensuchen",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FALLENSTELLEN = new Talent(
				  name: "Fallenstellen",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FESSELN_ENTFESSELN = new Talent(
				  name: "FesselnEntfesseln",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FISCHEN_ANGELN = new Talent(
				  name: "FischenAngeln",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ORIENTIERUNG = new Talent(
				  name: "Orientierung",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent WETTERVORHERSAGE = new Talent(
				  name: "Wettervorhersage",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent WILDNISLEBEN = new Talent(
				  name: "Wildnisleben",
				  talentGruppe: TalentGruppe.NATUR,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * WISSENS-TALENTE
		   */
		  Talent ANATOMIE = new Talent(
				  name: "Anatomie",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent BRETT_WUERFELSPIELE = new Talent(
				  name: "BrettWuerfelspiele",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GEOGRAPHIE = new Talent(
				  name: "Geographie",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GESCHICHTSWISSEN = new Talent(
				  name: "Geschichtswissen",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GESTEINSKUNDE = new Talent(
				  name: "Gesteinskunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GOETTER_KULTE = new Talent(
				  name: "GoetterKulte",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HERALDIK = new Talent(
				  name: "Heraldik",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent KRIEGSKUNST = new Talent(
				  name: "Kriegskunst",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MAGIEKUNDE = new Talent(
				  name: "Magiekunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MECHANIK = new Talent(
				  name: "Mechanik",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent PFLANZENKUNDE = new Talent(
				  name: "Pflanzenkunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent RECHNEN = new Talent(
				  name: "Rechnen",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent RECHTSKUNDE = new Talent(
				  name: "Rechtskunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SAGEN_LEGENDEN = new Talent(
				  name: "SagenLegenden",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SCHAETZEN = new Talent(
				  name: "Schaetzen",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SPRACHENKUNDE = new Talent(
				  name: "Sprachenkunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent STAATSKUNST = new Talent(
				  name: "Staatskunst",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent STERNKUNDE = new Talent(
				  name: "Sternkunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent TIERKUNDE = new Talent(
				  name: "Tierkunde",
				  talentGruppe: TalentGruppe.WISSEN,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * SPRACHEN
		   */
		  Sprache ALAANI =
			  new Sprache( name: "Alaani", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache ASDHARIA =
			  new Sprache( name: "Asdharia", quelle: Quelle.OFFIZIELL, kosten: SKT.B).save(failOnError: true);
	  
		  Sprache ATAK =
			  new Sprache( name: "Atak", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache BOSPARANO =
			  new Sprache( name: "Bosparano", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache FUECHSISCH =
			  new Sprache( name: "Fuechsisch", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache GARETHI =
			  new Sprache( name: "Garethi", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache GOBLINISCH =
			  new Sprache( name: "Goblinisch", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache ISDIRA =
			  new Sprache( name: "Isdira", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache MOHISCH =
			  new Sprache( name: "Mohisch", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache NUJUKA =
			  new Sprache( name: "Nujuka", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache OLOARKH =
			  new Sprache( name: "Oloarkh", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache OLOGHAIJAN =
			  new Sprache( name: "Ologhaijan", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache ROGOLAN =
			  new Sprache( name: "Rogolan", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache RSSAHH =
			  new Sprache( name: "Rssahh", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache THORWALSCH =
			  new Sprache( name: "Thorwalsch", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache TULAMIDYA =
			  new Sprache( name: "Tulamidya", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache UR_TULAMIDYA =
			  new Sprache( name: "UrTulamidya", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Sprache ZHAYAD =
			  new Sprache( name: "Zhayad", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   *  SCHRIFTEN
		   */
		  Schrift ASDHARIA_SCHRIFT =
			  new Schrift( name: "AsdhariaSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift CHRMK =
			  new Schrift( name: "Chrmk", quelle: Quelle.OFFIZIELL, kosten: SKT.B).save(failOnError: true);
	  
		  Schrift GLYPHEN_VON_UNAU =
			  new Schrift( name: "GlyphenVonUnau", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift HJALDINGSCHE_RUNEN =
			  new Schrift( name: "HjaldingscheRunen", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift ISDIRA_SCHRIFT =
			  new Schrift( name: "IsdiraSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift KUSLIKER_ZEICHEN =
			  new Schrift( name: "KuslikerZeichen", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift NANDURIA =
			  new Schrift( name: "Nanduria", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift ROGOLAN_SCHRIFT =
			  new Schrift( name: "RogolanSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift TULAMIDYA_SCHRIFT =
			  new Schrift( name: "TulamidyaSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift UR_TULAMIDYA_SCHRIFT =
			  new Schrift( name: "UrTulamidyaSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Schrift ZHAYAD_SCHRIFT =
			  new Schrift( name: "ZhayadSchrift", quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * HANDWERKS-TALENTE
		   */
		  Talent ABRICHTEN = new Talent(
				  name: "Abrichten",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ACKERBAU = new Talent(
				  name: "Ackerbau",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ALCHIMIE = new Talent(
				  name: "Alchimie",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent BERGBAU = new Talent(
				  name: "Bergbau",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent BOGENBAU = new Talent(
				  name: "Bogenbau",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent BOOTE_FAHREN = new Talent(
				  name: "BooteFahren",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FAHRZEUG_LENKEN = new Talent(
				  name: "FahrzeugLenken",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FALSCHSPIEL = new Talent(
				  name: "Falschspiel",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FEINMECHANIK = new Talent(
				  name: "Feinmechanik",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent FLEISCHER = new Talent(
				  name: "Fleischer",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GERBER_KUERSCHNER = new Talent(
				  name: "GerberKuerschner",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent GROBSCHMIED = new Talent(
				  name: "Grobschmied",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HEILKUNDE_GIFT = new Talent(
				  name: "HeilkundeGift",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HEILKUNDE_KRANKHEITEN = new Talent(
				  name: "HeilkundeKrankheiten",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HEILKUNDE_SEELE = new Talent(
				  name: "HeilkundeSeele",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HEILKUNDE_WUNDEN = new Talent(
				  name: "HeilkundeWunden",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent HOLZBEARBEITUNG = new Talent(
				  name: "Holzbearbeitung",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent KARTOGRAPHIE = new Talent(
				  name: "Kartographie",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent KOCHEN = new Talent(
				  name: "Kochen",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent LEDERARBEITEN = new Talent(
				  name: "Lederarbeiten",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MALEN_ZEICHNEN = new Talent(
				  name: "MalenZeichnen",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MUSIZIEREN = new Talent(
				  name: "Musizieren",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SCHLOESSER_KNACKEN = new Talent(
				  name: "SchloesserKnacken",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SCHNEIDERN = new Talent(
				  name: "Schneidern",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.BASIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent SEEFAHRT = new Talent(
				  name: "Seefahrt",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent STEINMETZ = new Talent(
				  name: "Steinmetz",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent STEINSCHNEIDER = new Talent(
				  name: "Steinschneider",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent TAETOWIEREN = new Talent(
				  name: "Taetowieren",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ZIMMERMANN = new Talent(
				  name: "Zimmermann",
				  talentGruppe: TalentGruppe.HANDWERK,
				  typ: Talent.Typ.SPEZIAL, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * GABEN
		   */
		  Talent GEFAHRENINSTINKT = new Talent(
				  name: "Gefahreninstinkt",
				  talentGruppe: TalentGruppe.GABEN,
				  typ: Talent.Typ.GABE, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent MAGIEGESPUER = new Talent(
				  name: "Magiegespuer",
				  talentGruppe: TalentGruppe.GABEN,
				  typ: Talent.Typ.GABE, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent PROPHEZEIEN = new Talent(
				  name: "Prophezeien",
				  talentGruppe: TalentGruppe.GABEN,
				  typ: Talent.Typ.GABE, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  Talent ZWERGENNASE = new Talent(
				  name: "Zwergennase",
				  talentGruppe: TalentGruppe.GABEN,
				  typ: Talent.Typ.GABE, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	  
		  /*
		   * RITUALKENNTNIS
		   */
		  Talent RITUALKENNTNIS = new Talent(
				  name: "Ritualkenntnis",
				  talentGruppe: TalentGruppe.RITUALKENNTNIS,
				  typ: Talent.Typ.RITUALKENNTNIS, quelle: Quelle.OFFIZIELL).save(failOnError: true);
			  
		}
    }
	
    def destroy = {
    }
}
