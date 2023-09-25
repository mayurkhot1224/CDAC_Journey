package dao;

import java.sql.*;
import static utils.DBUtils.*;

public class AccountDaoImpl implements AccountDao {
	// state
	private Connection cn;
	private CallableStatement cst1;

	public AccountDaoImpl() throws SQLException {
		// open cn
		cn = openConnection();
		// cst
		cst1 = cn.prepareCall("{call transfer_funds(?,?,?,?,?)}");
		// register OUT param
		cst1.registerOutParameter(4, Types.DOUBLE);
		cst1.registerOutParameter(5, Types.DOUBLE);
		System.out.println("acct dao created!");
	}

	@Override
	public String transferFunds(int srcNo, int destNo, double amount) throws SQLException {
		// set IN params
		cst1.setInt(1, srcNo);
		cst1.setInt(2, destNo);
		cst1.setDouble(3, amount);
		// exec stored proc
		cst1.execute();
		return "Transferred Funds , Updated src balance " 
		+ cst1.getDouble(4) + " updated dest bal "
				+ cst1.getDouble(5);
	}

	// clean up
	public void cleanUp() throws SQLException {
		// close
		if (cst1 != null)
			cst1.close();
		closeConnection();
	}

}
