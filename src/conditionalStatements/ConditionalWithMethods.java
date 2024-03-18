package conditionalStatements;

public class ConditionalWithMethods {
	
	void methodOne(int a,int b)
	  {
	    if(a>b)
	     {
	      System.out.println("a is Greater than b");
	     }
	  }
	 void methodTwo(int a,int b)
	  {
	    if(a<b)
	     {
	       System.out.println("a is Greater than b");
	     }
	     else
	     {
	       System.out.println("b is less than a");
	     }
	   }
	 void methodThree(int a,int b)
	  {
	    if(a<0)
	     {
	       System.out.println("a is equal to Zero");
	     }
	     else if(a==0)
	     {
	       System.out.println("a is equal to Zero");
	     }
	     else
	     {
	       System.out.println("a is Greaterthan Zero");
	     }
	   }
	 void methodFour(int a,int b)
	   {  
	    if(a>b&&b>a)
	     {
	       System.out.println("correct statements");
	     }
	     else
	     {
	       System.out.println("check the statements");
	     }
	   }
	 void methodFive(int a , int b)
	   { 
	     if(a>b||b>a)
	     {
	       System.out.println("correct statements");
	     }
	     else
	     {
	       System.out.println("check the statements");
	     }
	   }

}
