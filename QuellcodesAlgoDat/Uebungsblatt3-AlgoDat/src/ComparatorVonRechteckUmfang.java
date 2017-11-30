/**
 * @author ebayra2s
 */

import java.util.Comparator;

public class ComparatorVonRechteckUmfang implements Comparator<Rechteck>{
	
	@Override
	public int compare(Rechteck o1, Rechteck o2) {
		
		return (o1.umfang() > o2.umfang()) ? 1 : (o1.umfang() == o2.umfang()) ? 0 : -1;
	}
}
