package tester;

import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

/*
 * 1.2 Un subscribe user.
i/p : user id
 */
public class TestPSTDelete {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				// open cn
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("delete from users where id=?")) {
			System.out.println("Enter user id to delete details ");
			// set IN params. PST API : public void setType(int paramIndex,Type val) throws
			// SE
			pst.setInt(1, sc.nextInt());
			// exec methods : execQuery / execUpdate /execute
			// API of PST for DDL n DML : public int executeUpdate() throws SE
			int updateCount = pst.executeUpdate();
			if (updateCount == 1)
				System.out.println("User details deleted !");
			else
				System.out.println("Invalid user id !!!!!!!!!");

		} // pst , cn sc : close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
