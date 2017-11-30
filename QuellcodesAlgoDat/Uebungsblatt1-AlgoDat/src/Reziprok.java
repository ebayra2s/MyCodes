/**
 * @author ebayra2s
 */

public class Reziprok implements Funktion {
	

	@Override
	public boolean hatWertFuer(double x){

		return (x == 0) ? false : true;

	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		
		
		if(!hatWertFuer(x)){
			throw new ValueOutOfRangeException(" x darf nicht 0 sein");
		}

		return 1.0 / x;
	}
	
	public String toString(){
		return "1/x";
	}

}
