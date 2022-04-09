/*
 Assignment-2.3

 PROGRAM    : To find the greatest among 3 numeric values with nested ifand comandline input
 FILE       : Greatestno.java
 CREATED BY : Subhashis Patbandha
 DATED      : 07/09/2020
 */
class Greatestno
{
	public static void main(String args[])
	{
		if(args.length!=3)
		{
			System.out.println("Error!!(requires 3 arguments)");
		}	
	else
		{
				int a=Integer.parseInt(args[0]);
				int b=Integer.parseInt(args[1]);
				int c=Integer.parseInt(args[2]);
			if(a>=b)
			{
				if(a>=c)
					System.out.println("Greatest number among "+a+" , "+b+" , "+c+" is = "+a);
				else
					System.out.println("Greatest number among "+a+" , "+b+" , "+c+" is = "+c);
			}	
			else if(b>=a)
			{
				if(b>=c)
					System.out.println("Greatest number among "+a+" , "+b+" , "+c+" is = "+b);
				else
					System.out.println("Greatest number among "+a+" , "+b+" , "+c+" is = "+c);
			}	
				
		}
	}
}