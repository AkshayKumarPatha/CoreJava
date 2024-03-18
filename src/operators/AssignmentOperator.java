package operators;

public class AssignmentOperator 
{
int a=25,b=20;
void assignmentOne()
{
a+=b;
System.out.println("a+=b::::"+a);
}
void assignmentTwo()
{
a-=b;
System.out.println("a-=b::::"+a);
}
void assignmentThree()
{
b*=a;
System.out.println("b*=a::::"+b);
}
void assignmentFour()
{
b/=a;
System.out.println("b/=a::::"+b);
}
void assignmentFive()
{
a%=b;
System.out.println("a%=b::::"+a);
}
void assignmentSix()
{
a&=b;
System.out.println("a&=b::::"+a);
}
void assignmentSeven()
{
b|=a;
System.out.println("b|=a::::"+b);
}
void assignmentEight()
{
b^=a;
System.out.println("b^=a::::"+b);
}
void assignmentNine()
{
a>>=b;
System.out.println("a>>=b::::"+a);
}
void assignmentTen()
{
b<<=a;
System.out.println("b<<=a::::"+b);
}

}
