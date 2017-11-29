	
public class KomplexeZahl extends Zahl {
	private double realteil;
	private double imaginaerteil;
	
	public KomplexeZahl(double r, double i){
		this.realteil = r;
		this.imaginaerteil = i;
	}

	@Override
	public Zahl addieren(Zahl z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zahl subtrahieren(Zahl z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zahl multiplizieren(Zahl z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Zahl dividieren(Zahl z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.realteil + "+" + this.imaginaerteil + "*i";
	}
	


	
}
