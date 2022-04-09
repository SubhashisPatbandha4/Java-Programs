import java.util.Scanner;
class Fibbonaccipyramid
{
	public static void main(String args[])
	{
		int f1=0,f2=1,f3,r,c,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		n=sc.nextInt();
		if(n==1)
			System.out.println(0);
		else
		{		
			for(r=1;r<=n;r++)
			{	
				f1=0;
				f2=1;
				System.out.print(f1+" ");
		
				for(c=1;c<r;c++)
				{	
					System.out.print(f2+" ");
	
					f3=f1+f2;

					f1=f2;
					f2=f3;
				}	
				System.out.println();

			}	
		}
	}
}