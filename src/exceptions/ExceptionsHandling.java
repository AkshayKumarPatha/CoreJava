package exceptions;

public class ExceptionsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();

	}
//test
	
	//test
	static void method()
	{
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException w)
		{
			System.out.println(w);
		}
		finally
		{
			int a=10/4;
			System.out.println(a);
		}
	}
}
