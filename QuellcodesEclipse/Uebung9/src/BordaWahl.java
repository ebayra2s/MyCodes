import java.util.Scanner;

public class BordaWahl {
	public static void main(String[] args) {
		// Einlesen der Stimmen
		int[][] stimmen = einlesen();
		// Durchfuehren der Wahl
		int[] summe = wahl(stimmen);

		ausgeben(summe);

	}

	public static int[][] einlesen() {
		Scanner sc = new Scanner(System.in);
		int kandidaten = sc.nextInt();
		int waehler = sc.nextInt();

		int[][] übergabe = new int[waehler][kandidaten];

		for (int i = 0; i < übergabe.length; i++) {
			for (int j = 0; j < übergabe[i].length; j++) {
				übergabe[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return übergabe;
	}

	public static int[] wahl(int[][] stimmen) {
		int[] stimmenErgebnisse = new int[stimmen[0].length];

		for (int i = 0; i < stimmen.length; i++) {
			for (int j = 0; j < stimmen[i].length; j++) {
				stimmenErgebnisse[stimmen[i][j] - 1] += j + 1;
			}
		}

		return stimmenErgebnisse;
	}

	public static void ausgeben(int[] wahl) {
		int min = wahl[0];
		for (int i = 0; i < wahl.length; i++) {
			min = Math.min(min, wahl[i]);
			System.out.print(" " + wahl[i]);
		}
		System.out.println();
		System.out.println(min);

	}

}
