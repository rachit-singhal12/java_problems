import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MyConnections
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","R@chit100");
		PreparedStatement stmt = conn.prepareStatement("insert into Details values(?,?,?)");
		int n,id,price;
		String name;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		while(n>0)
		{
			id = scan.nextInt();
			name = scan.next();
			price = scan.nextInt();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, price);
			int res = stmt.executeUpdate();
			if(res==1)System.out.println("successfully executed");
			n--;
		}
		conn.close();
	}
}