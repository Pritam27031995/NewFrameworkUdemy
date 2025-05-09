package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDatabaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port ="3306";
		String dbname="PracticeDB";
		
		String connectionURL="jdbc:mysql://"+host+":"+port+"/"+dbname;
		System.out.println(connectionURL);
		Connection conn = DriverManager.getConnection(connectionURL, "root", "Test@1234");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("Select * from Employees where id ='2';");
		rs.next();
		System.out.println(rs.getString("Name"));
	}

}
