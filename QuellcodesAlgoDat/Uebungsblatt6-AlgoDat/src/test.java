
public class test {

	public static void main(String[] args) {
		  RingDyn<Integer> r = new RingDyn<Integer> ();
		  Feld<Integer> f = r;
		  f.size();
		  r.total();
		  r.insertLast(1);
		  f.size();
		  r.total();
		  r.insertFirst(0);
		  f.size();
		  r.total();
		  r.insertLast(2);
		  f.size();
		  r.total();
		  f.get(0);
		  f.get(1);
		  f.get(2);
		  try {
		    f.get(3);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  f.set(0, 2);
		  f.set(2, 0);
		  f.get(0);
		  f.get(1);
		  f.get(2);
		  try {
		    f.set(3, 6);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  f.set(2, 5);
		  f.set(1, 4);
		  f.set(0, 3);
		  f.get(2);
		  f.get(1);
		  f.get(0);
		  f.size();
		  r.total();
		  r.removeLast();
		  f.size();
		  r.total();
		  r.removeFirst();
		  f.size();
		  r.total();
		  System.out.println(r.removeLast());
		  System.out.println(f.size());
		  System.out.println(r.total());
	}

}
