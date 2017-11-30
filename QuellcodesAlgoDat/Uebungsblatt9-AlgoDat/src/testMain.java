
public class testMain {
	public static void main(String[] args) {
		FeldFix<Integer> f_obj = new FeldFix<Integer>(8);
		  f_obj.set(0,6);
		  f_obj.set(1,1);
		  f_obj.set(2,2);
		  f_obj.set(3,7);
		  f_obj.set(4,4);
		  f_obj.set(5,8);
		  f_obj.set(6,5);
		  f_obj.set(7,3);
		  FeldFix<Integer> f = f_obj;
		  FeldCount<Integer> feld = new FeldCount<Integer> (f);
		  feld.resetCount();
		  ComparatorCount<Integer> comp = new ComparatorCount<Integer> (new ComparatorVonComparable<Integer>());
		  FeldUtil.sortMerge(feld,comp);
	}

}
