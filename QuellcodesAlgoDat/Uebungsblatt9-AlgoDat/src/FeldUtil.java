/**
 * @author ebayra2s
 */

public class FeldUtil {
	// public static <T> void swap(Feld<T> a, int p1, int p2) {
	// if (a.get(p1) != a.get(p2)) {
	// T tmp = a.get(p1);
	// a.set(p1, a.get(p2));
	// a.set(p2, tmp);
	// }
	// }
	//
	// public static <T> int minPos(Feld<? extends T> feld, int i,
	// java.util.Comparator<? super T> comp) {
	//
	// int p = i;
	// for (int j = i + 1; j < feld.size(); ++j) {
	// if (comp.compare(feld.get(p), feld.get(j)) > 0) {
	// p = j;
	// }
	//
	// }
	// return p;
	// }
	//
	// public static <T> void sortSelect(Feld<? extends T> feld,
	// java.util.Comparator<? super T> comp) {
	// // fuer jede Position des Feldes, bis vorletzter:
	// for (int i = 0; i < feld.size() - 1; ++i) {
	// // suche Pos. von kleinstem Element im Rest des Feldes
	// // und tausche mit aktueller Position
	// swap(feld, i, minPos(feld, i, comp));
	// }
	// }
	//
	// public static <T> void sortInsert(Feld<? extends T> feld,
	// java.util.Comparator<? super T> comp) {
	// // fuer jedes Element, ab dem zweiten:
	// for (int i = 1; i < feld.size(); ++i) {
	// // solange vorhergehendes Element kleiner:
	// for (int j = i; j > 0 && comp.compare(feld.get(j - 1), feld.get(j)) > 0;
	// --j) {
	// // tausche Element nach links
	// swap(feld, j - 1, j);
	// }
	// }
	// }
	//
	// public static <T> void sortBubble(Feld<? extends T> feld,
	// java.util.Comparator<? super T> comp) {
	// int p = feld.size() - 1; // Position letzter Tausch
	// while (p > 0) { // solange vertauscht wurde
	// int r = p; // rechte Grenze fuer Iteration
	// p = 0; // bisher keine Vertauschung
	// for (int i = 0; i < r; ++i) {
	// if (comp.compare(feld.get(i), feld.get(i + 1)) > 0) { // falls
	// // Tausch
	// // notwendig:
	// swap(feld, i, i + 1); // tausche und
	// p = i; // merke Position
	// }
	// }
	// }
	// }

	public static <T> void sortMerge(Feld<? extends T> feld, java.util.Comparator<? super T> comp) {
		sortMerge(feld, comp, 0, feld.size());
	}

	public static <T> void sortMerge(Feld<T> feld, java.util.Comparator<? super T> comp, int l, int r) {
		if (r - l <= 1) {
			return;
		}
		int m = (l + r) / 2;

		sortMerge(feld, comp, l, m);
		sortMerge(feld, comp, m, r);

		Feld<T> y = new FeldFix<T>(r - l);
		Feld<T> tmp = new FeldCount<T>(y);

		int i = 0;
		int jl = l;
		int jr = m;
		while (jl < m && jr < r) {
			if (comp.compare(feld.get(jl), feld.get(jr)) <= 0) {
				tmp.set(i++, feld.get(jl++));
			} else {
				tmp.set(i++, feld.get(jr++));
			}
		}

		while (jl < m) {
			tmp.set(i++, feld.get(jl++));
		}
		while (jr < r) {
			tmp.set(i++, feld.get(jr++));
		}

		for (int k = 0; k < tmp.size(); ++k) {
			feld.set(l + k, tmp.get(k));
		}
	}

}
