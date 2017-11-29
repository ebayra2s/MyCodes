
public class A4 {
	public static void main(String[] args) {
		int [] a = {1, 3, 4, 5, 6};
		int [] b = {3, 4, 5};
		System.out.println(isSubarray(a, b));
	}
	
	public static boolean isSubarray(int [] y, int [] z){
		int x = 0;
		int t = 0;
		boolean w = false;
		for(int i = 0; i < y.length; i++){
			
				if(y[i] == z[x]){
					t++;
					x++;
				}else{
					
					x=0;
					t=0;
					w = false;
				}
				if(t == z.length){
					w = true;
					return w;
				}
			
		}
			
		return w;
			
	}

}
