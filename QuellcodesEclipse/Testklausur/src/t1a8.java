
public class t1a8 {
	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);

		System.out.println(umrechnung(fahrenheit));

	}

	public static double umrechnung(double gradfahrenheit) {

		return 5.0 / 9.0 * (gradfahrenheit - 32.0);
	}

}
