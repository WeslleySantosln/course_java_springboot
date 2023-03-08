package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Weslley Santos\\Desktop\\AULA DE PROGRAMACAO\\Curso de Java(Nelio Alves)\\class\\class_file\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {

			System.out.println("Error: " + e.getLocalizedMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				
				if (fr != null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
	
	
	}
}
