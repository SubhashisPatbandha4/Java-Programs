import java.util.*;
class Sin_x
{
	double num,fact,sum=0;
	int n,temp,sign=1;
	double calculate(double x,int n)
	{
		num=(x*3.14)/180;
		for(int i=1;i<=n;i+=2)
		{
			temp=i;
			fact=1;
			while(temp!=0)
			{
				fact*=temp;
				temp--;
				
			}
			sum+=((Math.pow(num,i))/fact)*sign;
			sign*=(-1);
			
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the value of x in degree : ");
		int x=sc.nextInt();
		System.out.print("\nEnter the value of n : ");
		int n=sc.nextInt();
		Sin_x obj=new Sin_x();
		double res=obj.calculate(x,n);
		System.out.println("\nsin "+x+" = "+res);
				
	}
}