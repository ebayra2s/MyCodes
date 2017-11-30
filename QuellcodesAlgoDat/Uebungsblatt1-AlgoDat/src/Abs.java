/**
 * @author ebayra2s
 */

public class Abs implements Funktion {
	

	@Override
	public boolean hatWertFuer(double x) {
		
		return true;
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		
		if(!hatWertFuer(x)){
			throw new ValueOutOfRangeException("Die Funktion für das Argument x ist nicht definiert");
		}
		
		return Math.abs(x);
	}
	
	public String toString(){
		return "|x|";
	}

}
