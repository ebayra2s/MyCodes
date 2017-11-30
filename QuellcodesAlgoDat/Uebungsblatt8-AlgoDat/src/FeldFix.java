import java.util.Iterator;

/**
 * @author ebayra2s
 */
public class FeldFix<T> implements Feld<T>{
	private T[] a;
	  public FeldFix(int size) {
	    @SuppressWarnings("unchecked")
	      T[] tmp = (T[])new Object[size];
	    a = tmp;
	  }
	  public int total() {
	    return a.length;
	  }
	  public int size() {
	    return a.length;
	  }
	  public T get(int p) {
	    return a[p];
	  }
	  public T set(int p, T v) {
	    T result = a[p];
	    a[p] = v;
	    return result;
	  }
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void swap(int p, int q) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
