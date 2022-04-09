import java.util.*;
interface Shape 
{
	Scanner sc = new Scanner(System.in);
	double area();
	double perimeter();
}
class Circle implements Shape {
	float r;
	Circle()
	{
		System.out.print("\nCircle\n~~~~~~~~~~~~ ");
		System.out.print("\nEnter the radius of the circle : ");
		r = sc.nextFloat();
	}
	public double area()
	{
		return 3.14*r*r;
	}
	public double perimeter()
	{
		return 2*3.14*r;
	}

}
class Square implements Shape 
{
	float a;
	Square() 
	{
		System.out.print("\nSquare\n~~~~~~~~~~~~ ");
		System.out.print("\nEnter the side of the square: ");
		a = sc.nextFloat();			
	}
	public double area() 
	{
		return a*a;
	}
	public double perimeter() 
	{
		return 4*a;
	}

}
class Rectangle implements Shape 
{
	float l,b;
	Rectangle() 
	{
		System.out.println("\nRectangle\n~~~~~~~~~~~~ ");
		System.out.print("Enter the length of the rectangle  : ");
		l = sc.nextFloat();		
		System.out.print("Enter the breadth of the rectangle : ");
		b = sc.nextFloat();	
	}
	public double area() 
	{
		return l * b;
	}
	public double perimeter() 
	{
		return 2*(l+b);
	}
}
class Myshape
{
	public static void main(String[] args)
	{
		Shape obj;
		obj = new Circle();
		double c_area = obj.area();
		double c_peri = obj.perimeter();
		System.out.println("Area of the Circle : "+c_area+" sq. units\nperimeter of the Circle : "+c_peri+" units");

		obj = new Square();
		double s_area = obj.area();
		double s_peri = obj.perimeter();
		System.out.println("Area of the Square : "+s_area+" sq. units\nperimeter of the Square : "+s_peri+" units");
		
		obj = new Rectangle();
		double r_area = obj.area();
		double r_peri = obj.perimeter();
		System.out.println("Area of the Rectangle : "+r_area+" sq. units\nperimeter of the Rectangle : "+r_peri+" units");
	}
}