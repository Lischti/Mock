package swen.testing.pzn;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestingSearchPzn {
	
	// Aspirin 0 249 505 2
	@InjectMocks
	SearchPzn search; 

	@Mock
	PznService mockService;
	  
	@Before
	public void setup() {
		search = new SearchPzn();
		MockitoAnnotations.initMocks(this);
	}
	 
	@Test
	public void test_validPznIsReturned() {
		Mockito.when(mockService.getNameOfDrug("12345678"))
			.thenReturn("foo"); // Mockito.anyString()
	  	
		// Vorbereiten / Durchführen
		String result = search.search("12345678");
		// Bewerten
		assertEquals("foo", result);
		// Verhalten
		Mockito.verify(mockService, Mockito.times(1))
			.getNameOfDrug(Mockito.anyString());
	}
	
	@Test
	public void test_invalidPzn() {
		// Vorbereiten / Durchführen
		String result = search.search("");
		// Bewerten
		assertEquals(SearchPzn.UNDEFINED, result);
		// Verhalten
		Mockito.verify(mockService, Mockito.never()).getNameOfDrug(Mockito.anyString());
	}
	
}
