package second.aplication;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double m = 0;

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			m += vect[i].getPrice();
		}

		for (int i = 0; i < vect.length; i++) {

			if(vect[i].getPrice() < 0) {
				System.out.println(vect[i].getPrice());
			}
		}

		m = m / vect.length;
		System.out.printf("The average height is: %.2f%n", m);

		sc.close();

	}

}
