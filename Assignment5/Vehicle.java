import java.util.Scanner;
class Vehicle
{
	
	String chasis_no,engine_no,colour,variant,model;
	static String brand;
	static
	{
		System.out.println("\nEnter the vehicle details\n=============================");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nbrand name = ");
		brand=sc.nextLine();	
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("engine number = ");
		engine_no=sc.nextLine();
		System.out.print("chasis number = ");
		chasis_no=sc.nextLine();
		System.out.print("colour = ");
		colour=sc.nextLine();
		System.out.print("variant = ");
		variant=sc.nextLine();
		System.out.print("model = ");
		model=sc.nextLine();
	}
	void display()
	{
		System.out.print("Brand = "+Vehicle.brand+"\nEngine number = "+engine_no+"\nchasis number = "+chasis_no+"\ncolour = "+colour+"\nvariant = "+variant+"\nmodel = "+model);
	}
	public static void main(String args[])
	{
		Vehicle v=new Vehicle();
		v.input();
		
		System.out.println("\nDisplay the vehicle details \n=============================");		
		v.display();
		
	}
}