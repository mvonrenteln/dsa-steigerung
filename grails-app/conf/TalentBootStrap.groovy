import dsa.held.Talent;

class BootStrap {

    def init = { servletContext ->
		
		if (!Talent.count()) {
			
		   /*
			* Kampf-TALENTE
			*/
		   Talent ANDERTHALBHAENDER =
			   new Talent( name: "Anderthalbhänder",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent ARMBRUST =
			   new Talent( name: "Armbrust",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent BOGEN =
			   new Talent( name: "Bogen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent DOLCHE =
			   new Talent( name: "Dolche",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent FECHTWAFFEN =
			   new Talent( name: "Fechtwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent HIEBWAFFEN =
			   new Talent( name: "Hiebwaffen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent INFANTERIEWAFFEN =
			   new Talent( name: "Infanteriewaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent KETTENWAFFEN =
			   new Talent( name: "Kettenwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent LANZENREITEN =
			   new Talent( name: "Lanzenreiten",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent RAUFEN =
			   new Talent( name: "Raufen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent RINGEN =
			   new Talent( name: "Ringen",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent SAEBEL =
			   new Talent( name: "Säbel",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent SCHWERTER =
			   new Talent( name: "Schwerter",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent SPEERE =
			   new Talent( name: "Speere",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent STAEBE =
			   new Talent( name: "Stäbe",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent WURFBEILE =
			   new Talent( name: "Wurfbeile",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent WURFMESSER =
			   new Talent( name: "Wurfmesser",
					   typ: Talent.Typ.BASIS,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent WURFSPEERE =
			   new Talent( name: "Wurfspeere",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent ZWEIHAND_HIEBWAFFEN =
			   new Talent( name: "ZweihandHiebwaffen",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
	   
		   Talent ZWEIHANDSCHWERTER =
			   new Talent( name: "Zweihandschwerter",
					   typ: Talent.Typ.SPEZIAL,
					   talentGruppe: TalentGruppe.KAMPF );
		}
    }
	
    def destroy = {
    }
}
