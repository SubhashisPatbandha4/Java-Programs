/*
 Assignment-1.5

 PROGRAM    : To find the sum of digits of a 4 digit integer
 FILE       : Sum_4digit.java
 CREATED BY : Subhashis Patbandha
 DATED      : 31/08/2020
 */
import java.util.Scanner;
class Sum_4digits
{
	public static void main(String args[])
	{
		int a,a1,a2,a3,a4,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 4 digit integer :  ");
		a=sc.nextInt();
		if(!(a>999 &&a<10000))
		{
			System.out.println("Error : "+a+" is not a 4 digit integer");
			return;
		}
		a1=a/1000;
		a2=(a-(a1*1000))/100;
		a3=(a-(a1*1000+a2*100))/10;
		a4=a%10;
		sum=a1+a2+a3+a4;
		System.out.println("Sum of the digits of the number "+a+" = "+sum);
	}
	
}