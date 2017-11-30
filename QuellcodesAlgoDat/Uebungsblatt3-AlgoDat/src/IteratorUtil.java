/**
 * @author ebayra2s
 */
import java.util.Iterator;

public class IteratorUtil {
	
	public static <T> String toString(Iterator<T> i, String a, String z, String e){
		String rueckgabe = a;
		while(i.hasNext()){
			rueckgabe += i.next();
			
			if(i.hasNext()){
				rueckgabe += z;
			}
		}
		return rueckgabe + e;
	}

}
