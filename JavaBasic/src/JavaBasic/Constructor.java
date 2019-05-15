package JavaBasic;

public class Constructor {

	
		
		int id;  
		String name;
		
	    Constructor(int i,String n)
	    {
	    	id = i;  
		    name = n;
	    }
	    Constructor(){
	    	this.name="Hello";
	    	this.id=5;
	    }
	    //method to display the value of id and name  
	    
		void display()
		{
			System.out.println(id+" "+name);
			}  
		  
		public static void main(String args[]){  
		//creating objects  
			
			Constructor s1 = new Constructor(111,"Nisha");  
			Constructor s2 = new Constructor(111,"Krish");  
		    Constructor s3 = new Constructor();
			//displaying values of the object  
		s1.display();  
		s2.display();  
		s3.display();
		
		}  


	}


