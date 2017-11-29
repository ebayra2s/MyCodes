
public class Stadion {
	public static void main(String[] args) {
		int [] trikotnr = new int [5];
		
		for(int j = 0; j < trikotnr.length; j++){
			trikotnr[j] = (j+1);
		}
		
		Mannschaft rot = new Mannschaft(
				new Fussballspieler("Spieler-rot-"+ trikotnr[0], trikotnr[0]*10000),
				new Fussballspieler("Spieler-rot-"+ trikotnr[1], trikotnr[1]*10000),
				new Fussballspieler("Spieler-rot-"+ trikotnr[2], trikotnr[2]*10000),
				new Fussballspieler("Spieler-rot-"+ trikotnr[3], trikotnr[3]*10000),
				new Fussballspieler("Spieler-rot-"+ trikotnr[4], trikotnr[4]*10000));

		Mannschaft blau = new Mannschaft(
				new Fussballspieler("Spieler-blau-"+ trikotnr[0], trikotnr[0]*20000 ),
				new Fussballspieler("Spieler-blau-"+ trikotnr[1], trikotnr[1]*20000),
				new Fussballspieler("Spieler-blau-"+ trikotnr[2], trikotnr[2]*20000),
				new Fussballspieler("Spieler-blau-"+ trikotnr[3], trikotnr[3]*20000),
				new Fussballspieler("Spieler-blau-"+ trikotnr[4], trikotnr[4]*20000));
		
		Person [] zuschauer = new Person[45000];
		for (int i = 0; i < 45000; i++) {
			zuschauer[i] = new Person("Zuschauer" +"-"+ (i+1) );
		}
		
		System.out.println(rot.toString());
		System.out.println(blau.toString());
		System.out.println(rot.einkommen());
		System.out.println(blau.einkommen());
		System.out.println(zuschauer[0].getName());
		
	}

}
