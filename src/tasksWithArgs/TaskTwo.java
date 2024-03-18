package tasksWithArgs;

public class TaskTwo {
	
	public static void main(String[] AO)
	{
	int n=Integer.parseInt(AO[0]);
	evenOdd(n);
	}
	public static void evenOdd(int n)
	{
	if(n%2==0)
	System.out.println("The Entered Number is Even:::::"+n);
	else
	System.out.println("The Entered Number is Odd:::::"+n);
	}

}
