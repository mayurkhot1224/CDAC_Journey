package dao;

import java.sql.SQLException;
import java.util.List;

import custom_exceptions.ResourceNotFoundException;
import pojos.User;

public interface UserDao {
//add a method for : get  user details for all users , under specific role 
	// , with reg amount > specified amount
	List<User> findUsersByRoleAndAmount(String role, double amount) throws SQLException;

	// delete user details
	String deleteUserDetails(int userId) throws SQLException, ResourceNotFoundException;

	// add new user details
	String registerNewUser(User newUser) throws SQLException;
}
