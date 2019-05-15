package JavaBasic;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter value of a");
	int a= in.nextInt();
	
	System.out.println("Enter value of b");
	int b= in.nextInt();
	
	int c=a+b;
	
	System.out.println("Value of c"+c);

	}

}
