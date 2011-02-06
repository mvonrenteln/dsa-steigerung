package dsa.held

import dsa.util.EnumHelper;

enum Merkmal {

	ANTIMAGIE, BESCHWOERUNG, DAEMONISCH_ALLGEMEIN, DAEMONISCH_EINZEL, EIGENSCHAFTEN, EINFLUSS, ELEMENTAR_ALLGEMEIN,
	ELEMENTAR_EIS, ELEMENTAR_ERZ, ELEMENTAR_FEUER, ELEMENTAR_HUMUS, ELEMENTAR_LUFT, ELEMENTAR_WASSER,
	FORM, GEISTERWESEN, HEILUNG, HELLSICHT, HERBEIRUFUNG, HERRSCHAFT, ILLUSION, KRAFT, LIMBUS, METAMAGIE,
	OBJEKT, SCHADEN, TELEKINESE, TEMPORAL, UMWELT, VERSTAENDIGUNG

	String name

	Merkmal() {
		this.name = EnumHelper.enumToString(this)
	}

	String toString() {
		return name
	}
}