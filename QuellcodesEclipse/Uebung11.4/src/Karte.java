
public class Karte {
	
	private int farbe;
	private int wert;
	
	private String []farben = {"Karo", "Herz", "Pik", "Kreuz"};
	private String []werte = {"7", "8", "9", "10", "Bube", "Dame", "Koenig", "As"};
	
	public Karte(int farbe, int wert){
		this.farbe = farbe;
		this.wert = wert;
	}
	
	public String toString(){
		String erg = "";
		erg += this.farben[this.farbe];
		erg += "-";
		erg += this.werte[this.wert];
		return erg;
	}
	

}
