/**
 * @author ebayra2s
 */

import java.util.Comparator;

public class ComparatorVonRechteckFlaeche implements Comparator<Rechteck>{

	@Override
	public int compare(Rechteck o1, Rechteck o2) {
		
		return (o1.flaeche() > o2.flaeche()) ? 1 : (o1.flaeche() == o2.flaeche()) ? 0 : -1;
	}

}
