package loops;

public class ForLoopTaskThree 
{
	
	public static void main(String[] A)
	{
		int n=Integer.parseInt(A[0]);
		fibo(n);
	}

static void fibo(int n)

    {
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
        for(int i=3;i<=n;i++)
        {
        	c=a+b;
        	System.out.println(c);
        	a=b;
            b=c;	
        }
    }
}
