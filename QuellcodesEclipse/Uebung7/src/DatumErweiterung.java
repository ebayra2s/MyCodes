import java.util.Scanner;

public class DatumErweiterung {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int j = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();

		m1 += m2;
		s += m1 / 60;
		m1 = m1 % 60;
		t += s / 24;
		s = s % 24;
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (t > 30) {
				t = t % 30;
				m++;
			}
		} else if (m == 2) {
			if (t > 28) {
				t = t % 28;
				m++;
			}

		} else {
			if (t > 31) {
				t = t % 31;
				m++;
			}

		}

		j += m / 13;
		if (m > 12) {
			m = m % 12;
		}

		System.out.println(j + " " + m + " " + t + " " + s + " " + m1);

		sc.close();
	}
}
