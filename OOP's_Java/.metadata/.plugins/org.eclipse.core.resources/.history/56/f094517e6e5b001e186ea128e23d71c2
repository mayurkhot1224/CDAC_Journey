package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;
public class TestConnection {

	public static void main(String[] args) {
		try(Connection cn=openConnection())
		{
			System.out.println("connected to db "+cn);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
