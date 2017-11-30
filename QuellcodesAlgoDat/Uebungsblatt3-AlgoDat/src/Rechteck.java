/**
 * @author ebayra2s
 */
public class Rechteck {
	private int laenge;
	private int breite;
	
	public Rechteck(int laenge, int breite){
		this.laenge = laenge;
		this.breite = breite;
	}
	
	public int laenge(){
		return laenge;
	}
	
	public int breite(){
		return breite;
	}
	
	public int flaeche(){
		return laenge * breite;
	}
	
	public int umfang(){
		return (2*laenge) + (2*breite);
	}
	
	

}
