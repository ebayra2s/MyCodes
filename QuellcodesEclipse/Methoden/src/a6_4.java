
public class a6_4 {
	public static void main(String[] args) {
		System.out.println(iterativ(0, 1));
		System.out.println(rekursiv(0, 1));
	}
	
	public static int iterativ(int x, int y){
		int summe = 1;
		
		for(int i = y; i > 0; i--){
			summe *= x;;
		}
	
			
			return summe;
	}
		
		

	
	public static int rekursiv(int x, int y){
		
		if(y == 0){
			return 1;
		}else{
			return x * rekursiv(x, y-1);
		}
	}

}
