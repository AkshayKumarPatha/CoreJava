package abstractFromOops;

abstract  class AbstractClass {
	
	abstract void primeMethod(int n);
	void primenumber(int n)
	{
		int k,j;
		 for(int i=1;i<=n;i++)
		 {
			 k=0;
			 for(j=1;j<=i;j++)
			 {
			 if(i%j==0)
				 k++;
			 }
			 if(k==2)
				 System.out.println(i+"::::This number is prime number");
		 }
		
	}

}
