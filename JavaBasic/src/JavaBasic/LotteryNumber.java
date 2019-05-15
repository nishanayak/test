package JavaBasic;

public class LotteryNumber {

	public static void main(String[] args)
	{
		int a=12345;	
		
		
		if(a==123 || a==1234)
		{
			System.out.println("You Won");
		}
		
		else if (a==12345)
			System.out.println("You won $10");
		else{
			System.out.println("better luck next time");
		}
	}

}
