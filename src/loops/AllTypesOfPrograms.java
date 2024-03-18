package loops;
import java.util.*;

import tasksWithArgs.TaskEight;
import tasksWithArgs.TaskFive;
import tasksWithArgs.TaskFour;
import tasksWithArgs.TaskOne;
import tasksWithArgs.TaskSeven;
import tasksWithArgs.TaskTwo;
public class AllTypesOfPrograms {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{

		first();
		boolean b=true;
		do
		{
			System.out.println(" 1.continue\n 2.exit\n enter your choice");
		    int s=sc.nextInt();

		if(s==1)
		{
			first();
		}
		else if(s==2)
		{
			b=false;
			System.out.println("Program Terminated");
			
		}
		else 
		{
			System.out.println("Invalid Enter"); 
		}
	 }while(b);
		
	}
public static void first()
		{
			System.out.println(" 1.Fibonacci Series\n 2.Prime Numbers series\n 3.Prime Number\n 4.Print Natrual Number\n 5.Print Positive or Negtive Number\n 6.Leap Year\n 7.Square of give number\n 8.Shows The month from Given Number\n 9.Enter the Number it shows Week\n 10.It shows Give is Even or Odd\n");
			System.out.println("Enter Your Choices");
		int click=sc.nextInt();
		if(click==1)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			ForLoopTaskThree fb=new ForLoopTaskThree();
			fb.fibo(n);
		}
		else if(click==2)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			PrimeNumberFornNumber pns=new PrimeNumberFornNumber();
			pns.primeNumber(n);
		}
		else if(click==3)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			PrimeWithLoopForOneNumber pn=new PrimeWithLoopForOneNumber();
			pn.primenumber(n);
		}
		else if(click==4)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			ForLoopTaskOne nn=new ForLoopTaskOne();
			nn.Main(n);
		}
		else if(click==5)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			TaskOne p=new TaskOne();
			p.posNeg(n);
		}
		else if(click==6)
		{
			System.out.println("Enter the your Year");
			int n=sc.nextInt();
			TaskSeven l=new TaskSeven();
			l.leap(n);
		}
		else if(click==7)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			TaskEight e=new TaskEight();
			e.square(n);
		}
		else if(click==8)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			TaskFour f=new TaskFour();
			f.month(n);
		}
		else if(click==9)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			TaskFive w=new TaskFive();
			w.week(n);
		}
		else if(click==10)
		{
			System.out.println("Enter the your Input Number");
			int n=sc.nextInt();
			TaskTwo eo=new TaskTwo();
			eo.evenOdd(n);
		}
		else
		{
			System.out.println("Invalid enter ");
		}
	
}
}
