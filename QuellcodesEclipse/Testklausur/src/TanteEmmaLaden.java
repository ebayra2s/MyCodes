import java.util.Scanner;

public class TanteEmmaLaden {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int anzahl = sc.nextInt();
		String artikel = sc.next();
		sc.close();
		double bezahlen = 0.0;

		if (artikel.equals("Playstation")) {
			double preis = 199.0;
			bezahlen += anzahl * preis;
			double mwst = bezahlen * 0.19;

			System.out.println("Netto ohne MwSt.: " + (bezahlen - mwst));
			System.out.println("MwSt: " + mwst);
			System.out.println("Zu Bezahlen: " + bezahlen);

		} else if (artikel.equals("Gummibaerchen")) {

			double preis = 0.05;
			bezahlen += anzahl * preis;
			double mwst = bezahlen * 0.07;

			System.out.println("Netto ohne MwSt.: " + (bezahlen - mwst));
			System.out.println("MwSt: " + mwst);
			System.out.println("Zu Bezahlen: " + bezahlen);

		} else if (artikel.equals("Lakritzstange")) {
			double preis = 0.3;
			bezahlen += anzahl * preis;
			double mwst = bezahlen * 0.07;

			System.out.println("Netto ohne MwSt.: " + (bezahlen - mwst));
			System.out.println("MwSt: " + mwst);
			System.out.println("Zu Bezahlen: " + bezahlen);
		} else {

			System.out.println("Fehlermeldung: Artikel nicht verfügbar!");
		}

	}
}
