/*
 Assignment-10.9

 PROGRAM    : To find duplicate characters in a string
 FILE       : DuplicateChar_find.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
import java.util.Scanner;
class DuplicateChar_find
{
	public static void main(String args[])
	{
		int i,j,ctr,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		char []a=str.toCharArray();
		System.out.println("Duplicate character(s) present in the string are =");
		for(i=0;i<a.length;i++)
		{
			ctr=0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[j]!=0)
				{
					ctr++;
					a[j]=0;
					temp=1;
				}
			}
			if(ctr!=0&&a[i]!='0'&&a[i]!=32&&a[i]!=9)
				System.out.println(a[i]);
			if(temp==0&& i==a.length-1)
				System.out.println("There is no duplicate characters present in the string");		
		}
	}
}	