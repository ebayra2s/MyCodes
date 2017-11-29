
public class a3 {
	public static boolean isLeapYear(int a){
		if((a%4==0)&&(a%100!=0)||(a%400==0)){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		int days=367;
		
		
		System.out.println(berechneJahr(days));
		System.out.println(days);
	}
	
	public static int berechneJahr(int x){
		int year=1980;
		
		while(x>365){
			if(isLeapYear(year)){
				if(x>366){
					x-=366;
					year++;	
				}else{
					break;
				}
			}else{
				x-=365;
				year++;
				
				
			}
			
		
		}
		
		return year;
	}

}
