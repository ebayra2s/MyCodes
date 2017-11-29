
public class PolynomTest {
	public static void main(String[] args) {
		
		double [] koeffizienten = {3, 2, 1};
		
		Polynom p = new Polynom(koeffizienten);
//		for(int i = 0; i < koeffizienten.length; i++){
//			koeffizienten[i] = sc.nextInt();
//		}
		System.out.println(p.toString());
		System.out.println(p.auswerten(2));
		System.out.println(p.getAnzahl());
		
			
	}

}
