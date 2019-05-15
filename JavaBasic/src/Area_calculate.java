import java.util.Scanner;

public class Area_calculate {

	public static void Area_of_Circle(double pi,int r)
	{
		// double pi =3.14 ,area;
			//int r = 10;
			
			double area=pi*r*r;
			
			System.out.println("area of circle: " +area);
	}
	
	public static void Area_of_Triangle(double base,double height)
	{
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter the base");
//	double base = scan.nextDouble();
//		//double base=20.0;
//	System.out.println("Enter the Height");
//	double height = scan.nextDouble();
//		//double height=111.5;
//		double Area =(base*height)/2;
//		System.out.println(+Area);
		//double base=20.0;
		//double height=111.5;
		double A =(base*height)/2;
		System.out.println(+A);
		
		
	}
	
	public static void Area_of_rectangle()
	{
	
	Scanner Scan = new Scanner(System.in);
	System.out.println("Enter the Width");
	int w = Scan.nextInt();
	System.out.println("Enter the height");
	int h = Scan.nextInt();
    
	int Area= w * h;
	
	System.out.println("Area of Rectangle"+Area);
    }
	}

