package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.myorg.Department;
import com.myorg.Employee;
import static utils.EmpValidationRules.*;

import static utils.IOUtils.*;

public class EMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.next();
			// init pahe of app : restore
			Map<String, Employee> empMap = restoreEmpDetails(fileName);
			System.out.println("restored map " + empMap);
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1 : Hire Emp 2 Display 0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out
								.println("Enter emp details :  id,  firstName,  lastName,  dept,  joinDate,  salary ");
						String empId = checkForDup(sc.next(), empMap);
						String firstName = sc.next();
						String lastName = sc.next();
						Department department = parseAndValidateDepartment(sc.next());
						LocalDate joinDate = parseAndValidateJoinDate(sc.next());
						empMap.put(empId,
								new Employee(empId, firstName, lastName, department, joinDate, sc.nextDouble()));
						System.out.println("emp details added....");
						break;
					case 2:
						System.out.println("All emps");
						empMap.forEach((k, v) -> System.out.println(v));

						break;

					case 0:
						exit = true;
						// store emp details in a bin file
						storeEmpDetails(empMap, fileName);
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
