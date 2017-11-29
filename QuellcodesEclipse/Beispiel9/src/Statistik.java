
public class Statistik {
	public static void main(String[] args) {
		int n = args.length;
		String[] y = new String[n];
		
		int h = 0;
		for (int i = 0; i < n; i++, h++) {
			y[i] = args[h];
		}
		double[] x =arr(y);
	
		System.out.println(arithm(x, n));
		System.out.println(harm(x, n));
		System.out.println(abweichung(x, n));

	}

	public static double arithm(double[] a, int b) {
		double ergebnis = 0.0;
		double n = b;
		for (int i = 0; i < b; i++) {
			ergebnis += a[i];	
		}
		return (1 / n) * ergebnis;
	}

	public static double harm(double[] a, int b) {
		double ergebnis = 0.0;
		int n = b;
		for (int i = 0; i < b; i++) {
			ergebnis += (1 / a[i]);
			
		}
		return n / ergebnis;
	}

	public static double abweichung(double[] a, int b) {
		double ergebnis = 0.0;
		double t = arithm(a, b);
		
		int n = b;
		for (int i = 0; i < a.length; i++) {
			ergebnis += (Math.pow(a[i]-t, 2));
			
		}
		ergebnis = (1.0/(n-1))*ergebnis;
		return Math.sqrt(ergebnis);
	}

	public static double [] arr(String [] a){
		double [] array = new double[a.length];
		
		for(int i = 0; i < a.length;i++){
			array[i]=Double.parseDouble(a[i]);
		}
		
		return array;
	}

}
