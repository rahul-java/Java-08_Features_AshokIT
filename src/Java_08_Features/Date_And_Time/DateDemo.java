package Java_08_Features.Date_And_Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {

		Date date = new Date();
		System.out.println(date);

		// format :: dd/MM/yyyy

		// Converting Date to String
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // indian date format
		String format = simpleDateFormat.format(date);
		System.out.println(format);

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy"); // indian date format
		String format1 = simpleDateFormat1.format(date);
		System.out.println(format1);

		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		String format2 = simpleDateFormat2.format(date);
		System.out.println(format2);

		// Converting String to Date
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = simpleDateFormat3.parse("2023-08-29");  //parse method convert string to date format
		System.out.println(parsedDate);

		// Converting String to Date
		SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd-MM-yyyy");
		Date parsedDate1 = simpleDateFormat4.parse(format1); //here format1 is a String of "dd-MM-yyyy" format
		System.out.println(parsedDate1);

	}
}
