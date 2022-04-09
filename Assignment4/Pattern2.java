//Assignment 4.5
import java.util.Scanner;
class Pattern2
{
	public static void main(String args[])
	{
		int n,r,c,c1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines = ");
		n=sc.nextInt();
		for(r=0;r<n;r++)
		{
			for(c=n-r;c>=1;c--)
			{
				System.out.print(" ");
			}	
			int temp=1;
			int num=r;
			int den=1;
			for(c1=0;c1<=r;c1++)
			{
				System.out.print(temp+" ");
				temp=temp*num;
				temp=temp/den;
				num--;
				den++;
			}
			System.out.println("");
		}
	}
}