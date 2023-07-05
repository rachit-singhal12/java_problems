import java.sql.*;

public class MyConnections 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","");
		CallableStatement stmt = con.prepareCall("{call insertR(?,?)}");
		stmt.setInt(1, 102);
		stmt.setString(2, "vikas");
		stmt.execute();
		System.out.print("yes");
		con.close();
	}
}