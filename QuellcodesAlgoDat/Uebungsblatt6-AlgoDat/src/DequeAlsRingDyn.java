/**
 * @author ebayra2s
 */
public class DequeAlsRingDyn<T> implements Deque<T> {
	RingDyn<T> r = new RingDyn<T>();

	@Override
	public int total() {

		return r.total();
	}

	@Override
	public boolean isEmpty() {

		return r.isEmpty();
	}

	@Override
	public void insertFirst(T v) {
		r.insertFirst(v);

	}

	@Override
	public void insertLast(T v) {
		r.insertLast(v);

	}

	@Override
	public T getFirst() {

		return r.get(0);
	}

	@Override
	public T getLast() {

		return r.get(r.size() - 1);
	}

	@Override
	public T setFirst(T v) {

		return r.set(0, v);
	}

	@Override
	public T setLast(T v) {

		return r.set(r.size() - 1, v);
	}

	@Override
	public T removeFirst() {

		return r.removeFirst();
	}

	@Override
	public T removeLast() {

		return r.removeLast();
	}

}
