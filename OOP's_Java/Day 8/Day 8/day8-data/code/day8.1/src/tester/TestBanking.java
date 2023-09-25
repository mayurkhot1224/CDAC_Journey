package tester;

import java.util.Map;
import java.util.Scanner;

import com.banking.BankAccount;

import custom_exceptions.BankingException;

import static utils.BankUtils.populateMap;
import static utils.BankValidations.validateAllInputs;

public class TestBanking {

	public static void main(String[] args) throws BankingException {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map from utils
			Map<Integer, BankAccount> acctMap = populateMap();

			boolean exit = false;
			while (!exit) {
				System.out
						.println("Options 1. Create A/C 2. Display all accounts 3. Transfer Funds " 
				+ "4.Close A/c 5. Fetch A/c Summary 6.Freeze A/cs 0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter acct details :  acctNo,  customerName,  type,  balance,  createdOn(yr-mon-day)");
						BankAccount account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), acctMap);
						acctMap.put(account.getAcctNo(), account);
						System.out.println("new a/c created....");
						break;

					case 2:// display acct details (admin)
						System.out.println("Accts in the bank : ");
						for (BankAccount a : acctMap.values())
							System.out.println(a);
						break;
					case 3: // fund transfer (customer)
						System.out.println("Enter src a/c no , dest a/c no n transfer amount");
						// get src a/c
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("Invalid src acct no!!!!!!!!!!!");
						BankAccount dest = acctMap.get(sc.nextInt());
						if (dest == null)
							throw new BankingException("Invalid dest acct no!!!!!!!!!!!");
						// transfer the funds
						src.transferFunds(dest, sc.nextDouble());
						System.out.println("funds transferred.....");
						break;
					case 4:
						System.out.println("Enter a/c no , to close the a/c");
						account = acctMap.remove(sc.nextInt());
						if (account == null)
							throw new BankingException("Invalid  acct no, Can't close A/c !!!!!!");
						System.out.println("Closed " + account);
						break;
					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
