import java.util.Scanner;
public class RationalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rational ergebnis;
		Rational b;
		ergebnis = new Rational(sc.nextInt(),sc.nextInt());
	//	Rational ergebnis = null;
		
		while(true){
			Rational tmp;
			//char operator = sc.next().charAt(0);
			char operator = sc.next().charAt(0);
			
			if(operator == '.')
				break;
			
			b = new Rational(sc.nextInt(),sc.nextInt());
			
			
			if(operator == '+'){
				tmp = ergebnis;
				ergebnis = b;
				b = tmp.add(ergebnis);
				
				
				
			}
			
			if(operator == '-'){
				tmp = ergebnis;
				ergebnis = b;
				b = tmp.sub(ergebnis);
				
			
			}
			
			if(operator == '*'){
				tmp = ergebnis;
				ergebnis = b;
				b = tmp.mul(ergebnis);
				
				
			}
			
			if(operator == '/'){
				tmp = ergebnis;
				ergebnis = b;
				b = tmp.div(ergebnis);
			
			
			}
			ergebnis=b;
		}
		System.out.println(ergebnis);
		
		
		sc.close();
	}

}
