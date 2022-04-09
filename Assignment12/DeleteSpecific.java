
import java.sql.*;
import java.util.*;

import javax.naming.NamingException;

public class DeleteSpecific {
    public static void main(String[] args)
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe", "system", "0000");
            System.out.println("Log-In to Oracle Database DONE Successfully");

            Scanner sc = new Scanner(System.in);
            System.out.println("---Delete a Specific book Info---");
            System.out.println("Enter name of the book:");
            String name = sc.nextLine();

            PreparedStatement pt = con.prepareStatement("Delete from mybook where name =?");
            con.setAutoCommit(false);
            pt.setString(1, name);
            
            int result = pt.executeUpdate();
            con.commit();
            System.out.println("Data deleted successfully!!!"+result);
            sc.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
