/*
 * PROGRAM   : To swap two string variables without using third variable
 * FILE      : SwapString.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */

import java.util.*;
class SwapString {

	public static void swap(String a, String b) {

		a = a + b;

		b = a.substring( 0,a.length() - b.length() );

		a = a.substring(b.length() );

		System.out.println("\nAfter Swaping : \n");
		System.out.println("string 1 : "+a);
		System.out.println("string 2 : "+b);

			
		}

	public static void main(String[] args) {

		System.out.print("Enter the first string : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		System.out.print("Enter the second string : ");
		String b = sc.nextLine();

		System.out.println("\nBefore Swaping : \n");
		System.out.println("string 1 : "+a);
		System.out.println("string 2 : "+b);

		swap(a,b);
	}
}