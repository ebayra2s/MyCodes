/**
 * @author ebayra2s
 */
public class StapelUtil {
	public static <T> int size(Stapel<T> s) {
		int size = 0;
		Stapel<T> tmp = new StapelAlsFeldFix<T>();
		while (!s.isEmpty()) {
			size++;
			tmp.insert(s.remove());
		}

		while (!tmp.isEmpty()) {
			s.insert(tmp.remove());
		}
		return size;
	}

	public static <T> void revert(Stapel<T> s) {
		Schlange<T> tmp = new SchlangeAlsFeldFix<T>();
		while (!s.isEmpty()) {
			tmp.insert(s.remove());
		}
		while (!tmp.isEmpty()) {
			s.insert(tmp.remove());
		}
	}

	public static <T> void append(Stapel<? super T> ziel, Stapel<T> quelle) {
		Stapel<T> tmp1 = new StapelAlsFeldFix<T>();
		Stapel<T> tmp2 = new StapelAlsFeldFix<T>();
		while (!quelle.isEmpty()) {
			tmp1.insert(quelle.remove());
			tmp2.insert(tmp1.element());
		}
		while (!tmp1.isEmpty()) {
			ziel.insert(tmp1.remove());
		}
		while (!tmp2.isEmpty()) {
			quelle.insert(tmp2.remove());
		}
	}

}
