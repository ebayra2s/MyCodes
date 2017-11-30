import java.util.Iterator;
public class testMain {	
	public static <T> String toString(Iterator<T> t, String a, String z, String e){
		String tmp = a;
		
		while(t.hasNext()){
			tmp += z + t.next();
		}
		tmp += e;
		return tmp;
	}

}
