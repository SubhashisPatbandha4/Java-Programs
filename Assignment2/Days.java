import java.util.Scanner;
class Days
{	
	public static void main(String args[])
	{	
		int year,month;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter year = ");
			year=sc.nextInt();
		System.out.print("Enter month (in number)= ");
			month=sc.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)	
			System.out.println("Number of days = 31");
		else if(month==2&(year%400==0||(year%4==0&&year%100!=0)))
			System.out.println("Number of days = 29");
		else if(month==2)
			System.out.println("Number of days = 28");
		else
			System.out.println("Number of days = 30");
			
	}
}