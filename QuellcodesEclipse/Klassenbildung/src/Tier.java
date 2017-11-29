
public class Tier {
	private static int num = 0;
	
	private int nummer;
	private String name;
	private Gehege gehege;
	
	Tier(){
		this("unbekannt");
	}
	
	Tier(String name){
		nummer = ++num;
		this.name = name;
		
	}
	
	String getName(){
		return name;
	}
	
	void setName (String neuerName){
		name = neuerName;
	}
	
	void umziehen(Gehege gehege){
		if(this.gehege != null){
			this.gehege.ausziehen(this);
		}
		
		if(gehege != null){
			gehege.einziehen(this);
		}
		
		this.gehege = gehege;
		
	}
	
	public static int anzahlTiere(){
		return num;
	}
	
	public String toString(){
		return "Tier " + getName() + " , Gehege=" + ((gehege == null) ? "ohne Gehege" : nummer);
	}

}
