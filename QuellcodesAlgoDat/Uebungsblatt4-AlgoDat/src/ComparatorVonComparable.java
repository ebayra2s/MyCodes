/**
 * @author ebayra2s
 */

import java.util.Comparator;
import java.util.Iterator;

public class ComparatorVonComparable <T extends Comparable <T>> {
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);		
	}

}
