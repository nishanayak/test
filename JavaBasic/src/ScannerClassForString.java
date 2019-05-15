import java.util.Scanner;

public class ScannerClassForString {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for s1");
		String s1= scan.nextLine();
		  
		System.out.println("Enter value for s2");
		String s2=scan.nextLine();
		System.out.println("Print the String " +s1+s2);
		

	}

}
