/**
 * @author ebayra2s
 */

public class Kettenfunktion implements Funktion {
	  private Funktion f;
	  private Funktion g;
	  public Kettenfunktion(Funktion f, Funktion g) {
	    this.f = f;
	    this.g = g;
	  }
	  
	  @Override
	  public boolean hatWertFuer(double x) {
	    try {
	      return g.hatWertFuer(x) && f.hatWertFuer(g.wert(x));
	    }
	    catch (Exception e) {
	      return false;
	    }
	  }
	  
	  @Override
	  public double wert(double x) throws ValueOutOfRangeException {
	    return f.wert(g.wert(x));
	  }
	  
	  public String toString() {
	    return "f(g(x)) mit f(x) = " + f + " und g(x) = " + g;
	  }


}
