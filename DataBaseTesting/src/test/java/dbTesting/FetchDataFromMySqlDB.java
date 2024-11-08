package dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromMySqlDB {
	public static void main(String[] args) throws SQLException {
		// Create object of Driver class
		Driver driver = new Driver();
		// Register the Driver
		DriverManager.registerDriver(driver);
		// Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
		// Create the statement
		Statement state = con.createStatement();
		String query = "select * from employee";
		ResultSet res = state.executeQuery(query);
		while (res.next()) {
			System.out
					.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getString(4));
		}

	}

}
