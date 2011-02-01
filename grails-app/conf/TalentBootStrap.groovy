import dsa.held.Talent;
import dsa.held.TalentGruppe;

class TalentBootStrap {

    def init = { servletContext ->
		
		if (!Talent.count()) {
			
		   /*
			* Kampf-TALENTE
			*/
		   Talent ANDERTHALBHAENDER =
			   new Talent( name: "Anderthalbhänder",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent ARMBRUST =
			   new Talent( name: "Armbrust",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent BOGEN =
			   new Talent( name: "Bogen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent DOLCHE =
			   new Talent( name: "Dolche",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent FECHTWAFFEN =
			   new Talent( name: "Fechtwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent HIEBWAFFEN =
			   new Talent( name: "Hiebwaffen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent INFANTERIEWAFFEN =
			   new Talent( name: "Infanteriewaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent KETTENWAFFEN =
			   new Talent( name: "Kettenwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent LANZENREITEN =
			   new Talent( name: "Lanzenreiten",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent RAUFEN =
			   new Talent( name: "Raufen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent RINGEN =
			   new Talent( name: "Ringen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent SAEBEL =
			   new Talent( name: "Säbel",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent SCHWERTER =
			   new Talent( name: "Schwerter",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent SPEERE =
			   new Talent( name: "Speere",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent STAEBE =
			   new Talent( name: "Stäbe",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent WURFBEILE =
			   new Talent( name: "Wurfbeile",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent WURFMESSER =
			   new Talent( name: "Wurfmesser",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent WURFSPEERE =
			   new Talent( name: "Wurfspeere",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent ZWEIHAND_HIEBWAFFEN =
			   new Talent( name: "ZweihandHiebwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
	   
		   Talent ZWEIHANDSCHWERTER =
			   new Talent( name: "Zweihandschwerter",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF ).save(failOnError: true);
		}
    }
	
    def destroy = {
    }
}
