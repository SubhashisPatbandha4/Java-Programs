import java.util.Scanner;
class Person
{
	int id;
	String name,gender,bgroup,nation;
	Person()
	{
		System.out.println("\nPlease enter the person's details :-\n");
	}
	void input()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ID = ");
		id=sc.nextInt();
		sc.nextLine();
	
		System.out.print("Name = ");
		name=sc.nextLine();

		System.out.print("Gender = ");
		gender=sc.nextLine();

		System.out.print("Blood Group = ");
		bgroup=sc.nextLine();

		System.out.print("Nation = ");	
		nation=sc.nextLine();

	}
	void show()
	{
		System.out.println("\nPerson's Details\n------------------");
		System.out.println("ID = "+id+"\nName = "+name+"\nGender = "+gender+"\nBlood Group = "+bgroup+"\nNation = "+nation);
	
	}
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.input();
		p1.show();
	}
}	