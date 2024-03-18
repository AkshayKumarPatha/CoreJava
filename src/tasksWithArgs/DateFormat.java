package tasksWithArgs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		method();
		
	}


static void method() throws ParseException {
	SimpleDateFormat rr=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	String a="23/12/2023 12:54:55";
	String b="26/12/2023 12:54:55";
	Date s=rr.parse(a);
	Date r=rr.parse(b);
	System.out.println(s);
	if(s.after(r)) {
		System.out.println("After"+s);
	}
	else
	{
		System.out.println("Before"+r);
	}
}
}
