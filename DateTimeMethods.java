package Finaltopic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeMethods {

	public static void main(String[] args) {
		LocalTime lt=LocalTime.now(ZoneId.of("Australia/Sydney"));
		System.out.println(lt);
		System.out.println("For Different Countries,Date and Time be:");
		System.out.println("India :"+ LocalTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println("London :"+ LocalTime.now(ZoneId.of("Europe/London")));
		System.out.println("Dubai :"+ LocalTime.now(ZoneId.of("Asia/Dubai")));
		System.out.println("Japan :"+ LocalTime.now(ZoneId.of("Asia/Tokyo")));
		System.out.println("US :"+ LocalTime.now(ZoneId.of("America/New_York")));
		
		System.out.println("Local Date and Time:");
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfYear());
		
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
	}

}
