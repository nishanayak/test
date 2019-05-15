package JavaBasic;

public class ArraySmallestLargestNumber {

	public static void main(String[] args) 
	{
		
				int numbers[] = new int[]{1,32,43,32,53,54,32,65,63,98,43,190,23,-10};
				
				int smallest = numbers[4];
				int largetst = numbers[10];
				
				for(int i=1; i< numbers.length; i++)
				{
					if(numbers[i] > largetst)
						largetst = numbers[i];
					else if (numbers[i] < smallest)
						smallest = numbers[i];
					
				}
				
				System.out.println("Largest Number is : " + largetst);
				System.out.println("Smallest Number is : " + smallest);
			}
		}


