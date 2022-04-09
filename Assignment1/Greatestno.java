/*
 Assignment-1.2

 PROGRAM    : To find greatest numbers among three numbers ,given as runtime input
 FILE       : Greatestno.java
 CREATED BY : Subhashis Patbandha
 DATED      : 31/08/2020
 */
import java.util.Scanner;
class Greatestno
{
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("Greatest number among "+a+","+b+","+c+" = "+d);


	}
}