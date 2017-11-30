
/**
 * @author ebayra2s
 */

public class EVL<T> {
	private class Item {
		private Item next;
		private T v;

		public Item(T v) {
			this.v = v;
		}
	}

	private Item first;
	private Item last;
	private int i;

	// nur solche Methoden bereitgestellt, die von Stapel/Schlange benoetigt
	// werden
	// oder die sich mit konstantem Aufwand implementieren lassen:
	public int total() {
		return 2 + 2 * size();
	}

	public boolean isEmpty() {
		return first == null;
	}

	// (nur) benoetigt fuer total()
	private int size() {

		// zu implementieren

		return i;
	}

	public T getFirst() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		return first.v;
	}

	public T getLast() {
		// zu implementieren
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}

		return last.v;
	}

	public T setFirst(T v) {
		// zu implementieren
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Item i = new Item(v);
		T tmp = first.v;
		first.v = v;
		if (first == last) {
			last = i;
		} else {
			i.next = first.next;
		}
		first = i;

		return tmp;
	}

	public T setLast(T v) {
		// zu implementieren
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		Item i = new Item(v);
		T tmp = last.v;
		if (first == last) {
			first = i;
		} else {
			Item b = first;
			while (b.next != last) {
				b = b.next;
			}
			b.next = i;
		}
		last = i;
		return tmp;
	}

	public void insertFirst(T v) {
		// zu implementieren
		Item item = new Item(v);
		i++;

		if (isEmpty()) {
			last = item;
		} else {
			item.next = first;
		}

		first = item;
	}

	public void insertLast(T v) {
		Item item = new Item(v); // neues Hilfsobjekt
		i++;
		if (isEmpty()) { // wenn Liste leer ...
			first = item; // ... H.O. einziges
		} else { // ... sonst ...
			last.next = item; // ... H.O. hintenan
		}
		last = item; // H.O. in jedem Fall letztes
	}

	public T removeFirst() {
		i--;
		T v = getFirst(); // Vorbed.: Liste nicht leer
		first = first.next; // zweites wird erstes
		if (first == null) { // evtl. Liste dann leer
			last = null;
		}
		return v;
	}
	
	public void revert(){
		Item neu = null;
		
		while(first != null){
			Item alt = first.next;
			first.next = neu;
			neu = first;
			
			first = alt;
			
		}
		
		first = neu;
	}
	// removeLast() haette Aufwand proportional zu Laenge, ist daher nicht
	// bereitzustellen
}
