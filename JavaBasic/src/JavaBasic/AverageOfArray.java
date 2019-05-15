package JavaBasic;

public class AverageOfArray {

	
	public static void main(String args[]){
		int Array[] = {};
		int	add=0;
		for(int i=0 ; i<Array.length; i++ ){
			add = add + Array[i] ;
		
		}
		System.out.println(add/Array.length);
	}
}
