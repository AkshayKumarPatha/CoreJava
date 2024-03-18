package loops;

import java.util.Scanner;

public class SwitchLoop {
	public static void main(String[] args) {
		switchCase();
		
	}
static void switchCase()
{
	System.out.println(" 1.Fibonacci Series\n 2.Prime Numbers series\n 3.Prime Number\n 4.Print Natrual Number\n");
	System.out.println("Enter your choices");
	Scanner sc=new Scanner(System.in);
	int Click=sc.nextInt();
	switch(Click) {
	case 1:{
		System.out.println("Enter Your input Number");
		int n=sc.nextInt();
		ForLoopTaskThree.fibo(n);
		break;
	}
	case 2:{
		System.out.println("Enter Your input Number");
		int n=sc.nextInt();
		PrimeNumberFornNumber.primeNumber(n);
		break;
	}
	case 3:{
		System.out.println("Enter Your input Number");
		int n=sc.nextInt();
		PrimeWithLoopForOneNumber.primenumber(n);
		break;
	}
	default:{
		System.out.println("Invalid Input");
	}
	
	}
}
}
