/**
 * @author ebayra2s
 */

public class EVLPur<T> {
	private class Item {
		private Item next;
		private T v;

		public Item(T v) {
			this.v = v;
		}
	}

	private Item first;
	private int i;

	public int total() {
		return 1 + 2 * size();
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {

		return i;
	}

	public T getFirst() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}

		return first.v;
	}

	public T setFirst(T v) {
		// zu implementieren
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Item i = new Item(v);
		T tmp = first.v;
		i.next = first.next;
		first = i;
		

		return tmp;
	}

	public void insertFirst(T v) {
		// zu implementieren
		Item item = new Item(v);
		i++;

		item.next = first;

		first = item;

	}

	public T removeFirst() {
		i--;

		T v = getFirst(); // Vorbed.: Liste nicht leer

		first = first.next; // zweites wird erstes

		return v;
	}

}
