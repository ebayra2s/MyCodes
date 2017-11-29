
public class Mannschaft {

	private Fussballspieler [] s1 = new Fussballspieler [5];
	

	public Mannschaft(Fussballspieler s1, Fussballspieler s2, Fussballspieler s3, Fussballspieler s4,
			Fussballspieler s5) {
		this.s1[0] = s1;
		this.s1[1] = s2;
		this.s1[2] = s3;
		this.s1[3] = s4;
		this.s1[4] = s5;

	}

	public int einkommen() {
		int einkommen = 0;
		for(int i = 0; i < this.s1.length; i++){
			einkommen += s1[i].getEinkommen();
		}
		return einkommen;
	}

	public String toString() {
		String aufstellung = "";
		for(int i = 0; i < this.s1.length; i++){
			aufstellung += (""+(i+1)+". ") + s1[i].getName() + "\n";
		}
		return aufstellung;
	}

}
