import java.util.Random;

public class a7_7 {
	public static void main(String[] args) {
		int l = 50;
		int[] zahl1 = new int[1];
		int[] zahl2 = new int[1];

		Random r = new java.util.Random();
		for (int i = 0; i < l; i++) {
			zahl1[i] = r.nextInt(10);
			zahl2[i] = r.nextInt(10);
			
			int [] result = new int[51];
			result = addieren(zahl1, zahl2);
			
			for(int j = 0; j < result.length; j++){
				System.out.println(result[i]);
			}
		}

	}

	public static int[] addieren(int[] a, int[] b) {
		int max = max(a, b);
		int[] groessere = groessereZahl(a, b);
		int[] kleinere = kleinereZahl(a, b);

		int[] result = new int[51];

		for (int i = 0; i < max; i++) {
			if ((groessere[i] + kleinere[i]) > 9) {
				result[i] %= groessere[i] + kleinere[i];
				result[i + 1] += 1;
			} else {
				result[i] = groessere[i] + kleinere[i];
			}
		}

		return result;
	}

	public static int max(int[] a, int[] b) {
		if (a.length > b.length) {
			return a.length-1;
		}

		return b.length-1;
	}

	public static int[] kleinereZahl(int[] a, int[] b) {
		int max = max(a, b);

		if (a.length > b.length) {
			return b;
		} else if (a.length == b.length) {
			for (int i = max; i > 0; i--) {
				if (a[i] > b[i]) {
					return b;
				} else if (a[i] < b[i]) {
					return a;
				}
			}

		}

		return b;
	}

	public static int[] groessereZahl(int[] a, int[] b) {
		int max = max(a, b);

		if (a.length > b.length) {
			return a;
		} else if (a.length == b.length) {
			for (int i = max; i > 0; i--) {
				if (a[i] > b[i]) {
					return a;
				} else if (a[i] < b[i]) {
					return b;
				}
			}

		}

		return b;
	}

}
