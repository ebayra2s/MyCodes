import java.util.*;

public class LaengsteKette {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int erg = 1;
		int akt = 1;
		while (sc.hasNextInt()) {

			int i = sc.nextInt();

			if (i == h) {
				akt++;
				if (akt > erg) {
					erg = akt;
				}

			} else {

				akt = 1;
			}

			h = i;

		}

		System.out.println(erg);
		
		sc.close();
	}

}
