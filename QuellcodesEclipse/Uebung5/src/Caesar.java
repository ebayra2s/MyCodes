import java.util.*;
public class Caesar {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 //Schlüssel k
		 int k = sc.nextInt();
		 char ergebnis;
		 
		 //Großbuchstabe b
		 String s1 = sc.next();
		 char b = s1.charAt(0);
		 
		
		
		ergebnis = (char)((b-'A'+k)%26+'A');
		
		 System.out.println(ergebnis);
		 
	

	}

}
