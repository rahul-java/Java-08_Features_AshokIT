package Java_08_Features.Date_And_Time;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;


public class NewDateDemo {

	public static void main(String[] args) throws Exception {

		Date d = new Date();
		System.out.println(d);  //Wed Aug 30 02:01:47 IST 2023

		//LocalDate
		
		LocalDate date=LocalDate.now();
		System.out.println(date);  //2023-08-30
		
		 date = date.plusDays(3);
		System.out.println(date);  //2023-09-02
		
		date = date.plusMonths(2);
		System.out.println(date);  //2023-11-02
		
		date = date.plusYears(2);
		System.out.println(date);  //2025-11-02
		
		boolean leapYear = LocalDate.parse("2021-12-22").isLeapYear();
		System.out.println("Leap Year ::: "+leapYear);   //Leap Year ::: false
		
		boolean before = LocalDate.parse("2023-08-30").isBefore(LocalDate.parse("2023-08-31"));
		System.out.println(before);  //true
		
		//LocalTime
		
		LocalTime time = LocalTime.now();
		System.out.println(time);  //02:28:01.985
		
		time = time.plusHours(2);
		System.out.println(time);  //04:29:40.797
		
		//LocalDateTime
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);  //2023-08-30T02:31:08.963
		
		//Period
		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());  //5
		
		//Period.between(startDateInclusive, endDateExclusive);
		//Period between = Period.between(LocalDate.parse("1991-05-20"), LocalDate.parse("2023-08-30"));
		Period between = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now()); 
		System.out.println(between);  //P32Y3M10D Y:32,M:3,D:10
		System.out.println(between.getMonths());  //3
		System.out.println(between.getDays());  //10  
		System.out.println(between.getYears());  //32
		
		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);  //PT-15H-16M-43.488S
		
		
		
		

		
		
		

		

	}
}
