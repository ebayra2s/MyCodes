
public class Rational {
	
	int zaehler;
	int nenner;
	
	public Rational(int x){
		zaehler = x;
		nenner = 1;
	}
	
	public Rational(int x, int y){
		zaehler = x;
		nenner = y;
		if(y == 0){
			System.out.println("Fehler: Nenner ist 0");
		}else if(y < 0){
			zaehler = (x * -1)/ggT(x, y);
			nenner = (y * -1)/ggT(x, y);
		}else{
			zaehler = x/ggT(x, y);
			nenner = y/ggT(x, y);
		}
	}
	
	public String toString(){
		return zaehler + "/" + nenner;
	}
	
	public Rational add(Rational a){
		
		int z = (zaehler * a.nenner) + (nenner * a.zaehler);
		int n = nenner * a.nenner;
		
		return new Rational(z, n);	
	}
	
	public Rational sub(Rational a){
		
		int z = (zaehler * a.nenner) - (nenner * a.zaehler);
		int n = nenner * a.nenner;
		
		return new Rational(z, n);
	}
	
	public Rational mul(Rational a){
		
		int z = zaehler * a.zaehler;
		int n = nenner * a.nenner;
		
		return new Rational(z, n);
	}
	
	public Rational div(Rational a){
		
		int z = zaehler * a.nenner;
		int n = nenner * a.zaehler;
		
		return new Rational(z, n);
	}
	
	public int ggT(int x, int y){
		x = Math.abs(x);
		y = Math.abs(y);
		
		if(x == 0){
			return y;
		}else{
			while(y != 0){
				if(x > y){
					x -= y;
				}else{
					y -=x;
				}
			}
			
			return x;
		}
		
	}
	
}
