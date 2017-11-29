
public class a4 {
	public static void main(String[] args) {
		String vn= "vor";
		char b= 's';
		String s = "durstiger";
		int len=s.length();
		
		int a=s.indexOf(b);
		
		if(vn.equals("vor")){
			System.out.println("vor " + b + " in " + s) ;
			System.out.println(s.substring(0, a));
		}else{
			System.out.println("nach " + b + " in " + s) ;
			System.out.println(s.substring(a+1, len));
		}
		
		
	}

}
