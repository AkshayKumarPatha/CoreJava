package tasksWithArgs;

public class TaskFive {
	
	public static void main(String[] AO)
	{
	int a=Integer.parseInt(AO[0]);
	week(a);
	}
	public static void week(int a)
	{
	if(a<=7)
	{
	if(a==1)
	System.out.println(a+"-Sunday");
	if(a==2)
	System.out.println(a+"-Monday");
	if(a==3)
	System.out.println(a+"-Tuesday");
	if(a==4)
	System.out.println(a+"-Wednesday");
	if(a==5)
	System.out.println(a+"-Thursday");
	if(a==6)
	System.out.println(a+"-Friday");
	if(a==7)
	System.out.println(a+"-Saturday");
	}
	else
	System.out.println("Enter correct Number");
	}

}
