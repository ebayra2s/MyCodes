/**
 * @author ebayra2s
 */
public class SchlangeUtil {
	public static <T> void sortMerge(Schlange<T> s, java.util.Comparator<? super T> comp) {
		if (s.isEmpty()) {
			return;
		}

		SchlangeAlsEVL<T> s1 = new SchlangeAlsEVL<T>();
		SchlangeAlsEVL<T> s2 = new SchlangeAlsEVL<T>();

		for (int i = 0; !s.isEmpty(); i++) {
			if (i % 2 == 0) {
				s1.insert(s.remove());
			} else {
				s2.insert(s.remove());
			}
		}

		if (s2.isEmpty()) {
			s.insert(s1.remove());
			return;
		}

		sortMerge(s1, comp);
		sortMerge(s2, comp);

		while (!s1.isEmpty() && !s2.isEmpty()) {
			if (comp.compare(s1.element(), s2.element()) > 0) {
				s.insert(s2.remove());
			} else {
				s.insert(s1.remove());
			}
		}

		while (!s1.isEmpty()) {
			s.insert(s1.remove());
		}

		while (!s2.isEmpty()) {
			s.insert(s2.remove());
		}

	}

}
