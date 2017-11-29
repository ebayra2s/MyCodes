
public class Lkw {
	private String kennzeichen;
	private double kmStand;
	private double kmLetzteInspektion;
	private double nutzlast;
	private boolean kennzeichnung;
	
	Lkw(String k, double s, double li, double n, boolean kn){
		this.kennzeichen = k;
		this.kmStand = s;
		this.kmLetzteInspektion = li;
		this.nutzlast = n;
		this.kennzeichnung = kn;
		
	}
	
	public double mietpreis(int tage){
		if(this.nutzlast > 1800.0){
			return tage * 80.0;
		}
		
		return tage * 50.0;
	}
	
	public void inspektion(){
		if((this.kmStand%20000.0) == 0.0){
			System.out.println("Inspektion faellig!");
		}
	}
	
	public String getKennzeichen(){
		return this.kennzeichen;
	}
	
	public double getKmLetzteInspektion(){
		return this.kmLetzteInspektion;
	}
	
	public boolean getKennzeichnung(){
		return this.kennzeichnung;
	}

}
