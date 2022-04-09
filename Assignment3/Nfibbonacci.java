/*	Assignment - 3.5

	PROGRAM   :To print first n fibbonacci numbers,where value of n is run-time input
	FILE 	  :Nfibbonacci.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
import java.util.Scanner;
class Nfibbonacci
{
	 public static void main(String args[])
	 {
		int n,i,f1=0,f2=1,f3;
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter value of n to find fibbonacci series : ");
			n = sc.nextInt();
		
		System.out.print("\nfirst "+n+" fibonacci numbers = ");
		if(n==1)
			System.out.print(f1);
		else if(n==2)
			System.out.print(f1+","+f2);			
		else
		{	
			System.out.print(f1+","+f2);
			for(i=3;i<=n;i++)
			{
				f3=f1+f2;
				System.out.print(","+f3);
				f1=f2;
				f2=f3;
			}
		}
	}
}