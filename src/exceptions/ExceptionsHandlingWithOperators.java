package exceptions;
import operators.ArithmethicOperator;
import java.util.*;

public class ExceptionsHandlingWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      division();

	}
static void division()
	{
		ArithmethicOperator s=new ArithmethicOperator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your 'a' Value");
		int a=sc.nextInt();
		System.out.println("enter your 'b' value");
		int b=sc.nextInt();
		try
		{
		System.out.println(s.divTwoNumber(a,b));
	
		}
		catch(ArithmeticException q)
		{
			System.out.println(q);
		}
		finally
		{
			System.out.println("Enter Correct Value");
		}
	}

}
