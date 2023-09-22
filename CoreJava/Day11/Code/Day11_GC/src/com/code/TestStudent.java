package com.code;

public class TestStudent {

	public static void display() {
		Student s = new Student();
		s = null;
		System.gc();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		display();
		System.out.println("-----other BL----");

	}

}
