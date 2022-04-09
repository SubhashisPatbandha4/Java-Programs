/*	Assignment - 3.2

	PROGRAM   :To check an integer as Strong or not using method with scanner class
	FILE 	  :Strongnum.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
import java.util.Scanner;
class Strongnum
{
	static void checkstrong(int num)
	{
		int temp,digit,fact,sum=0;
			temp=num;

			while(temp!=0)
			{
				fact=1;
				digit=temp%10;
				while(digit!=0)
				{
					fact=fact*digit;
					digit--;
				}
				sum+=fact;
				temp/=10;
			}	
			if(num==sum)
				System.out.println(num+" is a strong number");
			else
				System.out.println(num+" is not a strong number");
				
	}
	 public static void main(String args[])
	 {
		 int num;
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check it is strong number or not : ");
			num =sc.nextInt();
			
		checkstrong(num);
	 }

}