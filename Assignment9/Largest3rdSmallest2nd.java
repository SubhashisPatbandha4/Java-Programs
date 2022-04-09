import java.util.Scanner;
class Largest3rdSmallest2nd
{
	public static void main(String args[])
	{
		int size,temp,l3,s2,i,j,k;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
			System.out.print("Enter the size of the array(min = 3) = ");
			size=sc.nextInt();
			if(size<3)
				System.out.println("error : invalid size !");
			
			else
				break;
		}
		int a[]=new int[size];
		System.out.println("Enter the elements to the array = ");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();		
		}
		System.out.print("The Inputted Array  is : ");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
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
		
		System.out.print("\nThe 3rd largest element = "+a[size-3]+"\nThe 2nd smallest element = "+a[1]);
	}
}