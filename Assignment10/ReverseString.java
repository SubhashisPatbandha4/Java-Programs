/*
 Assignment-10.12

 PROGRAM    : To find reverse of a string
 FILE       : ReverseString.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		int i,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string = ");
		String str=sc.nextLine();
		char []a=str.toCharArray();
		char []b=new char[a.length];
		for(i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		String str2=String.valueOf(b);
	System.out.println("Reversed string = "+str2);
	}
}	