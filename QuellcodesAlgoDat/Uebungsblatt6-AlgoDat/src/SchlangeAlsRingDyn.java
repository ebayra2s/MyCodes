/**
 * @author ebayra2s
 */
public class SchlangeAlsRingDyn<T> implements Schlange<T> {
	RingDyn<T> r = new RingDyn<T>();

	@Override
	public void insert(T e) {

		r.insertLast(e);

	}

	@Override
	public T element() {

		try {
			return r.get(0);
		} catch (IndexOutOfBoundsException x) {
			throw new java.util.NoSuchElementException();
		}
	}

	@Override
	public T remove() {

		return r.removeFirst();
	}

	@Override
	public int total() {

		return r.total();
	}

	@Override
	public boolean isEmpty() {

		return r.isEmpty();
	}

}
