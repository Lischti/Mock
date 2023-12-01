package mock;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestPatientenVerwaltung {

    @Mock
    private Datenbank mockDatenbank;
    @InjectMocks
    private PatientenVerwaltung verwaltung;

    @Before
    public void setUp() {
        verwaltung = new PatientenVerwaltung();
//        MockitoAnnotations.initMocks(this); // deprecated in Mockito
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddExistingPatient() {
        Patient patient = new Patient();
        when(mockDatenbank.save(patient)).thenReturn(true);

        assertTrue(verwaltung.addPatient(patient));
        verify(mockDatenbank, times(1)).save(patient);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEmptyPatient() {
        assertTrue(verwaltung.addPatient(null));
    }

    // Weitere Tests für updatePatient und getPatientById
}
