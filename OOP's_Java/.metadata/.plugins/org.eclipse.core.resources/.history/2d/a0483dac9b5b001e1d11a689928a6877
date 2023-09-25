package tester;

import java.util.Scanner;

import dao.AccountDaoImpl;

public class TestStoredProc {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			AccountDaoImpl acctDao = new AccountDaoImpl();// init
			// service
			System.out.println("Enter src acct no dest acct no n amount");
			System.out.println(acctDao.transferFunds(sc.nextInt(), 
					sc.nextInt(), sc.nextDouble()));
			acctDao.cleanUp();// destroy
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
