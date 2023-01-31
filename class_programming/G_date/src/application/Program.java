package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-01-31");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-31T11:36:00");
		Instant d06 = Instant.parse("1997-07-18T01:30:26Z");
		Instant d07 = Instant.parse("1997-04-19T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("19/04/2021", f1);
		LocalDateTime d09 = LocalDateTime.parse("31/01/2023 11:52", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(31, 1, 23);
		LocalDateTime d11 = LocalDateTime.of(31, 01, 31, 01, 30);
	
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
