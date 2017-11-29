
public class TestKlasse {
	public static void main(String[] args) {
		ZahlKlasse z = new ZahlKlasse(1);
		for (int i = 2; i < 10; i++) {
			z = new ZahlKlasse(z.getZahlWert());
		}
		System.out.println(z);
	}

}
