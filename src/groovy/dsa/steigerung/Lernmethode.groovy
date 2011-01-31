package dsa.steigerung


enum Lernmethode {
	
	SPEZIELLE_ERFAHRUNG, LEHRMEISTER, GEGENSEITIG, SELBSTSTUDIUM
}

//public final int bestimmeSteigerungsfaktor(
//	final Steigerbar steigerbar ) {
//
//switch ( this ) {
//case SPEZIELLE_ERFAHRUNG:
//case LEHRMEISTER:
//	return ( -1 + steigerbar.getSteigerungsspalte() );
//
//case GEGENSEITIG:
//case KEINE:
//	return steigerbar.getSteigerungsspalte();
//
//case SELBSTSTUDIUM:
//	return ( 1 + steigerbar.getSteigerungsspalte() );
//
//default:
//	throw new RuntimeException( String.format(
//			"Die Lernmethode %1$s ist noch nicht in die Methode " +
//			"eingebunden.", this.getName() ) );
//}
//}