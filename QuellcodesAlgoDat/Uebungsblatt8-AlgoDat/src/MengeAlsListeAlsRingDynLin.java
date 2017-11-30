/**
 * @author ebayra2s
 */

public class MengeAlsListeAlsRingDynLin<T> implements Menge<T>{
	ListeAlsRingDyn<T> l = new ListeAlsRingDyn<T>();

	@Override
	public int total() {
		
		return l.total();
	}

	@Override
	public boolean isEmpty() {
		
		return l.isEmpty();
	}

	@Override
	public int size() {
		
		return l.size();
	}

	@Override
	public T element() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		
		return l.getFirst();
	}

	@Override
	public boolean contains(T v) {
		if(IterableUtil.sucheLinear(l, v) == -1){
			
			return false;
		}
		
		return true;
	}

	@Override
	public boolean insert(T v) {
		if(contains(v)){
			return false;
		}
		
		l.insertFirst(v);
		return true;
	}

	@Override
	public boolean remove(T v) {
		if(!contains(v)){
			return false;
		}
		
		
		l.remove(IterableUtil.sucheLinear(l, v));
		return true;
	}

}
