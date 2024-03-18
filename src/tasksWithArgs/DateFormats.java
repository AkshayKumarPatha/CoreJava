package tasksWithArgs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {
public static void main(String... args) {
	SimpleDateFormat fm=new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
	Date date=new Date();
	System.out.println(date.getDate());
	System.out.println(fm.format(date));
	SimpleDateFormat fm2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
	System.out.println(fm2.format(date));
	SimpleDateFormat fm3=new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
	System.out.println(fm3.format(date));
	
}
	
}
