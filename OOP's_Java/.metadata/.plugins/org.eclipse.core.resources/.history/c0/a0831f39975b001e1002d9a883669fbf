package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import custom_exceptions.ResourceNotFoundException;

import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	// state
	private Connection cn;
	private PreparedStatement pst1, pst2,pst3;

	// def ctor
	public UserDaoImpl() throws SQLException {
		// db cn
		cn = openConnection();
		pst1 = cn.prepareStatement("select * from users where role=? and reg_amt > ?");
		pst2 = cn.prepareStatement("delete from users where id=?");
		pst3=cn.prepareStatement("insert into users values(default,?,?,?,?,?,?,?)");
		System.out.println("user dao created !");
	}

	@Override
	public List<User> findUsersByRoleAndAmount(String role, double amount) throws SQLException {
		// create empty list
		List<User> users = new ArrayList<>();
		// set IN params : setType(pos,val)
		pst1.setString(1, role);
		pst1.setDouble(2, amount);
		// exec query -- RST : auto closeable
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				// int id, String firstName, String lastName, String email, String password,
				// double regAmount,
				// Date regDate, String role
				users.add(new User(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),
						rst.getString(5), rst.getDouble(6), rst.getDate(7), role));
		}
		return users;
	}

	@Override
	public String deleteUserDetails(int userId) throws SQLException, ResourceNotFoundException {
		// set IN param
		pst2.setInt(1, userId);
		// exec method of PST : public int executeUpdate() throws SE
		int delCount = pst2.executeUpdate();
		if (delCount == 1)
			return "User details deleted with user id =" + userId;
		throw new ResourceNotFoundException("User with user id=" + userId + " not found!!!!!");
	}
	/*
	 * id | first_name | last_name | email          | password | reg_amt | reg_date   | role
	 */

	@Override
	public String registerNewUser(User newUser) throws SQLException {
		// set IN params
		//set first name
		pst3.setString(1, newUser.getFirstName());
		pst3.setString(2, newUser.getLastName());
		pst3.setString(3, newUser.getEmail());
		pst3.setString(4, newUser.getPassword());
		pst3.setDouble(5, newUser.getRegAmount());
		pst3.setDate(6, newUser.getRegDate());
		pst3.setString(7, newUser.getRole());
		//exec update
		int rowCount=pst3.executeUpdate();
		if(rowCount==1)
			return "User registered...";
		return "User reg failed!!!!!!!!!!!!!!!";
	}

	// clean up dao
	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		closeConnection();
		System.out.println("user dao cleaned up....");
	}

}
