package operators;

public class UnaryOperator {
    
	int preIncrement(int a)
	{
	return ++a; 
	}
	int postIncrement(int b)
	{
	b++;
	return b;
	}
	int preDecrement(int a)
	{
	return --a;
	}
	int postDecrement(int b)
	{
	b--;
	return b;
	}

}
