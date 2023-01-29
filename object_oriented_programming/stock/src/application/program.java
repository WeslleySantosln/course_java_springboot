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
		
			
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Prince: ");
		double price = sc.nextDouble();
		
				
		Product product = new Product(name, price);
		
		
		System.out.println("Product data: " + product);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Do you want to add some products? [Y-N]");
		r = sc.next();
		
		if(r.equalsIgnoreCase("y")) {
		
		System.out.println("Enter the number of products to be added in sotck: ");
		product.addProducts(sc.nextInt());
		System.out.println("-------------------------------------------------------");
		
		}
		
		System.out.println("Do you want to removed some products? [Y-N]");
		r = sc.next();
		
		if(r.equalsIgnoreCase("Y")) {
			
		System.out.println("Enter the number of products to be removed in sotck: ");
		product.removeProducts(sc.nextInt());
		}
		
		System.out.println("Do you wish to add some product ? [Y-N]");		
	    r = sc.next();
		
				
		}while ( r.equalsIgnoreCase("y"));

		sc.close();
	}

}
