
public class MainKFZ {
	public static void main(String[] args) {
		Pkw a1 = new Pkw("HH A 1234", 60000.0, 30000.0, false);
		Lkw man = new Lkw("HH A 1235", 60001.0, 30000.0, 1900.0, true);
		
		System.out.println(a1.getKennzeichen());
		System.out.println(a1.getKmLetzteInspektion());
		System.out.println(a1.getKennzeichnung());
		System.out.println(a1.mietpreis(3));
		a1.inspektion();
		a1.waschen();
		
		System.out.println();
		
		System.out.println(man.getKennzeichen());
		System.out.println(man.getKmLetzteInspektion());
		System.out.println(man.getKennzeichnung());
		System.out.println(man.mietpreis(3));
		man.inspektion();
		
	}

}
