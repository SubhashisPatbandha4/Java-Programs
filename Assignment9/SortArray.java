/*
 * PROGRAM : To sort an array of integer values in default order and print the array before and after sorting operation. 
 * FILE : SortArray.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */ 
 import java.util.*;
 class SortArray {

 	public static int[] sortingOperation(int arr[]) {

 		int temp;
 		for (int i=0; i<arr.length; i++) {
 			for (int j=i+1; j<arr.length; j++) {
 					if (arr[i] > arr[j]) {

 						temp = arr[j];
 						arr[j] = arr[i];
 						arr[i] = temp; 
 						
 					}
 			}
 		}
 		return arr;
 	}

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
		System.out.println("Elements of the array before Sorting : ");
		for (int i: arr) {
			System.out.print(i+" ");
			
		}
		int sort[] = sortingOperation(arr);
		System.out.println(); 
		System.out.println("Elements of the array after Sorting: ");
		for (int i : sort ) {
			System.out.print(i+" ");
			
		}
 	
 	}

}