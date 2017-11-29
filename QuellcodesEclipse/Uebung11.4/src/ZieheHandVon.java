import java.util.Scanner;
public class ZieheHandVon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int zahl = sc.nextInt();
		Blatt b1 = new Blatt();
		Karte [] gezogeneKarten;
		
		

		gezogeneKarten = b1.ziehe(zahl);

			
			for(int i = 0; i < gezogeneKarten.length; i++ ){
				System.out.println(gezogeneKarten[i].toString());
			}
			sc.close();

	}	
}
