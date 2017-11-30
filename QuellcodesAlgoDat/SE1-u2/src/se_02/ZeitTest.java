package se_02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeitTest {

	Zeit z01, z02, z03, z04;

	@Before
	public void setUp() throws Exception {
		z01 = new Zeit(0, 1);
		z02 = new Zeit(0, 2);
		z03 = new Zeit(0, 60);
		z04 = new Zeit(23, 60);

	}

	@Test
	public void testStunden() {
		assertEquals(0, z01.stunden());
		assertEquals(0, z02.stunden());

	}

	@Test
	public void testMinuten() {
		assertEquals(1, z01.minuten());
		assertEquals(2, z02.minuten());

	}

	@Test
	public void testAdd() {
		z01.add(z01);

		assertEquals(z01, z01);

	}

	@Test
	public void testToString() {
		assertEquals("00:01", z01.toString());

	}

	@Test
	public void testMinutenFailure() {
		assertEquals(0, z03.minuten());
	}

	@Test
	public void testStundeMinuteFailure() {
		assertEquals(0, z04.stunden());
		assertEquals(0, z04.minuten());
	}

	@Test
	public void testz04ToString() {
		assertEquals("00:00", z04.toString());
	}

}
