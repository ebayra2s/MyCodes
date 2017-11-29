
public class Rational {

	private int zaehler;
	private int nenner;

	public Rational(int x) {
		this.zaehler = x;
		this.nenner = 1;
	}

	public Rational(int x, int y) {
		this.zaehler = x;
		this.nenner = y;
		
		if(y == 0){
			System.out.println("Fehler: Nenner ist 0");
		}else if(y < 0){
			this.zaehler = (x * -1)/ggT(x, y);
			this.nenner = (y * -1)/ggT(x, y);
		}else{
			this.zaehler = this.zaehler/ggT(x, y);
			this.nenner = this.nenner/ggT(x, y);
		}
	}
	
	public String toString(){
		return this.zaehler + " / " + this.nenner;
	}

	public static int ggT(int x, int y) {
		x = Math.abs(x);
		y = Math.abs(y);
		
		if (x == 0) {
			return y;
		} else {
			while (y != 0) {
				if (x >= y) {
					x -= y;
				} else {
					y -= x;
				}
			}
			return x;
		}
	}
}
