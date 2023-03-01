  package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.exceptions.DomainException;
import entities.model.Reservation;

public class Program {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyy): ");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyy): ");
			Date checkOut = sdf.parse(sc.next());
						
			System.out.println("Error in reservation: Check-out date must be after check-in date");			
		
			Reservation reserva = new Reservation(number, checkIn, checkOut);
			System.out.println("Resevation: " + reserva);
			
			System.out.println();
			System.out.println("Enter a data to update the reservation");
			System.out.print("Check-in date (dd/MM/yyy): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyy): ");
			checkOut = sdf.parse(sc.next());
									
			reserva.upDateDates(checkIn, checkOut);		
			System.out.println("Resevation: " + reserva);
		
		}catch(ParseException e ) {
			System.out.println("Invalid date format");
		}catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getLocalizedMessage());
		}catch(RuntimeException e){
			System.out.println("another unexpected error");
		}
			
		sc.close();
	}
}
