package utils;

import java.sql.*;

public class DBUtils {
	private static Connection cn;

	// add a static method to open db con.
	public static Connection openConnection() throws SQLException{
		// DriverManager :Connection getConnection(url,nm,pass) throws sqlexc
		String url = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn=DriverManager.getConnection(url, "root", "root");
		return cn;
	}

}
