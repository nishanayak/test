package JavaBasic;

import java.util.Scanner;

//A palindrome number is a number that is same after reverse

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		//int n = 353;
		System.out.println("Enter number");
		int n = new Scanner(System.in).nextInt();
		System.out.println("value of n: "+n);
		int temp =n;
		int r,sum =0;
		 
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n= n/10;
		}
		
		if(sum==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}

}
