package JavaBasic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		 String s, reverse = ""; // Objects of String class  
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      s = scan.nextLine();   
	      int length = s.length();   
	      for( int i = length - 1; i >= 0; i-- )  {
	    	  
	      
	         reverse = reverse + s.charAt(i); 
	      }
	      if (s.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string is not a palindrome.");   
	   
}
}