package com.app;

public class TestInterface {

	public static void displayTotal(MathOperatoins m) {
		System.out.println(m.add(34, 34));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator m1 = new MyCalculator();
		System.out.println(m1.add(23, 34));
		System.out.println("Max=" + m1.max(34, 5));
		displayTotal(m1);

		StudentExam s = new StudentExam();
		System.out.println(s.add(67, 89));

		displayTotal(s);

	}

}
