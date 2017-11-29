
public class a4_15 {
	public static void main(String[] args) {
		double basispreis = 22.98;
		int gesprächsminuten = Integer.parseInt(args[0]);
		double kosten = 0.248;
		double rechnung;

		if (gesprächsminuten > 30) {
			gesprächsminuten = gesprächsminuten - 30;
			double gesprächsminuten2 = (double) gesprächsminuten * kosten;
			rechnung = gesprächsminuten2 + basispreis;
			System.out.println(Math.round(rechnung * 100) / 100.0);
		} else {
			rechnung = basispreis;
			System.out.println(rechnung);
		}

	}
}
