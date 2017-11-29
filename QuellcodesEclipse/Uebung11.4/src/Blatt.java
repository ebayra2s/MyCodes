
public class Blatt {
	private int maxKarten = 32;
	private Karte[] karten = new Karte[maxKarten];

	public Blatt() {
		this.initBlatt();
	}

	private void initBlatt() {
		Karte karte = null;
		for (int i = 0; i < this.maxKarten; i++) {

			do {
				karte = new Karte((int) ((Math.random() * 10) % 4), (int) ((Math.random() * 10) % 8));
			} while (this.karteContains(karte));
			this.addKarte(karte);
		}
	}

	private Boolean karteContains(Karte k) {
		for (int i = 0; i < this.maxKarten; i++) {
			if (this.karten[i] != null && this.karten[i].toString().equals(k.toString()))
				return true;
		}

		return false;
	}

	private Boolean addKarte(Karte k) {
		for (int i = 0; i < this.maxKarten; i++) {
			if (this.karten[i] == null) {
				this.karten[i] = k;
				return true;
			}
		}
		return false;
	}


	public Karte [] ziehe(int zahl){
		
		Karte [] gezogeneKarten = new Karte [zahl];
		int random;
		
		for(int i = 0; i < zahl; i++){
			do{
				random = (int) ((Math.random() * 100) % 32);
				if(this.karten[random] != null){
					gezogeneKarten[i] = this.karten[random];
				}
				
			}while(this.karten[random] == null);
			this.karten[random] = null;
			
		}
		
		return gezogeneKarten;

		
	}
}
