import java.io.*;
class FileList
{
	public static void main(String args[])
	{
		File f= new File("D:/java practical assignment/Assignment11");

		if(f.exists())
		{
			File file[]=f.listFiles();
			double b;
			int ctr=0	;
			System.out.println("\nFiles preset in location - D:/java practical assignment/Assignment11 are :\n");
			for(File i :file)
			{
				String name = i.getName();
				System.out.print(name+"				");
				b = i.length();	
				System.out.println(b/1024+" KB");
				ctr++;
			}
			if(ctr==0)
				System.out.println("\nThere is no file present in D:/java practical assignment/Assignment11");
			else
				System.out.println("\nNo.s of file(s) present : "+ctr);
		}
		else
			System.out.println("\nError ! Location does not exist ");
		
	}
}