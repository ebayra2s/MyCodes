
public class Methode62 {
	public static void main(String[] args) {
		float a1 = 1f,
			b1 = 2f,
			c1 = 3f,
			a2 = 4f,
			b2 = 5f,
			c2 = 6f,
			x,
			y,
			d= det(a1, b1, a2, b2);
		
		if (d != 0) {
			x = det(c1, b1, c2, b2)/d;
			y = det(a1, c1, a2, c2)/d;
			System.out.println("Schnittpunkt: " + x + " / " + y);
			}else{
			System.out.println("Es gibt keinen Schnittpunkt.");
		
			}
	}
	
	public static float det(float a, float b, float c, float d){
		return a*d - b*c;
	}

}
