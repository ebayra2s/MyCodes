
public class a3_12 {
	public static void main(String[] args) {
		double babylon = 3.0 + (1.0/8.0);
		double egypt = Math.pow((16.0/9.0), 2);
		double china = Math.sqrt(10.0);
		double europa = 3.0 + (1.0/7.0);
		System.out.println("Java Math.PI Methode Value: " + Math.PI);
		System.out.println("Babylon value is : " + babylon +", Difference is : " + abweichung(babylon));
		System.out.println("Egypt value is : " + egypt +", Difference is : " + abweichung(egypt));
		System.out.println("China value is : " + china +", Difference is : " + abweichung(china));
		System.out.println("Europa value is : " + europa +", Difference is : " + abweichung(europa));

		
	}
	
	public static double abweichung(double x){
		return Math.PI - x;
	}

}
