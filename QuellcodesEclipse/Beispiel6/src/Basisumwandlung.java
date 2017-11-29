
public class Basisumwandlung {
	public static void main(String[] args) {
		
		int basis = Integer.parseInt(args[0]);
		String chain = args[1];
		int ausgabe = 0;
		
		System.out.println(zahl(chain, basis, ausgabe));
		
	}
	//x=chain, a=basis, b=ausgabe
	public static int zahl(String x, int a, int b){
		int j=0;
		char y=' ';
		while(j<x.length()){
			y=x.charAt(j);
			if(y<=57){
				y-=48;
				 b=(b+y)*a;
			}else{
				y-=55;
				b=(b+y)*a;
			}
			j++;
		}
		return b/a;
	}

}
