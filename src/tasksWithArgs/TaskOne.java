package tasksWithArgs;

public class TaskOne {

	public static void main(String[] AO)
	{
	int n=Integer.parseInt(AO[0]);
	posNeg(n);
	}
public static void posNeg(int n)
	{
	if(n>0)
	System.out.println("The Entered Number is Positive(+ve):::::"+n);
	if(n<0)
	System.out.println("The Entered Number is Negtive(- ve):::::"+n);
	}
}
