/*
 * PROGRAM    : To divide a string into N equal parts.
 * FILE       : DivideString.java
 * CREATED BY : Santosh Hembram
 * DATED      : 14-10-2020
 */
import java .util.*;
class DivideString {

	public static void main(String[] args) {

		String str;
		System.out.print("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		System.out.print("Enter the number of parts to be divided : ");
		int n = sc.nextInt();

		int str_len = str.length();
 
		int div = str_len/n;
		int temp=0;
		String[] arrStr = new String[n];

		if (str_len % n != 0) {

			System.out.println("\nThe string cannot be divide into "+n+" equal parts");
			
		}
		else {

			for (int i=0 ; i<str_len; i=i+div ) {

				String newStrData = str.substring(i,i+div);
				arrStr[temp] = newStrData;
				temp++;
			}
			System.out.println("\n"+n+" equal parts of given string are : \n");
			for (int i=0; i<arrStr.length; i++) {
				System.out.println(arrStr[i]);				
			}
		}	
	}
}