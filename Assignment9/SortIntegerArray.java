import java.util.Scanner;
class SortIntegerArray
{
	public static void main(String args[])
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements to the array = ");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Before sorting the array = ");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nAfter sorting the array = ");
		if(size==1)
		{
			System.out.print(a[0]);
		}
		else
		{
			for(i=0;i<size;i++)
			{
				
				for(j=i+1;j<size;j++)
				{
					if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
				
			}
		
			for(i=0;i<size;i++)
			{
				System.out.print(a[i]+" ");
			}		
		}
	
	}
}