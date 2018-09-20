package casino;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest {

	@Test
	void testDice() {
		fail("Not yet implemented");
	}

	@Test
	void testDiceInt() {
		Dice d1 = new Dice(2);
		assertEquals(2, d1.getFaceValue());
		
		Dice d2 = null;
		assertNull(d2);
	}

	@Test
	void testRoll() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFaceValue() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFaceValue() {
		Dice d1 = new Dice(5); //whatever
		d1.setFaceValue(6);
		assertEquals(6, d1.getFaceValue());
		
		d1.setFaceValue(1000);
		assertEquals(6, d1.getFaceValue());
		
		d1.setFaceValue(-1);
		assertEquals(1, d1.getFaceValue());
	}

	@Test
	void testToString() {
		Dice d1 = new Dice(5);
		assertTrue(d1.toString().length() > 0);
	}

	@Test
	void testEqualsObject() {
		Dice d1 = new Dice(5);
		Dice d2 = new Dice(5);
		Dice d3 = new Dice(1);
		assertEquals(d1, d2);
		// or assertTrue(d1.equals(d2));
		// assertFalse(d1.equals(d3));
	}

}
