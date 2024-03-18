package operators;
import java.util.*;
public class TernaryOperator 
	{
	public static void main(String[] args){
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter b number");
		int b=sc.nextInt();
		System.out.println("Enter c number");
		int c=sc.nextInt();
		String result=(a>b)?"A is big":"b is big";
		int largestnumber1=(a>b)?((a>c)?a:c):((b>c)?b:c);
		String largestnumber=(a>b)?((a>c)?"a is big":"c is big"):((b>c)?"b is big":"c is big");
		System.out.println(result);
		System.out.println(largestnumber+" "+ largestnumber1);
	}


	}
	}


