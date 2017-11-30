
public class PivotPickerMitte<T> implements PivotPicker<T> {

	@Override
	public int pivot(Feld<? extends T> feld, int l, int r) {
		

		return (r + l + 1) / 2;
	}

}
