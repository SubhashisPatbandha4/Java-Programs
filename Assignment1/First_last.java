/*
 Assignment-1.4

 PROGRAM    : To calculate the sum of first and last digit of a 5 digit integer given as commandline input
 FILE       :First_last.java
 CREATED BY : Subhashis Patbandha
 DATED      : 31/08/2020
 */
class First_last
{
	public static void main(String args[])
	{
		int a,fd,ld,sum;
		 a=Integer.parseInt(args[0]);
		if(!(a>9999 && a<100000))
		{
			System.out.println("Error : "+a+" is not a 5 digit integer.");
			return ;
		}
		 fd=a/10000;
		 ld=a%10;
		 sum=fd+ld;

		System.out.println("1st digit "+fd+" , last digit = "+ld);
		System.out.println("Addition of the 1st and the last digits of the number "+a+" = "+sum);
	}
	
}