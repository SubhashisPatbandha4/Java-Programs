import java.util.Scanner;
abstract class Account
{
	Scanner sc=new Scanner (System.in);
	String acc_type,acc_holder_name;
	double balance,min_balance;
	long mobile_no;
	
	abstract double getBalance();
	abstract String getACCType();
	abstract long getMobileNo();
	abstract String getHoldername();
}
class Saving_Account extends Account
{
	double min_balance; 
	Saving_Account()
	{
		System.out.println("\nEnter details for Saving Account\n==================================");
		System.out.print("Enter minimum balance     : ");
		min_balance=sc.nextDouble();
		sc.nextLine();

	}
	double getBalance()
	{
		System.out.print("Enter Balance             : ");
		
		balance = sc.nextDouble();
		return balance;
	}
	String getACCType()
	{
		System.out.print("Enter Account Type        : ");
		acc_type = sc.nextLine();
		return acc_type;
	}
	long getMobileNo()
	{
		System.out.print("Enter Mobile No.          : ");
		mobile_no = sc.nextLong();
		return mobile_no;
	}
	String getHoldername()
	{
		System.out.print("Enter account holder name : ");
		acc_holder_name = sc.nextLine();
		return acc_holder_name;
	}	
}
class Current_Account extends Account
{
	double min_balance; 
	Current_Account()
	{
		System.out.println("\nEnter details for Current Account\n=================================");
		
		System.out.print("Enter minimum balance     : ");
		min_balance=sc.nextDouble();
		sc.nextLine();

	}
	double getBalance()
	{
		System.out.print("Enter Balance             : ");

		balance = sc.nextDouble();
		return balance;
	}
	String getACCType()
	{
		System.out.print("Enter Account Type        : ");		
		acc_type = sc.nextLine();
		return acc_type;
	}
	long getMobileNo()
	{
		System.out.print("Enter Mobile No.          : ");
		mobile_no = sc.nextLong();
		return mobile_no;
	}
	String getHoldername()
	{
		System.out.print("Enter account holder name : ");
		acc_holder_name = sc.nextLine();
		return acc_holder_name;
	}	
}
class My_Account
{
	public static void main(String args[])
	{
		Saving_Account s = new Saving_Account();
		String S_acc_type = s.getACCType();
		String S_name = s.getHoldername();
		double S_balance = s.getBalance();
	    long S_mob_no = s.getMobileNo();

		
		Current_Account c=new Current_Account();
		String C_acc_type = c.getACCType();
		String C_name = c.getHoldername();
		double C_balance = c.getBalance();
		long C_mob_no = c.getMobileNo();
		System.out.println("Display saving account details\n================================");
		System.out.println("Account holder name : "+S_name+"\nAccount type        : "+S_acc_type+"\nmobile no.          : "+S_mob_no+"\nminimum balance     : "+s.min_balance+"\nbalance             : "+S_balance);
		System.out.println("Display current account details\n===============================");
		System.out.println("Account holder name : "+C_name+"\nAccount type        : "+C_acc_type+"\nmobile no.          : "+C_mob_no+"\nminimum balance     : "+c.min_balance+"\nbalance             : "+C_balance);
	}
} 