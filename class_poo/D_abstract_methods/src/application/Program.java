package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("Rectangle or Cicle? [R/C]");
			String rc = sc.next();
			System.out.println("Color: [BLACK/BLUE/RED]");
			Color color = Color.valueOf(sc.next().toUpperCase());
			
			if(rc.equalsIgnoreCase("r")) {
				System.out.println("Width: ");
				Double wi = sc.nextDouble();
				
				System.out.println("Height: ");
				Double hei = sc.nextDouble();
				
				list.add(new Rectangle(color, wi, hei));
			}
			
			if(rc.equalsIgnoreCase("c")) {
				System.out.println("Radius: ");
				Double rd = sc.nextDouble();				
				list.add(new Circle(color, rd));
			}			
		}

		for (Shape li : list) {
			System.out.println(li);
		}

	}

}
