package constructors;

public class CallConstructor {
	public static void main(String[] a)
	{
		Constructor myconst1=new Constructor();
		Constructor myconst=new Constructor(15,90,15);
	int finelly=myconst1.methodOne();
	System.out.println("Methodoutput::::"+finelly);
	System.out.println("Input::::"+myconst.d);
	}

}
