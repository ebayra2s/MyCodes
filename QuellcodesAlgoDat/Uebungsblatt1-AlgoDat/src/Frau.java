/**
 * @author ebayra2s
 */

public class Frau extends Person {
	
	private static int anzahl;

	public Frau(String name, int alter, int groesse, int gewicht) {
		super(name, alter, groesse, gewicht);
		
		anzahl++;
	}

	public final String chromosomen() {
		
		return "XX";
	}

	public int groesse() {
		return super.groesse();
	}

	public int gewicht() {
		return super.gewicht() - 5;
	}

	public int preisHaarschnitt() {
		return (int) Math.round(20 + 2.0/3.0 * this.getAlter());
	}
	
	public static int anzahl(){
		return anzahl;
	}

}
