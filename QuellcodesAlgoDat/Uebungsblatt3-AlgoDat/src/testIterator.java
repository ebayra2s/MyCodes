import java.util.ArrayList;
import java.util.Iterator;


public class testIterator {
	public static void main(String[] args) throws Exception{
		ArrayList<String> listString = new ArrayList<String>();
		ArrayList<Integer> listInteger = new ArrayList<Integer>(); 
		
		listString.add("Kaffee");
		listString.add("munter");
		listString.add("erfolgreich");
		
		listInteger.add(7);
		listInteger.add(2);
		listInteger.add(6);
		listInteger.add(3);
		listInteger.add(9);
		
		Iterator<String> iteratorString = listString.iterator();
		Iterator<Integer> iteratorInteger = listInteger.iterator();
		
		
		
		System.out.println(IteratorUtil.toString(iteratorString, "versprochen: ", " macht ", "!"));
		System.out.println();
		System.out.println(IteratorUtil.toString(iteratorInteger, "(", ",", ")"));
		
	}

}
