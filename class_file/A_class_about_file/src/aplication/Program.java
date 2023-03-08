package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Weslley Santos\\Desktop\\AULA DE PROGRAMACAO\\Curso de Java(Nelio Alves)\\class\\class_file\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null){
				sc.close();
			}
		}
		
		
	}

}
