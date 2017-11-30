import java.util.Iterator;

/**
 * @author ebayra2s
 */

public class IterableUtil {

	public static <T> T max2(Iterable<T> o1, java.util.Comparator<T> o2) throws IllegalArgumentException {

		int i = 0;
		T m1 = null, m2 = null;

		Iterator<T> iter = o1.iterator();
		if (iter.hasNext()) {
			m1 = iter.next();
			++i;
		}
		if (iter.hasNext()) {
			m2 = iter.next();
			++i;
		}
		if (i < 2) {

			throw new IllegalArgumentException();
		}

		if (o2.compare(m2, m1) > 0) {
			T tmp1 = m1;
			m1 = m2;
			m2 = tmp1;
			i = 2;
		}

		while (iter.hasNext()) {
			T e = iter.next();

			if (o2.compare(e, m2) > 0) {

				m2 = e;

				if (o2.compare(m2, m1) > 0) {
					T tmp1 = m1;
					m1 = m2;
					m2 = tmp1;
				}

			}
			i++;
		}

		return m2;

	}

}
