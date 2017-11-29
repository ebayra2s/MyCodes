import java.io.*;
import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner sc=null;
		
		try{sc=new Scanner(new File(args[0]));
		
		}catch(FileNotFoundException e){
			System.out.println("Datei nicht vorhanden!");
			return;
		}
	
		int count=0;
		while(sc.hasNext()){
			String a=sc.next();
			count+=a.length();
			
		}
		
		System.out.println(count);
		
		
		sc.close();
	}
}
