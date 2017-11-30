/**
 * @author ebayra2s
 */

public class RechteckComparable extends Rechteck implements Comparable<RechteckComparable>{

	public RechteckComparable(int laenge, int breite) {
		super(laenge, breite);
	}

	@Override
	public int compareTo(RechteckComparable o) {
		if(this.flaeche() < o.flaeche()){
			return -1;
		}else if(this.flaeche() == o.flaeche()){
			return 0;
		}
		
		return 1;
	}


}
