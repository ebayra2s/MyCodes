
public class Aufgabe5 {
	public static void main(String []args){
		boolean wert1=true;
		boolean wert2=false;
		
		System.out.println(!wert1&(wert1|wert2));
		System.out.println((wert1&wert2)|(!wert1&!wert2));
		System.out.println(!(wert1&wert2)|(!wert1|!wert2));
		System.out.println(!(wert1|false)&(wert1 !=wert2));
	}

}
