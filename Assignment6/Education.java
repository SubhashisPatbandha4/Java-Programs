import java.util.*;
class University {

	int noOfDepts;
	String vcName,uName;
	String nGrade;
	
	public void getUniversityDetail() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Name of the University: ");
		uName = sc.nextLine();

		System.out.print("Enter the total no. of Departments: ");
		noOfDepts = sc.nextInt();

		sc.nextLine(); 
		System.out.print("Vice chancellor Name: ");
		vcName = sc.nextLine();

		System.out.print("NAAC grade: ");
		nGrade = sc.nextLine();


	}
	public void display() {
		System.out.println("University: "+uName);
		System.out.println("Total no. of Departments: "+noOfDepts);
		System.out.println("VC name:- "+vcName);
		System.out.println("NAAC grade: "+nGrade);
	
	}
	public void teacherData(String x,String y){

	}
	
}
class Address {

	String country,state,city;
	Address(String country, String state, String city) {

		this.country = country;
		this.state = state;
		this.city = city;

	}
}


class Student extends University{

	int rollNo;
	String name; 

	Address adr;

	public void studentData(int r_n, String n) {

		rollNo = r_n;
		name = n;
	}



	public void display(){

		System.out.println("Student Name:- "+name);
		System.out.println("Student rollNo:- "+rollNo);
		System.out.println("Country:- "+adr.country+", State:- "+adr.state+", City:- "+adr.city);
	}

	Student(Address adr){

		this.adr  = adr;

	}
}

class Teacher extends University {

	String name,dept;

	public void teacherData(String name, String dept) {

			this.name = name;
			this.dept = dept;
	}

	public void display() {

		System.out.println("Teacher Name:- "+name);
		System.out.println("Department Name:- "+dept);
	}


}

class Education{

	public static void main(String[] args) {

		Address obj = new Address("India", "Odisha", "Bhubaneswar");
		
		Student s = new Student(obj);
		s.studentData(42,"Santosh Hembram");

		System.out.println("================== Method overriding process ==========================");
		s.display();

		System.out.println("=================== Getting the information about the University =====================");
		University un = new University();
		un.getUniversityDetail();

		System.out.println("================ Displaying about the University in details =======================");
		un.display();	
		
		System.out.println("================== Dynamic dispatching process =====================");

		University ref;
		ref = new Teacher();
		ref.teacherData("Manoranjan Mohapatra", "IMCA");
		ref.display();
		
	}
}