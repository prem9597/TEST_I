package practice.pom.org.cucumbertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://autorack.proxy.rlwy.net:19607/railway";
		String user = "root"; // Your username
		String password = "JPZcCoHZXvBLeJXRIZiAzmfEGMSVSZWj";
		String query="select * from PracticeOnline";

		Connection	 con = DriverManager.getConnection(url, user, password);
		Statement statement = con.createStatement();
		ResultSet executeQuery = statement.executeQuery(query);
		
		//executeQuery.next();
		System.out.println(executeQuery.getInt(0));
	}

}
