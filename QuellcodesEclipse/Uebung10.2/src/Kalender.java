
public class Kalender {
	public static void main(String[] args) {
		Jahr j1 = new Jahr(2016);
		Jahr j2 = new Jahr(2015);

		j1.eintragen(28, "Klausur", 1);
		j2.eintragen(37, "Treffen", 5);

		System.out.println(j2.getTermin(28));
		System.out.println(j1.getBelegt() + j2.getBelegt());
	}

}
