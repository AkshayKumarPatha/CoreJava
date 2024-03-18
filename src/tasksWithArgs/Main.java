package tasksWithArgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Denomiator");
		int a=sc.nextInt();
		System.out.println("Enter Your Type");
		System.out.println("1.Odd\n2.Even\n3.Prime\n4.Positive(+ve) Number\n5.Negtive(-ve) Number");
		int b=sc.nextInt();
		System.out.println("Enter Your Numerator");
		int c=sc.nextInt();
		System.out.println("Enter Your one Operators");
		String e=sc.next();
		System.out.println("Enter Your Two Operators");
		String f=sc.next();
	   switch(b) {
	   case 1:{
		   oddMethod(a,c,e,f);
		   break;
	   }
	   case 2:{
		   evenMethod(a,c,e,f);
		   break;
	   }
	   case 3:{
		   primeNumber(a,c,e,f);
		   break;
	   }
	   
	   }
}
	static void oddMethod(int a,int c,String e,String f) {
		String k="";
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=a;i++)
		{
			if(i%2!=0) 
				k=k+c+"/"+i+",";
			
		}
	  String[] h=k.split(",");
	  for(int i=0;i<h.length;i++) {
		  if(i%2==0)
			  sb.append(h[i]+e);
		  else 
			  sb.append(h[i]+f);
	  }
	  sb.deleteCharAt(sb.length()-1);
	  System.out.println(sb);
	
	}
	static void evenMethod(int a,int c,String e,String f) {
		String k="";
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0) 
				k=k+c+"/"+i+",";
			
		}
	  String[] h=k.split(",");
	  for(int i=0;i<h.length;i++) {
		  if(i%2==0)
			  sb.append(h[i]+e);
		  else 
			  sb.append(h[i]+f);
	  }
	  sb.deleteCharAt(sb.length()-1);
	  System.out.println(sb);
	
	}
	static void primeNumber(int a,int c,String e,String f) {
		String k="";
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=a;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				}
			if(count==2) {
				k=k+i+",";
			}
		}
			String[] h=k.split(",");
			 for(int i=0;i<h.length;i++) {
				  if(i%2==0)
					  sb.append(c+"/"+h[i]+e);
				  else 
					  sb.append(c+"/"+h[i]+f);
			  }
			  sb.deleteCharAt(sb.length()-1);
			  System.out.println(sb);
		}
		
		
	}


