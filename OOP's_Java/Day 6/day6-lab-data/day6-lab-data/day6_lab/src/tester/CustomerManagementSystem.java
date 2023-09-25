package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iacsd.Customer;
import com.iacsd.ServicePlan;

import custom_exceptions.CustomerHandlingException;

import static utils.CustomerValidationRules.*;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init
			// create empty AL to hold customer refs
			List<Customer> customerList = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"0. Exit 1. Sign Up 2. Sign In 3.Display all " + "4. Change Password 5.Unsubscribe customer");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:// customer reg.
						System.out.println(
								"Enter customer details :  firstName,  lastName,  email,  password,  regAmount,  dob service Plan");
						Customer validCustomer = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(validCustomer);
						System.out.println("customer registered....");

						break;
					case 2: // sign in
						System.out.println("Enter email n password");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						System.out.println(validCustomer);
						break;

					case 4:  //change password
						System.out.println("Enter email , old pwd , new pwd");
						validCustomer = customerLogin(sc.next(), sc.next(), customerList);
						//=> valid login
						validCustomer.setPassword(sc.next());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// read off pending token from the scanner till EOL (end of line)
					sc.nextLine();
				}
			}
		}

	}

}
