
public class Parasitenzahl {
	public static void main(String[] args) {
		parasitenZahlen(100000000000000000L);

	}

	public static void parasitZahl(long zahl) {

		long letzteZiffer = zahl % 10;
		long zahlOhneLetzteZiffer = zahl / 10L;
		long faktor = 1;

		long tmp = zahl;

		while (tmp > 0) {
			tmp /= 10;
			faktor *= 10;
		}

		faktor /= 10;

		long zahl2 = zahlOhneLetzteZiffer + (letzteZiffer * faktor);

		if ((zahl * letzteZiffer) == zahl2) {
			System.out.println(
					zahl + " ist eine Parasitenzahl, weil " + letzteZiffer + " * " + zahl + " = " + zahl2 + " ist.");
		}

	}

	public static void parasitenZahlen(long m) {
		for (long i = 1; i <= m; i++) {
			parasitZahl(i);
		}
	}

}
