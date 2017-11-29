
public class A3 {
	public static void main(String[] args) {
		double [] a = new double [args.length];
		
		int x = 0;
		for(int i = 0; i < args.length; i++, x++){
			a[i]=Double.parseDouble(args[x]);
		}
		System.out.println(arithm(a, x));
		System.out.println(nah(a, x));
		
		
	}
	
	public static double arithm(double [] x, int y){
		double ergebnis = 0.0;
		double n = y;
		
		for(int i = 0; i < y; i++){
			ergebnis += x[i];
			
		}
		
		return (1/n) * ergebnis;
	}
	
	public static double nah(double [] x, int a){
		double ergebnis = 0.0;
		double ari = arithm(x, a);
		
		for(int i = 0; i < a;i++){
			double tmp = 0.0;
			if(ari >= x[i] && x[i] >= tmp){
				tmp = x[i];
				ergebnis = tmp;
			}else if(ari <= x[i] && x[i] <= tmp){
				tmp = x[i];
				ergebnis = tmp;
				
			}
		}
		return ergebnis;
	}
/*
 * Frage: Muss man unbedingt in der Main Methode eine for-Schleifen initialisierung durchführen
 * damit man das Array befüllen kann oder kann man dazu auch eine Methode schreiben(Kommandozeile)
 * Problem: Habe keine Variante gefunden momentan
 */
//	public static double [] füll(double [] b){
//		int x = 0;
//		double [] y = b;
//		
//		
//		for(int i = 0; i < b.length; i++, x++){
//			y[i] = Double.parseDouble(args[x]);
//		}
//		
//		
//	}

}
