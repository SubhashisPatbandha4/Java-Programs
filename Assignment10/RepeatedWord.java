import java.util.*;
class RepeatedWord
{
	public static void main(String args[])
	{
		int i,j,ctrMax=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a String : ");
		String str=sc.nextLine();
		String strArray[]=str.split(" ");
		String maxWord=" ";
		for(i=0;i<strArray.length;i++)
		{
			int ctr=1;
			if(strArray[i]!="-1")
			{	
				for(j=i+1;j<strArray.length;j++)
				{
					if(strArray[i].equals(strArray[j]))	
					{
						ctr++;
						strArray[j]="-1";
					}
				}
			}
			if(ctr>ctrMax && strArray[i]!="-1")
			{
				ctrMax=ctr;
				maxWord=strArray[i];
			}
		}
		if(ctrMax>0)
			System.out.println("\nMost Repeated Word in the given string is : "+maxWord+" (repeated "+ctrMax+" times)");
		else
			System.out.println("\nThere is no repeated word in the given string .");
	}
}