package a_triangle_calculator;

import java.util.Locale;
import java.util.Scanner;
import entites.Triangle;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		x.p = x.calcP();
		x.area = x.calcArea();
		
		y.p = y.calcP();
		y.area = y.calcArea();
		
		x.printArea();
		y.printArea();
		
				
		if (x.area > y.area) {
			System.out.println("Larger area: X");
		}else if(x.area < y.area) {
			System.out.println("Larger area: Y");
		}else {
			System.out.println("Revisar Codigo");
		}
		
				
		
		
		sc.close();
	
	}

}
