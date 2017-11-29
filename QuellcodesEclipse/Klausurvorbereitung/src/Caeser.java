import java.util.Scanner;
public class Caeser{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int schluessel = sc.nextInt();
		String a = sc.next();
		char buchstabe = a.charAt(0);
		 
		char result = (char)((buchstabe -'A' + schluessel)%26 + 'A');
		
		System.out.println(result);
	}

}
