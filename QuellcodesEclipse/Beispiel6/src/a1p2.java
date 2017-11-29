
public class a1p2 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int summe=0;
		
		if(n<=m){
			
			while(n<=m){
				
				summe=summe+n;
				n++;
				
			}
			System.out.println(summe);
		}else{
			System.out.println("Fehlermeldung!");
		}
		
	}

}
