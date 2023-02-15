package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeOutsourced;

public class Program {
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int nEmplo;
	
	System.out.println("Enter the number of employees ");
	nEmplo = sc.nextInt();
	
	List<Employee> list = new ArrayList<>();
	
	
	for(int i = 0; i < nEmplo ; i++) {
		System.out.println(" - - - - - - - - - - - - - - - - -");
		System.out.println("Employee of Number: " + (i+1));
		System.out.print("Outsource? [Y or N] ");
		String r = sc.next();
		
		System.out.print("Enter the employee's name: ");
		String name = sc.next();
		System.out.print("Hours: ");
		int hours = sc.nextInt();
		System.out.print("Value per Charge: ");
		double vH = sc.nextDouble();
		
 
		if(r.equalsIgnoreCase("y")) {			
			System.out.print("Additional charge: ");
			double addC = sc.nextDouble();
			
			Employee emp = new EmployeeOutsourced(name, hours, vH, addC);
			list.add(emp);
		}else {
		
			Employee emp = new Employee(name, hours, vH);
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("--------P A Y M E N T S--------");
		for(Employee emp : list) {
			System.out.println(emp + (emp.payment().toString()));
			
		}
		
	}
	
	
	
	
	sc.close();
	}
}
