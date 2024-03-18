package loops;

public class PrimeWithLoopForOneNumber {
 
	public static void main(String[] args)
	{
//		int n=Integer.parseInt(args[0]);
		primenumber(10);
	}
 static void primenumber(int n)
 {
	 int k=0;
	 for(float i=0;i<=n;i++)
	 {
		 if(n%i==0)
			 k++;
	 }
	 if(k==2)
		 System.out.println(n+"::::is prime number");
	 else 
		 System.out.println(n+":::: is not a prime number");
 }
}
