package JavaBasic;

public class AddSubDivMulMethods {
	public static int add(int a, int b) {
		return a + b;

	}
	public static int sub(int a,int b )
	{
		return a-b;
	}
	public static int multi (int a, int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		int c = add(2, 3);
		System.out.println("result add = " + c);
		
		int s = sub(10,2);
		System.out.println("result sub = " +s);
		
		int m =multi( 3,3); 
		
		System.out.println("result multi= " + m);
		
		int d = div(10,2);
		
		System.out.println("result of div= " + d);
		
		
		

	}

}
