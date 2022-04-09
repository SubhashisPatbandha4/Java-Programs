/*
 Assignment-10.4

 PROGRAM    : To find that two strings are anagram or not
 FILE       : Anagram.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
import java.util.*;
class Anagram
{
	public static void main(String args[])
	{
		String str1,str2;
		int i,ctr;	;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st string = ");
		str1=sc.nextLine();
		System.out.print("Enter 2nd string = ");
		str2=sc.nextLine();

		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		if(a1.length==a2.length)
		{
			Arrays.sort(a1);
			Arrays.sort(a2);
			ctr=0;
			for(i=0;i<a1.length;i++)
			{
				if(!(a1[i]==a2[i]))
				{
					ctr++;
					break;
				}	
			}	
			if(ctr==0)
			{
				System.out.println("Two strings are anagram");
			}
			else
				System.out.println("Two strings are not anagram");
		}
			else
				System.out.println("Two strings are not anagram");
		
	}
}