
public class Jahr {
	private int jahr;
	private Tag tage[] ;

	public Jahr(int jahr) {
		this.jahr = jahr;
		tage = new Tag[366];
	}

	public void eintragen(int tag, String was, int prioritaet) {

		if (tage[tag] != null) {
			System.out.println("Fehler: " + tage[tag].getVerabredung());
		} else {
			tage[tag] = new Tag(was, prioritaet);

		}

	}

	public String getTermin(int tag) {
		if (tage[tag] == null)
			return null;
		return tage[tag].getVerabredung();
	}

	public int getPrioritaet(int tag) {

		return tage[tag].getPrioritaet();
	}

	public int getBelegt() {
		int zaehler = 0;
		for (int i = 1; i < 366; i++) {
			if (tage[i] != null) {
				zaehler++;
			}
		}
		return zaehler;
	}
}
