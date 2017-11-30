/**
 * @author ebayra2s
 */

public class StapelAlsEVLPur<T> implements Stapel<T> {

	EVLPur<T> ep = new EVLPur<T>();

	@Override
	public void insert(T e) {
		ep.insertFirst(e);
	}

	@Override
	public T element() {
		return ep.getFirst();
	}

	@Override
	public T remove() {
		return ep.removeFirst();
	}

	@Override
	public boolean isEmpty() {
		return ep.isEmpty();
	}

	public int total() {
		return ep.total();
	}

}
