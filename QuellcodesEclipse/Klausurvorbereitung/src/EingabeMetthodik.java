import java.util.Scanner;
import java.io.*;
public class EingabeMetthodik {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = Integer.parseInt(args[0]),
				e = Integer.parseInt(args[1]), f = Integer.parseInt(args[2]);
		
		System.out.println(a + b + c);
		System.out.println(d + e + f);
		sc = null;
		
		try{
			sc = new Scanner(new File("/Users/Emre/Desktop/test.txt"));
		}catch(FileNotFoundException x){
			System.out.println("Datei nicht gefunden!");
			return;
		}
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(a + b + c);
		
		
	}

}
