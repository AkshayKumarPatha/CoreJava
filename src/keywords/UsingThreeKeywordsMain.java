package keywords;


public class UsingThreeKeywordsMain  {

	public static void main(String[] args)
	{
		UsingSuperKeyword obj=new UsingSuperKeyword();
		int a=50;
		System.out.println(a);
		System.out.println(obj.a);
		obj.method();
		method();
	}
static	void method()
	{
		System.out.println("Hello!");
	}

}
