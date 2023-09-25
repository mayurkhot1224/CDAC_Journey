package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.myorg.Employee;

public interface IOUtils {
//add a static method to store emp details 
	static void storeEmpDetails(Map<String, Employee> emps, String fileName) throws IOException {
		// I/O strms : serialization
		// Java App ---->OOS--> FOS---> BIn File
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// ser
			out.writeObject(emps);
		}
	}

	// add a static method to restore emp details
	@SuppressWarnings("unchecked")
	static Map<String, Employee> restoreEmpDetails(String fileName) {
		// de ser strms : Java App<----OIS <-----FIS <--- bin file
		try (ObjectInputStream in = new ObjectInputStream
				(new FileInputStream(fileName))) {
			// de-serial
			return (Map<String, Employee>) in.readObject();
		} catch (Exception e) {
			System.out.println("err during de-serial " + e);
			return new HashMap<>();
		}
	}
}
