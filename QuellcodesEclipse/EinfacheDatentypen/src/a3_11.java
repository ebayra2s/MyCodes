
public class a3_11 {
	public static void main(String[] args) {
		int sterling = Integer.parseInt(args[0]);
		int shilling = Integer.parseInt(args[1]);
		int pence = Integer.parseInt(args[2]);

		int count = 0;
		for (int i = 1; pence >= 12; i++) {

			pence -= 12;

			count = i;

		}
		shilling += count;
		count = 0;
		while (shilling >= 20) {
			count++;
			shilling -= 20;

		}

		sterling += count;

		System.out.println(sterling);
		System.out.println(shilling);
		System.out.println(pence);

	}

}
