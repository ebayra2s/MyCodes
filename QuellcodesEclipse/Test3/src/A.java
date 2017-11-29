
public class A{
	public int x;
	public static int y = 0;
	
	public A(){
		this(8);
		y++;
	}
	
	public A(int i){
		x = i;
		y++;
	}
	
	public int f(double d){
		return 11;
	}
	
	public int f(int i){
		return 2;
	}
}
