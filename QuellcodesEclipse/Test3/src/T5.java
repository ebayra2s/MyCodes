
public class T5 {
	public static double f(int n, int m){
		if(n == 0){
			return g(n+m);
		}else{
			return f((n-1), (m+1));
		}
	}
	
	public static double g(int p){
		if(p > 2){
			return p-1;
		}else{
			return f((p-1),(p-2));
		}
	}
	
	public static void main(String []args){
		System.out.println(f(5,7));
	}
}
