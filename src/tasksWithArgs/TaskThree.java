package tasksWithArgs;

public class TaskThree {
	
	public static void main(String[] AO)
	{
	int a=Integer.parseInt(AO[0]);
	int b=Integer.parseInt(AO[1]);
	int c=Integer.parseInt(AO[2]);
	if(a>b&&a>c)
	System.out.println("The Entered a is Big :::::"+a);
	else if(b>c)
	System.out.println("The Entered b is Big :::::"+b);
	else
	System.out.println("The Entered c is Big :::::"+c);
	}

}
