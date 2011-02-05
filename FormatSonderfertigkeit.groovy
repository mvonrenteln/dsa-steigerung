
String liste = """Akklimatisierung
Aurapanzer
Berufsgeheimnis
Dschungelkundig
Eiserner Wille I
Eiserner Wille II
Eiskundig
Fälscher
Gebirgskundig
Gedankenschutz
Geländekunde
Höhlenkundig
Kulturkunde
Maraskankundig
Meereskundig
Meister der Improvisation
Nandusgefälliges Wissen
Ortskenntnis
Rosstäuscher
Standfest
Steppenkundig
Sumpfkundig
Talentspezialisierung
Waldkundig
Wüstenkundig"""

liste.eachLine {  println """createSonderfertigkeit("$it",Sonderfertigkeit.Typ.ALLGEMEIN);\n""" }
