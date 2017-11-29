
public class ParityBit {
	public static void main(String []args){
	
		int wert = 0x17;
		int paritybit;
		int prüfbit=wert&0x1;
		int wert1=wert>>1;
		int bitwert1 = wert1&0x1;
		int wert2=wert1>>1;
		int bitwert2 = wert2&0x1;
		int wert3=wert2>>1;
		int bitwert3 = wert3&0x1;
		int wert4=wert3>>1;
		int bitwert4 = wert4&0x1;
		int quersum;
		
		quersum= bitwert1+bitwert2+bitwert3+bitwert4;
		
		
		
		if((quersum%2)==0){
			paritybit=0;
		}else{
			paritybit=1;
		}
		
		
		if(paritybit==prüfbit){
			System.out.println(true);
			
		}else{
			System.out.println(false);
		}
		
		System.out.println(quersum);
		System.out.println(prüfbit);
	}

}
