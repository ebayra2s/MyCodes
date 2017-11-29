
public class Programmgeruest {

	public static void main(String[] args) {
		System.out.println(fak(5));
	}
	
	public static int fak(int a){
		if(a==1)
			return a;
		return a*fak(a-1);
	}

}
