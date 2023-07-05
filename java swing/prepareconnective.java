import java.sql.*;

public class MyConnections 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","");
		PreparedStatement stmt = con.prepareStatement("insert into student values(?,?)");
		stmt.setInt(1, 102);
		stmt.setString(2, "vikas");
		int rs = stmt.executeUpdate();
		if(rs == 1)System.out.print("yes");
		else System.out.print("no");
		con.close();
	}
}