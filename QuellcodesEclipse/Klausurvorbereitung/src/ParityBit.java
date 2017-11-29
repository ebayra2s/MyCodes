
public class ParityBit {
	public static void main(String[] args) {
		int wert = 0x17;
		int pruefbit = 0;
		int res = 0;
		int zaehler = 0;
		
		while(zaehler < 4){
			res += wert&1;
			wert = wert >> 0x1; 
		zaehler++;
		}
		
		if(((res % 2) == 0) && pruefbit == 0){
			System.out.println(true);
			System.out.println(res);
			System.out.println(pruefbit);
		}else if(((res % 2) == 1) && pruefbit == 1){
			System.out.println(true);
			System.out.println(res);
			System.out.println(pruefbit);
		}else{
			System.out.println(false);
			System.out.println(res);
			System.out.println(pruefbit);
		}
	}

}
