package tasksWithArgs;

public class TaskEight {
	
	public static void main(String[] A)
	{
	int suq=Integer.parseInt(A[0]);
	square(suq);
	}
	public static void  square(int suq)
	{
	int res=suq*suq;
	System.out.println("Square::::"+res);
	}

}
