package commandLineArguments;

public class ArgumentsWithArithmethicOperator {
	public static void main(String[] AO)
	{
		ArgumentsWithArithmethicOperator obj=new ArgumentsWithArithmethicOperator();
	int a=Integer.parseInt(AO[0]);
	int b=Integer.parseInt(AO[1]);
	System.out.println("Sum:::  "+obj.addTwoNumber(a,b));
	System.out.println("Sub:::  "+obj.subTwoNumber(a,b));
	System.out.println("mul:::  "+obj.mulTwoNumber(a,b));
	System.out.println("div:::  "+obj.divTwoNumber(a,b));
	System.out.println("mod:::  "+obj.modTwoNumber(a,b));
	}
	int addTwoNumber(int a,int b)
	{
	int sum=a+b;
	return sum;
	}
	int subTwoNumber(int a,int b)
	{
	int sub=a-b;
	return sub;
	}
	int mulTwoNumber(int a,int b)
	{
	int mul=a*b;
	return mul;
	}
	double divTwoNumber(int a,int b)
	{
	int div=a/b;
	return div;
	}
	int modTwoNumber(int a,int b)
	{
	int mod=a%b;
	return mod;
	}

}
