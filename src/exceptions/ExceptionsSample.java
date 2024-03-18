package exceptions;

public class ExceptionsSample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(14);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void method(int age) throws Exception{
		
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible  for vote");
		}
		else 
		{
			System.out.println("Eligible For Vote");
		}
		
		
	}

}
