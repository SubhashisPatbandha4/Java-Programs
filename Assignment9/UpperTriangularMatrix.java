/*
 * PROGRAM : To find the upper triangular matrix
 * FILE : UpperTriangularMatrix.java
 * CREATED BY : Subhashis Patbandha
 * DATE : 12-10-20
 */
import java.util.*;
class UpperTriangularMatrix {
	public static void upperTriangular(int m[][],int r,int c){

		System.out.println("\n\n======================\nUpper Tringular Matrix \n======================");

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {

				if (i<=j) {
					System.out.print(m[i][j]+" ");
					
				}
				else {
					System.out.print("0"+" ");
				}	
			}
			System.out.println();	
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size    : ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		while (r!=c) {
 			System.out.println("Error ! The row and coloumn size must be equal.");
 			System.out.print("Enter the coloumn size : ");
 			c = sc.nextInt();
 		}
 		int m[][]  = new int[r][c];

 		System.out.println("\nEnter the elements of the matrix :-");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("for row "+i+" coloumn "+j+": ");
				 m[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("\n=============\nThe Matrix\n=============");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				 System.out.print(m[i][j]+" ");
				  
			}
			System.out.println();
		}
		upperTriangular(m,r,c);
	}
}