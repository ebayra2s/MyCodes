/**
 * @author ebayra2s
 */

public class Polynom implements Funktion {
	double [] feldWerte;
	
	public Polynom(double [] feldWerte){
		this.feldWerte = feldWerte;
	}

	@Override
	public boolean hatWertFuer(double x) {
		
		return true;
	}
	
	public double potenzieren(double x, int exponent){
		
		if( exponent == 0){
			return 1.0;
		}
		
		return x * potenzieren(x, exponent - 1);
		
	}
	

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		double ergebnis = 0.0;
		
		if(!hatWertFuer(x)){
			throw new ValueOutOfRangeException("Die Funktion für das Argument x ist nicht definiert");
		}
		
		for(int i = 0; i < this.feldWerte.length; i++){
			
			ergebnis += (this.feldWerte[i] * potenzieren(x, i));
		}
		
		
				return ergebnis;
	}
	
	public String toString(){
		String str = "";
		
		for(int i = (this.feldWerte.length - 1); i >= 0; i--){
			str += " + "+this.feldWerte[i]+"*x^"+i;
		}
		return str.substring(3, str.length());
	}

}
