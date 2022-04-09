/*
 Assignment-10.2

 PROGRAM    : To count vowels and contants in a string
 FILE       : Vowel_consonant.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
 import java.util.Scanner;
 class Vowel_consonant
 {
	 public static void main(String args[])
	 {
		 int i,v=0,c=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a string : ");
		 String str=sc.nextLine();
		 char[] a=str.toCharArray();
		 for(i=0;i<a.length;i++)
		 {
			 if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
				 v++;
			 else
				 if((a[i]>=65&& a[i]<=90 )||( a[i]>=97 && a[i]<=122))
					c++;
		 }
		 System.out.print("\nnumber of vowel(s) = "+v+"\nnumber of consonant(s) = "+c);
	 }
 }