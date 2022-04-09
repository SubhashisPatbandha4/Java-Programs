import java.util.Scanner;
abstract class Bank
{
	abstract double getRateofInterest();
	abstract double getBalance();
	Scanner sc=new Scanner(System.in);
}
class SBI extends Bank
{
	double roi,amount,t_amount;
	SBI()
	{	
		System.out.println("\nSBI Bank\n~~~~~~~~~~~~~~~~");
		System.out.print("Enter amount : ");
		amount=sc.nextDouble();		
	}
	double getRateofInterest()
	{
		System.out.print("Enter rate of interest : ");
		roi=sc.nextDouble();
		return roi;
	}
	double getBalance()
	{
		return(((roi*amount)/100)+amount);	
	}
}
class PNB extends Bank
{
	double roi,amount,t_interest,t_amount;
	PNB()
	{		
		System.out.println("\nPNB Bank\n~~~~~~~~~~~~~~~~");
		System.out.print("Enter amount : ");
		amount=sc.nextDouble();	
	}
	double getRateofInterest()
	{
		System.out.print("Enter rate of interest : ");
		roi=sc.nextDouble();
		return roi;
	}
	double getBalance()
	{
		return(((roi*amount)/100)+amount);	
	}
}
class BOI extends Bank
{
	double roi,amount,t_interest,t_amount;
	BOI()
	{		
		System.out.println("\nBOI Bank\n~~~~~~~~~~~~~~~~");
		System.out.print("Enter amount : ");
		amount=sc.nextDouble();	
	}
	double getRateofInterest()
	{
		System.out.print("Enter rate of interest : ");
		roi=sc.nextDouble();
		return roi;
	}
	double getBalance()
	{
		return(((roi*amount)/100)+amount);	
	}
}
class IOB extends Bank
{
	double roi,amount,t_interest,t_amount;
	IOB()
	{
		System.out.println("\nIOB Bank\n~~~~~~~~~~~~~~~~");
		System.out.print("Enter amount : ");
		amount=sc.nextDouble();	
	}
	
	double getRateofInterest()
	{
		System.out.print("Enter rate of interest : ");
		roi=sc.nextDouble();
		return roi;
	}
	double getBalance()
	{
		return(((roi*amount)/100)+amount);	
	}
}
class UCO extends Bank
{
	double roi,amount,t_interest,t_amount;
	UCO()
	{
		System.out.println("\nUCO Bank\n~~~~~~~~~~~~~~~~");
		System.out.print("Enter amount : ");
		amount=sc.nextDouble();	
	}
	double getRateofInterest()
	{
		System.out.print("Enter rate of interest : ");
		roi=sc.nextDouble();
		return roi;
	}
	double getBalance()
	{
		return(((roi*amount)/100)+amount);	
	}
}
class Mybank
{
	public static void main(String args[])
	{
		SBI s=new SBI();
		double roi_SBI=s.getRateofInterest();
		double amount_SBI=s.getBalance();
		System.out.println("\nRate of Interest = "+roi_SBI+"% (per year) , Total amount = Rs "+amount_SBI+" /-");
		
		PNB p=new PNB();
		double roi_PNB=p.getRateofInterest();
		double amount_PNB=p.getBalance();
		System.out.println("\nRate of Interest = "+roi_PNB+"% (per year) , Total amount = Rs "+amount_PNB+" /-");
		
		BOI b=new BOI();
		double roi_BOI=b.getRateofInterest();
		double amount_BOI=b.getBalance();
		System.out.println("\nRate of Interest = "+roi_BOI+"% (per year) , Total amount = Rs "+amount_BOI+" /-");
		
		IOB i=new IOB();
		double roi_IOB=i.getRateofInterest();
		double amount_IOB=i.getBalance();
		System.out.println("\nRate of Interest = "+roi_IOB+"% (per year) , Total amount = Rs "+amount_IOB+" /-");
		
		UCO u=new UCO();
		double roi_UCO=u.getRateofInterest();
		double amount_UCO=u.getBalance();
		System.out.println("\nRate of Interest = "+roi_UCO+"% (per year) , Total amount = Rs "+amount_UCO+" /-");
	}
}