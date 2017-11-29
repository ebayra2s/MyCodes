
public class Bitquersumme {
	public static void main(String[] args) {
		int a = Integer.parseInt( args[0] );
		int ergebnis=0;
		int bitwert = 0;
		
		for(int i=0;i<=31;i++){
			bitwert=a&0x1;
			a=a>>2;
			ergebnis+=bitwert;
			
			
		}
		
		System.out.println(ergebnis);
	}

}
