
public interface PivotPicker<T> {
	public int pivot(Feld<? extends T> feld, int l, int r);

	/**
	 * @return Position des zu verwendenden Pivotelements in dem Intervall (l,r)
	 *         in feld zurückgibt
	 */

}
