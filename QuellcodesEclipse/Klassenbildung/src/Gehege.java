
public class Gehege {
	private static int num = 0;

	private int nummer;
	private int maximalBelegung;
	private int aktuelleBelegung;
	private Tier[] bewohner;

	Gehege() {
		this(5);

	}

	Gehege(int maximalBelegung) {
		nummer = ++num;
		this.maximalBelegung = maximalBelegung;
		bewohner = new Tier[maximalBelegung];
	}

	int getNummer() {
		return nummer;
	}

	int getMaximalBelegung() {
		return maximalBelegung;
	}

	int getAktuelleBelegung() {
		return aktuelleBelegung;
	}

	void einziehen(Tier tier) {
		for (int i = 0; i < maximalBelegung; i++) {
			if (bewohner[i] == null) {
				bewohner[i] = tier;
				break;
			}
		}
		++aktuelleBelegung;

	}

	void ausziehen(Tier tier) {
		for (int i = 0; i < maximalBelegung; i++) {
			if (bewohner[i] == tier) {
				bewohner[i] = null;
				break;
			}
		}
		--aktuelleBelegung;

	}

	public String toString() {
		return "Gehege " + nummer + ", maximal= " + maximalBelegung + " , aktuell=" + aktuelleBelegung;
	}

}
