package de.htwg.swen;

import static de.htwg.swen.DemoCoverage.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemoCoverage {

	@Test
	public void testPosAddieren() {
		assertEquals(3, addieren(1,2));
//		assertEquals(-1, addieren(-1,-2));
		//		assertEquals(-1, addieren(-1,2));
		//assertEquals(-1, addieren(1,-2));
	}
}
