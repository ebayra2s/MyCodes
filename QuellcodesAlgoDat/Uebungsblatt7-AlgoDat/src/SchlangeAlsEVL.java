/**
 * @author ebayra2s
 */

public class SchlangeAlsEVL<T> implements Schlange<T> {
	EVL<T> l = new EVL<T>();

	@Override
	public void insert(T e) {
		l.insertLast(e);

	}

	@Override
	public T element() {
		try {
			return l.getFirst();
		} catch (IndexOutOfBoundsException x) {
			throw new java.util.NoSuchElementException();
		}
	}

	@Override
	public T remove() {

		return l.removeFirst();
	}

	@Override
	public boolean isEmpty() {

		return l.isEmpty();
	}

	public int total() {
		return l.total();
	}

}
