/* 
 * PROGRAM : To design a class "Shape" with relevant members.
 			Design another class "Rectangle" that inherits class "Shape" 
 			and another class "Square" that inherit class "Rectangle". 
 			Find area and perimeter of rectangle and square using methods.Implement dynamic dispach method overriding in program.
 * FILE : Myshape.java
 * CREATED BY : Subhashis Patbandha
 * DATED : 28-09-20
 */
 import java.util.*;
 class Shape 
 {
	void input(){}
	double area()
	{
		return 0;
	}
 	double perimeter()
	{
		return 0;
	}
 
 }	

 class Rectangle extends Shape {

	double l,b;

 	void input() {

 		Scanner sc = new Scanner(System.in);
 		System.out.print("\nEnter the length of the Rectangle : ");
 		l = sc.nextDouble();
 		System.out.print("Enter the breadth of the Rectangle : ");
 		b = sc.nextDouble();
 	}
 	double area()
	{
 		return (l * b);
 	}
 	double perimeter()
	{
 		return (2 * (l+b));
 	}

 }	

 class Square extends Rectangle {
 	double a;

 	void input() 
	{
 		Scanner sc = new Scanner(System.in);

 		System.out.print("\nEnter the side of the square : ");
 		a = sc.nextDouble();
 	}

 	double area() 
	{
		return(a * a);
 	}
 	double perimeter()
	{
 		return 4*a; 
 	}
 }	
 class Myshape
 {
 	public static void main(String[] args)
	{
 		Shape obj1=new Rectangle();
		obj1.input();
 		double r_area = obj1.area();
 		double r_peri = obj1.perimeter();

 		System.out.println("Area : "+r_area+"\nPerimeter : "+r_peri);

 		Shape obj2=new Square();
		obj2.input();
 		double s_area = obj2.area();
 		double s_peri = obj2.perimeter();

 		System.out.println("Area : "+s_area+"\nPerimeter : "+s_peri);
 	}
 }