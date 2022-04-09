/*
 * PROGRAM : To remove duplicate elements in an array
 * FILE : RemoveDuplicate.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class RemoveDuplicate {

	public static void remove(int arr[]) {
		int temp;

		for (int i=0; i<arr.length; i++) {

			for (int j=i+1; j<arr.length; j++ ) {

				if(arr[i] > arr[j]) {
						
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}			
			}
		}
		int j=0;
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				arr[j] = arr[i];
				j++;			
			}			
		}
		arr[j] = arr[arr.length-1];
		j++;
		System.out.println("\nElements of the array after removing duplicate: ");

		for (int i=0;i<j;i++ ) {
			System.out.print(arr[i]+" ");			
		}			
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
		System.out.println("Elements of the array before removing the duplicate: ");
		for (int i: arr) {
			System.out.print(i+" ");
			
		}
	 	remove(arr);
	}
}