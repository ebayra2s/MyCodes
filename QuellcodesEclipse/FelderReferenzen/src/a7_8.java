
public class a7_8 {
	public static void main(String[] args) {
		int n = 13;
		
		double [] x = x(n);
		double [] y = y();
		
		
	}
	
	public static double [] x(int n){
		double [] x = new double[n];
		
		for(int i = 0; i < n; i++){
			x [i] = 1996+i;
		}
		
		return x;
	}
	
	public static double [] y(){
		double [] y = {16.5, 18.2, 17.8, 20.1, 16.4, 19.5, 18.8,
				20.1, 17.5, 19.0, 23.4, 18.7, 19.4};
		return y;
	}

}
