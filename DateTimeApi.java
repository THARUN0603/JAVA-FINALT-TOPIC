package Finaltopic;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeApi {
	public static void main(String[]args) {
		System.out.println("Lets Display Local Date:");
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		
		Instant i=Instant.now();
		System.out.println(i);
		
		System.out.println("Lets Display Local Time:");
		LocalDateTime lt=LocalDateTime.of(2026,8,20,12,00);
		System.out.println(lt);
		
		LocalDateTime li=LocalDateTime.now();
		System.out.println(li);
	}

}
