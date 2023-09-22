package com.code;

import java.util.Scanner;

public class TestMyColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (MyColors m : MyColors.values()) {
			System.out.print(m + "  ");
		}

		System.out.println("Enter Color");
		Scanner sc = new Scanner(System.in);
		String col = sc.next();

		MyColors m = MyColors.valueOf(col.toUpperCase());
		System.out.println("You Selected Color=" + m + " Price:" + m.getPrice());

		m.setPrice(4500);

		System.out.println(m + "  " + m.getPrice());

		for (MyColors m3 : MyColors.values()) {
			System.out.print(m3 + "  ");
		}
		MyColors m2 = MyColors.SILVER;
		System.out.println(m2 + "   " + m2.getPrice());

	}

}
