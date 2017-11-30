
/**
 * @author ebayra2s
 */

import java.util.Comparator;
import java.util.Iterator;

class ComparatorFuerIterableLex<T extends Comparable<T>> implements Comparator<Iterable<T>> {
	public int compare(Iterable<T> o1, Iterable<T> o2) {
		Iterator<T> iterator1 = o1.iterator();
		Iterator<T> iterator2 = o2.iterator();
		while (iterator1.hasNext() && iterator2.hasNext()) {
			T a = iterator1.next();
			T b = iterator2.next();
			if (a.compareTo(b) < 0) {
				return -1;
			} else if (a.compareTo(b) > 0) {
				return 1;
			}
		}
		if (!iterator1.hasNext() && !iterator2.hasNext()) {
			return 0;
		}
		if (!iterator1.hasNext() && iterator2.hasNext()) {
			return -1;
		}
		return 1;
	}

}
