/**
 * @author ebayra2s
 */

public class Wurzel implements Funktion {
	
	
	@Override
	public boolean hatWertFuer(double x) {
		
		return (x >= 0);
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		
		if(!hatWertFuer(x)){
			throw new ValueOutOfRangeException("Die Funktion für das Argument x ist nicht definiert");
		}
			
		return Math.sqrt(x);
	}
	
	public String toString(){
		return "sqrt(x)";
	}

}
