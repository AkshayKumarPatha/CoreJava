package constructors;

public class SimpleConstructor {

	int a;
	String b;
	SimpleConstructor()
	{
	a=52;
	b="name";//test
	}
	public static void main(String[] args)
	{
		SimpleConstructor obj=new SimpleConstructor();
	System.out.println(obj.a+"   "+obj.b);
	}
}
