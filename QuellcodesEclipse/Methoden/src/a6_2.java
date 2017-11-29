
public class a6_2 {
	public static void main(String[] args) {
		double a1 = 1, b1 = 2, c1 = 3, a2 = 4, b2 = 5, c2 = 6, xk, yk;
		
		
		if(det(a1, b1, a2, b2) != 0){
			
			xk = det(c1, b1, c2, b2)/det(a1, b1, a2, b2);
			yk = det(a1, c1, a2, c2)/det(a1, b1, a2, b2);
			
			System.out.println("Schnittpunkt: " + xk + " / " + yk);
			
		}else{
			System.out.println("Kein Schnittpunkt vorhanden!");
		}
		System.out.println();
		
		a2 = 2;
		b2 = 4;
		c2 = 6;
		
if(det(a1, b1, a2, b2) != 0){
			
			xk = det(c1, b1, c2, b2)/det(a1, b1, a2, b2);
			yk = det(a1, c1, a2, c2)/det(a1, b1, a2, b2);
			
			System.out.println("Schnittpunkt: " + xk + " / " + yk);
			
		}else{
			System.out.println("Kein Schnittpunkt vorhanden!");
		}
		
	}
	
	public static double det(double a, double b, double c, double d){
		
		return a*d - b*c;
	}

}
