package mock;

public class PatientenVerwaltung {

    private Datenbank datenbank;

    public PatientenVerwaltung(Datenbank datenbank) {
        this.datenbank = datenbank;
    }

    public PatientenVerwaltung() {
        // während der Entwicklung der Datenbankschnittstelle gibt es lediglich das Interface!
        this(null);
    }

    public boolean addPatient(Patient patient) {
        // Implementierung zum Hinzufügung eines Patienten
        if (patient == null)
            throw new IllegalArgumentException("Missing Patient Info");
        return datenbank.save(patient);
    }

    public boolean updatePatient(Patient patient) {
        // Implementierung zur Aktualisierung eines Patienten
        if (patient == null)
            throw new IllegalArgumentException("Missing Patient Info");
        return datenbank.update(patient);
    }

    public Patient getPatientById(int id) {
       
        // Implementierung zur Abfrage eines Patienten
        if (id <=0  )
            throw new IllegalArgumentException("Missing Patient Info");
        return datenbank.findById(id);
    }
}
