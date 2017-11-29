
public class Pkw {
	private String kennzeichen;
	private double kmStand;
	private double kmLetzteInspektion;
	private boolean kennzeichnung;
	
	Pkw(String k, double s, double li, boolean kz){
		this.kennzeichen = k;
		this.kmStand = s;
		this.kmLetzteInspektion = li;
		this.kennzeichnung = kz;
		
	}
	
	public int mietpreis(int tage){
		return 30 * tage;
	}
	
	public void inspektion(){
		if((this.kmStand%30000.0) == 0.0){
			System.out.println("Inspektion faellig!");
		}
	}
	
	public void waschen(){
		if(this.kennzeichnung == false){
			System.out.println("PKW waschen!");
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
