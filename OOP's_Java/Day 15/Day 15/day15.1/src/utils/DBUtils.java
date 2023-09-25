package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;

	// add a static method to open db con.
	public static Connection openConnection() throws SQLException {
		// DriverManager :Connection getConnection(url,nm,pass) throws sqlexc
		String url = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url, "root", "root");
		return cn;
	}

	// add a static method to close db con.
	public static void closeConnection() throws SQLException {
		if (cn != null)
			cn.close();
	}

}
