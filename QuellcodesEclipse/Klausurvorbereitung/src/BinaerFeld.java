
public class BinaerFeld {
	public static void main(String[] args) {
		int zahl1 = 3;
		int zahl2 = 3;
		int [] feld = new int [2];
		
		for(int i = 0; i < feld.length; i++){
			feld[i] = zahl1%2;
			zahl1 /= 2;
			System.out.println(feld[i]);
		}
		int [] feld1 = new int[2];
		
		for(int i = 0; i < feld1.length; i++){
			feld1[i] = zahl2%2;
			zahl2 /= 2;
			System.out.println(feld1[i]);
		}
		
		int [] result = new int [feld.length + 1];
		
	
	}

}


