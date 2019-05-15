package JavaBasic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
    //int n = 37997;  //370,153
    System.out.println("Enter number");
	int n = new Scanner(System.in).nextInt();
    int temp = n;
    int r,sum = 0;
   
    
    while(n>0)
    {
     r = n%10; //3,5,1
     n = n/10;  //15,1,1
     sum= sum + r*r*r; //27,125,1
    }
    
    //System.out.println("Sum is:"+sum);
    if(temp == sum)
    	System.out.println("Its Armstrong Number");
    else
        System.out.println("Its not a Armstrong Number");
    
    
	}

}
