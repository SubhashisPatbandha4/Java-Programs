/*	Assignment - 3.1

	PROGRAM   :To find gcd using method findgcd() where values are run-time input through BufferedReader class
	FILE 	  :Gcdcalculation.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
import java.io.*;
class Gcdcalculation
{	
	static int findGCD(int a,int b)
	{
		int temp1,temp2,gcd,lcm;
			temp1=a;
			temp2=b;
			while(temp1!=temp2)
			{
				if(temp1>temp2)
					temp1=temp1-temp2;
				else
					temp2=temp2-temp1;
			}	
			gcd=temp1;
			return gcd;
	}
	 public static void main(String args[])throws Exception
	 {
		 int a,b,gcd;
		 InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("Enter 2 numbers to find their GCD : ");
			a =Integer.parseInt(br.readLine());
			b =Integer.parseInt(br.readLine());
			gcd=findGCD(a,b);
		System.out.println("GCD of "+a+" and "+b+" = "+gcd);

	 }

}