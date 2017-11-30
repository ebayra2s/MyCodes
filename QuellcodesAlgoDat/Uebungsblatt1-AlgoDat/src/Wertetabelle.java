
public class Wertetabelle{
	public static void ausgabe(Funktion f, double von, double bis, int n) {
	    System.out.println("f(x) = " + f);
	    double x = von;
	    double h = (bis - von) / (n + 1);
	    for (int i=0 ; i<=n+1 ; ++i) {
	      try {
			System.out.println("f(" + x + ") " +
			                     (f.hatWertFuer(x) ? "= " + f.wert(x) : "ist nicht definiert"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      x += h;
	    }
	    System.out.println();
	  }

}
