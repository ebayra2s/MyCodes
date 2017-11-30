/**
 * @author ebayra2s
 */

public class AbgeschlosseneAuswertung {
	
	
	
	public static Double auswertung(Funktion f, double x){
		double a1;
		
		try {
			
			 a1 = f.wert(x);
		} catch (ValueOutOfRangeException ve) {
			return null;
			
		}
		
		return new Double(a1);
	}

}
