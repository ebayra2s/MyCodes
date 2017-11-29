
public class a1_2 {
	public static void main(String[] args) {
		int [] x = new int[args.length];
		
		for(int i = 0; i < x.length; i++){
			x[i] = Integer.parseInt(args[i]);
		}
		
		
		
	}
	
 public static int min(int [] x){
	 int min = 0;
	 
	 for(int i = 0; i < x.length; i++){
		 if(x[i] < min){
			 min = x[i];
		 }
	 }
	 return min;
 }

}
