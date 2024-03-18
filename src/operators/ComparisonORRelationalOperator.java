package operators;

public class ComparisonORRelationalOperator {
    
	int a=25,b=20;
	void comparisonOne()
	{
	System.out.println("Equalto operator(a==b)::::"+(a==b));
	}
	void comparisonTwo()
	{
	System.out.println("Notequal operator(a!=b)::::"+(a!=b));
	}
	void comparisonThree()
	{
	System.out.println("Greater than operator(a>b)::::"+(a>b));
	}
	void comparisonFour()
	{
	System.out.println("Less than operator(a<b)::::"+(a<b));
	}
	void comparisonFive()
	{
	System.out.println("Greater than or equal to(a>=b)::::"+(a>=b));
	}
	void comparisonSix()
	{
	System.out.println("Less than or equal to(a<=b)::::"+(a<=b));
	}
	void comparisonSeven()
	{
	boolean c=a>b;
	System.out.println("Not operator(!c)::::"+(!c));
	}
	
}
