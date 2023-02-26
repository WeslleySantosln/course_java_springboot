package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		
		System.out.println("End of program");
		
		
	}
	
	public static void method1() {
		System.out.println("-----M E T H O D-FIRST  S T A R T------------");
		method2();		
		System.out.println("-----M E T H O D-FIRST  E N D------------");

	}
		
	
	public static void method2() {
		System.out.println("-----M E T H O D-SECOND  S T A R T------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 names, separating them with space" );
		try {
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
		
		
		sc.close();

	}
	 

}
