/**
 * @author ebayra2s
 */

public class SchlangeUtil {
	public static <T> int size(Schlange<T> s) {
		int size = 0;
		Schlange<T> tmp = new SchlangeAlsFeldFix<T>();
		while (!s.isEmpty()) {
			size++;
			tmp.insert(s.remove());
		}
		while (!tmp.isEmpty()) {
			s.insert(tmp.remove());
		}
		return size;
	}

	public static <T> void revert(Schlange<T> s) {
		Stapel<T> tmp1 = new StapelAlsFeldFix<T>();
		while (!s.isEmpty()) {
			tmp1.insert(s.remove());
		}
		while (!tmp1.isEmpty()) {
			s.insert(tmp1.remove());
		}

	}

	public static <T> void append(Schlange<? super T> ziel, Schlange<T> quelle) {
		Schlange<T> tmp1 = new SchlangeAlsFeldFix<T>();
		Schlange<T> tmp2 = new SchlangeAlsFeldFix<T>();

		while (!quelle.isEmpty()) {
			tmp1.insert(quelle.element());
			tmp2.insert(quelle.remove());
			ziel.insert(tmp2.remove());
		}
		while (!tmp1.isEmpty()) {
			quelle.insert(tmp1.remove());
		}

	}
}
