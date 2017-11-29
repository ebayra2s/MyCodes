
public class a1p1 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int summe =0;
		
		
		if(n<=m){
			for (int i = n; i <= m; i++) {
				summe= summe+i;
			}
		}else{
			System.out.println("Fehlermeldung!");
		}
		
		System.out.println(summe);
	}

}
