
public class a4_17 {
	public static void main(String[] args) {
		int decimal = 49;
		String binary = "";
		int rest = 0;
		
		int i = 1;
		while(i <= 32){
			rest = decimal % 2;
			decimal /= 2;
			 binary += rest;
			 
			 i++;
		}
		
		System.out.println(binary);
		
	}

}
