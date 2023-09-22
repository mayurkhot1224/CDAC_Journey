package com.bank;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("AccountType:");
		for (AccountType a : AccountType.values()) {
			System.out.print(a + "  ");
		}
		System.out.println();
		System.out.println("ActId Name email balance  ActType doc ");
		Scanner sc = new Scanner(System.in);
		int actid = sc.nextInt();
		String name = sc.next();
		String email = sc.next();
		double balance = sc.nextDouble();
		AccountType actType = AccountType.valueOf(sc.next().toLowerCase());
		Date doc = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());

		BankAccount act1 = new BankAccount(actid, name, email, balance, actType, doc);
		System.out.println(act1);
		// lab:create array store 10 accounts
		// actId must be unique (static)
		// chk duplicate customer with email
		// display specific account type customers

	}

}
