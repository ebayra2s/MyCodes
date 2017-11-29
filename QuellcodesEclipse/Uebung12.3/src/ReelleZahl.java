
public class ReelleZahl extends Zahl {
	private double reelleZahl;
	
	public ReelleZahl(double r){
		this.reelleZahl = r;
	}

	@Override
	public Zahl addieren(Zahl z) {
		String a = "" + z;
		double z1 = Double.parseDouble(a);
		
		
		// TODO Auto-generated method stub
		return new ReelleZahl(this.reelleZahl + z1);
	}

	@Override
	public Zahl subtrahieren(Zahl z) {
		String a = "" + z;
		double z1 = Double.parseDouble(a);
		// TODO Auto-generated method stub
		return new ReelleZahl(this.reelleZahl - z1);
	}

	@Override
	public Zahl multiplizieren(Zahl z) {
		String a = "" + z;
		double z1 = Double.parseDouble(a);
		
		// TODO Auto-generated method stub
		return new ReelleZahl(this.reelleZahl * z1);
	}

	@Override
	public Zahl dividieren(Zahl z) {
		String a = "" + z;
		double z1 = Double.parseDouble(a);
		// TODO Auto-generated method stub
		return new ReelleZahl(this.reelleZahl / z1);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.reelleZahl;
	}
	
	
}
