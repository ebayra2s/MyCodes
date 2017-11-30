
public class testMain {
	public static void main(String[] args) {
		
		  EVL<Integer> evl = new EVL<Integer> ();
		 evl.insertLast(1);
		 evl.insertLast(2);
		 evl.insertLast(3);
		 
		 evl.revert();
		 
		 System.out.println(evl.removeFirst());
		 System.out.println(evl.removeFirst());
		 System.out.println(evl.removeFirst());
	}

}
