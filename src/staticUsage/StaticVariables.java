package staticUsage;

public class StaticVariables {

	static int a=15,b=5,c;
	public static void main(String[] hi) 
	{
	c=a+b;
	StaticVariables sv=new StaticVariables();
	System.out.println(c);
	System.out.println(sv.add1());
	sv.add();

	}
	void add() 
	{
	System.out.println("input:::::"+a);
	System.out.println("Hello");
	}
    int add1()
	{
	return c;
	}
}
