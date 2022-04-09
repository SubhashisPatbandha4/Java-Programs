/*
 Assignment-10.7

 PROGRAM    : To determine whether a string is pallindrome or not
 FILE       : Pallindrome_string.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
import java.util.*;
class Pallindrome_string
{
	public static void main(String args[])
	{
		int i,j=0,ctr=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string = ");
		String str=sc.nextLine();
		char[]a=str.toCharArray();
		char[]b=new char[a.length];
		for(i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		for(i=0;i<a.length;i++)
		{
			if(!(a[i]==b[i]))
				ctr=1;
			
		}
		if(ctr==0)
			System.out.println("It is a pallindrome string");
		else
			System.out.println("It is not a pallindrome string");

	}
}