
/**
 * @author ebayra2s
 */

import java.util.Iterator;

public class FeldIterableVonPaar<E,Z> implements FeldIterable<Paar<E,Z>>{
	
	private FeldIterable<E> e;
	private FeldIterable<Z> z;
	
	public FeldIterableVonPaar(FeldIterable<E> e, FeldIterable<Z> z){
		this.e = e;
		this.z = z;
	}

	@Override
	public boolean isEmpty() {
		
		return this.e.isEmpty() || this.z.isEmpty();
	}

	@Override
	public int size(){
		

		return (this.e.size() <= this.z.size()) ? this.e.size() : this.z.size();
	}

	@Override
	public Paar<E, Z> get(int p) throws IndexOutOfBoundsException{

		return new Paar<E,Z>(this.e.get(p), this.z.get(p));
	}
	

	@Override
	public Paar<E, Z> set(int p, Paar<E, Z> e) throws IndexOutOfBoundsException{
		Paar<E,Z> tmp = get(p);
		this.e.set(p, e.erstes());
		this.z.set(p, e.zweites());
		
		return tmp;
	}

	@Override
	public void swap(int p, int q) throws IndexOutOfBoundsException{
		 this.e.swap(p, q);
		 this.z.swap(p, q);
		
	}

	@Override
	public Iterator<Paar<E, Z>> iterator() {
		
		return new IteratorVonPaar<E,Z>(e.iterator(),z.iterator());
	}

}
