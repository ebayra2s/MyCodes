
public class Oberflaechenentfernung {
	public static void main(String[] args) {

		double oberflaechenentfernung = entfernung(7.0, 11.0, 1.0, "Ost", 50.0, 46.0, 50.0, "Nord", 6.0, 5.0, 50.0,
				"Ost", 50.0, 47.0, 28.0, "Nord");

		System.out.println(oberflaechenentfernung);

	}

	public static double entfernung(double lgrad1, double lmin1, double lstunde1, String lg1, double bgrad1, double bmin1,
			double bstunde1, String bg1, double lgrad2, double lmin2, double lstunde2, String lg2, double bgrad2, double bmin2,
			double bstunde2, String bg2) {

		double laengenangabe1 = kompaktWert(lgrad1, lmin1, lstunde1, lg1);
		double breitenangabe1 = kompaktWert(bgrad1, bmin1, bstunde1, bg1);
		double laengenangabe2 = kompaktWert(lgrad2, lmin2, lstunde2, lg2);
		double breitenangabe2 = kompaktWert(bgrad2, bmin2, bstunde2, bg2);

		double laengenradiant1 = radiantenWerte(laengenangabe1);
		double breitenradiant1 = radiantenWerte(breitenangabe1);
		double laengenradiant2 = radiantenWerte(laengenangabe2);
		double breitenradiant2 = radiantenWerte(breitenangabe2);

		double erdradius = 6378.137;
		double entfernung;

		entfernung = erdradius * Math.acos(Math.sin(breitenradiant1) * Math.sin(breitenradiant2)
				+ Math.cos(breitenradiant1) * Math.cos(breitenradiant2) * Math.cos(laengenradiant2 - laengenradiant1));

		return entfernung;
	}

	public static double kompaktWert(double grad, double minute, double sekunde, String lgbg) {
		double wert;
		wert = grad + (minute / 60.0) + (sekunde / 3600.0);

		if (lgbg == "West" || lgbg == "Sued") {
			return wert *= -1.0;
		}

		return wert;
	}

	public static double radiantenWerte(double grad) {

		return grad * Math.PI / 180.0;
	}

}
