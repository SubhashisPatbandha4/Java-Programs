/*
 Assignment-2.1

 PROGRAM    : To find the root(s) of a quadratic equation with runtime input
 FILE       : Quadratic.java
 CREATED BY : Subhashis Patbandha
 DATED      : 07/09/2020
 */
import java.util.Scanner;
class Quadratic
{
	public static void main(String args[])
	{
		double a,b,c,d,r1,r2;
		System.out.println("\nIn a quadratic equation ax^2+bx+c,");
		Scanner sc =new Scanner(System.in);
		
		System.out.print("\nEnter value of a : ");
		a=sc.nextDouble();
		System.out.print("Enter value of b : ");
		b=sc.nextDouble();
		System.out.print("Enter value of c : ");
		c=sc.nextDouble();
		
		d=(b*b)-(4*a*c);
		if(a==0)
		{
			r1=-c/b;
			System.out.println("there is only one root i.e = "+r1+"( due to a = 0)");				
		}
		else if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.println("Roots are : r1 = r2 = "+r1+"( Roots are same due to discriminent = 0 )");

		}
		else if(d>0)
		{
			r1=(-b+ Math.sqrt((b*b)-4*a*c) )/2*a;
			r2=(-b- Math.sqrt((b*b)-4*a*c) )/2*a;
			System.out.println("Roots are : r1 = "+r1+" , r2 = "+r2+" ( Roots are Real and different due to discriminent > 0 )");
		}
		else
		{
			
			System.out.println("Roots are imaginary and different due to discriminent < 0 ");

		}
	}
}