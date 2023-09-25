package tester;

import com.app.banking.BankAccount;

public class TestAcctEquals {

	public static void main(String[] args) {
		Object acct1=new BankAccount(101, "Rama Mathur", "Saving", 12000);
		Object acct2=new BankAccount(101, "Rama Kelkar", "Current", 5000);
	//	System.out.println(acct2.getClass());
	//	System.out.println(acct1==acct2);//f
		System.out.println(acct1.equals(acct2));//t
		//PK (UID) : acct no + acct type 
		Object o=100;//auto boxing --up casting
		System.out.println(o.getClass());
		System.out.println(acct1.equals(o));
	}

}






