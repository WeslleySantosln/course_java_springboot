package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		
		String r = "S";
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		do {
				
		Product product = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		
		System.out.println("Prince: ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in sotck: ");
		product.addProducts(sc.nextInt());
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in sotck: ");
		product.removeProducts(sc.nextInt());
		
		System.out.println();
		
	    String p = sc.nextLine();
		
		r = p;
		
		
		}while ( r.equalsIgnoreCase("s"));

		sc.close();
	}

}
