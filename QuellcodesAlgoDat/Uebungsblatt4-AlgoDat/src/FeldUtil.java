/**
 * @author ebayra2s
 */
public class FeldUtil {

	public static <T> void zipGeordnet(Feld<? super Paar<T, T>> ziel, Feld<? extends T> quelle1, Feld<? extends T> quelle2,
			java.util.Comparator<? super T> comp) {

		if (quelle1.size() < ziel.size() || quelle2.size() < ziel.size()) {
			throw new IndexOutOfBoundsException();
		}

		for (int i = 0; i < ziel.size(); i++) {
			if (comp.compare(quelle1.get(i), quelle2.get(i)) > -1) {
				ziel.set(i, new Paar<T, T>(quelle2.get(i), quelle1.get(i)));
			} else {
				ziel.set(i, new Paar<T, T>(quelle1.get(i), quelle2.get(i)));
			}

		}

	}

}
