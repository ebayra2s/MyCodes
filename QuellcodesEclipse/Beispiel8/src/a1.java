
public class a1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(ggT1(a, b));
		System.out.println(ggT2(a, b));
		System.out.println(ggT3(a, b));
		System.out.println(ggT4(a, b));

	}

	public static int ggT1(int x, int y) {

		if (x == 0) {
			return y;
		} else {
			while (y != 0) {
				if (x > y) {
					x -= y;
				} else {
					y -= x;
				}
			}
			return x;
		}

	}

	public static int ggT2(int x, int y) {
		if (x == 0) {
			return y;
		} else if (y == 0) {
			return x;
		} else if (x > y) {
			return ggT2(x -= y, y);
		} else {
			return ggT2(x, y -= x);
		}

	}
	
	public static int ggT3(int x, int y){
		if(x==0){
			return y;
		}else{
			while(y!=0){
				if(x>y){
					x%=y;
				}else{
					y%=x;
				}
			}
			return x;
		}
	}
	
	public static int ggT4(int x, int y){
		if(x==0){
			return y;
		}else if(y==0){
			return x;
		}else if(x>y){
			return ggT4(x%=y,y);
		}else{
			return ggT4(x, y%=x);
		}
	}
}
