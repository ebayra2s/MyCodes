
public class TestMain {
	public static void main(String[] args) {
		Zahl z1 = new ReelleZahl (3.0);
		Zahl z2 = new ReelleZahl (5.0); 
		System.out.println(z1.multiplizieren(z2)); // Ausgabe muss 15.0 sein
		z1 = new KomplexeZahl (3.0 ,1.0); 
		z2 = new KomplexeZahl (5.0, 1.0);
		
		System.out.println(z1.multiplizieren(z2)); // Ausgabe muss 14.0+8.0∗i sein
		}


}
