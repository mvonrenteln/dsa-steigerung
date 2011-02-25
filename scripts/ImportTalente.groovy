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


String heldenXml = new File("scripts/Helden-Talent-Import.xml").text
def held = new XmlSlurper().parseText(heldenXml).held[0]


// Talente mit zugehörigen Werten aus der XML-Datei lesen
def talente = [:]
held.talent.each {
	def probe = it.@probe.text().trim()[1..-2]
	List werte = probe.tokenize("/")
	talente[it.@name.text()] = werte
}

String talentBootstap = ""
File bootstrapFile = new File("grails-app/conf/TalentBootStrap.groovy")
bootstrapFile.eachLine( "UTF-8") { String line ->
	def modifiedLine = line
	if (line =~ /.*createTalent.*/) {
		def matcher = (line =~ /".*"/)
		if (matcher) {
			def talentName = matcher[0]
			talentName = talentName[1..-2]
			def mappedName = talentMapping[talentName] ?: talentName
			def probe = talente[mappedName]
			if (probe != null) {
				modifiedLine = modifiedLine.replace(")", ", $probe)")
			} else {
				println "$talentName nicht gefunden"
			}
		}
	}
	talentBootstap += modifiedLine + "\n"
}

bootstrapFile.text = talentBootstap


