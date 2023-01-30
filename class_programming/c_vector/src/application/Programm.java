package application;

import java.util.Locale;
import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double m = 0;
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		
		for (int i = 0; i<n; i++) {
			m += vect[i];
			System.out.printf("%.2f%n", vect[i]);
		}
		
		m = m/n;
		System.out.printf("The average height is: %.2f%n", m);
		
		sc.close();
	}

}
