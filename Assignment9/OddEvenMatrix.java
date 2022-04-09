/*
 * PROGRAM : To find the frequency of ODD and EVEN integers in a matrix.
 * FILE : CalOddEvenMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
 class OddEvenMatrix {
 	public static void matrix(int mat[][]) {
 		int odd=0,even=0;

 		for (int i=0; i<mat.length; i++) {
 			for (int j=0; j<mat[0].length; j++) {

 				if (mat[i][j] % 2 == 0) {

 					even++;
 					
 				}
 				else
 					odd++;
 				
 			}
 			
 		}
 		System.out.println("The frequency of odd integers in the matrix  : "+odd);
 		System.out.println("The frequency of even integers in the matrix : "+even );

 	}

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the row size    : ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		int mat[][]  = new int[r][c];

 		System.out.println("\nEnter the elements of the matrix :-");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("for row "+i+" coloumn "+j+": ");
				 mat[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("\n===========\nThe Matrix\n=============");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				 System.out.print(mat[i][j]+" ");
				  
			}
			System.out.println();
		}
		OddEvenMatrix obj = new OddEvenMatrix();
		obj.matrix(mat);
 	}
 }