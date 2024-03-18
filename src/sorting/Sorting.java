package sorting;

import java.util.Scanner;

public class Sorting {
	static int o, z;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("Enter your Array With "+s+" Elements");
		for(int i=0;i<s;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("Enter your choices");
		System.out.println("1.Ascending Order\n2.Descending Order\n3.Order");
		int click=sc.nextInt();
if(click>0) 
	{
	  if(click==1)
		 {
			  ascending(a);
			  
		 }
     else if(click==2)
		  {
			  descending(a);
			  
		  }
	 else if(click==3)
		  {
			 System.out.println(" 4:SplitFirstAscending\n 5:SplitSecondAscending\n 6:SplitFirstDescending\n 7:SplitSecondDescending");
			 z=sc.nextInt();
			 o=sc.nextInt();
			  if(z>0&&o>0)
			   {
			    if(z==4)
			      {
			          if(o==5)
			             {
				           splitAscending(a,s);
			             }
			          else if(o==7)
			             {
				           splitStartAscending(a,s);
			             }
		          }
			      else if(z==5)
			        {
			         if(o==4)
				       {
					 splitAscending(a,s); 
				       }
			         else if(o==6)
				       {
					 splitStartDescending(a,s);
				       }
			        }
			      else if(z==6)
			        {
			          if(o==5)
				        {
					       splitStartDescending(a,s); 
				        }
			         else if(o==7)
				       {
					      splitDescending(a,s);
				       }
			        }
			      else if(z==7)
			       {
			        if(o==4)
				       {
					     splitStartAscending(a,s);
				       }
			        else if(o==6)
				       {
					     splitDescending(a,s);
				       }
			       }
			   }
		  }
	}
} 
      static void ascending(int a[]) 
        {
	      
	      int temp=0;
	      for(int i=0;i<a.length;i++)
	        {
		      for(int j=i+1;j<a.length;j++)
		       {
			     if(a[i]>a[j]) 
			       {
			         temp=a[i];
			         a[i]=a[j];
			         a[j]=temp;
			       }
			   }
		     
		    }
	          System.out.println("::::Ascending Order::::");
		      for(int i=0;i<a.length;i++)
		       {
			     System.out.println(a[i]+" ");
		      }
         }
	    static void descending(int[] a)  
	     {
		  int temp=0;
		  for(int i=0;i<a.length;i++)
		   {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				  {
				    temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				 }
				
			 }
	       }
		      System.out.println("::::descending Order::::");
		      for(int i=0;i<a.length;i++)
		       {
			  System.out.println(a[i]+" ");
		       }
         }
	    static void splitAscending(int[] a,int s)
	    {

		      int temp=0;
		      for(int i=0;i<s/2;i++)
		        {
			      for(int j=i+1;j<s/2;j++)
			       {
				     if(a[i]>a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
			      
	           }
		      for(int i=(a.length/2);i<a.length;i++)
		        {
			      for(int j=i+1;j<a.length;j++)
			       {
				     if(a[i]>a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
	          }
		      System.out.println("---->splitFirst and splitSecond::Ascending Order");
		      for(int i=0;i<a.length;i++)
		      {
		    	  System.out.print(a[i]+" ");
		      }
	    }
	    static void splitDescending(int[] a,int s)
	    {

		      int temp=0;
		      for(int i=0;i<s/2;i++)
		        {
			      for(int j=i+1;j<s/2;j++)
			       {
				     if(a[i]<a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
			      
	           }
		      for(int i=(a.length/2);i<a.length;i++)
		        {
			      for(int j=i+1;j<a.length;j++)
			       {
				     if(a[i]<a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
	          }
		      System.out.println("---->splitFirst and splitSecond::descending Order");
		      for(int i=0;i<a.length;i++)
		      {
		    	  System.out.print(a[i]+" ");
		      }
	    }
	    static void splitStartAscending(int[] a,int s)
	    {

		      int temp=0;
		      for(int i=0;i<s/2;i++)
		        {
			      for(int j=i+1;j<s/2;j++)
			       {
				     if(a[i]>a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
			      
	           }
		      for(int i=(a.length/2);i<a.length;i++)
		        {
			      for(int j=i+1;j<a.length;j++)
			       {
				     if(a[i]<a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
	          }
		      System.out.println("---->splitFirstAscending Order and splitSecondDescending Order");
		      for(int i=0;i<a.length;i++)
		      {
		    	  System.out.print(a[i]+" ");
		      }
	    }
	    static void splitStartDescending(int[] a,int s)
	    {

		      int temp=0;
		      for(int i=0;i<s/2;i++)
		        {
			      for(int j=i+1;j<s/2;j++)
			       {
				     if(a[i]<a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
			      
	           }
		      for(int i=(a.length/2);i<a.length;i++)
		        {
			      for(int j=i+1;j<a.length;j++)
			       {
				     if(a[i]>a[j]) 
				       {
				         temp=a[i];
				         a[i]=a[j];
				         a[j]=temp;
				       }
				   } 	
	          }
		      System.out.println("---->splitFirstDescending Order and splitSecondAscending Order");
		      for(int i=0;i<a.length;i++)
		      {
		    	  System.out.print(a[i]+" ");
		      }
	    }
	    
}
