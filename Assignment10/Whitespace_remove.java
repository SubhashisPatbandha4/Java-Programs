/*
 Assignment-10.5

 PROGRAM    : To remove all white spaces from a string
 FILE       : Whitespace_remove.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
 import java.util.*;
class Whitespace_remove
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a string : ");
		String str=sc.nextLine();
		System.out.println("\nAfter removing all white space :-\nthe string is : "+str.replaceAll("\\s",""));
		
	}
}