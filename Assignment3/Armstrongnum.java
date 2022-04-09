/*	Assignment - 3.3

	PROGRAM   :To check an integer as Armstrong or not using method with scanner class
	FILE 	  :Armstrongnum.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
import java.util.Scanner;
class Armstrongnum
{

	static void checkarmstrong(int num)
	{
		int temp,digit,sum=0;
			temp=num;

			while(temp!=0)
			{
				digit=temp%10;
				sum=sum+digit*digit*digit;
				temp/=10;
			}	
			if(num==sum)
				System.out.println(num+" is a Armstrong number");
			else
				System.out.println(num+" is not a Armstrong number");
				
	}
	 public static void main(String args[])
	 {
		 int num;
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number to check as Armstrong number or not : ");
			num =sc.nextInt();
			
		checkarmstrong(num);
	 }
}