package dsa.util

import org.apache.commons.lang.WordUtils

class EnumHelper {

	public static String enumToString(def instance) {
		def name = instance.name()?.replaceAll("_", " ")
		name = name?.replaceAll("_", " ")
		name = name?.replaceAll("AE", "Ä")
		name = name?.replaceAll("OE", "Ö")
		name = name?.replaceAll("UE", "Ü")
		return WordUtils.capitalizeFully(name)
	}
}
