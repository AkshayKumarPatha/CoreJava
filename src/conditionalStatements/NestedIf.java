package conditionalStatements;

public class NestedIf {
	
	public static void main(String[] args){
		int a=25,b=15;
		if(a!=0)//if-block
		{
		 if(b!=0)
		 {
		  if(a>b)
		    {
		      System.out.println("a is Greater than b");
		    }
		 }
		 if(a<b)//ifelse-block
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
		 else
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
		 if(a<0)//if-elseif:block
		   {
		    if(a<0)
		     {
		       System.out.println("a is equal to Zero");
		     }
		    else if(a==0)
		     {
		       System.out.println("a is equal to Zero");
		     }
		   }
		 else if(a>0)
		   {
		    if(a<0)
		     {
		       System.out.println("a is equal to Zero");
		     }
		    else if(a>0)
		     {
		       System.out.println("a is equal to Zero");
		     }
		   }
		 if(a<0)//if/elseif/else-block
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
		 else if(a==0)
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
		 else
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
		}
		else
		{
		 System.out.println("Check the Logic");
		}
		}

}
