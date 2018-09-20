import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StorageBoxTest {

	@Test
	void testIsEmpty() {
		StorageBox a = new StorageBox();
		assertTrue(a.isEmpty());

		a.push(new Object());
		assertFalse(a.isEmpty());

		a.push(new Object());
		assertFalse(a.isEmpty());

		a.pop();
		assertFalse(a.isEmpty());

		a.pop();
		assertTrue(a.isEmpty());

		a.pop();
		assertTrue(a.isEmpty());

	}

	@Test
	void testIsFull() {
		StorageBox a = new StorageBox();
		assertFalse(a.isFull());

		a.push(new Object());
		a.push(new Object());
		a.push(new Object());
		a.push(new Object());
		assertFalse(a.isFull());

		a.push(new Object());
		assertTrue(a.isFull());

		a.push(new Object());
		assertFalse(a.isFull());
		a.push(new Object());
		assertFalse(a.isFull());
		a.push(new Object());
		assertFalse(a.isFull());
		a.push(new Object());
		assertFalse(a.isFull());
		a.push(new Object());
		assertTrue(a.isFull());

	}

	@Test
	void testPush() {
		StorageBox a = new StorageBox();
		Object[] xs = new Object[7];
		for (int i = 0; i < xs.length; i++) {
			xs[i] = new Integer(i);
		}

		for (int i = 0; i < xs.length; i++) {
			a.push(xs[i]);
			assertEquals(xs[i], a.top());
		}

	}

	@Test
	void testPopAndTop() {
		StorageBox a = new StorageBox();
		Object[] xs = new Object[7];
		for (int i = 0; i < xs.length; i++) {
			xs[i] = new Integer(i);
		}

		assertNull(a.pop());
		for (int i = 0; i < xs.length; i++) {
			a.push(xs[i]);
		}

		for (int i = xs.length - 1; i >= 0; i--) {
			assertEquals(xs[i], a.top());
			assertEquals(xs[i], a.pop());
			if (i > 0)
				assertEquals(xs[i - 1], a.top());
			else
				assertNull(a.top());
		}
	}

}
