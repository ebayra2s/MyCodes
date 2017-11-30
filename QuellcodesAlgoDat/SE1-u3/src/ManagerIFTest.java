import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ManagerIFTest {

	Manager m;

	@Before
	public void setUp() throws Exception {
		m = new Manager(3.0f);
	}

	@Test
	public void test() {
		assertTrue(m.preis() == (3.0f));
	}

}
