package operators;

public class LogicalOperator {
	
	 void methodOne(int a,int b)
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
	 void methodTwo(int a , int b)
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
