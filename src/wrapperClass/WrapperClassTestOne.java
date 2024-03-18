package wrapperClass;

public class WrapperClassTestOne {

	public static void main(String[] args)
	{
	WrapperClassTestOne wrapper=new WrapperClassTestOne();
	WrapperClassTest test=new WrapperClassTest();
	wrapper.method();
	wrapper.methodOne();
	System.out.println(test.b);
	System.out.println(test.s);
	System.out.println(test.i);
	System.out.println(test.l);
	System.out.println(test.f);
	System.out.println(test.d);
	System.out.println(test.b0);
	System.out.println(test.c);
	System.out.println(test.b1);
	System.out.println(test.b2);
	System.out.println(test.b3);
	System.out.println(test.b4);
	System.out.println(test.b5);
	System.out.println(test.b6);
	System.out.println(test.b7);
	System.out.println(test.b8);
	}
	void method()
	{

	Byte b=null;
	Short s=null;
	Integer i=null;
	Long l=null;
	Float f=null;
	Double d=null;
	Character c=null;
	Boolean b1=null;
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(b1);
	System.out.println(c);
	}
	void methodOne()
	{
	Byte b=115;
	Short s=254;
	Integer i=56458;
	Long l=9984858445l;
	Float f=20.625f;
	Double d=2568.2555562;
	Character c='O';
	Boolean m=true;
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(m);
	System.out.println(c);
	}
}
