
public class FeldUtil {
	public <T> void sortQuick(Feld<? extends T> feld, java.util.Comparator<? super T> comp,
			PivotPicker<T> p) {
		
		sortQuick(feld, comp, p, 0, feld.size());

	}

	public <T> void sortQuick(Feld<? extends T> feld, java.util.Comparator<? super T> comp, PivotPicker<T> p, int l,
			int r) {

		if (l >= r) {
			return;
		}

		int pivot = p.pivot(feld, l, r);

		feld.swap(pivot, r);

		int il = l, ir = r - 1;

		do {
			while (il <= ir && comp.compare(feld.get(il), feld.get(r)) == -1) {
				++il;
			}

			while (il < ir && comp.compare(feld.get(ir), feld.get(r)) >= 0) {
				--ir;
			}

			if (il < ir) {
				feld.swap(il++, ir);
			}

		} while (il <= --ir);

		pivot = il;
		feld.swap(pivot, r);

		sortQuick(feld, comp, p, l, pivot - 1);
		sortQuick(feld, comp, p, pivot + 1, r);

	}

}
