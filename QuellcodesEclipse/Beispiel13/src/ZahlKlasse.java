
public class ZahlKlasse {
	public static int anzahl;
	private Zahl zahl;

	class Zahl {
		private int zahl;

		public Zahl(int zahl) {
			this.zahl = zahl * ZahlKlasse.getAnzahl();
		}

		public int getZahl() {
			return zahl;
		}
	}

	public ZahlKlasse(int zahl) {
		++anzahl;
		this.zahl = new Zahl(zahl);

	}

	public static int getAnzahl() {
		return anzahl;
	}

	public int getZahlWert() {
		return zahl.getZahl();
	}

	public String toString() {
		return "" + zahl.getZahl();
	}

}
