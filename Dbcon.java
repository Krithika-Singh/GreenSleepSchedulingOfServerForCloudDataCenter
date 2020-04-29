import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbcon 
{
	static Connection con;
	public Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj16","root","root");
		System.out.println("Connected");
		}
		catch(ClassNotFoundException | SQLException e)
		{
		}
		return con;
                //jdbc:mysql://localhost:3306/?user=root
		
	}

}
