/*
 Assignment-10.3

 PROGRAM    : To create separate strings for vowels and contants present in a string
 FILE       : Vowel_consonant_String.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
 import java.util.*;
 class Vowel_consonant_String
 {
	 public static void main(String args[])
	 {
		int i,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
				j++;
			else
			{
				if((a[i]>=65&& a[i]<=90 )||( a[i]>=97 && a[i]<=122))
					k++;
			}
		}		 
		char []v=new char[j];
		char []c=new char[k];
		j=0;
		k=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				v[j]=a[i];
				j++;
			}
			else
			{
				if((a[i]>=65&& a[i]<=90 )||( a[i]>=97 && a[i]<=122))
				{
					c[k]=a[i];
					k++;
				}
			}
		 }
		 String vowel=Arrays.toString(v);
 		 String consonant=Arrays.toString(c);

		 System.out.print("\nvowel(s) are = "+vowel+"\nconsonant(s) are = "+consonant);
	 }
 }