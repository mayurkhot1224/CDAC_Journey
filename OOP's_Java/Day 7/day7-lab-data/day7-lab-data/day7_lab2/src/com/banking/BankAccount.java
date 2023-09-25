package com.banking;

/*
 * BankAccount : acctNo(int), customerName(string) , type (enum : SAVING,CURRENT,FD) , balance(double)
ctor + toString

PK : acctNo

 */
public class BankAccount {
	private int acctNo;
	private String customerName;
	private AccountType type;
	private double balance;

	public BankAccount(int acctNo, String customerName, AccountType type, double balance) {
		super();
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + "]";
	}
	//PK : acct no
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in acct eq");
		if(o instanceof BankAccount)
			return this.acctNo==((BankAccount)o).acctNo;
		return false;
	}
	//override hashCode
	@Override
	public int hashCode()
	{
		System.out.println("in acct hC");
		return acctNo;
	}

}
