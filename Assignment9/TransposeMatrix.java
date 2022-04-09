/*
 * PROGRAM : To find the transpose of a matrix
 * FILE : TransposeMatrix.java
 * CREATED BY : Subhasis Patbandha
 * DATE : 12-10-20
 */
import java.util.*;
class TransposeMatrix1 {

	public int[][] transpose(int m[][],int r,int c) {

		int t_m[][] = new int[c][r];

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {

				t_m[j][i] = m[i][j];
				
			}	
		}
		return t_m;
	}
}
class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the row size    : ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		int m[][]  = new int[r][c];

 		System.out.println("\nEnter the elements of the matrix :-\n");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("for row "+i+" coloumn "+j+": ");
				 m[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("\nEntered Matrix \n=====================");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				 System.out.print(m[i][j]+" ");
				  
			}
			System.out.println();
		}
		TransposeMatrix1 obj = new TransposeMatrix1();
		int t_m[][] = obj.transpose(m,r,c);
		System.out.println("\nTranspose Matrix\n==================");  
		for(int i=0; i<c; i++) { 
			for (int j=0; j<r; j++) {
				
				 System.out.print(t_m[i][j]+" ");
				 
			}
			System.out.println(); 
		}
	}
}
