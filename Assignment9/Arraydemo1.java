//Assignment9.1
import java.util.Scanner;
class Arraydemo1
{
	public static void main(String args[])
	{
		int i,j,size;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		size=sc.nextInt();
		int[] arr1 =new int[size];

		System.out.println("Enter elements to the array = ");
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			int ctr=1;
			if(arr1[i]==-1)
				continue;
			else
			{
				System.out.print("Frequency of "+arr1[i]+" = ");
				for(j=i+1;j<size;j++)
				{
					if(arr1[i]==arr1[j])
					{
						arr1[j]=-1;
						ctr++;
					}
				}
				System.out.print(ctr+"\n");
			}
		}
		
		
	}
}