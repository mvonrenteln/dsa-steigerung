package dsa.imports

import dsa.held.Talent

/**
 * Der Helden-Importer importiert einen aus Helden exportierten Charakter.
 * 
 * @author marcvonrenteln
 *
 */
class HeldenImporter {
	
	/**
	 * Helden verwendet teilweise andere Schreibweisen für Talente.
	 * Diese Map dient als Konverter.
	 */
	def talentMapping = [
		/* Schreibweise Hier - Schreibweise in Helden */
		"Zweihand-Hiebwaffen": "Zweihandhiebwaffen",
		"Sich Verstecken": "Sich verstecken",
		"Stimmen Imitieren": "Stimmen imitieren",
		"Sich Verkleiden": "Sich verkleiden",
		"Fallenstellen": "Fallen stellen",
		"Brettspiel": "Brett-/Kartenspiel",
		"Geographie": "Geografie",
		"Götter/Kulte": "Götter und Kulte",
		"Sagen/Legenden": "Sagen und Legenden",
		"Boote Fahren": "Boote fahren",
		"Fahrzeug Lenken": "Fahrzeug lenken",
		"Heilkunde Gift": "Heilkunde: Gift",
		"Heilkunde Krankheiten": "Heilkunde: Krankheiten",
		"Heilkunde Seele": "Heilkunde: Seele",
		"Heilkunde Wunden": "Heilkunde: Wunden",
		"Kartographie": "Kartografie",
		"Schlösser Knacken": "Schlösser knacken",
		"Stoffe Färben": "Stoffe färben"
	]
	
	String getMappedName(Talent talent) {
		return talentMapping[talent.name] ?: talent.name
	}

}
