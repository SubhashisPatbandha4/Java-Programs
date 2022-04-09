/*
 Assignment-10.1

 PROGRAM    : To find total no. of characters in a string without using string method
 FILE       : Strlength.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
 import java.util.Scanner;
 class Strlength
 {
	 public static void main(String args[])
	 {
		 int i,ctr=0;
		 Scanner sc =new Scanner(System.in);
		System.out.print("\nEnter a String : ");
		String s=sc.nextLine();
		char []a=s.toCharArray();
		for(i=0;i<a.length;i++)
		{
			ctr++;
		}	
		System.out.print("\nThe total no. of characters in the string is : "+ctr);
		 
	 }
 }