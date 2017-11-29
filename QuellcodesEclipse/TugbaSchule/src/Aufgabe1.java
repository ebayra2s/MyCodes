import java.util.Scanner;
public class Aufgabe1 {
	public static void main(String[] args) {
		
		double [] berechnung = div();
		
		for(int i = 0; i < berechnung.length; i++){
			System.out.println(""+(i+1) +". Verhältnis"+ " liefert als Ergebnis " + berechnung[i] );
		}
		
		
		
	}
	
	public static double [] div(){
		Scanner sc = new Scanner(System.in);
		
		double euroKapital = sc.nextDouble();
		int verhaeltnisSumme = sc.nextInt();
		double [] verhaeltnisFeld = {2, 5, 7, 1};
		
		for(int i = 0; i < verhaeltnisFeld.length; i++){
			verhaeltnisFeld [i] *= (euroKapital/verhaeltnisSumme);
		}
		
		sc.close();
		
		return verhaeltnisFeld;
	}

}
