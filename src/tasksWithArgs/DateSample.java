package tasksWithArgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {
	
		Date date=new Date();
		System.out.println("Today Date:::"+date);
	
		LocalDate localdate=LocalDate.now();
		System.out.println("Local Date:::"+localdate);
		LocalTime localtime=LocalTime.now();
		System.out.println("Local Time:::"+localtime);
		LocalDateTime localDate=LocalDateTime.now();
		System.out.println("Local Date and Time:::"+localDate);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Local Format:::"+dtf.format(localDate));
		DateTimeFormatter dtf1=DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println("Local Basic date:::"+dtf1.format(localdate));
		DateTimeFormatter dtf2=DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println("Local Time:::"+dtf2.format(localtime));
	}

}
