package tester;

import static utils.StudentCollectionUtils.populateList;

import java.util.List;

import com.app.core.Student;

public class Test3 {

	public static void main(String[] args) {
		// 1. Display all student details from a student list
		List<Student> studentList = populateList();
		System.out.println("Students : ");
		studentList.forEach(s -> System.out.println(s));
		// Display all student details(list) sorted as per GPA
		System.out.println("Students sorted as per GPA : asc");
		studentList.stream() // Stream<Student>
				.sorted((s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa())) // Stream<Student> : sorted
				.forEach(s -> System.out.println(s));

	}

}
