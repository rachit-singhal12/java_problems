import java.sql.*;

public class myproject {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","R@chit100");  
		Statement st = con.createStatement() ;
		String query = "insert into mca values (102,'Akshay',45)";
		st.executeUpdate(query);
		System.out.print("Successfully inserted");
		
	}

}
