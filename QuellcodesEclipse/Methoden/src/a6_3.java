
public class a6_3 {
	public static void main(String[] args) {
		double radius = 6378.137;
		//GPS-Koordinate Parkplatz Sankt Augustin
		double laenge1 = grad(7, 11, 1, 'O');
		double breite1 = grad(50, 46, 50, 'N');
		
		//GPS-Koordinate Aachener Tivoli
		double laenge2 = grad(6, 5, 50, 'O');
		double breite2 = grad(50, 47, 28, 'N');
		
		System.out.println(entfernung(radius, breite1, breite2,
				laenge1, laenge2));
		
		
		
	}
	
	public static double entfernung(double radius, double breite1, double breite2,
			double laenge1, double laenge2){
		
		return radius * Math.acos(Math.sin(radiant(breite1)) * Math.sin(radiant(breite2)) + Math.cos(radiant(breite1))
					* Math.cos(radiant(breite2)) * Math.cos(radiant(laenge2 - laenge1)));
		
	}
	
	public static double grad(int grad, int minuten, int sekunden, char koordinate){
		
		double wert = grad + (minuten/60.0) + (sekunden/3600.0);
			if((koordinate == 'W') || (koordinate == 'S')){
				wert *=-1;
			}
		return wert;
	}
	
	public static double radiant(double grad){
		return grad * Math.PI/180.0;
	}

}
