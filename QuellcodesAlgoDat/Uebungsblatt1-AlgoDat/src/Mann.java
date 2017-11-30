/**
 * @author ebayra2s
 */

public class Mann extends Person {
	private static int anzahl;

	public Mann(String name, int alter, int groesse, int gewicht) {
		super(name, alter, groesse, gewicht);
		
		anzahl++;
	}

	public final String chromosomen() {
	
		return "XY";
	}

	public int groesse() {
		return super.groesse() + 5;
	}

	public int gewicht() {
		return super.gewicht();
	}

	public int preisHaarschnitt() {
		return (int) Math.round(10 + 1.0/4.0 * this.getAlter());
	}
	
	public static int anzahl(){
		return anzahl;
	}

}
