package staticUsage;

public class StaticObjects {
	
	int a=58;
	 static StaticObjects testStaticMain = new StaticObjects();
	  public static void main(String[] args)
	  {
	    System.out.println("input main a:::::::"+testStaticMain.a);
	    testStaticMain.methodOne(); 
	    testStaticMain.methodTwo(); 
	    testStaticMain.methodThree(); 
	  }
	   void methodOne() 
	     {
	        System.out.println("input b:::::::"+b);
	        methodTwo();
	     }
	 int b=89;
	   void methodTwo()
	     {
	       int c=a+b;
	       System.out.println("input a+b:::::::"+c);
	     }
	   void methodThree()
	     {
	       System.out.println("input a:::::::"+a);
	       System.out.println("input b:::::::"+b);
	       methodOne();
	       methodTwo();
	     }

}
