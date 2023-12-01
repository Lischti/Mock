# Testing.Mock

## Code Coverage

Quelldateien in `src/main/java` in Klasse `de.htwg.swen.DemoCoverage`

- VScode extension `Coverage Gutters` (https://marketplace.visualstudio.com/items?itemName=ryanluker.vscode-coverage-gutters) installieren

- *Terminal* in VScode öffnen
- Tests ausführen mit `mvn test` ggfalls `mvn clean test`
- Test Reports erzeugen mit `mvn jacoco:report`
- Öffnen der Reports im Browser mit `open target/site/jacoco/jacoco-sessions.html`
- Anzeige der Code Coverage in VScode: Öffnen des Produktionscode Klasse DemoCoverage - `de.htwg.swen.DemoCoverage`

## Mock Testing

- Mocking Framework Mockito unter https://site.mockito.org

- Quelldateien in `src/main/java` in Klasse `swen.testing.pzn.SearchPzn`


## Patientenverwaltung

Diese Übung soll Ihnen helfen, das Konzept des mockbasierten Testens zu verstehen und anzuwenden, insbesondere in Bezug auf die Interaktion mit externen Systemen wie Datenbanken. Es ist wichtig, dass Sie lernen, wie Sie Ihre Tests isolieren können, um nur die Funktionalität der zu testenden Komponente zu überprüfen, ohne von externen Abhängigkeiten beeinflusst zu werden.

---

Aufgabe: Mocking der Datenbankverbindung. 

Da Sie während des Testens nicht auf eine echte Datenbank zugreifen möchten, verwenden Sie das Framework Mockito, um das Datenbank-Interface in Java zu mocken. Stellen Sie sicher, dass die Mock-Objekte so konfiguriert sind, dass sie das erwartete Verhalten der Datenbank simulieren.

- Testfälle erstellen:
  - Hinzufügen eines Patienten: Schreiben Sie einen Test, der überprüft, ob ein neuer Patient korrekt zur Datenbank hinzugefügt wird.
  - Aktualisieren von Patientendaten: Implementieren Sie einen Test, der sicherstellt, dass die Daten eines bestehenden Patienten korrekt aktualisiert werden.
  - Abrufen von Patientendaten: Entwickeln Sie einen Test, der überprüft, ob die Abfrage von Patientendaten wie erwartet funktioniert.

- Verifizierung der Interaktionen: Verwenden Sie Mockito, um zu verifizieren, dass die Patientenverwaltung-Klasse die richtigen Methoden des Datenbank-Mock-Objekts mit den korrekten Parametern aufruft.
- Behandlung von Ausnahmesituationen: Schreiben Sie Testfälle, die überprüfen, wie Ihre Komponente auf verschiedene Arten von Ausnahmesituationen reagiert, z.B. wenn die Datenbank nicht erreichbar ist oder ungültige Daten übergeben werden.
- Berichterstattung: Implementieren Sie eine Möglichkeit, die Testabdeckung und die Ergebnisse der Testläufe zu dokumentieren (Code Coverage).