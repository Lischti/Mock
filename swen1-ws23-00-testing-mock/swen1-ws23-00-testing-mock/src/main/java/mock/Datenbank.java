package mock;

public interface Datenbank {

    boolean save(Patient patient);

    boolean update(Patient patient);

    Patient findById(int id);

}
