/*
 Assignment-10.8

 PROGRAM    : To find maximum and minimum occuring character is a string
 FILE       : MaxMin_string.java
 CREATED BY : Subhashis Patbandha
 DATED      : 14/10/2020
 */
import java.util.Scanner;
class MaxMin_string
{
	public static void main(String args[])
	{
		int i,j,max=1,min=1,ctr;
		char maxchar,minchar;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		char []a=str.toCharArray();
		maxchar=minchar=a[0];
		for(i=0;i<a.length;i++)
		{
			ctr=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]='0';
					ctr++;
				}
			}
			if(max <ctr && a[i]!='0'&&a[i]!=32&&a[i]!=9)
			{
				max=ctr;
				maxchar=a[i];
			}
			if(min>=ctr && a[i]!='0'&&a[i]!=32&&a[i]!=9)
			{
				min=ctr;
				minchar=a[i];
			}
		}	
		
		System.out.println("Maximum occuring character = "+maxchar+"\nMinimum occuring character = "+minchar);
	}
}