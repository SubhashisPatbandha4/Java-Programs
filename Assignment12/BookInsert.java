
import java.sql.*;

public class BookInsert 
{
    public static void  main(String[] args)
    {
        try 
		{
            
			Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "0000");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Statement stmt = con.createStatement();
			

            String sqlcmd = "insert into mybook values('god is everything',250)";
            con.setAutoCommit(false);
            int result = stmt.executeUpdate(sqlcmd);
            con.commit();
            System.out.println("1 row is created ! -> "+result);
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
