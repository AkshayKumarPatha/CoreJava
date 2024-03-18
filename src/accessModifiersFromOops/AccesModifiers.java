package accessModifiersFromOops;

public class AccesModifiers {
	public static void main(String... args) {
		method();
		methodThree();
	}
	static private void method()
	{
		System.out.println("HEllO!");
	}
	static protected void methodOne()
	{
		System.out.println("HEllO!");
	}
	static public void methodTwo()
	{
		System.out.println("HEllO!");
	}
	static  void methodThree()
	{
		System.out.println("HEllO!");
	}


}
