package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataIntoMySqlDB {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement stmt = con.createStatement();
		String query = "insert into employee values (5678,'Sarath','Male','Software')";
		int upd = stmt.executeUpdate(query);
		String query1 = "delete from employee where Empid=5678";
		int upd2= stmt.executeUpdate(query1);
		if(upd==1) {
			System.out.println("Data is updated");
		}
		else {
			System.out.println("Data is not upadated");
		}
		
	}

}
