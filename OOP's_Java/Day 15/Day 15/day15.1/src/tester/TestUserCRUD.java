package tester;

import java.sql.Date;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojos.User;

public class TestUserCRUD {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase of the app
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			boolean exit = false;
			while (!exit) {

				System.out.println("Options 1. Display user details by role n amount "
						+ "2. Un-subscribe user 3. Register New User 0.Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter role n amount");
						dao.findUsersByRoleAndAmount(sc.next(), sc.nextDouble()).forEach(System.out::println);
						break;
					case 2:
						System.out.println("Enter user id");
						System.out.println(dao.deleteUserDetails(sc.nextInt()));
						break;
					case 3:
						System.out.println(
								"Enter user details :  firstName,  lastName,  em, password regAmount,  regDate(yr-mon-day), role");
						System.out.println("Reg status " + dao.registerNewUser(new User(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), Date.valueOf(sc.next()), sc.next())));
						break;

					case 0:
						exit = true;
						dao.cleanUp();
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
