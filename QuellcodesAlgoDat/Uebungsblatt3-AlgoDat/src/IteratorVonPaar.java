/**
 * @author ebayra2s
 */

import java.util.Iterator;

public class IteratorVonPaar<E,Z> implements Iterator<Paar<E,Z>> {
	private Iterator<E> e;
	private Iterator<Z> z;
	
	public IteratorVonPaar(Iterator<E> e, Iterator<Z> z){
		this.e = e;
		this.z = z;
		
	}

	@Override
	public boolean hasNext() {
		
		return e.hasNext() && z.hasNext();
	}

	@Override
	public Paar<E, Z> next() {
		
		return new Paar<E,Z>(e.next(),z.next());
	}

}
