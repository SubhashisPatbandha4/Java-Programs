//Assignment 2.4
import java.util.Scanner;
class floatingpoint
{
	public static void main(String args[])
	{
		float a,b,temp1,temp2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 floating point values upto 3 decimal places = ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		temp1=a*1000;
		temp2=b*1000;

		if(temp1>temp2)
			System.out.println(a+" is greater than "+b);
		else if(temp2>temp1)
			System.out.println(a+" is less than "+b);
		else
			System.out.println(a+" is eqal to "+b);

	
	}
}