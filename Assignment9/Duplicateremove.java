//Assignments 9.6 :remove duplicate elements
import java.util.Scanner;
class Duplicateremove
{
	public static void main(String args[])
	{
		int i,j,k,temp=1,size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		size=sc.nextInt();
		int[] a=new int[size];

		System.out.println("Enter elements to the array = ");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Before removing duplicate values  = ");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+",");
		}		
		System.out.print("\nAfter removing duplicate values  = ");
		if(size==1)
		{
			System.out.print(a[0]);
		}	
		else
		{	
			for(i=0;i<size;i++)
			{
				j=i+1;
				while(temp!=0)
				{	
					if(a[i]==a[j])
					{
						for(k=j+1;k<size;k++)
						{
							a[j]=a[k];
						}
						size--;
					}
					if(a[i]!=a[j])
					{
						j++;
					}
					if(j==size)
					{
						break;
					}
				}	
			}
			for(i=0;i<size;i++)
			{
				System.out.print(a[i]+",");
			}
		}	
	}
}