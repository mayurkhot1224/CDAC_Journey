package utils;

import java.util.List;

import com.iacsd.Customer;

import custom_exceptions.CustomerHandlingException;

public class CustomerValidationRules {
//add a static method to check for dup
	public static void checkForDup(List<Customer> customerList, String newEmail) throws CustomerHandlingException {
		// 1. wrap email in customer ref.
		Customer newCustomer = new Customer(newEmail);
		if (customerList.contains(newCustomer))
			throw new CustomerHandlingException("Dup Email ID , choose new email !!!!!");
		System.out.println("no dup email found....");
	}
}
