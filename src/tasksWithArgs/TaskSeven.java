package tasksWithArgs;

public class TaskSeven 
{
	
	public static void main(String[] A)
	{
	int year=Integer.parseInt(A[0]);
	leap(year);
	}
  public static void leap(int year)
  {
	if(year%4==0&&year%100!=0||year%400==0)
	{
	System.out.println("Entered Year is a LeapYear::::"+year);
	}
	else {
	System.out.println("Entered Year is a NotLeapYear::::"+year);
	}
  }
}
