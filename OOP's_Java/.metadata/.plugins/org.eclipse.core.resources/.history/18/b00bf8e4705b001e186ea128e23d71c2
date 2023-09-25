package tester;

import java.sql.*;
import java.util.Scanner;

import static utils.DBUtils.openConnection;

/*
 *  Display user details for all users , under specific role , 
 *  with reg amount > specified amount
i/p : role , amount
 */
public class TestPSTSelect {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);
				// open cn
				Connection cn = openConnection();
				// create pst
				PreparedStatement pst = cn.prepareStatement("select * from users where role=? and reg_amt > ?");) {
			System.out.println("Enter role n reg amount ");
			// set IN params. PST API : public void setType(int paramIndex,Type val) throws
			// SE
			pst.setString(1, sc.next());
			pst.setDouble(2, sc.nextDouble());
			// exec methods : execQuery / execUpdate /execute
			// API of PST : public RST executeQuery() throws SE
			try (ResultSet rst = pst.executeQuery()) {
				// rst cursor : before the 1st row
				// RST API : public boolean next() throws SE
				while (rst.next())
					// read row data : RST API public Type getType(int colPos/String colName) throws
					// SE
					System.out.println("id " + rst.getInt(1) + " full name " + rst.getString(2) + " " + rst.getString(3)
							+ ", reg date" + rst.getDate(7));
			}//rst.close

		} //pst , cn sc : close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
