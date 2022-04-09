/*
 * PROGRAM : Create a package named "com.myjava.pac" that contains a class "Number" with instance vairable x, constructor(s)
 			 and methods isZero(), isPositive(), isNegative(), isEven(), isOdd(), isPrime(), isArmstrong() those returning a boolean type value 
 			 and getSquare(), getSqrt(), getCube(), those returns double type value and printFactors(), printPrimeFactors() those returns nothing.
 			 WAP in java to implement it in the program.
 * FILE : Number.java
 * CREATED BY : Santosh Hembram
 * DATE : 09-10-20
 */

package com.myjava.pac;
import java.lang.Math;

 public class Number
 {

	int x;

	public Number(int x)
	{

		this.x = x;
	}

	public boolean isZero() {

		if (x==0) 
			return true;
		else 
			return false;
	}

	public boolean isPositive() {

		if (x>0)
			return true;
		else
			return false;
	}

	public boolean isNegative() {
		if (x<0) 
			return true;
		else 
			return false;
	}

	public boolean isEven() {
		if (x%2==0) {
			return true;
		}
		else 
			return false;
	}
	public boolean isOdd(){
		if (x%2==1) {
			return true;
		}
		else
			return false;
	}
	public boolean isPrime(){
		int i,p=0,temp = x ;
		for(i=1;i<=temp;i++)
			if(temp%i==0)
				p++;
		if(p==2)
			return true;
		else 
			return false;
	}
	public boolean isArmstrong(){
		int temp,sum=0,digit;
		
		temp=x;
		while(temp!=0)
		{
			digit=temp%10;
			sum=(digit*digit*digit)+sum;
			temp/=10;
		}
		if(x==sum)
			return true;
		else 
			return false;
	}
	public double getSquare() {
		  return Math.pow(x,2) ;
	}
	public double getCube() {
		return Math.pow(x,3) ;
	}
	public double getSqrt() {
		return Math.sqrt(x) ;
	}

	public void printFactors() {

    	System.out.print("Factors of " + x + " are         : ");

    	int copyX = x;

    	for (int i = 1; i <= copyX; ++i) {

      		if (copyX % i == 0) {
        		System.out.print(i + " ");
      		}
    	}
   }

    public void printPrimeFactors() 
	{
		if(x<2)
		{
			System.out.print("\n"+x +" has no prime factors .");
		}
		else
		{
			System.out.print("\nPrime Factors of "+x+" are   : ");
			for(int i = 2; i<=x; i++)
			{
				while(x%i == 0)
				{
						System.out.print(i+" ");
						x = x/i;
				}
			}

		}	
   }	
}
