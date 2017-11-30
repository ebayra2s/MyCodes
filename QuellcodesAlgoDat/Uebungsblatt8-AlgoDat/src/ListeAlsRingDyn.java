/**
 * @author ebayra2s
 */
public class ListeAlsRingDyn<T> extends ListeAbstrakt<T> implements Liste<T> {
	private final RingDyn<T> r = new RingDyn<>();
	
	@Override
    public int total() {
        return r.total();
    }
    
    @Override
    public boolean isEmpty() {
        return r.size() == 0;
    }
    
    @Override
    public int size() {
        return r.size();
    }
 
    @Override
    public void insert(int i, T e) {
        if(i >= size() / 2) {
            insertLast(e);
            for(int j = size() - 1; j > i; j--) {
                swap(j, j - 1);
            }
        } else {
            insertFirst(e);
            for(int j = 0; j < i; j++) {
                swap(j, j + 1);
            }
        }
    }
    
    @Override
    public T remove(int i) {
        for(; i + 1 < size(); i++) {
            swap(i, i + 1);
        }
        return removeLast();
    }
 
    @Override
    public T set(int i, T e) {
        return r.set(i, e);
    }
 
    @Override
    public T get(int i) {
        return r.get(i);
    }
    
    @Override
    public T setFirst(T e) {
        if(isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return set(0, e);
    }
 
    @Override
    public T setLast(T e) {
        if(isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return set(size() - 1, e);
    }
 
    @Override
    public T getFirst() {
        if(isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return get(0);
    }
 
    @Override
    public T getLast() {
        if(isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return get(size() - 1);
    }
     
    @Override
    public void insertFirst(T e) {
         r.insertFirst(e);
    }
 
    @Override
    public void insertLast(T e) {
        r.insertLast(e);
    }
 
    @Override
    public T removeFirst() {
        return r.removeFirst();
    }
 
    @Override
    public T removeLast() {
        return r.removeLast();
    }
 
   @Override
    public java.util.Iterator<T> iterator() {
        return iterator(0);
    }
 
   	@Override
    public java.util.Iterator<T> iterator(int i) {
        return new IteratorFuerFeld<>(r, i);
    }
}
