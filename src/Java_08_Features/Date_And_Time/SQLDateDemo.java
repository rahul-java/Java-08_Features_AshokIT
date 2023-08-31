package Java_08_Features.Date_And_Time;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class SQLDateDemo {

	public static void main(String[] args) throws Exception {

		Date date = new Date(20230830);
		System.out.println(date);  //1970-01-01

		// format :: dd/MM/yyyy

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		String format = simpleDateFormat.format(date);
		System.out.println(format);  //01/01/1970

		

	}
}
