
public class a1p3 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int summe=0;
		
		if(n<=m){
		do{
		
			summe=summe+n;
			n++;
			
		}while(n<=m);
		}else{
			System.out.println("Fehlermeldung!");
		}
		
		System.out.println(summe);
		
		
		}
	
}
