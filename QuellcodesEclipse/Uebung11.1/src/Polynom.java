
public class Polynom {
	private double maxKoeffWert = 0.0;
	private static int anzErzPoly = 0;
	int grad;
	double[] koeffizienten;

	public Polynom(double[] koeffizienten) {
		anzErzPoly++;
		this.grad = koeffizienten.length;
		this.koeffizienten = new double[koeffizienten.length];

		for (int i = 0; i < koeffizienten.length; i++) {
			this.koeffizienten[i] = koeffizienten[i];
		}

		for (int i = 0; i < this.koeffizienten.length; i++) {
			if (maxKoeffWert < this.koeffizienten[i]) {
				maxKoeffWert = this.koeffizienten[i];
			}
		}

		if (maxKoeffWert == 0.0) {
			System.out.println("Fehler: Nullpolynom");
		}

	}

	public String toString() {
		int exponent = this.koeffizienten.length - 1;
		String polynom = "";
		for (int i = this.koeffizienten.length - 1; i >= 0; i--, exponent--) {
			if (this.koeffizienten[i] != 0.0) {
				polynom += " + " + this.koeffizienten[i] + "*x^" + exponent;
			}
		}

		return polynom.substring(3);
	}

	public double auswerten(double x) {
		double wertPolynom = 0.0;
		int j = 0;

		for (int i = 0; i < this.koeffizienten.length; i++, j++) {
			wertPolynom += this.koeffizienten[j] * Math.pow(x, i);
		}

		return wertPolynom;
	}

	public static int getAnzahl() {

		return anzErzPoly;
	}
	
	public String polyAdd(Polynom p, Polynom q){
		
		return "";
	}

}
