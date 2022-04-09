/*
 Assignment-1.1

 PROGRAM    : To find area of a scalen triangle using comandline input
 FILE       : Area_triangle.java
 CREATED BY : Subhashis Patbandha
 DATED      : 31/08/2020
 */
class Area_triangle
{
	public static void main (String args[])
	{
		double a,b,c,s,area;
		if(args.length!=3)
		{
			System.out.println("\nError : Please enter the length of 3 sides of a scalan triangle");
			return;
		}
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if((a+b)<=c || (b+c)<=a || (a+c)<=b)
		{
			System.out.println("Error : Triangle is invalid.");
			return ;
		}
		if(a==b || b==c || a==c)
		{
			System.out.println("Error : It is not a Scalen triangle. ");
			return ;
		}		
		System.out.println("\n3 sides of a scalan-triangle's are - \n a = "+a+" unit \n b = "+b+" unit\n c = "+c+" unit");
		s=(a+b+c)/2;
		area=(s*(s-a)*(s-b)*(s-c));
		area=Math.sqrt(area);
		System.out.println("Area of the scalen triangle = "+area+" sq units");
		
		
	}
}