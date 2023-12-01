package de.htwg.swen;

public class DemoCoverage {
	static int addieren ( int a, int b) throws RuntimeException {
		int ergebnis = 0;
		
		if (a < 0 || b <0)  {
			ergebnis = -1;
		} else {
			ergebnis = a+ b;
		}
		return(ergebnis);
	}

}
