/**
*  DSA-Steigerung an inofficial fan project based on content of the
*  german roleplaying game Das Schwarze Auge ® (DSA) (The Black Eye)
*  owned by Ulisses Medien & Spiel Distribution GmbH.
*
*  Copyright (C) 2011  Marc von Renteln (Code)
*  Copyright (C) 2007  Ulisses Medien & Spiel Distribution GmbH (Rules)
*
*  This program is free software: you can redistribute it and/or modify
*  it under the terms of the GNU Affero General Public License as
*  published by the Free Software Foundation, either version 3 of the
*  License, or (at your option) any later version.
*
*  This program is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU Affero General Public License for more details.
*
*  You should have received a copy of the GNU Affero General Public License
*  along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
import dsa.Quelle
import dsa.held.Merkmal
import dsa.held.Zauber
import dsa.steigerung.SKT



class ZauberBootStrap {

	def init = { servletContext ->
		if (!Zauber.count()) {
			
			createZauber("Abvenenum", [Merkmal.OBJEKT], SKT.C);
			
			createZauber("Accuratum", [Merkmal.OBJEKT], SKT.C);
			
			createZauber("Adamantium", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Adlerauge", [Merkmal.EIGENSCHAFTEN, Merkmal.HELLSICHT], SKT.B);
			
			createZauber("Adlerschwinge", [Merkmal.FORM], SKT.D);
			
			createZauber("Aeolitus", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.B);
			
			createZauber("Aerofugo", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.D);
			
			createZauber("Aerogelo", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.D);
			
			createZauber("Alpgestalt", [Merkmal.EINFLUSS, Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Analys", [Merkmal.HELLSICHT, Merkmal.METAMAGIE], SKT.D);
			
			createZauber("Ängste lindern", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Animatio", [Merkmal.TELEKINESE], SKT.E);
			
			createZauber("Applicatus", [Merkmal.METAMAGIE, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Arachnea", [Merkmal.HERBEIRUFUNG], SKT.D);
			
			createZauber("Arcanovi", [Merkmal.METAMAGIE, Merkmal.OBJEKT], SKT.E);
			
			createZauber("Archofaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Archosphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Armatrutz", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ], SKT.B);
			
			createZauber("Atemnot", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Attributo", [Merkmal.EIGENSCHAFTEN], SKT.B);
			
			createZauber("Aquafaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Aquasphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Aufgeblasen", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.FORM], SKT.C);
			
			createZauber("Auge des Limbus", [Merkmal.KRAFT, Merkmal.LIMBUS], SKT.E);
			
			createZauber("Aureolus", [Merkmal.ILLUSION], SKT.A);
			
			createZauber("Auris", [Merkmal.ILLUSION], SKT.D);
			
			createZauber("Axxeleratus", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Balsam", [Merkmal.FORM, Merkmal.HEILUNG], SKT.C);
			
			createZauber("Band und Fessel", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Bannbaladin", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Bärenruhe", [Merkmal.FORM], SKT.D);
			
			createZauber("Beherrschung brechen", [Merkmal.ANTIMAGIE, Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Beschwörung vereiteln", [Merkmal.ANTIMAGIE, Merkmal.BESCHWOERUNG], SKT.C);
			
			createZauber("Bewegung stören", [Merkmal.ANTIMAGIE, Merkmal.TELEKINESE], SKT.C);
			
			createZauber("Blendwerk", [Merkmal.ILLUSION], SKT.C);
			
			createZauber("Blick aufs Wesen", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Blick durch fremde Augen", [Merkmal.HELLSICHT, Merkmal.VERSTAENDIGUNG], SKT.E);
			
			createZauber("Blick in die Gedanken", [Merkmal.HELLSICHT], SKT.D);
			
			createZauber("Blick in die Vergangenheit", [Merkmal.HELLSICHT, Merkmal.TEMPORAL], SKT.D);
			
			createZauber("Blitz", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Böser Blick", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Brenne toter Stoff", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Caldofrigo", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.ELEMENTAR_FEUER, Merkmal.OBJEKT, Merkmal.UMWELT], SKT.E);
			
			createZauber("Chamelioni", [Merkmal.ILLUSION], SKT.C);
			
			createZauber("Chimaeroform", [Merkmal.DAEMONISCH, Merkmal.FORM], SKT.F);
			
			createZauber("Chronoklassis", [Merkmal.HERBEIRUFUNG, Merkmal.TEMPORAL], SKT.F);
			
			createZauber("Chrononautos", [Merkmal.TEMPORAL], SKT.F);
			
			createZauber("Claudibus", [Merkmal.OBJEKT], SKT.C);
			
			createZauber("Corpofesso", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Corpofrigo", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS], SKT.C);
			
			createZauber("Cryptographo", [Merkmal.OBJEKT, Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Custodosigil", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.METAMAGIE, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Dämonenbann", [Merkmal.ANTIMAGIE, Merkmal.DAEMONISCH], SKT.C);
			
			createZauber("Delicioso", [Merkmal.ILLUSION], SKT.D);
			
			createZauber("Desintegratus", [Merkmal.OBJEKT, Merkmal.SCHADEN], SKT.D);
			
			createZauber("Destructibo", [Merkmal.ANTIMAGIE, Merkmal.KRAFT, Merkmal.METAMAGIE], SKT.E);
			
			createZauber("Dichter und Denker", [Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Dschinnenruf", [Merkmal.ELEMENTAR, Merkmal.HERBEIRUFUNG], SKT.E);
			
			createZauber("Dunkelheit", [Merkmal.UMWELT], SKT.C);
			
			createZauber("Duplicatus", [Merkmal.ILLUSION], SKT.C);
			
			createZauber("Ecliptifactus", [Merkmal.DAEMONISCH, Merkmal.FORM], SKT.D);
			
			createZauber("Eigenschaft wiederherstellen", [Merkmal.ANTIMAGIE, Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Eigene Ängste", [Merkmal.EIGENSCHAFTEN, Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Einfluss bannen", [Merkmal.ANTIMAGIE, Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Eins mit der Natur", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR], SKT.C);
			
			createZauber("Eisenrost", [Merkmal.OBJEKT, Merkmal.TEMPORAL], SKT.C);
			
			createZauber("Eiseskälte", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Elementarbann", [Merkmal.ANTIMAGIE, Merkmal.ELEMENTAR], SKT.C);
			
			createZauber("Elementarer Diener", [Merkmal.ELEMENTAR, Merkmal.HERBEIRUFUNG], SKT.D);
			
			createZauber("Elfenstimme", [Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Erinnerung verlasse dich", [Merkmal.HERRSCHAFT], SKT.D);
			
			createZauber("Exposami", [Merkmal.HELLSICHT], SKT.B);
			
			createZauber("Falkenauge", [Merkmal.EIGENSCHAFTEN], SKT.B);
			
			createZauber("Favilludo", [Merkmal.ILLUSION], SKT.A);
			
			createZauber("Firnlauf", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS], SKT.D);
			
			createZauber("Flim Flam", [Merkmal.UMWELT], SKT.A);
			
			createZauber("Fluch der Pestilenz", [Merkmal.DAEMONISCH], SKT.D);
			
			createZauber("Foramen", [Merkmal.HELLSICHT, Merkmal.TELEKINESE], SKT.C);
			
			createZauber("Fortifex", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.UMWELT], SKT.D);
			
			createZauber("Frigifaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Frigisphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Fulminictus", [Merkmal.KRAFT, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Gardianum", [Merkmal.ANTIMAGIE, Merkmal.KRAFT, Merkmal.METAMAGIE], SKT.D);
			
			createZauber("Gletscherwand", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS], SKT.D);
			
			createZauber("Gedankenbilder", [Merkmal.VERSTAENDIGUNG], SKT.B);
			
			createZauber("Gefäss der Jahre", [Merkmal.FORM, Merkmal.TEMPORAL], SKT.E);
			
			createZauber("Gefunden", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Geisterbann", [Merkmal.ANTIMAGIE, Merkmal.GEISTERWESEN], SKT.C);
			
			createZauber("Geisterruf", [Merkmal.GEISTERWESEN, Merkmal.HERBEIRUFUNG], SKT.D);
			
			createZauber("Granit und Marmor", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.FORM], SKT.D);
			
			createZauber("Große Gier", [Merkmal.EINFLUSS, Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Große Verwirrung", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Halluzination", [Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Harmlose Gestalt", [Merkmal.EINFLUSS, Merkmal.ILLUSION], SKT.C);
			
			createZauber("Hartes schmelze", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Haselbusch", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.FORM], SKT.D);
			
			createZauber("Heilkraft bannen", [Merkmal.ANTIMAGIE, Merkmal.HEILUNG], SKT.C);
			
			createZauber("Hellsicht trüben", [Merkmal.ANTIMAGIE, Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Herbeirufung vereiteln", [Merkmal.ANTIMAGIE, Merkmal.HERBEIRUFUNG], SKT.C);
			
			createZauber("Herr über das Tierreich", [Merkmal.HERRSCHAFT], SKT.D);
			
			createZauber("Herzschlag Ruhe", [Merkmal.DAEMONISCH, Merkmal.EIGENSCHAFTEN, Merkmal.EINFLUSS], SKT.D);
			
			createZauber("Hexenblick", [Merkmal.VERSTAENDIGUNG], SKT.B);
			
			createZauber("Hexengalle", [Merkmal.SCHADEN], SKT.C);
			
			createZauber("Hexenholz", [Merkmal.TELEKINESE], SKT.B);
			
			createZauber("Hexenknoten", [Merkmal.EINFLUSS, Merkmal.ILLUSION], SKT.C);
			
			createZauber("Hexenkrallen", [Merkmal.EIGENSCHAFTEN, Merkmal.FORM], SKT.C);
			
			createZauber("Hexenspeichel", [Merkmal.HEILUNG], SKT.C);
			
			createZauber("Hilfreiche Tatze", [Merkmal.EINFLUSS, Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Höllenpein", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Holterdipolter", [Merkmal.UMWELT], SKT.C);
			
			createZauber("Horriphobus", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Humofaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Humosphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Ignifaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Ignisphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Ignorantia", [Merkmal.EINFLUSS, Merkmal.ILLUSION], SKT.D);
			
			createZauber("Illusion auflösen", [Merkmal.ANTIMAGIE, Merkmal.ILLUSION], SKT.B);
			
			createZauber("Immortalis", [Merkmal.FORM, Merkmal.TEMPORAL], SKT.F);
			
			createZauber("Imperavi", [Merkmal.HERRSCHAFT], SKT.E);
			
			createZauber("Impersona", [Merkmal.ILLUSION], SKT.D);
			
			createZauber("Infinitum", [Merkmal.METAMAGIE, Merkmal.TEMPORAL], SKT.F);
			
			createZauber("Invercano", [Merkmal.ANTIMAGIE, Merkmal.KRAFT, Merkmal.METAMAGIE], SKT.F);
			
			createZauber("Invocatio Major", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.E);
			
			createZauber("Invocatio Minor", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.D);
			
			createZauber("Iribaars Hand", [Merkmal.EINFLUSS, Merkmal.SCHADEN], SKT.D);
			
			createZauber("Juckreiz", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Karnifilo", [Merkmal.EIGENSCHAFTEN, Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Katzenaugen", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Klarum Purum", [Merkmal.FORM, Merkmal.HEILUNG], SKT.D);
			
			createZauber("Klickeradomms", [Merkmal.TELEKINESE], SKT.A);
			
			createZauber("Koboldgeschenk", [Merkmal.HERRSCHAFT], SKT.C);
			
			createZauber("Koboldovision", [Merkmal.HELLSICHT, Merkmal.LIMBUS], SKT.D);
			
			createZauber("Komm Kobold komm", [Merkmal.HERBEIRUFUNG], SKT.C);
			
			createZauber("Körperlose Reise", [Merkmal.LIMBUS, Merkmal.VERSTAENDIGUNG], SKT.E);
			
			createZauber("Krabbelnder Schrecken", [Merkmal.DAEMONISCH, Merkmal.HERBEIRUFUNG], SKT.C);
			
			createZauber("Kraft des Erzes", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.OBJEKT], SKT.D);
			
			createZauber("Krähenruf", [Merkmal.EINFLUSS, Merkmal.HERBEIRUFUNG, Merkmal.LIMBUS], SKT.C);
			
			createZauber("Krötensprung", [Merkmal.EIGENSCHAFTEN], SKT.B);
			
			createZauber("Kulminatio", [Merkmal.SCHADEN], SKT.D);
			
			createZauber("Kusch", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Lach dich gesund", [Merkmal.EINFLUSS, Merkmal.HEILUNG], SKT.C);
			
			createZauber("Lachkrampf", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Langer Lulatsch", [Merkmal.FORM, Merkmal.OBJEKT], SKT.D);
			
			createZauber("Last des Alters", [Merkmal.FORM, Merkmal.TEMPORAL], SKT.E);
			
			createZauber("Leib des Eises", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.FORM], SKT.E);
			
			createZauber("Leib der Erde", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.FORM], SKT.D);
			
			createZauber("Leib des Erzes", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.FORM], SKT.E);
			
			createZauber("Leib des Feuers", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.FORM], SKT.E);
			
			createZauber("Leib des Windes", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.FORM], SKT.E);
			
			createZauber("Leib der Wogen", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.FORM], SKT.E);
			
			createZauber("Leidensbund", [Merkmal.HEILUNG, Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Levthans Feuer", [Merkmal.EINFLUSS, Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Limbus versiegeln", [Merkmal.ANTIMAGIE, Merkmal.LIMBUS], SKT.E);
			
			createZauber("Lockruf und Feenfüsse", [Merkmal.ILLUSION, Merkmal.TELEKINESE], SKT.B);
			
			createZauber("Lunge des Leviatan", [Merkmal.HEILUNG], SKT.C);
			
			createZauber("Madas Spiegel", [Merkmal.HELLSICHT, Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Magischer Raub", [Merkmal.KRAFT, Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Mahlstrom", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.UMWELT], SKT.D);
			
			createZauber("Manifesto", [Merkmal.ELEMENTAR], SKT.A);
			
			createZauber("Meister minderer Geister", [Merkmal.HERBEIRUFUNG], SKT.B);
			
			createZauber("Meister der Elemente", [Merkmal.ELEMENTAR, Merkmal.HERBEIRUFUNG], SKT.F);
			
			createZauber("Memorabia", [Merkmal.HERRSCHAFT], SKT.E);
			
			createZauber("Memorans", [Merkmal.EIGENSCHAFTEN, Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Mentekel", [Merkmal.ILLUSION], SKT.B);
			
			createZauber("Metamagie neutralisieren", [Merkmal.ANTIMAGIE, Merkmal.METAMAGIE], SKT.F);
			
			createZauber("Metamorpho Felsenform", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.OBJEKT], SKT.D);
			
			createZauber("Metamorpho Gletscherform", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Motoricus", [Merkmal.TELEKINESE], SKT.C);
			
			createZauber("Movimento", [Merkmal.EIGENSCHAFTEN], SKT.A);
			
			createZauber("Murks und Patz", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Nackedei", [Merkmal.OBJEKT, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Nebelleib", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.ELEMENTAR_WASSER, Merkmal.FORM], SKT.D);
			
			createZauber("Nebelwand", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.ELEMENTAR_WASSER, Merkmal.UMWELT], SKT.C);
			
			createZauber("Nekropathia", [Merkmal.GEISTERWESEN, Merkmal.VERSTAENDIGUNG], SKT.E);
			
			createZauber("Nihilogravo", [Merkmal.UMWELT], SKT.E);
			
			createZauber("Nuntiovolo", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.C);
			
			createZauber("Objecto Obscuro", [Merkmal.OBJEKT], SKT.D);
			
			createZauber("Objectofixo", [Merkmal.OBJEKT, Merkmal.TEMPORAL], SKT.D);
			
			createZauber("Objectovoco", [Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Objekt entzaubern", [Merkmal.ANTIMAGIE, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Oculus", [Merkmal.HELLSICHT, Merkmal.KRAFT, Merkmal.LIMBUS, Merkmal.METAMAGIE], SKT.E);
			
			createZauber("Odem", [Merkmal.HELLSICHT, Merkmal.KRAFT], SKT.A);
			
			createZauber("Orcanofaxius", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Orcanosphaero", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.SCHADEN, Merkmal.TELEKINESE], SKT.D);
			
			createZauber("Orkanwand", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT], SKT.D);
			
			createZauber("Pandämonium", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.D);
			
			createZauber("Panik", [Merkmal.EINFLUSS], SKT.E);
			
			createZauber("Papperlapapp", [Merkmal.EINFLUSS], SKT.D);
			
			createZauber("Paralysis", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.FORM], SKT.C);
			
			createZauber("Pectetondo", [Merkmal.FORM], SKT.B);
			
			createZauber("Penetrizzel", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Pentagramma", [Merkmal.ANTIMAGIE, Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH, Merkmal.GEISTERWESEN], SKT.D);
			
			createZauber("Pestilenz erspüren", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Pfeil des Eises", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Pfeil des Erzes", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Pfeil des Feuers", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Pfeil des Humus", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Pfeil der Luft", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Pfeil des Wassers", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Planastrale", [Merkmal.LIMBUS], SKT.F);
			
			createZauber("Plumbumbarum", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Projectimago", [Merkmal.ILLUSION, Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Protectionis", [Merkmal.ANTIMAGIE, Merkmal.KRAFT, Merkmal.METAMAGIE], SKT.F);
			
			createZauber("Psychostabilis", [Merkmal.ANTIMAGIE, Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Radau", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.TELEKINESE], SKT.C);
			
			createZauber("Reflectimago", [Merkmal.ILLUSION], SKT.B);
			
			createZauber("Reptilea", [Merkmal.HERBEIRUFUNG], SKT.D);
			
			createZauber("Respondami", [Merkmal.HERRSCHAFT], SKT.B);
			
			createZauber("Reversalis", [Merkmal.METAMAGIE], SKT.E);
			
			createZauber("Ruhe Körper, Ruhe Geist", [Merkmal.HEILUNG], SKT.B);
			
			createZauber("Salander", [Merkmal.FORM], SKT.E);
			
			createZauber("Sanftmut", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Sapefacta", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.ELEMENTAR_WASSER, Merkmal.TELEKINESE], SKT.C);
			
			createZauber("Satuarias Herrlichkeit", [Merkmal.EIGENSCHAFTEN, Merkmal.ILLUSION], SKT.B);
			
			createZauber("Schabernack", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Schadenszauber bannen", [Merkmal.ANTIMAGIE, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Schelmenkleister", [Merkmal.UMWELT], SKT.C);
			
			createZauber("Schelmenlaune", [Merkmal.EINFLUSS], SKT.D);
			
			createZauber("Schelmenmaske", [Merkmal.ILLUSION], SKT.D);
			
			createZauber("Schelmenrausch", [Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Schleier der Unwissenheit", [Merkmal.EIGENSCHAFTEN, Merkmal.METAMAGIE], SKT.D);
			
			createZauber("Schwarz und Rot", [Merkmal.EIGENSCHAFTEN, Merkmal.SCHADEN], SKT.D);
			
			createZauber("Schwarzer Schrecken", [Merkmal.EINFLUSS], SKT.D);
			
			createZauber("Seelentier erkennen", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Seelenwanderung", [Merkmal.EIGENSCHAFTEN, Merkmal.VERSTAENDIGUNG], SKT.F);
			
			createZauber("Seidenweich", [Merkmal.ILLUSION], SKT.C);
			
			createZauber("Seidenzunge", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Sensattacco", [Merkmal.EIGENSCHAFTEN, Merkmal.HELLSICHT], SKT.D);
			
			createZauber("Sensibar", [Merkmal.HELLSICHT], SKT.C);
			
			createZauber("Serpentialis", [Merkmal.FORM], SKT.D);
			
			createZauber("Silentium", [Merkmal.UMWELT], SKT.B);
			
			createZauber("Sinesigil", [Merkmal.ILLUSION], SKT.D);
			
			createZauber("Skelettarius", [Merkmal.DAEMONISCH], SKT.C);
			
			createZauber("Solidirid", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.D);
			
			createZauber("Somnigravis", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Spinnenlauf", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Spurlos", [Merkmal.UMWELT], SKT.C);
			
			createZauber("Standfest Katzengleich", [Merkmal.EIGENSCHAFTEN], SKT.C);
			
			createZauber("Staub wandle", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ], SKT.E);
			
			createZauber("Stein wandle", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.E);
			
			createZauber("Stillstand", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_EIS, Merkmal.UMWELT], SKT.E);
			
			createZauber("Sumus Elixiere", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS], SKT.C);
			
			createZauber("Tauschrausch", [Merkmal.LIMBUS], SKT.D);
			
			createZauber("Tempus Stasis", [Merkmal.TEMPORAL], SKT.E);
			
			createZauber("Tiere besprechen", [Merkmal.FORM, Merkmal.HEILUNG], SKT.C);
			
			createZauber("Tiergedanken", [Merkmal.HELLSICHT, Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Tlalucs Odem", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Totes Handle", [Merkmal.BESCHWOERUNG, Merkmal.DAEMONISCH], SKT.D);
			
			createZauber("Transformatio", [Merkmal.OBJEKT], SKT.E);
			
			createZauber("Transmutare", [Merkmal.FORM], SKT.D);
			
			createZauber("Transversalis", [Merkmal.LIMBUS], SKT.E);
			
			createZauber("Traumgestalt", [Merkmal.VERSTAENDIGUNG], SKT.D);
			
			createZauber("Unberührt von Satinav", [Merkmal.OBJEKT, Merkmal.TEMPORAL], SKT.C);
			
			createZauber("Unitatio", [Merkmal.KRAFT, Merkmal.VERSTAENDIGUNG], SKT.B);
			
			createZauber("Unsichtbarer Jäger", [Merkmal.ILLUSION], SKT.E);
			
			createZauber("Veränderung aufheben", [Merkmal.ANTIMAGIE, Merkmal.UMWELT], SKT.D);
			
			createZauber("Verschwindibus", [Merkmal.LIMBUS], SKT.C);
			
			createZauber("Verständigung stören", [Merkmal.ANTIMAGIE, Merkmal.VERSTAENDIGUNG], SKT.C);
			
			createZauber("Verwandlung beenden", [Merkmal.ANTIMAGIE, Merkmal.FORM], SKT.D);
			
			createZauber("Vipernblick", [Merkmal.EINFLUSS], SKT.B);
			
			createZauber("Visibili", [Merkmal.FORM], SKT.C);
			
			createZauber("Vocolimbo", [Merkmal.ILLUSION], SKT.B);
			
			createZauber("Vogelzwitschern", [Merkmal.ILLUSION], SKT.B);
			
			createZauber("Wand aus Dornen", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS], SKT.D);
			
			createZauber("Wand aus Erz", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ], SKT.D);
			
			createZauber("Wand aus Flammen", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER], SKT.D);
			
			createZauber("Wand aus Wogen", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER], SKT.D);
			
			createZauber("Warmes Blut", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_FEUER, Merkmal.HELLSICHT], SKT.B);
			
			createZauber("Wasseratem", [Merkmal.FORM], SKT.C);
			
			createZauber("Weiches erstarre", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.UMWELT], SKT.C);
			
			createZauber("Weihrauchwolke", [Merkmal.ILLUSION], SKT.B);
			
			createZauber("Weisheit der Bäume", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS, Merkmal.FORM], SKT.D);
			
			createZauber("Weisse Mähn", [Merkmal.BESCHWOERUNG], SKT.D);
			
			createZauber("Wellenlauf", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_WASSER], SKT.D);
			
			createZauber("Wettermeisterschaft", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.E);
			
			createZauber("Widerwille", [Merkmal.EINFLUSS, Merkmal.ILLUSION], SKT.D);
			
			createZauber("Windhose", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.D);
			
			createZauber("Windstille", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_LUFT, Merkmal.UMWELT], SKT.C);
			
			createZauber("Wipfellauf", [Merkmal.EIGENSCHAFTEN, Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_HUMUS], SKT.D);
			
			createZauber("Xenographus", [Merkmal.HELLSICHT], SKT.E);
			
			createZauber("Zagibu", [Merkmal.ELEMENTAR, Merkmal.ELEMENTAR_ERZ, Merkmal.OBJEKT], SKT.C);
			
			createZauber("Zappenduster", [Merkmal.ANTIMAGIE, Merkmal.UMWELT], SKT.C);
			
			createZauber("Zauberklinge", [Merkmal.KRAFT, Merkmal.OBJEKT], SKT.D);
			
			createZauber("Zaubernahrung", [Merkmal.EIGENSCHAFTEN, Merkmal.EINFLUSS], SKT.C);
			
			createZauber("Zauberwesen der Natur", [Merkmal.HERBEIRUFUNG, Merkmal.VERSTAENDIGUNG], SKT.B);
			
			createZauber("Zauberzwang", [Merkmal.HERRSCHAFT, Merkmal.SCHADEN], SKT.E);
			
			createZauber("Zorn der Elemente", [Merkmal.ELEMENTAR, Merkmal.SCHADEN], SKT.C);
			
			createZauber("Zunge lähmen", [Merkmal.EIGENSCHAFTEN], SKT.B);
			
			createZauber("Zwingtanz", [Merkmal.HERRSCHAFT], SKT.D);
			
		}
	}
	
	Zauber createZauber(String name, List merkmale, SKT kosten) {
		return new Zauber(name: name, merkmale: merkmale, kosten: kosten, quelle: Quelle.OFFIZIELL).save(failOnError: true);
	}
	
	def destroy = {
	}
}
