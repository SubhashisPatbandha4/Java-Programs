import java.util.Scanner;
class MultiplicationOperation
{
	static int [][] multiplication(int[][] m1,int[][] m2,int r1,int c1,int r2,int c2)
	{
		int m3[][]=new int[r1][c2];  
    
		for(int i=0;i<r1;i++)
		{    
			for(int j=0;j<c2;j++)
			{    
				m3[i][j]=0;      
				for(int k=0;k<c2;k++)      
				{      
					m3[i][j]+=m1[i][k]*m2[k][j];      
				}//end of k loop  
			}//end of j loop    
		} 
			return m3;

	} 
	
}
class MultiplicationMatrix
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size for the 1st Matrix    : ");
		int r1=sc.nextInt();
		System.out.print("Enter the column size for the 1st Matrix : ");
		int c1=sc.nextInt();
		System.out.print("Enter the row size for the 2nd Matrix    : ");
		int r2=sc.nextInt();
		System.out.print("Enter the column size for the 2nd Matrix : ");
		int c2=sc.nextInt();
		if(c1 != r2)
			System.out.println("\nError ! You cant multiply the 2 matrix \n(due to 1st matrix column size and 2nd matrix row size are not same .");
		else	
		{
			int [][]m1= new int[r1][c1];
			System.out.println("\nEnter elements to the 1st Matrix :-");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print("for "+i+" raw "+j+" column :");
					m1[i][j]=sc.nextInt();
				}
			}

			int [][]m2= new int[r2][c2];
			System.out.println("\nEnter elements to the 2nd Matrix :-");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print("for "+i+" raw "+j+" column :");
					m2[i][j]=sc.nextInt();

				}
			}
			System.out.println("\nDisplaying the 1st Matrix\n============================");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(m1[i][j]+" ");
				}
				System.out.println();
			}		
			System.out.println("\nDisplaying the 2nd Matrix\n============================");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(m2[i][j]+" ");
				}
				System.out.println();
			}	
			int [][]MulMatrix = MultiplicationOperation.multiplication(m1,m2,r1,c1,r2,c2);
			System.out.println("\nDisplaying the Multiplication Matrix\n============================");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(MulMatrix[i][j]+" ");
				}
				System.out.println();
			}	
		}
	}
} 	




