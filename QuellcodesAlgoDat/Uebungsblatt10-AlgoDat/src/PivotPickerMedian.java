
public class PivotPickerMedian<T> implements PivotPicker<T> {

	@Override
	public int pivot(Feld<? extends T> feld, int l, int r) {
		int m = (r + l + 1) / 2;

		return Math.min(r, Math.max(l, m));
	}

}
