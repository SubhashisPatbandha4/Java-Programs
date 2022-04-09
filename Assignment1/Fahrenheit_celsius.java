/*
 Assignment-1.3

 PROGRAM    : To convert fahrenheit to celsius
 FILE       : Fahrenheit_celsius.java
 CREATED BY : Subhashis Patbandha
 DATED      : 31/08/2020
 */
import java.util.Scanner;
class Fahrenheit_celsius
{
	public static void main(String args[])
	{
		float f,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter tempreture in fahrenheit  :  ");
		f=sc.nextFloat();
		c=(f-32)*5/9;
		System.out.println(f+" degree fahrenheit = "+c+" degree celsius");
	}
}