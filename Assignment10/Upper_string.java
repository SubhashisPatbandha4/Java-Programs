/*
 Assignment-10.6

 PROGRAM    : To convert a string to uppercase wihtout using string method
 FILE       : Upper_string.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
 import java.util.*;
 class Upper_string
 {
	 public static void main(String args[])
	 {
		 int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		char []a=str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)((int)a[i]-32);
			}
		}
		System.out.println("After converting to upper case string is = "+String.valueOf(a));
	 }
 }