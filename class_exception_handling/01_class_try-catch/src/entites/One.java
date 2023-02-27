package entites;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
	
	private String r = "s";
	private static Scanner sc = new Scanner(System.in);
	
	
	public One() {		
	}
	
	public void method1() {		 
		
		do{
			System.out.println("-----M E T H O D-FIRST  S T A R T------------");
			method2();		
		
			System.out.println("Do you want to repeat? [s or n]");			
			r = sc.next();
			
		}while(r.equalsIgnoreCase("s"));
		
		System.out.println("-----M E T H O D-FIRST  E N D------------");
		sc.close();
		
	}
		
	
	private static void method2() {
		System.out.println("-----M E T H O D-SECOND  S T A R T------------");
		
		System.out.println("enter 3 names, separating them with space" );
		try {
			sc.next();
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Enter a value for position!");
			int position = sc.nextInt();		
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			e.printStackTrace();
			
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid value for position!");
		}
		
		System.out.println("-----M E T H O D-SECOND  E N D------------");
		
	}

	
}
