import java.util.Scanner;
public class MehrArrays {
	    public static void main(String[]args){
	        Scanner sc = new Scanner(System.in);
	       int zeile = sc.nextInt();
	       int spalte = sc.nextInt();
	       
	        int[][] a;                  
	        a=new int [zeile][spalte];
	        
	        for(int i=0; i<a.length;i++){
	            for(int j=0; j<a[i].length; j++){
	            	int eingabe = sc.nextInt();
	                a[i][j]=eingabe;
	                        
	            }
	        }

	        
	        for(int i=0; i<a.length;i++){
	            for(int j=0; j<a[i].length; j++){
	                System.out.print(a[i][j]);
	                System.out.println();
	            }
	            
	        }
	        System.out.println(a[0][1]);
	        sc.close();
	    }

}
