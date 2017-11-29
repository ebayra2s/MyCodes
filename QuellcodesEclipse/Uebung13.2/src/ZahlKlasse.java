
public abstract class ZahlKlasse implements ZahlFunktionalitaet {
	private int zahl;
	
	public ZahlKlasse(int zahl){
		this.zahl = zahl;
	}
	
	public int getZahl(){
		return this.zahl;
	}
	
	public String toString(){
		return "" + this.zahl;
	}

}
