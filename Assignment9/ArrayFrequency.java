/*
 * PROGRAM : To create an array and input values for the array with run-time input.Find the frequency of each element in the array and print the result along with array elements.

 * FILE : ArrayFrequency.java
 * CREATED BY : Santosh Hembram 
 * DATE : 12-10-20
 */

import java.util.Scanner;
 class Array {

 	public static void check(int c_arr[]) {

 		for (int i=0; i<c_arr.length; i++ ) {

 			int count = 1;
 			int found = 0;

 			for (int j=0; j<c_arr.length; j++ ) {

 				if(j>=i) {

 					if (c_arr[i] == c_arr[j] && i!=j) {

 						count ++ ;

 					}
 				}
 				else if (c_arr[i] == c_arr[j]) {

 					found = 1;	
 				} 					
 			}
 				
 			if (found!=1) {
 				System.out.println("Elements "+c_arr[i]+" | frequency = "+count+" times.");			
 			}	
 		}
 	}	
}	

class ArrayFrequency {

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
 	 	int s = sc.nextInt();

 		int arr[]  = new int[s];
 		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<s; i++)  
		{	  	
			arr[i]=sc.nextInt();  
		} 
		Array obj = new Array(); 
		obj.check(arr);
	}  
}




	