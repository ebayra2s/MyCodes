
public class a4_15 {
	public static void main(String[] args) {
		double basispreis = 22.98;
		int gespraechsminuten = Integer.parseInt(args[0]);
		double result = basispreis;
		
		if(gespraechsminuten > 30){
			gespraechsminuten -= 30;
			
			result += (gespraechsminuten*0.248);
			
		}
		
		System.out.println(result);
		
	}

}
