
public class MessBereich {
	private double von;
	private double bis;
	private double abhierKritisch;

	public MessBereich(int von, int bis, int kritisch) {
		this.von = von;
		this.bis = bis;
		this.abhierKritisch = kritisch;
	}

	public void pruefen(double wert) throws CriticalValue, IllegalValue {
		if (wert >= this.abhierKritisch) {
			new CriticalValue("Befindet sich im Kritischen Zustand!");
		} else if (wert > this.bis || wert < this.von) {
			new IllegalValue("Wert außerhalb der Spezifikation!");
		} else {
			System.out.println("Im grünen Bereich...");
		}
	}

}
