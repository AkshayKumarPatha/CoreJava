package tasksWithArgs;

public class TaskFour {
	
	public static void main(String[] AO)
	{
	int a=Integer.parseInt(AO[0]);
	month(a);
	}
	
public static void month(int a)
{
	if(a<=12)
	{
	if(a==1)
	System.out.println(a+"-Jan");
	if(a==2)
	System.out.println(a+"-Feb");
	if(a==3)
	System.out.println(a+"-Mar");
	if(a==4)
	System.out.println(a+"-Apr");
	if(a==5)
	System.out.println(a+"-May");
	if(a==6)
	System.out.println(a+"-Jun");
	if(a==7)
	System.out.println(a+"-July");
	if(a==8)
	System.out.println(a+"-Aug");
	if(a==9)
	System.out.println(a+"-Sep");
	if(a==10)
	System.out.println(a+"-Oct");
	if(a==11)
	System.out.println(a+"-Nov");
	if(a==12)
	System.out.println(a+"-Dec");
	}
	else 
	System.out.println("Check the Month You have Entered");
}

}
