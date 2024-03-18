package staticUsage;

public class StaticMethods {

	static int a=10,b=25,c=54;
	static void methodOne()
	{
	int d=a+b+c;
	System.out.println("Input:::::::"+d);
	}
	int methodTwo()
	{
	  this.a=100;
      return a;
	}

	public static void main(String[] args)
	{
		StaticMethods testforstatic=new StaticMethods();
	System.out.println("Input:::::::"+a);
	StaticMethods.methodOne();
	System.out.println("InputafterChanging a:::"+testforstatic.methodTwo());
	System.out.println("Input:::::::"+a);
	}
}
