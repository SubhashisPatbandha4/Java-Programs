import java.util.Scanner;
class Floyds_triangle
{
	static void floyds(int n)
	{
		int r,c,num=1;

		for(r=1;r<=n;r++)
		{
			System.out.print(num+" ");
			for(c=1;c<r;c++)
			{
				num++;
				System.out.print(num+" ");
			}
			num++;
			System.out.println();

		}
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n=sc.nextInt();	
		floyds(n);	
	}
}