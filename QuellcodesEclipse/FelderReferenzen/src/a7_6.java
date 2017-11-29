
public class a7_6 {
	public static void main(String[] args) {
		int a;
		int b;
		a = 5;
		b = a;
		
		System.out.println("a: " + a + "  b: " + b + " gleich: " + (a == b));
		b = 7;
		System.out.println("a: " + a + "  b: " + b + " gleich: " + (a == b));
		System.out.println();
		int [] A = new int[1];
		int [] B = new int[1];
		A[0] = 5;
		B = A;
		
		System.out.println("a: " + A[0] + "  b: " + B[0] + " gleich: " + (A == B));
		System.out.println(inhalt(A, B));
		B[0] = 7;
		System.out.println("a: " + A[0] + "  b: " + B[0] + " gleich: " + (A == B));
		System.out.println(inhalt(A, B));
		System.out.println();
		
		int [] Aa = new int[1];
		int [] Bb = new int [1];
		Aa[0] = 5;
		Bb[0] = Aa[0];
		
		System.out.println("a: " + Aa[0] + "  b: " + Bb[0] + " gleich: " + (Aa == Bb));
		System.out.println(inhalt(Aa, Bb));
		Bb[0] = 7;
		System.out.println("a: " + Aa[0] + "  b: " + Bb[0] + " gleich: " + (Aa == Bb));
		System.out.println(inhalt(Aa, Bb));
		
	}
	
	public static boolean length(int [] a, int [] b){
		if(a.length == b.length){
			return true;
		}
		
		return false;
	}
	
	public static boolean inhalt(int [] a, int [] b){
		boolean length = length(a, b);
		int zaehler = 0;
		
		
		for(int i = 0; i < a.length; i++){
			if(a[0] == b[0]){
				zaehler++;
			}
		}
		
		if(length == true && zaehler == a.length ){
			return true;
		}
		
		return false;
	}

}
