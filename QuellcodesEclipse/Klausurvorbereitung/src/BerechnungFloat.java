
public class BerechnungFloat {
	public static void main(String[] args) {
		float x = 2304f;
		float y = -4096f;
		float z = 4096.001953125f;
		
		System.out.println(x*(y+z));
		System.out.println(x*z + x*y);
		
	}

}
