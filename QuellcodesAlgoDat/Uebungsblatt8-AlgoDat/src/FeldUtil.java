/**
 * @author ebayra2s
 */
import java.util.Iterator;
public class FeldUtil {
	public static <T extends Comparable<T>> int sucheBinaerPos (Feld<T> a1, T a2){
		int z = 0;
		for(Iterator<T> run = a1.iterator(); run.hasNext(); z++){
			if(run.next().compareTo(a2) == 0){
				return z;
			}
		}
		
		return z+1;
	}
	
	public static <T extends Comparable<T>> int sucheBinaer (Feld<T> a1, T a2){
		int z = 0;
		for(Iterator<T> run = a1.iterator(); run.hasNext(); z++){
			if(run.next().compareTo(a2) == 0){
				return z;
			}
		}
		
		return -1;
	}

}
