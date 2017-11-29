
public class Mrd {
	public static void main(String[] args) {
		int l1=2000000000;
		int l2=2000000001;
		
		long l3=2000000000;
		long l4=2000000001;
		//sprengt den Wertebereich von 32bit deswegen negatives Ergebnis
		System.out.println(l1+l2);
		//zulässig, da der wertebereich von long 64bit lang ist
		System.out.println(l3+l4);
		
	}

}
