/**
 * @author ebayra2s
 */
public class FeldDyn<T> extends FeldAbstrakt<T> {
	private Feld<T> f = new FeldFix<T>(1);
	private int size;

	public int total() {
		return f.size();
	}

	public int size() {
		return size;
	}

	public T get(int p) {
		checkIndex(p);
		return f.get(p);
	}

	public T set(int p, T v) {
		checkIndex(p);
		return f.set(p, v);
	}

	// in der Vorlesung gezeigte Fassung - nicht aufgeteilt
	/*
	 * public void insert(T v) { if (size == f.size()) { FeldFix<T> fNeu = new
	 * FeldFix<T>(2 * size); for (int i = 0 ; i < size ; ++i) { fNeu.set(i,
	 * f.get(i)); } f = fNeu; } f.set(size++, v); }
	 */
	private void adjust(int s) {
		Feld<T> ff = new FeldFix<T>(s);
		for (int i = 0; i < size; ++i) {
			ff.set(i, get(i));
		}
		f = ff;
	}

	private void adjustInsert() {
		if (size == f.size()) {
			adjust(f.size() * 2);
		}
	}

	private void adjustRemove() {
		if (size * 2 == 0)
			adjust(1);
		else
			adjust(size * 2);

		// hier sollte der Speicherplatz halbiert werden,
		// wenn der Fuellgrad nur noch ein Viertel betraegt
	}

	public void insert(T v) {
		adjustInsert();
		f.set(size++, v);
	}

	public T remove() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		T tmp = f.get(--size);
		if (total() >= size * 4 && total() > 1) {
			adjustRemove();
		}

		return tmp;
		// hier sollte der Speicherplatz halbiert werden,
		// wenn der Fuellgrad nur noch ein Viertel betraegt
	}

}
