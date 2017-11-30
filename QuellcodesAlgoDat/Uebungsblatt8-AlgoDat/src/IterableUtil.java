/**
 * @author ebayra2s
 */

import java.util.Iterator;

public class IterableUtil {
	public static <T> int sucheLinear(Iterable <T> a1, T a2){
		
		int z = 0;
		for(Iterator<T> run = a1.iterator(); run.hasNext(); z++){
			if(run.next().equals(a2)){
				return z;
			}
		}
		return -1;
	}

}
