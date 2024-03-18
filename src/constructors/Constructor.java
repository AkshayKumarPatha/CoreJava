package constructors;

public class Constructor {
	
	int a=10,b=20,c=25,d=85,e=89;
	int methodOne()
	{
	int sum=a+b;
	return sum;
	}

	Constructor(){
	System.out.println("Hello World!");
	}
	Constructor(int c,int d,int e){
	System.out.println("Input::::"+c+ " "+d+" "+e);
	this.d=20;
	System.out.println("Input::::"+c+ " "+d+" "+e);
	}

}
