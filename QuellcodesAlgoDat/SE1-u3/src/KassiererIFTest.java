import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KassiererIFTest {

	Kassierer k, k1;

	@Before
	public void setUp() throws Exception {
		k = new Kassierer(2.0f, 2, 3.0f);
		k1 = new Kassierer(2.0f, 3, 7.0f);
	}

	@Test
	public void testPreis() {
		assertTrue(k.preis() == 4.0);
		assertTrue(k1.preis() == 6.0);

	}

	@Test
	public void testRueckgeld() {
		assertTrue(k.rueckgeld() == -1.0);
		assertTrue(k1.rueckgeld() == 1.0);
	}

	@Test
	public void testToString() {
		assertTrue(k.toString().equals("Noch zu zahlen: 1.0"));
		assertTrue(k1.toString().equals("Ihr Rueckgeld beträgt: 1.0"));
	}

}
