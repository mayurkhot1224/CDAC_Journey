package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.myorg.Department;
import com.myorg.Employee;

import custom_exceptions.EmployeeHandlingException;

public interface EmpValidationRules {
//add a static method to parse n validate dept
	static Department parseAndValidateDepartment(String deptName) {
		return Department.valueOf(deptName.toUpperCase());
	}

	// add static method to parse n validate join date (should not be > 3 yrs old)
	static LocalDate parseAndValidateJoinDate(String date) throws EmployeeHandlingException {
		// 1. parsing
		LocalDate joinDate = LocalDate.parse(date);
		// 2. validation
		int differenceInYears = Period.between(joinDate, LocalDate.now()).getYears();
		if (differenceInYears > 3)
			throw new EmployeeHandlingException("Invalid join date!!!!!!!!!!!!!!!!");
		return joinDate;
	}

	// add a static method to validate if emp id is dup or distinct
	static String checkForDup(String empId, Map<String, Employee> emps) throws EmployeeHandlingException {
		if (emps.containsKey(empId))
			throw new EmployeeHandlingException("dup emp id!!!!!!");
		return empId;
	}

}
