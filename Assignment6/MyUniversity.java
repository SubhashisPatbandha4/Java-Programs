import java.util.*;
class University
{
	String name,VCname,NACCGrade;
	int noOfDept;
	Address ad=new Address();
	public void university_info()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter University Details :-\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("\tEnter University Name       : ");
		name=sc.nextLine();

		System.out.print("\tEnter Vice Chancellor Name  : ");
		VCname=sc.nextLine();	

		System.out.print("\tEnter NACC Grade            : ");
		NACCGrade=sc.nextLine();	

		System.out.print("\tEnter No. of Departments    : ");
		noOfDept=sc.nextInt();

		ad.input();
	}
	void display()
	{
		System.out.println("University details :-\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\tUniversity name      :"+name+"\n\tVice Chancellor Name : "+VCname+"\n\tNACC Grade           : "+NACCGrade+"\n\tNo. of Departments   : "+noOfDept);
		ad.display();
	}
	void teacher_info(){}	
}
class Address
{
	String city,dist,state,country;
	void input()
	{	Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter City     : ");
		city=sc.nextLine();
	
		System.out.print("\tEnter District : ");
		dist=sc.nextLine();
		
		System.out.print("\tEnter State    : ");
		state=sc.nextLine();
	
		System.out.print("\tEnter Country  : ");
		country=sc.nextLine();
	}
	void display()
	{
		System.out.println("\tCity     : "+city+"\n\tDistrict : "+dist+"\n\tState    : "+state+"\n\tCountry  : "+country);
	
	}

} 
class Student extends University
{
	String name,roll,dept;
	Address ad=new Address();
	void student_info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student details :-\n~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("\tEnter Student's Name :");
		name=sc.nextLine();
		System.out.print("\tEnter Roll No.       :");
		roll=sc.nextLine();
		System.out.print("\tEnter Department     : ");
		dept=sc.nextLine();
		ad.input();
	}
	void display()
	{
		System.out.println("\nStudent's detail's\n~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("\tStudent's Name : "+name+"\n\tRoll No.       : "+roll+"\n\tDepartment     : "+dept+"\n");
		ad.display();
	}
}
class Teacher extends University
{
	String name,dept;
	Address ad=new Address();
	void teacher_info()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Teacher details :-\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("\tEnter Teacher's Name : ");
		name=sc.nextLine();
		System.out.print("\tEnter Department     : ");
		dept=sc.nextLine();
		ad.input();
	}
	void display()
	{
		System.out.println("\nTeacher's detail's\n~~~~~~~~~~~~~~~~~~~");
		System.out.print("\tTeacher's Name : "+name+"\n\tDepartment     : "+dept+"\n");
		ad.display();
	}
}	
class MyUniversity
{
	public static void main(String args[])
	{
		University u=new University();
		u.university_info();
		u.display();
		Student s=new Student();
		s.student_info();
		s.display();
		University u1=new Teacher();
		u1.teacher_info();
		u1.display();
	}
}
