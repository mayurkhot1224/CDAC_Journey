package dao;

import java.sql.SQLException;

public interface AccountDao {
//add a method for the funds transfer
	String transferFunds(int srcNo,int destNo,double amount) throws SQLException;
}
