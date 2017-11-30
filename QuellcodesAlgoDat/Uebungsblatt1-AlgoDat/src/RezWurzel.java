/**
 * @author ebayra2s
 */

public class RezWurzel implements Funktion {
	
	private Kettenfunktion kettenFunktion;
	
	
	
	public RezWurzel(){
		
		this.kettenFunktion = new Kettenfunktion(
				new Reziprok(), new Kettenfunktion(new Wurzel(), new Abs()));
	}
	

	@Override
	public boolean hatWertFuer(double x) {
		
		return kettenFunktion.hatWertFuer(x);
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		
		if(!hatWertFuer(x)){
			throw new ValueOutOfRangeException("Methode hatWertFuer ist false!");
		}
		
		return kettenFunktion.wert(x);
	}
	
	public String toString(){
		//"1/sqrt(|" + this.x + "|)"
		return kettenFunktion.toString();
	}

}
