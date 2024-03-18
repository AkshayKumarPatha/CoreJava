package abstractFromOops;

import java.util.Scanner;

public class AbstractMain {
	
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Input");
		int n=sc.nextInt();
		AbstractClassTwo obj=new AbstractClassTwo();
		obj.primeMethod(n);
		obj.primenumber(n);
	}

}
