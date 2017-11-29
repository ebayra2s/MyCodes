import java.util.Scanner;

public class IbanBerechnen {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Länderkennung
		String laenderkennung = laenderkennung(sc.next());
		// Bankleitzahl
		String bankleitzahl = sc.next();
		// Kontonummer
		String kontonummer = sc.next();

		System.out.println(erzeugeIban(laenderkennung, bankleitzahl, kontonummer));
		sc.close();
	}

	public static String laenderkennung(String lk) {
		return lk.toUpperCase();

	}

	public static String kontonummer(String knummer) {
		if (knummer.length() < 10) {
			knummer = '0' + knummer;
			return kontonummer(knummer);
		}

		return knummer;
	}

	public static String bban(String bankl, String knummer) {
		String bban = bankl + kontonummer(knummer);
		return bban;
	}

	public static String umwandlung(String bankl, String knummer, String lk) {
		String umw = bban(bankl, knummer);

		int eins = (lk.charAt(0) - 'A') + 10;
		int zwei = (lk.charAt(1) - 'A') + 10;

		umw += eins + "" + zwei + "00";

		return umw;
	}

	public static int umrechnung(String bankl, String knummer, String lk) {

		String zahlenfolge = umwandlung(bankl, knummer, lk);
		int ergebnis = 0;
		
		String tmp = "";

		while (zahlenfolge.length() > 2) {

			if (zahlenfolge.length() >= 9) {

				tmp = zahlenfolge.substring(0, 9);
				ergebnis = Integer.parseInt(tmp) % 97;
				zahlenfolge = ergebnis + zahlenfolge.substring(9);

			} else {

				tmp = zahlenfolge.substring(0, zahlenfolge.length());
				ergebnis = Integer.parseInt(tmp) % 97;
				zahlenfolge = ergebnis + zahlenfolge.substring(tmp.length());

			}

		}

		return ergebnis;

	}

	public static String konst(String bankl, String knummer, String lk) {
		int konstante = 98 - umrechnung(bankl, knummer, lk);
		String konsta = ""+ konstante;
		if(konsta.length()<2){
			konsta= "0"+ konsta;
		}
		return konsta;

	}

	public static String erzeugeIban(String landerkennung, String blz, String nummer) {

		return landerkennung + konst(blz, nummer, landerkennung) + bban(blz, nummer);

	}

}
