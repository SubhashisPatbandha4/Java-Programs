import java.io.FileInputStream;
class FileInputStreamDemo
{
	public static void main(String args[])
	{
		int x;
		byte[]city_arr;
		try
		{
			FileInputStream fin = new FileInputStream("testout.txt");
			x=fin.read();
			System.out.println("Read char = "+(char)x);
			
			int count = fin.available();
			System.out.println("Available bytes : "+count);
			city_arr=new byte[count];
			fin.read(city_arr);
			String city=new String(city_arr);
			System.out.println("City : | "+city+" |");
	
			fin.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
	}
}
