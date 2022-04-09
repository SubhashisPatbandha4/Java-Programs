import java.io.FileOutputStream;
class FileOutputStreamDemo
{
	public static void main(String args[])
	{
		int x = 99;
		String city="Bhubaneswar,Odisha";
		byte[]city_arr=city.getBytes();
		try
		{
			FileOutputStream fout = new FileOutputStream("testout.txt");
			fout.write(x);
			fout.write(32);
			fout.write(city_arr);
			fout.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}
}
