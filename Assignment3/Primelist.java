/*	Assignment - 3.4

	PROGRAM   :To list all the prime numbers between two integer values given as runtime input
	FILE 	  :Primelist.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
import java.util.Scanner;
class Primelist
{

	static void findprimenum(int a,int b)
	{
		int ctr,i,j;
		System.out.println("\nprime number(s) between"+a+" to "+b+" is/are :\n");
			for(i=a;i<=b;i++)
			{	
				ctr=0;
				for(j=1;j<=b;j++)
				{
					if(i%j==0)
						ctr++;
				}	
				if(ctr==2)
					System.out.print(i+",");
			}	
	}
	 public static void main(String args[])
	 {
		 int a,b;
		 Scanner sc = new Scanner(System.in);
			System.out.print("Enter lower limit of list :");
			a = sc.nextInt();
			System.out.print("Enter upper limit of list :");
			b = sc.nextInt();
			
			findprimenum(a,b);
	 }
}