import java.util.*;
class Bank 
{
	String name;
	float rateofinterest;
	final static double balance = 50000.96;
 	Bank()
	{
 		System.out.println("\tEnter your account details:-\n\t~~~~~~~~~~~~~~~~~~~~~~~~~");
 	}
	void info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\t1.Enter the Account Holder Name: ");
		name = sc.nextLine();

	}
}
class SBI extends Bank
{
 	String acc_no,mobile_no,ifsc,micr;	 
  	void input_details() 
	{
		info();
 		Scanner sc = new Scanner(System.in);
 		
		System.out.print("\t2.Enter your Account No      : ");
 		acc_no = sc.nextLine();
 		
		System.out.print("\t3.Enter your Mobile No       : ");
 		mobile_no= sc.nextLine();

 		System.out.print("\t4.Enter the IFSC code        : ");
 		ifsc = sc.nextLine();

 		System.out.print("\t5.Enter the MICR code        : ");
 		micr = sc.nextLine();
		
		System.out.print("\t6.Enter the rate of interest : ");
 		rateofinterest = sc.nextFloat();
 	}

 	void display() 
	{
  		System.out.println("SBI Bank details\n~~~~~~~~~~~~~~~~~~~~~~~");
 	 	System.out.println("\t1.Account Holder Name : "+name);
 	 	System.out.println("\t2.Account No          : "+acc_no);
		System.out.println("\t3.Mobile No           : "+mobile_no);
 		System.out.println("\t4.IFSC code           : "+ifsc);
 		System.out.println("\t5.MICR code           : "+micr);
 		System.out.println("\t6.rate Of Interest    : "+rateofinterest);
		System.out.println("\t7.Balance             : "+balance);
 	
 	}

}
class ICICI extends Bank {

	String acc_no,mobile_no,ifsc,micr;
  	void input_details() 
	{	
		info();
 		Scanner sc = new Scanner(System.in);
 		
		System.out.print("\t2.Enter your Account No      : ");
 		acc_no = sc.nextLine();
 		
		System.out.print("\t3.Enter your Mobile No       : ");
 		mobile_no= sc.nextLine();

 		System.out.print("\t4.Enter the IFSC code        : ");
 		ifsc = sc.nextLine();

 		System.out.print("\t5.Enter the MICR code        : ");
 		micr = sc.nextLine();
		
		System.out.print("\t6.Enter the rate of interest : ");
 		rateofinterest = sc.nextFloat();
 	}

 	void display() 
	{
  		System.out.println("ICICI Bank details\n~~~~~~~~~~~~~~~~~~~~");
 	 	System.out.println("\t1.Account Holder Name : "+name);
 	 	System.out.println("\t2.Account No          : "+acc_no);
		System.out.println("\t3.Mobile No           : "+mobile_no);
 		System.out.println("\t4.IFSC code           : "+ifsc);
 		System.out.println("\t5.MICR code           : "+micr);
 		System.out.println("\t6.rate Of Interest    : "+rateofinterest);
		System.out.println("\t7.Balance             : "+balance);
 	}
}

class Mybank 
{
 	public static void main(String[] args) 
	{ 
		System.out.println("Creating Account for SBI Bank\n*****************************");
 		SBI obj1 = new SBI();
 		obj1.input_details();
 		obj1.display();
 	
		System.out.println("Creating Account for ICICI Bank\n*****************************");
 		ICICI obj2 = new ICICI();
  		obj2.input_details();
 		obj2.display();
 	}
}
