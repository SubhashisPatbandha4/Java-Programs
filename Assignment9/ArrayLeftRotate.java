/*
 * PROGRAM : To left rotate the elements of an array and display the elements of an array before and after rotation.  
 * FILE : ArrayRotate.java
 * CREATED BY : Santosh Hembram
 * DATED : 17-10-20
 * 
 */
import java.util.*;

class ArrayLeftRotate {

	public static int[] leftRotate(int arr[]) {

		int temp;

		temp = arr[0];

		for (int i=0;i<arr.length-1 ;i++ ) {

			arr[i] = arr[i+1];		
		}
		arr[arr.length-1] = temp;

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
		System.out.println("Elements of the array before Left Rotation: ");
		for (int i:arr) { 	
		
			System.out.print(i+" ");
		}

		int array[] = leftRotate(arr);

		System.out.println();
		System.out.println("Elements of the array after Left Rotation: ");
		for (int i:array) { 	
		
			System.out.print(i+" ");
		}	
	}
}
