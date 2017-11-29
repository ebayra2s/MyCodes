
public class Zoo {
	public static void main(String[] args) {
		Tier t1 = new Tier();
		Tier t2 = new Tier("Gerti");
		

		Gehege g1 = new Gehege();
		Gehege g2 = new Gehege(10);

		t1.umziehen(g1);
		t2.umziehen(g1);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(g1);
		System.out.println(g2);
	}

}
