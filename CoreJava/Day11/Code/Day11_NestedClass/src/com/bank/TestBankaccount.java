package com.bank;

import java.util.Scanner;

public class TestBankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter ActId Name balance");
		Scanner sc = new Scanner(System.in);
		BankAccount act1 = new BankAccount(sc.nextInt(), sc.next(), sc.nextDouble());

		System.out.println(act1);

		System.out.println("Do You Want to Have Locker(Y/N)");
		Character ans = sc.next().charAt(0);
		if (ans.equals('Y')) {// BL

			System.out.println("Duration:");
			int d = sc.nextInt();
			act1.assignLocker(d);
			System.out.println("Locker Get Assigned");
			System.out.println(act1);
		} else {
			System.out.println("Locker Not Assigned");
		}

	}

}
