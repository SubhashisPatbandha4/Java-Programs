/*	Assignment - 3.6

	PROGRAM   :To print nth fibbonacci number using method,value of n is accepted from command-line input
	FILE 	  :Nthfibbo.java
	CREATED BY:Subhashis Patbandha
	DATED	  :09/09/2020

 */
class Nthfibbo
{
	 public static void main(String args[])
	 {
		int n,nth;
			n = Integer.parseInt(args[0]);
	 	
		nth=nthfibbo(n);
		System.out.println("\n"+n+"th term of the fibbonacci series = "+nth);
	 }	

	public static int nthfibbo(int n)
	{
		int f1=0,f2=1,f3=0,i;
		if(n==1)
			return f1;
		else if(n==2)
			return f2;
		else
		{
			for(i=3;i<=n;i++)
			{
				f3=f1+f2;
				f1=f2;
				f2=f3;
			}	
			return f3;
		}
	}

}