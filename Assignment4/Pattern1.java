
import java.util.Scanner;
class Pattern1
{
	public static void main(String args[])
	{
		int i,j,n,temp,temp1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter range for the pattern =  ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");	
			}	
			temp=i;
			
			while(temp>=1)
			{
				System.out.print(temp);
				temp--;
			}
			temp1=temp+2;
			while(temp1<=i)
			{
				System.out.print(temp1);
				temp1++;
		
			}
			System.out.println("");
		}	
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			temp=n-i;
			while(temp>=1)
			{
				System.out.print(temp);
				temp--;
			}	
			temp1=temp+2;
			while(temp1<=n-i)
			{
				System.out.print(temp1);
				temp1++;
			}
			System.out.println("");
			
		}	
	
	}
}