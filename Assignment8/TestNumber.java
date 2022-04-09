import com.myjava.pac.Number;
import java.util.Scanner;
class  TestNumber
 {

	public static void main(String[] args) {

		int num;
		System.out.print("\nEnter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		Number obj = new Number(num);

		if (obj.isZero() == true)
			System.out.println("The number is zero");
		else 
			System.out.println("The number is not zero");

		if (obj.isPositive() == true)
			System.out.println(num+" is a positive number");
		else
			System.out.println(num+" is not a positive number");

		if (obj.isNegative() == true)
			System.out.println(num+" is a negative number");
		else
			System.out.println(num+" is not a negative number");

		if (obj.isEven() == true)
			System.out.println(num+" is an even number");
		else
			System.out.println(num+" is not an even number");

		if (obj.isOdd() == true)
			System.out.println(num+" is an odd number");
		else
			System.out.println(num+" is not an odd number");

		if (obj.isPrime() == true)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not an prime number");

		if (obj.isArmstrong() == true)
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");

		double sq = obj.getSquare();
		double cube = obj.getCube();
		double sqRoot = obj.getSqrt();

		 System.out.println("The Square of "+num+" is       : "+sq);
		 System.out.println("The cube of "+num+" is         : "+cube);
		System.out.println("The Square root of "+num+" is  : "+sqRoot);

		obj.printFactors();

		obj.printPrimeFactors();

	}
}
