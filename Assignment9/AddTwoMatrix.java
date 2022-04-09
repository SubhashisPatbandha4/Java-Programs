/*
 * PROGRAM : To add two matrices using your own method. Print the resultant along with two input matrices.
 * FILE : AddTwoMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class Matrix{
	public int[][] addMatrix(int arr[][],int arr2[][],int r,int c) {

		int addResult[][] = new int[r][c];

		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {

				 addResult[i][j] = arr[i][j] + arr2[i][j]; 
			}
		}
		return addResult;
	}
}
class AddTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the row size    : ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		int arr[][]  = new int[r][c];

 		System.out.println("Enter the elements of the 1st array :\n");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("for row "+i+" coloumn "+j+" : ");
				 arr[i][j] = sc.nextInt(); 
			}
		}	  		
 		int arr2[][]  = new int[r][c];
 		System.out.println("\nEnter the elements of the 2nd array :\n");  
		for(int k=0; k<r; k++) {
			for (int l=0; l<c; l++) {

				System.out.print("for row "+k+" coloumn "+l+" : ");
				arr2[k][l] = sc.nextInt();
			}
		}
		System.out.println("\n1st Matrix\n============");
		for( int i=0; i<r; i++) { 
			for ( int j=0; j<c; j++) {
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();

		}
		System.out.println("\n2nd Matrix\n============");
		for( int k=0; k<r; k++) { 
			for ( int l=0; l<c; l++) {
				System.out.print(arr2[k][l]+" ");
			
			}
			System.out.println();

		}

		Matrix obj = new Matrix();
		int result[][] = obj.addMatrix(arr,arr2,r,c);
		System.out.println("\nAfter adding the two Matrix\n========================");
		for(int k=0; k<r; k++) { 
			for (int l=0; l<c; l++) {
				System.out.print(result[k][l]+" ");
			
			}
			System.out.println();
		}
	}
}