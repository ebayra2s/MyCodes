
public class A1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 4, 3, 2, 2 };
		int wert = 2;
		System.out.println(anzahl(a, wert));
		a = umkehrung(a);

		System.out.println(a[6]);
		System.out.println();
	}

	public static int anzahl(int[] x, int y) {
		int ergebnis = 0;
		for (int z = 0; z < x.length; z++) {
			if (x[z] == y) {
				ergebnis++;
			}
		}
		return ergebnis;
	}

	public static int[] umkehrung(int[] x) {
		int[] y = new int[x.length];

		int j = 0;
		for (int i = x.length - 1; i >= 0; i--, j++) {

			y[j] = x[i];
		}
		return y;
	}

}