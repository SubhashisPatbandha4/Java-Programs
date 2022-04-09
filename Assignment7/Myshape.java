import java.util.*;
abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract double area();
	abstract double perimeter();
	
}
class Rectangle extends Shape
{
	double l,b,area,peri;
	Rectangle()
	{
		System.out.print("\nEnter length of the Rectangle : ");
		l=sc.nextDouble();
		System.out.print("Enter bredth of the Rectangle : ");
		b=sc.nextDouble();
	}
	double area()
	{
		area= l*b;
		return area;
	}
	double perimeter()
	{
		peri=2*(l+b);
		return peri;
	}
}
class Square extends Shape
{
	double a,area,peri;
	Square()
	{
		System.out.print("\nEnter a side of the square : ");
		a=sc.nextDouble();
	}
	double area()
	{
		area= a*a;
		return area;
	}
	double perimeter()
	{
		double peri=4*a;
		return peri;
	}
}
class Circle extends Shape
{
	double r,area,peri;
	Circle()
	{
		System.out.print("\nEnter the radious of the circle : ");
		r=sc.nextDouble();
	}
	double area()
	{
		area= 3.14*r*r;
		return area;
	}
	double perimeter()
	{
		double peri=2*3.14*r;
		return peri;

	}
}
class Myshape
{
	static void show(double a,double p)
	{
		System.out.println("\nArea = "+a+" sq.units , Perimeter = "+p+" units");
	}
	public static void main(String args[])
	{
		double Ar,Pr,As,Ps,Ac,Pc;
		
		Rectangle r=new Rectangle();
		Ar=r.area();
		Pr=r.perimeter();
		show(Ar,Pr);
		
		Square s=new Square();
		As=s.area();
		Ps=s.perimeter();
		show(As,Ps);

		Circle c=new Circle();
		Ac=c.area();
		Pc=c.perimeter();
		show(Ac,Pc);

	}
}
