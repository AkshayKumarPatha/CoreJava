package operators;

public class AllOperator 
{
	public static void main(String[] args)
	{
	int a=25,b=20;
	ArithmethicOperator ao=new ArithmethicOperator();
	AssignmentOperator aso=new AssignmentOperator();
	ComparisonORRelationalOperator co=new ComparisonORRelationalOperator();
	LogicalOperator lo=new LogicalOperator();
	UnaryOperator uo=new UnaryOperator();
	System.out.println(":::::::ArithmeticOperators:::::::");
	System.out.println("Addition of Two Number::::"+ao.addTwoNumber(a,b));
	System.out.println("Subtraction of Two Number::::"+ao.subTwoNumber(a,b));
	System.out.println("Multiplication of Two Number::::"+ao.mulTwoNumber(a,b));
	System.out.println("Division of Two Number::::"+ao.divTwoNumber(a, b));
	System.out.println("Modulus of Two Number::::"+ao.modTwoNumber(a,b));
	System.out.println(":::::::UnaryOperators:::::::");
	System.out.println("PreIncrement of a Value::::"+uo.preIncrement(a));
	System.out.println("PostIncrement of b Value::::"+uo.postIncrement(b));
	System.out.println("PreDecrement of a Value::::"+uo.preDecrement(a));
	System.out.println("PostDecrement of b Value::::"+uo.postDecrement(b));
	System.out.println(":::::::AssignmentOperators:::::::");
	aso.assignmentOne();
	aso.assignmentTwo();
	aso.assignmentThree();
	aso.assignmentFour();
	aso.assignmentFive();
	aso.assignmentSix();
	aso.assignmentSeven();
	aso.assignmentEight();
	aso.assignmentNine();
	aso.assignmentTen();
	System.out.println(":::::::ComparisonOperators:::::::");
	co.comparisonOne();
	co.comparisonTwo();
	co.comparisonThree();
	co.comparisonFour();
	co.comparisonFive();
	co.comparisonSix();
	co.comparisonSeven();
	System.out.println(":::::::LogicalOperators:::::::");
	lo.methodOne(a, b);
	lo.methodTwo(a, b);
	}
}

