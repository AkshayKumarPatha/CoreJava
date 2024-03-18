package tasksWithArgs;

public class BinaryNumber {
	int a;


	public static void main(String[] args) {
		String rev="madam";
		int t=Integer.parseInt(args[0]);
		if(rev.equals(method(rev))) {
			System.out.println("pali");
		}

}
	static String method(String rev) {
		String rel="";
		for(int i=rev.length()-1;i>=0;i--)
		{
			rel=rel+rev.charAt(i);
		}
		return rel;
		
	}
}