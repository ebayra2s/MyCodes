
public class a6_1 {
	public static void main(String[] args) {
		int hausarbeit = 5;
		int vortrag = 8;
		int summe = 0;
		
		System.out.println("Summe beträgt " + bewerten(hausarbeit, vortrag, summe));
	}
	
	public static int bewerten(int hausarbeit, int vortrag, int summe){
		hausarbeit *= 3;
		vortrag *= 2;
		summe = hausarbeit + vortrag;
		return summe;
	}

}
