import java.util.Scanner;
class StaticMethodDemo
{
	static double findArea(double l,double b)
	{
		return l*b;
	}
	public static void main(String args[])
	{
		double l,b,area;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter length of the rectangle :");
		l=sc.nextDouble();
		System.out.print("\nEnter bredth of the rectangle : ");
		b=sc.nextDouble();
		area=StaticMethodDemo.findArea(l,b);	
	
		System.out.println("\nArea of the rectangle = "+area+" units");
	}
}