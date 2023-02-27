package entites;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Twe {
	private File file = new File("C:\\Users\\Weslley Santos\\Desktop\\AULA DE PROGRAMACAO\\class_java_2\\class\\class_exception_handling/in.txt");
	private Scanner sc = null;
	
	public Twe(){}
	
	public void methodOne() {
		
		try {
			sc = new Scanner(file); 
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		
		}catch(FileNotFoundException e) {
			System.out.println("Error opening file: ");
			
		}
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed");
		}		
	}
	
	
}
