/**
 * @author ebayra2s
 */

public class RingDyn<T> extends FeldAbstrakt<T> {
	private Feld<T> f = new FeldFix<T>(1);
	private int size;
	private int a;

	@Override
	public int size() {

		return size;
	}

	@Override
	public T get(int p) {
		checkIndex(p);
		return f.get((a + p) % f.size());
	}

	@Override
	public T set(int p, T v) {
		checkIndex(p);
		return f.set((a + p) % f.size(), v);
	}

	@Override
	public int total() {

		return f.size();
	}

	public void insertLast(T v) {
		adjust();
		if (size == f.size()) {
			throw new IllegalStateException();
		}
		
		++size;
		
		set(size - 1, v);
	}

	public void insertFirst(T v) {
		adjust();
		if (size == f.size()) {
			throw new IllegalStateException();
		}
		a = (a - 1 + f.size()) % f.size();
		++size;
		set(0, v);
	}

	public T removeLast() {
		
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		
		T v = get(size - 1);
		--size;
		adjust();

		return v;
	}

	public T removeFirst() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		T v = get(0);
		a = (a + 1) % f.size();
		--size;
		adjust();
		return v;
	}

	private void adjust() {
		if (size == total()) {
			Feld<T> ff = new FeldFix<T>(size * 2);
			for (int i = 0; i < size; i++) {
				ff.set(i, get(i));
			}
			a = 0;
			f = ff;
		} else if (size * 4 == total()) {
			Feld<T> ff = new FeldFix<T>(size * 2);
			for (int i = 0; i < size; i++) {
				ff.set(i, get(i));
			}
			a = 0;
			f = ff;
		}else if(size() == 0){
			Feld<T> ff = new FeldFix<T>(1);
			
			a = 0;
			f = ff;
		}
	}

}
