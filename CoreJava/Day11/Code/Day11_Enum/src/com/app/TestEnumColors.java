package com.app;

import java.util.Scanner;

public class TestEnumColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		Colors col = Colors.gray;
		System.out.println(col);

		System.out.println("Available Colors=");

		Colors[] arrColrs = Colors.values();
		for (Colors c : arrColrs) {
			System.out.println(c);
		}
		System.out.println("---------------------");

		for (Colors c : Colors.values()) {
			System.out.print(c + "  ");
		}
		// accept enum values from user

		System.out.println("---Enter Color-----");
		Scanner sc = new Scanner(System.in);

		String strCol = sc.next();
		// valueOf:convert String values into enum
		// enum valueOf(String str);
		// :input:String Output:enum type
		Colors userSel = Colors.valueOf(strCol);
		System.out.println("Selected Color=" + userSel);
		sc.close();
	}

}
