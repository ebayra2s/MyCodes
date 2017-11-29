
public class Obst {
	String name;
	int kilogramm;
	double preisProKilo;
	
	public Obst(String name, int kilogramm, double preisProKilo){
		
		this.name = name;
		this.kilogramm = kilogramm;
		this.preisProKilo = preisProKilo;
		
	}
	
	public static double kostenGesamt(int kilogramm, double preisProKilo){
		return ((double)kilogramm) * preisProKilo;
	}
	
	
	

}
