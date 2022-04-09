/*
 * PROGRAM : To find the 3rd largest and 2nd smallest element in an array. Also print the input array.
 * FILE : : LarSmall.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class LarSmall {

	public static int[] largeSmall(int arr[]){

		int temp;
		for (int i=0; i<arr.length; i++ ) {

			for (int j=i+1; j<arr.length; j++ ) {

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
 		if (s<3) {

 			while (true) {

 				System.out.println("------Please enter the size of array more than 2--------");
 				System.out.print("Enter the size of the array: ");
 				s = sc.nextInt();	
 			}
 		}
 		int arr[]  = new int[s];
 		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<s; i++)  
		{	  	
			arr[i]=sc.nextInt();  
		}
		int lar[] = largeSmall(arr);
		int thirdLarge = lar[lar.length - 3];
		int secondSmall = lar[1];

		System.out.println("The third largest element of the array = "+thirdLarge); 
		System.out.println("The second smallest element of the array = "+secondSmall); 
	}

}










