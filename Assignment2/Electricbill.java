/*
 Assignment-2.2

 PROGRAM    : To find electric bill
 FILE       : Electricbill.java
 CREATED BY : Subhashis Patbandha
 DATED      : 07/09/2020
 */
import java.io.*;
class Electricbill
{
	public static void main(String args[])throws Exception
	{	
		double s1=0,s2=0,s3=0,s4=0,s5=0,unit;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(is);
		System.out.print("\nEnter the units shown in electric meter : ");

		unit=Integer.parseInt(br.readLine());
		
		if(unit>=0 && unit <=50)
		{
			s1=unit*2.5;
		}
		
		else if(unit>50 && unit <=100)
		{
			s1=50*2.5;
			s2=(unit-50)*4.5;
		}	
		else if(unit>100 && unit <=200)
		{
			s1=50*2.5;
			s2=50*4.5;
			s3=(unit-100)*6;
		}
		else if(unit>200 && unit <=300)
		{
			s1=50*2.5;
			s2=50*4.5;
			s3=100*6;
			s4=(unit-200)*8.5;
		}
		else
		{
			s1=50*2.5;
			s2=50*4.5;
			s3=100*6;
			s4=100*8.5;		
			s5=(unit-300)*100;
		}	
		System.out.println("\nTotal units consumed                    = "+unit+"(units)\n===========================================================");
		System.out.println("0 unit to 50 units (Rs 2.5/unit)        = Rs. "+s1+"/-\n50 unit to 100 units(Rs 4.5/unit)       = Rs. "+s2+"/-\n100 unit to 200 units(Rs 6.0/unit)      = Rs. "+s3+"/-\n200 unit to 300 units(Rs 8.5/unit)      = Rs. "+s4+"/-\nabove 300 units(Rs 10/unit)             = Rs. "+s5+"/-\n===========================================================\nTotal charge                            = "+(s1+s2+s3+s4+s5));
	}
	
}