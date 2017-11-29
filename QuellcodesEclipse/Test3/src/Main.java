
public class Main {
	public static void main(String[] args) {
		A a = new A(6);
		
		System.out.println(a.x);
		System.out.println(a.y);
		
		B b = new B(12);
		
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(A.y);
		System.out.println(b.f(14));
		
		A ab = b; System.out.println(ab.f(1.5f));
		
		System.out.println(new B().x);
		System.out.println(ab.y);

		
	}

}
