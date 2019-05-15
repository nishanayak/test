package JavaBasic;

public class FactorialOfNumbers {

	public static void main(String[] args)
	{
		long n = 12;
	       long result = 1;
	       for (int i = 1; i <= n; i++) 
	       {
	           result = result * i;
	       }
	       System.out.println("The factorial of "+n+" is " + result);
	   }
	}


