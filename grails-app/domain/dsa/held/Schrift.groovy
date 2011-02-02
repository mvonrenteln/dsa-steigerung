package dsa.held

class Schrift extends Talent {

   /**
	* Die Komplexitaet ist die Hoechststufe auf die die Schrift
	* gesteigert werden kann.
	*/
   private int komplexitaet;
  
   Schrift() {
	   talentGruppe = TalentGruppe.SCHRIFTEN
		typ = Talent.Typ.SPEZIAL
   }
}
