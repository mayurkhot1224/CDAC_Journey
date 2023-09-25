package tester;

import static utils.DBUtils.openConnection;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		try (Connection cn = openConnection()) {
			System.out.println("connected to db " + cn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
