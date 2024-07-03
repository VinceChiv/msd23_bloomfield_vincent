# Was ist notwendig um Maven Site Dokumentation zu generieren?
`mvn site` um maven Seite Dokumentation zu erzeugen.
# Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?
- `site.xml` declares the structure of the maven site documentation.
- `pom.xml` requires the plugins necessary for the maven site can document all specified javadoc comments and tests.