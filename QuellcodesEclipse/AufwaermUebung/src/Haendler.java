
public class Haendler {
	public static void main(String[] args) {
		Obst apfel = new Obst("Apfel", 5, 2.59);
		
		System.out.println(apfel.name);
		System.out.println(apfel.kilogramm);
		System.out.println(apfel.preisProKilo);
		
		System.out.println(apfel.kostenGesamt(apfel.kilogramm,apfel.preisProKilo));
	}
	
	

}
