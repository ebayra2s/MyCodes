
public class a6_5 {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++){
			System.out.println(ulam(i));
			System.out.println();
		}
	}
	
	public static int ulam(int x){
		
		if(x == 1){
			System.out.println("ulam(" + x + ") = ");
			return 1;
		}else if(x%2==0){
			System.out.println("ulam(" + x + ") = ");
			return ulam(x / 2);
		}else{
			System.out.println("ulam(" + x + ") = ");
			return ulam((3*x) + 1);
		}
	}

}
